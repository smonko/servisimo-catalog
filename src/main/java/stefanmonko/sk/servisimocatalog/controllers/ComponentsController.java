package stefanmonko.sk.servisimocatalog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import stefanmonko.sk.servisimocatalog.domain.Component;
import stefanmonko.sk.servisimocatalog.domain.ComponentRepository;

@RestController
public class ComponentsController {

    @Autowired
    private ComponentRepository componentRepository;

    @RequestMapping("/components")
    public @ResponseBody Iterable<Component> getAll_Components() {
        return componentRepository.findAll();

    }

    @RequestMapping("/componentbyid/{id}")
    public Component getComponentById(@PathVariable("id") Integer id) {
        return componentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    
}
