package com.example.progresspoint.climbingappbackend.model.climbingRoutes.repo;

import com.example.progresspoint.climbingappbackend.model.climbingRoutes.ClimbingLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClimbingLineRepository extends JpaRepository<ClimbingLine, Long> {
    List<ClimbingLine> findByName(String name);

}
