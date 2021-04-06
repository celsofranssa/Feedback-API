package br.dcc.ufmg.feedbackapi.feedbackapi.service;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Description;
import br.dcc.ufmg.feedbackapi.feedbackapi.model.Product;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.DescriptionRepository;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.FeedbackRepository;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Description findHighestPriorityDescription() {

        List<Description> descriptions = descriptionRepository.findAll();
        Description priorityDescription = descriptions.get(0);
        Integer numFeedbacks = feedbackRepository.countFeedbacksByDescriptionId(priorityDescription.getId());

        for (Description description : descriptions
        ) {
            if (feedbackRepository.countFeedbacksByDescriptionId(description.getId()) < numFeedbacks)
                priorityDescription = description;
            numFeedbacks = feedbackRepository.countFeedbacksByDescriptionId(priorityDescription.getId());

        }
        return priorityDescription;
    }

    public Description findHighestPriorityDescription(Integer judgeId) {

        List<Description> descriptions = descriptionRepository.findAll();
        Collections.shuffle(descriptions);

        Description priorityDescription = descriptions.get(0);
        Integer priorityNumFeedbakcs = feedbackRepository.countFeedbacksByDescriptionId(priorityDescription.getId());
        Integer descriptionId;
        Integer numFeedbakcs;

        for (Description description : descriptions
        ) {
            descriptionId = description.getId();

            if (!hasJudgment(descriptionId, judgeId)) {

                numFeedbakcs = feedbackRepository.countFeedbacksByDescriptionId(descriptionId);

                if (numFeedbakcs <= priorityNumFeedbakcs) {
                    priorityDescription = description;
                    priorityNumFeedbakcs = numFeedbakcs;
                }
            }

        }
        return priorityDescription;
    }

    private boolean hasJudgment(Integer descriptionId, Integer judgeId) {
        return feedbackRepository.countFeedbacksByDescriptionIdAndJudgeId(descriptionId, judgeId) > 0;

    }

}
