package controlador;

import modelo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.ServicioPersona;

import java.util.Hashtable;

@RestController
@RequestMapping("/Persona")
public class ControladorPersonas {

    @Autowired
    ServicioPersona pes;

    @RequestMapping("/all")
    public Hashtable<String,Person> getAll(){
        return pes.getPersonas();
    }

     @RequestMapping("{id}")
    public Person getPersona(@PathVariable("id") String id){
        return pes.getPersona(id);
     }
}
