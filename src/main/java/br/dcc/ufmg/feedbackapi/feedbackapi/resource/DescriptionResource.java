package br.dcc.ufmg.feedbackapi.feedbackapi.resource;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Description;
import br.dcc.ufmg.feedbackapi.feedbackapi.model.Product;
import br.dcc.ufmg.feedbackapi.feedbackapi.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/descriptions")
public class DescriptionResource {

        @Autowired
        private DescriptionService descriptionService;

        @GetMapping
        public List<Description> findAll() {
                return descriptionService.findAll();
        }

        @GetMapping("/{id}")
        public Optional<Description> findById(@PathVariable Integer id) {
                return descriptionService.findById(id);
        }

        @GetMapping("/{id}/products")
        public List<Product> findByDescriptionId(@PathVariable Integer id) {
                return descriptionService.findProductsByDescriptionId(id);
        }


}
