package scherbak.pet.model;

import lombok.Getter;
import lombok.Setter;
import scherbak.pet.model.base.Handbook;

import javax.persistence.*;

/**
 * Уровень лиги
 */
@Entity(name = "leagueLevel")
@Table(name = "league_level")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "league_level_id")),
        @AttributeOverride(name = "name", column = @Column(name = "league_level_name"))
})
@Getter
@Setter
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "league_level_league_level_id_seq", allocationSize = 1)
public class LeagueLevel extends Handbook {
}
