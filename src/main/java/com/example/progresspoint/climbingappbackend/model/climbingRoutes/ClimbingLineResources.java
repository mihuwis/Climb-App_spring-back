package com.example.progresspoint.climbingappbackend.model.climbingRoutes;

import com.example.progresspoint.climbingappbackend.model.climbingRoutes.repo.ClimbingLineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClimbingLineResources {

    private ClimbingLineRepository repository;

    public ClimbingLineResources(ClimbingLineRepository repository) {
        this.repository = repository;
    }

    @GetMapping("v1/climbing-lines")
    public List<ClimbingLine> getAllClimbingLines(){
        return repository.findAll();
    }


}
