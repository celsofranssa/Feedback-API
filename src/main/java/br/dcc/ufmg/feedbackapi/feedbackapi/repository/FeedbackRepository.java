package br.dcc.ufmg.feedbackapi.feedbackapi.repository;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    Integer countFeedbacksByDescriptionId(Integer descriptionId);

}
