package br.dcc.ufmg.feedbackapi.feedbackapi.resource;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.ProductItem;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producitems")
public class ProductItemResources {

        @Autowired
        private ProductItemRepository repository;

        @GetMapping
        public List<ProductItem> findAll(){
            return repository.findAll();
        }
}
