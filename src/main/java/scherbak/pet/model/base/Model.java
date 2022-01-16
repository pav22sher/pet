package scherbak.pet.model.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
@Getter
@Setter
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "ID_SEQUENCE", allocationSize = 1)
public class Model {
    @Id
    protected Long id;
}