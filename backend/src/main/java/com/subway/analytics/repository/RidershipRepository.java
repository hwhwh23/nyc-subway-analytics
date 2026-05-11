package com.subway.analytics.repository;

import com.subway.analytics.model.Ridership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RidershipRepository extends JpaRepository<Ridership, Long> {

    @Query(value = """
        SELECT station, SUM(ridership) AS total_ridership
        FROM ridership
        GROUP BY station
        ORDER BY total_ridership DESC
        LIMIT 10
        """, nativeQuery = true)
    List<Object[]> findBusiestStations();


    @Query(value = """
    SELECT hour, SUM(ridership) AS total_ridership
    FROM ridership
    GROUP BY hour
    ORDER BY hour
    """, nativeQuery = true)
    List<Object[]> findHourlyTraffic();

    @Query(value = """
        SELECT DISTINCT station
        FROM ridership
        ORDER BY station
        """, nativeQuery = true)
    List<String> findAllStations();

}