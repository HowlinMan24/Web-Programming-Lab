package com.demotest.wplab1.repository;

import com.demotest.wplab1.bootstrap.DataHolder;
import com.demotest.wplab1.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocationRepository {

    public Optional<List<Location>> findAll() {
        return Optional.of(DataHolder.locations);
    }
}