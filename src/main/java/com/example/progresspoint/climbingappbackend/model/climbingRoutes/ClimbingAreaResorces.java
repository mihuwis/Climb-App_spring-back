package com.example.progresspoint.climbingappbackend.model.climbingRoutes;

import com.example.progresspoint.climbingappbackend.model.climbingRoutes.repo.ClimbingAreaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
