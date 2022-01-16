package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.LeagueLevelRepository;
import scherbak.pet.dto.LeagueLevelDTO;

import java.util.Collections;
import java.util.List;

@Service
public class LeagueLevelService {
    @Autowired
    private LeagueLevelRepository leagueLevelRepository;

    public List<LeagueLevelDTO> findAll(){
        return Collections.emptyList();
    }
}
