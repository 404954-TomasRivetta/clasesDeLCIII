package utn.LCIII;

public class Hijo extends Persona{

    private int dni;

    public Hijo(String nombre, String apellido,int edad, int dni){
        //llamo al constructor de la clase padre
        super(nombre,apellido,edad);
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Hijo{" +
                "Nombre: " + this.getNombre() +
                ", Apellido: " + this.getApellido() +
                ", Edad: " + this.getEdad() +
                "dni=" + dni +
                '}';
    }
}
