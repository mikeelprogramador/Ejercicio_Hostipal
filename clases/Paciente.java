package clases;

public class Paciente extends Persona {
    String diagnosticoMedico ;

    public Paciente(String nombre,int edad,String diagnosticoMedico){
        super(nombre, edad);
        this.diagnosticoMedico = diagnosticoMedico;
    }

    @Override    
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("informe medico del paciente: "+diagnosticoMedico);
    }
}
