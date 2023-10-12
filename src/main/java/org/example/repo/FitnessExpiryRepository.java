package org.example.repo;

import org.example.entity.FitnessExpiry;
import org.example.RTOData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FitnessExpiryRepository extends JpaRepository<FitnessExpiry, Integer> {

    @Query(value = "SELECT rto, count(rto) FROM fitness_expiry \n" +
            "GROUP BY rto\n" +
            "ORDER BY COUNT(RTO) desc", nativeQuery = true)
    List<RTOData> findAllFitnessExpiry();

}