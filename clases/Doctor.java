package clases;

public class Doctor extends Trabajador {
    String especialidadDelDoctor; 

    public Doctor(String nombre,int edad,String identificadorDeTrabajo,String areaDondeDesempeña,String especialidadDelDoctor){
        super(nombre, edad, identificadorDeTrabajo, areaDondeDesempeña);
        this.especialidadDelDoctor = especialidadDelDoctor;
    }

    @Override
    public void realizarTarea(){
        String mensaje = String.format("""
                El doctor %s
                se encuentar en el area %s
                y se especializa en %s
                """,getNombre(), areaDondeDesempeña, especialidadDelDoctor);
        System.out.println(mensaje);
    }

    public void realizarTarea(Paciente p){
        String mensaje  = String.format("""
                El doctor le da el diagnostico al paciente %s
                """,p.getNombre());
        System.out.println(mensaje);
    }
}
