package br.dcc.ufmg.feedbackapi.feedbackapi.resource;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Description;
import br.dcc.ufmg.feedbackapi.feedbackapi.model.Product;
import br.dcc.ufmg.feedbackapi.feedbackapi.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/descriptions")
public class DescriptionResource {

        @Autowired
        private DescriptionService descriptionService;

        @GetMapping
        public List<Description> findAll() {
                return descriptionService.findAll();
        }

        @GetMapping("/high-priority")
        public Description findHighestPriorityDescription(@RequestParam(value = "judgeId") Integer judgeId) {
                return descriptionService.findHighestPriorityDescription(judgeId);
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
