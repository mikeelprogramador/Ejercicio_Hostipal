package clases;

public class Enfermera extends Trabajador{
    String turno ; 

    public Enfermera(String nombre,int edad,String identificadorDeTrabajo,String areaDondeDesempeña,String turno){
        super(nombre, edad, identificadorDeTrabajo, areaDondeDesempeña);
        this.turno = turno;
    }

    @Override
    public void realizarTarea(){
        String mensaje = String.format("""
                El enfermera %s
                se encuentar en el area %s
                y se en cuentra en el turno  %s
                """,getNombre(), areaDondeDesempeña, turno);
        System.out.println(mensaje);
    }

    public void realizarTarea(Paciente p){
        String mensaje  = String.format("""
                La enfermera le da la medicina que el doctor le indica
                para el paciente %s
                """,p.getNombre());
        System.out.println(mensaje);
    }
}
