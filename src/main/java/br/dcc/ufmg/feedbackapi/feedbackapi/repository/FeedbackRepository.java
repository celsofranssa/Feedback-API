package br.dcc.ufmg.feedbackapi.feedbackapi.repository;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    Integer countFeedbacksByDescriptionId(Integer descriptionId);

    List<Feedback> findFeedbackByDescriptionIdAndAndJudgeId(Integer descriptionId, Integer judgeId);

    Integer countFeedbacksByDescriptionIdAndJudgeId(Integer descriptionId, Integer judgeId);


}
