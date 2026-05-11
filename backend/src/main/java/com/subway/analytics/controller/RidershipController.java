package com.subway.analytics.controller;

import com.subway.analytics.repository.RidershipRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RidershipController {

    private final RidershipRepository repository;

    public RidershipController(RidershipRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/stations/busiest")
    public List<Object[]> getBusiestStations() {
        return repository.findBusiestStations();
    }

    @GetMapping("/traffic/hourly")
    public List<Object[]> getHourlyTraffic() {
        return repository.findHourlyTraffic();
    }

    @GetMapping("/stations")
    public List<String> getStations() {
        return repository.findAllStations();
    }
}