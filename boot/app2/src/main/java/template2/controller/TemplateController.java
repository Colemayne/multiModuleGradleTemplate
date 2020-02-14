package template2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TemplateController {

    @RequestMapping(path = "/alive", method = RequestMethod.GET)
    public ResponseEntity<String> alive() {
        return ResponseEntity.ok().body("Alive");
    }
}

