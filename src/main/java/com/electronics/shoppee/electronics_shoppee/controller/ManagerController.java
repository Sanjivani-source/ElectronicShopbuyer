package com.electronics.shoppee.electronics_shoppee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.shoppee.electronics_shoppee.entity.ManagerEntity;
import com.electronics.shoppee.electronics_shoppee.model.ManagerDTO;
import com.electronics.shoppee.electronics_shoppee.service.IManagerService;


@RestController
public class ManagerController {
	
	@Autowired
	private IManagerService iManagerService;
	
	@PostMapping("/add-manager")
	ResponseEntity<ManagerEntity> addManager(@RequestBody ManagerDTO managerDTO) {
		return new ResponseEntity<ManagerEntity>(iManagerService.addManager(managerDTO),HttpStatus.OK);
	}
	
	@PutMapping("/update-manager")
	ResponseEntity<ManagerEntity> updateManager(@RequestParam int id,@RequestBody ManagerDTO managerDTO) {
		return new ResponseEntity<ManagerEntity>(iManagerService.updateManager(id,managerDTO),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-manager")  
	ResponseEntity<ManagerEntity> deleteManager(@RequestParam int id) {
		return new ResponseEntity<ManagerEntity>(iManagerService.deleteManager(id),HttpStatus.OK);
	}

	@GetMapping("/get-manager-by-id")
	ResponseEntity<ManagerEntity> getManagerId(@RequestParam int id) {
		return new ResponseEntity<ManagerEntity>(iManagerService.getManagerId(id),HttpStatus.OK);
	}
	
	@GetMapping("/get-all-manager")
	List<ManagerEntity> getAllManager() {
		return iManagerService.getAllManager();
	}
}
