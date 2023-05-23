public class EmpleadoPunto8 extends PersonaProbarComparable
{
    private String nombreTrabajo;

    public EmpleadoPunto8(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public EmpleadoPunto8(String nombre, int edad, String nombreTrabajo) {
        super(nombre, edad);
        this.nombreTrabajo = nombreTrabajo;
    }
}
