package guia5java;

//DEFINIMOS LA CLASE ALUMNO QUE HEREDA DE LA CLASE PERSONA
public class Alumno extends Persona {
    //DEFINIMOS VARIABLES

    protected double nota;
    //CONSTRUCTOR DE LA SUBCLASE

    public Alumno(String nombre, int id, double nota) {
        //es como usar el constructor de la clase padre SUPER
        super(nombre, id);
        this.nota = nota;
    }

    //METODOS DE LA CLASE
    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return this.nota;
    }

    public void mostrar() {
        System.out.println(getNombre() + " " + getEdad() + " " + getNota());
    }
}  
