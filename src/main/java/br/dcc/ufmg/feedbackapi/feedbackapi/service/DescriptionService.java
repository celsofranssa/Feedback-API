package br.dcc.ufmg.feedbackapi.feedbackapi.service;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Description;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.DescriptionRepository;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.FeedbackRepository;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {

    DescriptionRepository descriptionRepository;
    FeedbackRepository feedbackRepository;

    Description findDescription() {
        return null;
    }
}
