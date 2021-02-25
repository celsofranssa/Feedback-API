package br.dcc.ufmg.feedbackapi.feedbackapi.repository;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByDescriptionId(Integer id);
}
