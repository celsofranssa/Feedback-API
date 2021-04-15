package br.dcc.ufmg.feedbackapi.feedbackapi.resource;


import br.dcc.ufmg.feedbackapi.feedbackapi.model.Info;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/info")
public class InfoResource {


    @GetMapping
    public Info info() {
        Info info = new Info();
        System.out.println(info);
        return info;
    }
}