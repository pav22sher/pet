package scherbak.pet.model;

import lombok.Getter;
import lombok.Setter;
import scherbak.pet.model.base.Model;

import javax.persistence.*;

/**
 * Игрок
 */
@Entity(name = "player")
@Table(name = "player")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "player_id"))
})
@Getter
@Setter
@SequenceGenerator( name = "ID_GENERATOR", sequenceName = "player_player_id_seq", allocationSize = 1)
public class Player  extends Model {
    /**
     * Имя
     */
    @Column(name = "player_first_name")
    private String firstName;
    /**
     * Фамилия
     */
    @Column(name = "player_last_name")
    private String lastName;
    /**
     * Отчество
     */
    @Column(name = "player_second_name")
    private String secondName;
    /**
     * Позиция
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="position_id")
    private Position position;
    /**
     * Команда
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="team_id")
    private Team team;
}
