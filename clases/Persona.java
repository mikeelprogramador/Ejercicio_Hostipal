package clases;

public class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre,int edad){
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre){
        if(!nombre.trim().isEmpty()){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre no puede estar vacio");
        }
    }

    public void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
        }else{
            System.out.println("La edad tiene que ser mayor a cero!");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre de la persona: "+nombre+" Edad de la perosna: "+edad);
    }

}