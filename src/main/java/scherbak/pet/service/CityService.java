package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.CityRepository;
import scherbak.pet.dto.CityDTO;
import scherbak.pet.mapper.CityMapper;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private CityMapper cityMapper;

    public List<CityDTO> findAll(){
        return cityMapper.toDtos(cityRepository.findAll());
    }
}
