package stefanmonko.sk.servisimocatalog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class StatusController {

    @Autowired
    private stefanmonko.sk.servisimocatalog.domain.StatusRepository statusRepository;

    @RequestMapping("/statuses")
    public @ResponseBody Iterable<stefanmonko.sk.servisimocatalog.domain.Status> getAllStatuses() {
        return statusRepository.findAllByOrderByIdAsc();
    }

    @RequestMapping("/statusbyid/{id}")
    public @ResponseBody stefanmonko.sk.servisimocatalog.domain.Status getStatus(@PathVariable("id") Integer id) {
        return statusRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    
}
