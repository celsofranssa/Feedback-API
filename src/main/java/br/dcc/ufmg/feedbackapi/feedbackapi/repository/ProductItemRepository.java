package br.dcc.ufmg.feedbackapi.feedbackapi.repository;
import br.dcc.ufmg.feedbackapi.feedbackapi.model.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Integer> {
}
