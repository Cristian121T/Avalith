package net.avalith.cristiantapia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.avalith.cristiantapia.fachada.IDeveloperFacade;
import net.avalith.cristiantapia.modelo.developer;

@RestController
public class DeveloperController {

	@Autowired
	private IDeveloperFacade developerFacade;

	@GetMapping(path = "/developers", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<developer> findDevelopers() {
		return developerFacade.findAll();
	}

	@PostMapping(path = "/developers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String createDevelopers(@RequestBody developer devep) {
		try {
			developerFacade.createDeveloper(devep);
			return "{\"codResp\":\"000\",\"msgResp\":\"Developer created successfully\"}";
		} catch (Exception ex) {
			return "{\"codResp\":\"500\",\"msgResp\":\"Developer created error\"}";
		}
	}

	@PutMapping(path = "/developers/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String editDeveloper(@PathVariable Long id, @RequestBody developer devep) {
		try {
			developerFacade.editDeveloper(id, devep);
			return "{\"codResp\":\"000\",\"msgResp\":\"Developer edited successfully\"}";
		} catch (Exception ex) {
			return "{\"codResp\":\"500\",\"msgResp\":\"Developer edited error\"}";
		}
	}

	@DeleteMapping(path = "/developers/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String deleteDeveloper(@PathVariable Long id) {
		try {
			developerFacade.deleteDeveloper(id);
			return "{\"codResp\":\"000\",\"msgResp\":\"Developer deleted successfully\"}";
		} catch (Exception ex) {
			return "{\"codResp\":\"500\",\"msgResp\":\"Developer deleted error\"}";
		}
	}

	@GetMapping(path = "/developers/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public developer findDeveloper(@PathVariable Long id) {
		return developerFacade.findByID(id);
	}

}
