package igf.g6.defuncionesservice.interfaces;

import igf.g6.defuncionesservice.models.Defuncion;
import org.springframework.data.repository.CrudRepository;

public interface defuncionRepository extends CrudRepository<Defuncion, Long> {
}
