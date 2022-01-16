package scherbak.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import scherbak.pet.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
}
