package com.digital.vehicleservice.repository;

import com.digital.vehicleservice.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    @Query("{brand:'?0'}")
    Vehicle findItemByBrand(String brand);

    public long count();
}
