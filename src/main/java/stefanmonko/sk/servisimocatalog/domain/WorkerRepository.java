package stefanmonko.sk.servisimocatalog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    List<Worker> findAll();

    Integer findWorkerById(Integer id);

}

