package com.example.progresspoint.climbingappbackend.model.climbingRoutes.repo;

import com.example.progresspoint.climbingappbackend.model.climbingRoutes.ClimbingArea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimbingLineRepository extends JpaRepository<ClimbingArea, Long> {
}
