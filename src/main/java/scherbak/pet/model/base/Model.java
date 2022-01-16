package scherbak.pet.model.base;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "ID_SEQUENCE", allocationSize = 1)
public class Model {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "ID_GENERATOR")
    protected Long id;
}