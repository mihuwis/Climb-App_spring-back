package com.example.progresspoint.climbingappbackend.model.climbingRoutes;

import com.example.progresspoint.climbingappbackend.model.climbingRoutes.repo.ClimbingAreaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class ClimbingAreaResorces {

    private ClimbingAreaRepository repository;

    public ClimbingAreaResorces(ClimbingAreaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/v1/climbing-areas")
    public List<ClimbingArea> getAllClimbingAreas(){
        return repository.findAll();
    }

    @GetMapping("/v1/climbing-areas/{id}")
    public ClimbingArea getClimbingAreaById(@PathVariable Long id){
        return repository.getReferenceById(id);
    }

    @GetMapping("v1/climbing-areas/countries")
    public Set<String> findAllCountries(){
        return repository.findAllCountries();
    }


}
