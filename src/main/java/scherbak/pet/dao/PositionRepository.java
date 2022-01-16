package scherbak.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import scherbak.pet.model.Position;

@Repository
public interface PositionRepository extends CrudRepository<Position, Long> {
}
