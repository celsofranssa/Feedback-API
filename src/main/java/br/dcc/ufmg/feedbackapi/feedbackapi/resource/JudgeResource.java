package br.dcc.ufmg.feedbackapi.feedbackapi.resource;

import br.dcc.ufmg.feedbackapi.feedbackapi.model.Judge;
import br.dcc.ufmg.feedbackapi.feedbackapi.repository.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/judges")
public class JudgeResource {

    @Autowired
    private JudgeRepository repository;

    @GetMapping
    public List<Judge> findAll() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Judge judge) {
        repository.save(judge);
    }

}

