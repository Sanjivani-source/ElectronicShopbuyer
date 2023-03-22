package com.electronics.shoppee.electronics_shoppee.service;

import java.util.List;

import com.electronics.shoppee.electronics_shoppee.entity.ManagerEntity;
import com.electronics.shoppee.electronics_shoppee.model.ManagerDTO;

public interface IManagerService {

	ManagerEntity addManager(ManagerDTO managerDTO);

	ManagerEntity updateManager(int id, ManagerDTO managerDTO);

	ManagerEntity deleteManager(int id);

	ManagerEntity getManagerId(int id);

	List<ManagerEntity> getAllManager();

}
