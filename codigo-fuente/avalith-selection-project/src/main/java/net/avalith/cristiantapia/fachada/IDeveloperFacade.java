package net.avalith.cristiantapia.fachada;

import java.util.List;
import net.avalith.cristiantapia.modelo.developer;

public interface IDeveloperFacade {
	public List<developer> findAll();
	public void createDeveloper(developer devep);
	public void editDeveloper(Long id, developer devep);
	public void deleteDeveloper(Long id);
	public developer findByID(Long id);
}
