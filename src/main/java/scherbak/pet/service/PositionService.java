package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.PositionRepository;
import scherbak.pet.dto.PositionDTO;

import java.util.Collections;
import java.util.List;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;

    public List<PositionDTO> findAll(){
        return Collections.emptyList();
    }
}
