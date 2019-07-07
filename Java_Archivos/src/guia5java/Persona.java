package guia5java;

public class Persona {

    //DECLARACION DE VARIABLES
    private String nombre;
    private int edad;

    //CONSTRUCTOR DE LA CLASE
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "sebajun";
        this.edad = 29;
    }

    //METODOS SETTER Y GETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
