package scherbak.pet.mapper;

import org.mapstruct.Mapper;
import scherbak.pet.dto.PlayerDTO;
import scherbak.pet.model.Player;

import java.util.List;

@Mapper
public interface PlayerMapper {
    PlayerDTO toDto(Player entity);
    List<PlayerDTO> toDtos(Iterable<Player> entities);
}
