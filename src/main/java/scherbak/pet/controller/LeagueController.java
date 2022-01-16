package scherbak.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scherbak.pet.dto.LeagueDTO;
import scherbak.pet.service.LeagueService;

import java.util.List;

@RestController
@RequestMapping("/league")
public class LeagueController {
    @Autowired
    private LeagueService leagueService;

    @GetMapping
    public List<LeagueDTO> get() {
        return leagueService.findAll();
    }
}
