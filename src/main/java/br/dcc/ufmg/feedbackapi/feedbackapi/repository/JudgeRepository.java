package br.dcc.ufmg.feedbackapi.feedbackapi.repository;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Judge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JudgeRepository extends JpaRepository<Judge, Integer> {
}
