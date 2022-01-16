package scherbak.pet.mapper;

import org.mapstruct.Mapper;
import scherbak.pet.dto.LeagueDTO;
import scherbak.pet.model.League;

import java.util.List;

@Mapper
public interface LeagueMapper {
    LeagueDTO toDto(League entity);
    List<LeagueDTO> toDtos(Iterable<League> entities);
}
