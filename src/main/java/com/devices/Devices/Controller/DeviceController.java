package com.devices.Devices.Controller;

import com.devices.Devices.DevicesApplication;
import com.devices.Devices.Service.DeviceService;
import com.devices.Devices.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DeviceController {
    @Autowired
    DeviceService service;
    @PostMapping("/insert")
    public  String insertDevice(@RequestBody Device d){
        service.insertDevice(d);
        return "Device is inserted into the DataBase-->"+d.getDeviceName();
    }
    @PutMapping("/update")
    public String updateDevice(@RequestBody Device d){
        service.updateDevice(d);
        return "Device is Updated--->"+d.getDeviceName();
    }
    @GetMapping("/getSingleDevice")
    public Optional<Device>getSingleDevice(@RequestParam("deviceName")String deviceName){
        return service.getSingleDevice(deviceName);
    }
    @GetMapping("/getAllDevice")
    public Iterable<Device>getAllDevice(){
        return service.getAllDevice();
    }
    @DeleteMapping("/deleteSingleDevice")
    public String deleteSingleDevice(@RequestParam("deviceName")String deviceName){
        service.deleteSingleDevice(deviceName);
        return "The Record is Deleted --->"+deviceName;
    }
    @DeleteMapping("/deleteAllDevices")
    public String deleteAllDevices(){
        service.deleteAllDevices();
        return "All Devices are Deleted--->";
    }
}
