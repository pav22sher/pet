package scherbak.pet.model;


import lombok.Getter;
import lombok.Setter;
import scherbak.pet.model.base.Handbook;

import javax.persistence.*;

@Entity(name = "position")
@Table(name = "position")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "position_id")),
        @AttributeOverride(name = "name", column = @Column(name = "position_name"))
})
@Getter
@Setter
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "position_position_id_seq", allocationSize = 1)
public class Position extends Handbook {
}
