package com.devices.Devices.Service;

import com.devices.Devices.Repo.DeviceRepo;
import com.devices.Devices.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeviceService {
    @Autowired
    DeviceRepo repo;
    public void insertDevice(Device d){
        repo.save(d);
    }
    public void updateDevice(Device d){
        repo.save(d);
    }
    public Optional<Device>getSingleDevice(String deviceName){
        return repo.findById(deviceName);
    }
    public Iterable<Device>getAllDevice(){
        return  repo.findAll();
    }
    public void deleteSingleDevice(String deviceName){
        repo.deleteById(deviceName);
    }
    public void deleteAllDevices(){
        repo.deleteAll();
    }
}
