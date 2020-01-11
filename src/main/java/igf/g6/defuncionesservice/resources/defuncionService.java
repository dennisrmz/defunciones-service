package igf.g6.defuncionesservice.resources;

import igf.g6.defuncionesservice.interfaces.defuncionRepository;
import igf.g6.defuncionesservice.models.Defuncion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class defuncionService {
    @Autowired
    private defuncionRepository defuncionRepository;

    //Mostrando Todas las defunciones
    public List<Defuncion> getAllDefunciones(){
        List<Defuncion> defunciones = new ArrayList<>();
        defuncionRepository.findAll().forEach(defunciones::add);
        return defunciones;
    }

    //Mostrando Una Defuncion Especifica
    public Defuncion getDefuncion(Long id) {
        return defuncionRepository.findById(id).get();
    }

    //Mostrando Una Defuncion Especifica buscada por nombres
    public List<Defuncion> getDefuncionNombre(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido) {
        List<Defuncion> defunciones = new ArrayList<>();
        defuncionRepository.findAll().forEach(defunciones::add);
        List<Defuncion> defuncionEncontrada = new ArrayList<>();

        for (int i = 0; i < defunciones.size() ; i++) {
            if (primer_nombre.equals(defunciones.get(i).getPrimer_nombre()) && segundo_nombre.equals(defunciones.get(i).getSegundo_nombre() )
                    && primer_apellido.equals(defunciones.get(i).getPrimer_apellido()) && segundo_apellido.equals(defunciones.get(i).getSegundo_apellido()) ) {
                defuncionEncontrada.add(defunciones.get(i));

            }
        }
        return defuncionEncontrada;
    }

    //Agregando Una Defuncion
    public void addDefuncion(Defuncion defuncion) {
        defuncionRepository.save(defuncion);
    }

}
