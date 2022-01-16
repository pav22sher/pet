package scherbak.pet.mapper;

import org.mapstruct.Mapper;
import scherbak.pet.dto.PositionDTO;
import scherbak.pet.model.Position;

import java.util.List;

@Mapper
public interface PositionMapper {
    PositionDTO toDto(Position entity);
    List<PositionDTO> toDtos(Iterable<Position> entities);
}
