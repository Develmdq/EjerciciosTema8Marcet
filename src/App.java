public class App {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Eduardo");
        System.out.println("Nombre: " + persona.getNombre());
        persona.setEdad(49);
        System.out.println("Edad: " + persona.getEdad() + " años");
        persona.setTelefono(12345678);
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
