package scherbak.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import scherbak.pet.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
