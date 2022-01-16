package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.LeagueRepository;
import scherbak.pet.dto.LeagueDTO;
import scherbak.pet.mapper.LeagueMapper;

import java.util.List;

@Service
public class LeagueService {
    @Autowired
    private LeagueRepository leagueRepository;
    @Autowired
    private LeagueMapper leagueMapper;

    public List<LeagueDTO> findAll(){
        return leagueMapper.toDtos(leagueRepository.findAll());
    }
}
