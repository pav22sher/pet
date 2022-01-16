package scherbak.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import scherbak.pet.model.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Long> {
}
