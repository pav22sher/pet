package scherbak.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scherbak.pet.dto.LeagueLevelDTO;
import scherbak.pet.service.LeagueLevelService;

import java.util.List;

@RestController
@RequestMapping("/league-level")
public class LeagueLevelController {
    @Autowired
    private LeagueLevelService leagueLevelService;

    @GetMapping
    public List<LeagueLevelDTO> get() {
        return leagueLevelService.findAll();
    }
}
