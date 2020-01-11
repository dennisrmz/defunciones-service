package igf.g6.defuncionesservice.resources;

import igf.g6.defuncionesservice.models.Defuncion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class defuncionController {

    @Autowired
    private defuncionService defuncionService;

    //Ruta y Metodo Para Obtener Todas Las Defunciones
    @RequestMapping("/defunciones")
    public List<Defuncion> getAllDefunciones(){
        return defuncionService.getAllDefunciones();
    }

    //Ruta y Metodo Para Obtener Una Defuncion
    @RequestMapping("/defunciones/{id}")
    public Defuncion getDefuncion(@PathVariable Long id){
        return defuncionService.getDefuncion(id);
    }

    //Ruta y Metodo Para Obtener Una Defuncion por nombres y apellidoss
    @RequestMapping("/defunciones/buscarDefuncion/{primer_nombre}/{segundo_nombre}/{primer_apellido}/{segundo_apellido}")
    public List<Defuncion> getDefuncionNombres(@PathVariable String primer_nombre,@PathVariable String segundo_nombre,
                                             @PathVariable String primer_apellido, @PathVariable String segundo_apellido){
        return defuncionService.getDefuncionNombre(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido);
    }

    //Ruta y Metodo Para Agregar una Defuncion
    @RequestMapping(method = RequestMethod.POST, value = "/defunciones")
    public void addDefuncion(@RequestBody Defuncion defuncion){
        defuncionService.addDefuncion(defuncion);
    }
}
