package stefanmonko.sk.servisimocatalog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComponentRepository extends JpaRepository<Component, Integer> {
    List<Component> findAll();

    Integer findComponentById(Integer id);

    Component findComponentByName(String name);
}
