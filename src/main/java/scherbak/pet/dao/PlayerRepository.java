package scherbak.pet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import scherbak.pet.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
