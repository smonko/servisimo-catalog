package stefanmonko.sk.servisimocatalog.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "workers")
@Getter
@Setter
public class Worker {

    @Id
    private Integer id;

    private String name;

    private String email;
}
