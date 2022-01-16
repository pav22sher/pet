package scherbak.pet.mapper;

import org.mapstruct.Mapper;
import scherbak.pet.dto.LeagueLevelDTO;
import scherbak.pet.model.LeagueLevel;

import java.util.List;

@Mapper
public interface LeagueLevelMapper {
    LeagueLevelDTO toDto(LeagueLevel entity);
    List<LeagueLevelDTO> toDtos(Iterable<LeagueLevel> entities);
}
