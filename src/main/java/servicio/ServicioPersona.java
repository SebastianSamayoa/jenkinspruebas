package servicio;

import modelo.Person;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class ServicioPersona {
    Hashtable<String, Person> Personas = new Hashtable<String, Person>();

    public ServicioPersona() {
        Person p = new Person();
        p.setId("1");
        p.setNombre("Jhoan");
        p.setApellido("Samayoa");
        p.setEdad(26);

        Personas.put("1",p);
    }

    public Person getPersona(String id){

        if (Personas.containsKey(id)){
            return Personas.get(id);
        }else{return null;}

    }

    public Hashtable<String, Person> getPersonas() {
        return Personas;
    }
}
