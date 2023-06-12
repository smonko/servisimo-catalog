package stefanmonko.sk.servisimocatalog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import stefanmonko.sk.servisimocatalog.domain.WorkerRepository;

@RestController
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @RequestMapping("/workers")  
    public @ResponseBody Iterable<stefanmonko.sk.servisimocatalog.domain.Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @RequestMapping("/workerbyid/{id}")
    public @ResponseBody stefanmonko.sk.servisimocatalog.domain.Worker getWorker(Integer id) {
        return workerRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }
    
}
