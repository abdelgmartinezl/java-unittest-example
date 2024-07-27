import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void testNombreCompleto() {
        Persona persona = new Persona("Petra", "Petrov", 25);
        assertEquals("Petra Petrov", persona.getFullName());
    }

    @Test
    public void testEdad() {
        Persona persona = new Persona("Susana", "Perez", 30);
        persona.setEdad(35);
        assertEquals(35, persona.getEdad());
    }

    @Test
    public void testEdadNegativa() {
        Persona persona = new Persona("Toribia", "Paz", 20);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            persona.setEdad(-5);
        });
        assertEquals("Edad no puede ser negativo.", exception.getMessage());
    }

    @Test
    public void testNombre() {
        Persona persona = new Persona("Serafin", "Luna", 40);
        persona.setNombre("Roberto");
        assertEquals("Roberto", persona.getNombre());
    }

    @Test
    public void testApellido() {
        Persona persona = new Persona("Rocko", "Valiente", 22);
        persona.setApellido("Dominguez");
        assertEquals("Dominguez", persona.getApellido());
    }

}