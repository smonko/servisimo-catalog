package stefanmonko.sk.servisimocatalog.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ticketstatus")
@Getter
@Setter
public class Status {

    @Id
    private Integer id;

    private String status;
    
}
