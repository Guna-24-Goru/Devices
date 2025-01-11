package com.devices.Devices.Repo;

import com.devices.Devices.entity.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepo extends CrudRepository<Device,String> {

}
