package net.avalith.cristiantapia.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.avalith.cristiantapia.modelo.developer;
import net.avalith.cristiantapia.persistencia.IDeveloperDAO;

@Service
public class DeveloperFacade implements IDeveloperFacade {

	@Autowired
	private IDeveloperDAO developerDAO;
	
	@Override
	@Transactional(timeout = 50, readOnly = true)
	public List<developer> findAll() {
		return (List<developer>) developerDAO.findAll();
	}

	@Override
	public void createDeveloper(developer devep) {
		developerDAO.save(devep);
	}

	@Override
	public void editDeveloper(Long id, developer devep) {
		developer dev = findByID(id);
		dev.setNombres_completos(devep.getNombres_completos());
		dev.setLink_github(devep.getLink_github());
		dev.setTecnologias_conocidas(devep.getTecnologias_conocidas());
		developerDAO.save(dev);

	}

	@Override
	public void deleteDeveloper(Long id) {
		developerDAO.deleteById(id);
	}

	@Override
	@Transactional(timeout = 50, readOnly = true)
	public developer findByID(Long id) {
		return developerDAO.findById(id).orElse(null);
	}

}
