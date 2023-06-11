package stefanmonko.sk.servisimocatalog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SeverityRepository extends JpaRepository<Severity, Integer> {
    List<Severity> findAll();
    List<Severity> findAllByOrderByIdAsc();

    Integer findSeverityById(Integer id);
}
