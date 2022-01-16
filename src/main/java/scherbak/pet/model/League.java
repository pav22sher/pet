package scherbak.pet.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import scherbak.pet.model.base.Model;

import javax.persistence.*;

/**
 * Лига
 */
@Entity(name = "league")
@Table(name = "league")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "league_id"))
})
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "league_league_id_seq", allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
@Data
public class League extends Model {
    /**
     * Уровень лиги
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="league_level_id")
    private LeagueLevel level;
}