package br.dcc.ufmg.feedbackapi.feedbackapi.service;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Description;
import br.dcc.ufmg.feedbackapi.feedbackapi.model.Product;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.DescriptionRepository;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.FeedbackRepository;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class DescriptionService {

    @Autowired
    DescriptionRepository descriptionRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    FeedbackRepository feedbackRepository;

//    public Description findHighestPriorityDescription() {
//        List<Description> descriptions = descriptionRepository.findAll();
//        return descriptions.get(0);
//    }

    public List<Description> findAll() {
        return descriptionRepository.findAll();

    }

    public Optional<Description> findById(Integer id) {
        return descriptionRepository.findById(id);
    }

    public List<Product> findProductsByDescriptionId(Integer id) {
        return productRepository.findByDescriptionId(id);

    }

    public Description findHighestPriorityDescription(Integer judgeId) {

        List<Description> descriptions = descriptionRepository.findAll();
        List<Description> descriptionsToEval = getDescriptionsToEval(descriptions, judgeId);

        if (descriptionsToEval.size() == 0) {
            descriptionsToEval = descriptions;
        }
        Collections.shuffle(descriptionsToEval);
        return findHighestPriorityDescription(descriptionsToEval);


    }

    private Description findHighestPriorityDescription(List<Description> descriptionsToEval) {
        Description priorityDescription = descriptionsToEval.get(0);
        Integer priorityNumFeedbakcs = feedbackRepository.countFeedbacksByDescriptionId(priorityDescription.getId());
        Integer descriptionId;
        Integer numFeedbakcs;

        for (Description description : descriptionsToEval) {
            descriptionId = description.getId();
            numFeedbakcs = feedbackRepository.countFeedbacksByDescriptionId(descriptionId);
            if (numFeedbakcs < priorityNumFeedbakcs) {
                priorityDescription = description;
                priorityNumFeedbakcs = numFeedbakcs;
            }
        }
        return priorityDescription;
    }

    private List<Description> getDescriptionsToEval(List<Description> descriptions, Integer judgeId) {
        ArrayList<Description> descriptionsToEval = new ArrayList<>();
        for (Description description : descriptions) {
            if (!hasJudgment(description.getId(), judgeId)) {
                descriptionsToEval.add(description);
            }
        }

        return descriptionsToEval;
    }

    private boolean hasJudgment(Integer descriptionId, Integer judgeId) {
        return feedbackRepository.countFeedbacksByDescriptionIdAndJudgeId(descriptionId, judgeId) > 0;

    }

}
