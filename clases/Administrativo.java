package clases;

public class Administrativo extends Trabajador {
    String cargoAdministrativo ; 

    public Administrativo(String nombre,int edad,String identificadorDeTrabajo,String areaDondeDesempeña,String cargoAdministrativo){
        super(nombre, edad, identificadorDeTrabajo, areaDondeDesempeña);
        this.cargoAdministrativo = cargoAdministrativo;
    }

    @Override
    public void realizarTarea(){
        String mensaje = String.format("""
                El administrativo %s
                con el cargo de %s
                se en cuentar en el area %s
                """,getNombre(), cargoAdministrativo, areaDondeDesempeña);
        System.out.println(mensaje);
    }

    public void realizarTarea(Paciente p){
        String mensaje  = String.format("""
                El administrativo ayuda al paciente %s, en lo que necesite
                """,p.getNombre());
        System.out.println(mensaje);
    }
}
