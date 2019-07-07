package persona;

public class Persona {
    //DECLARACION DE VARIABLES
    protected String nombre;
    protected int id;
    //UNICO CONSTRUCTOR DE LA CLASE
    public Persona(String nombre, int id){
        this.nombre = nombre;
        this.id=id;
    }
    //METODOS SETTER Y GETTER
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public int getId(){
        return this.id;
    }
    
    public static void main(String[] args) {
        Persona pe1 = new Persona("jose",11);
        Alumno a1 = new Alumno("clau" , 18 , 6.4);
        //comprobamos que los metodos de la superclase son usables por la subclase
        System.out.println(a1.getNombre()+" "+a1.getNota());
        a1.mostrar();
        

    }
    
    
}
