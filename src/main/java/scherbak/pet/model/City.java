package scherbak.pet.model;

import scherbak.pet.model.base.Handbook;

import javax.persistence.*;

/**
 * Город
 */
@Entity(name = "city")
@Table(name = "city")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "city_id")),
        @AttributeOverride(name = "name", column = @Column(name = "city_name"))
})
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "city_city_id_seq", allocationSize = 1)
public class City extends Handbook {
}