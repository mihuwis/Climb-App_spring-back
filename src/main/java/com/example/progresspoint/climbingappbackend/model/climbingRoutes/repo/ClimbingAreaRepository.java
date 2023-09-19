package com.example.progresspoint.climbingappbackend.model.climbingRoutes.repo;

import com.example.progresspoint.climbingappbackend.model.climbingRoutes.ClimbingArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ClimbingAreaRepository extends JpaRepository<ClimbingArea, Long> {

    @Query(value = "SELECT country FROM ClimbingArea")
    Set<String> findAllCountries();
}
