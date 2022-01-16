package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.PositionRepository;
import scherbak.pet.dto.PositionDTO;
import scherbak.pet.mapper.PositionMapper;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private PositionMapper positionMapper;

    public List<PositionDTO> findAll(){
        return positionMapper.toDtos(positionRepository.findAll());
    }
}
