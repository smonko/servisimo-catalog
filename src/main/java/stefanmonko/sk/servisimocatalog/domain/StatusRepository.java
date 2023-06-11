package stefanmonko.sk.servisimocatalog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Integer> {
    List<Status> findAll();
    List<Status> findAllByOrderByIdAsc();

    Integer findStatusById(Integer id);
} 
