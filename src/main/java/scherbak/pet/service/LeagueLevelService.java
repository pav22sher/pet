package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.LeagueLevelRepository;
import scherbak.pet.dto.LeagueLevelDTO;
import scherbak.pet.mapper.LeagueLevelMapper;

import java.util.List;

@Service
public class LeagueLevelService {
    @Autowired
    private LeagueLevelRepository leagueLevelRepository;
    @Autowired
    private LeagueLevelMapper leagueLevelMapper;

    public List<LeagueLevelDTO> findAll(){
        return leagueLevelMapper.toDtos(leagueLevelRepository.findAll());
    }
}
