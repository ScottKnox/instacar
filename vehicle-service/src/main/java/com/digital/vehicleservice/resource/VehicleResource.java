package com.digital.vehicleservice.resource;

import com.digital.vehicleservice.domain.Vehicle;
import com.digital.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleResource {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @RequestMapping(value = "{vehicleId}", method = RequestMethod.PUT)
    public Vehicle updateVehicle(@PathVariable String vehicleId,
            @RequestBody Vehicle vehicle) {
        return vehicleService.updateVehicle(vehicleId, vehicle);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @RequestMapping(value = "/{vehicleId}", method = RequestMethod.GET)
    public Optional<Vehicle> getVehicle(@PathVariable String vehicleId) {
        return vehicleService.getVehicle(vehicleId);
    }

    @RequestMapping(value = "/{vehicleId}", method = RequestMethod.DELETE)
    public void deleteVehicle(@PathVariable String vehicleId) {
        vehicleService.deleteVehicle(vehicleId);
    }

}