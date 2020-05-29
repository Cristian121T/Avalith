package net.avalith.cristiantapia.persistencia;

import org.springframework.data.repository.CrudRepository;
import net.avalith.cristiantapia.modelo.developer;

public interface IDeveloperDAO extends CrudRepository<developer, Long> {
}
