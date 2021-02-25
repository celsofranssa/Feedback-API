package br.dcc.ufmg.feedbackapi.feedbackapi.service;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Description;
import br.dcc.ufmg.feedbackapi.feedbackapi.model.Product;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.DescriptionRepository;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescriptionService {

    @Autowired
    DescriptionRepository descriptionRepository;

    @Autowired
    ProductRepository productRepository;

    public Description findDescription() {
        List<Description> descriptions = descriptionRepository.findAll();
        return descriptions.get(0);
    }

    public List<Description> findAll() {
        return descriptionRepository.findAll();

    }

    public Optional<Description> findById(Integer id) {
        return descriptionRepository.findById(id);
    }

    public List<Product> findProductsByDescriptionId(Integer id) {
        return productRepository.findByDescriptionId(id);

    }

}
