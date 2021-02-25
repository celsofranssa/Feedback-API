package br.dcc.ufmg.feedbackapi.feedbackapi.resource;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Feedback;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackResource {
    @Autowired
    private FeedbackRepository repository;

    @GetMapping
    public List<Feedback> findAll() {
        return repository.findAll();
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void save(@RequestBody Feedback feedback) {
//        repository.save(feedback);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAll(@RequestBody List<Feedback> feedbacks) {
        repository.saveAll(feedbacks);
    }
}