package scherbak.pet.model;

import scherbak.pet.model.base.Handbook;

import javax.persistence.*;

/**
 * Команда
 */
@Entity(name = "team")
@Table(name = "team")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "team_id")),
        @AttributeOverride(name = "name", column = @Column(name = "team_name"))
})
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "team_team_id_seq", allocationSize = 1)
public class Team extends Handbook {
}