package com.digital.vehicleservice.service;

import com.digital.vehicleservice.domain.Vehicle;
import com.digital.vehicleservice.repository.VehicleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    Logger logger = LoggerFactory.getLogger(VehicleService.class);

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(String id, Vehicle vehicle) {
        Vehicle updatedVehicle = new Vehicle();
        Optional<Vehicle> existingVehicle
                = vehicleRepository.findById(id);

        if (existingVehicle.isPresent()) {
            updatedVehicle.setId(id);
            updatedVehicle.setModel(vehicle.getModel());
            updatedVehicle.setMileage(vehicle.getMileage());
            updatedVehicle.setDescription(vehicle.getDescription());
            updatedVehicle.setPrice(vehicle.getPrice());
            updatedVehicle.setType(vehicle.getType());
            updatedVehicle.setYear(vehicle.getYear());
            updatedVehicle.setImageUrl(vehicle.getImageUrl());
            updatedVehicle.setColor(vehicle.getColor());
            updatedVehicle.setBrand(vehicle.getBrand());

            return vehicleRepository.save(updatedVehicle);
        }

        return updatedVehicle;
    }

    public Optional<Vehicle> getVehicle(String id) {
        return vehicleRepository.findById(id);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public void deleteVehicle(String id) {
        vehicleRepository.deleteById(id);
    }
}
