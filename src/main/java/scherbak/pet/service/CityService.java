package scherbak.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scherbak.pet.dao.CityRepository;
import scherbak.pet.dto.CityDTO;

import java.util.Collections;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<CityDTO> findAll(){
        return Collections.emptyList();
    }
}
