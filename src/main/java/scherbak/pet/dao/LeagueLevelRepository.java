package scherbak.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import scherbak.pet.model.LeagueLevel;

@Repository
public interface LeagueLevelRepository extends CrudRepository<LeagueLevel, Long> {
}
