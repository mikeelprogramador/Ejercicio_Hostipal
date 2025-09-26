import java.util.ArrayList;
import clases.*;

public class HostipalApp{
    public static void main(String[] args) {
        ArrayList<Paciente> Pacientes = new ArrayList<>();
        ArrayList<Trabajador> Trabajadores = new ArrayList<>();

        Paciente p1 = new Paciente("pepito perez", 25, "Gripa aguda");
        Paciente p2 = new Paciente("martina martinez", 20, "Gastritis");

        Pacientes.add(p1);
        Pacientes.add(p2);

        Doctor doc = new Doctor("jose manuel", 35, "jfk171", " seccion 6 consultorio 14", "doctor general");
        Enfermera enfer = new Enfermera("maria jose", 25, "ewq4", "seccion 6", "diurno");
        Administrativo admin = new Administrativo("mafe", 28, "124a", "seccion 6", "resepcinista");

        Trabajadores.add(doc);
        Trabajadores.add(enfer);
        Trabajadores.add(admin);

        for(Trabajador t: Trabajadores){
            t.realizarTarea();
            for(Paciente p: Pacientes){
                if(t instanceof Doctor){
                    ((Doctor) t).realizarTarea(p);
                }
                if(t instanceof Enfermera){
                    ((Enfermera) t).realizarTarea(p);
                }
                if(t instanceof Administrativo){
                    ((Administrativo) t).realizarTarea(p);
                }
            }
        }


    }
}