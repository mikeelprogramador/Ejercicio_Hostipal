package clases;

public class Trabajador extends Persona {
    protected String identificadorDeTrabajo ;
    protected String areaDondeDesempeña; 

    public Trabajador(String nombre,int edad,String identificadorDeTrabajo,String areaDondeDesempeña){
        super(nombre, edad);
        this.identificadorDeTrabajo = identificadorDeTrabajo;
        this.areaDondeDesempeña = areaDondeDesempeña;
    }

    public void realizarTarea(){
        System.out.println("El trabajador esta realizando una tarea...");
    }
}
