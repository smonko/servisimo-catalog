package stefanmonko.sk.servisimocatalog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import stefanmonko.sk.servisimocatalog.domain.Severity;
import stefanmonko.sk.servisimocatalog.domain.SeverityRepository;

@RestController
public class SeverityController {

    @Autowired
    private SeverityRepository severityRepository;
    
    @RequestMapping("/severities")
    public @ResponseBody Iterable<Severity> getAllSeverities() {
        return severityRepository.findAllByOrderByIdAsc();
    }

    @RequestMapping("/severitybyid/{id}")
    public @ResponseBody Severity getSeverity(@PathVariable("id") Integer id) {    
        return severityRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }   
}
    

