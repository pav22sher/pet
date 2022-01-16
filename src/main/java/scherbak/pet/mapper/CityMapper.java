package scherbak.pet.mapper;

import org.mapstruct.Mapper;
import scherbak.pet.dto.CityDTO;
import scherbak.pet.model.City;

import java.util.List;

@Mapper
public interface CityMapper {
    CityDTO toDto(City entity);
    List<CityDTO> toDtos(Iterable<City> entities);
}
