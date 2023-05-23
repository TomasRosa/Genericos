import java.util.List;

public class PersonaProbarComparable<T>
{
    private String nombre;
    private int edad;

    public PersonaProbarComparable ()
    {

    }
    public PersonaProbarComparable (String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    ///T representa el tipo generico. La restriccion T extends EmpleadoPunto8 indica que T debe ser una
    ///superclase o la misma clase de EmpleadoPunto8. De esta manera con el bucle for, el metodo imprimir
    ///elementos recorrera y mostrara una lista que dentro contenga elementos que sean superclases o la misma clase de
    ///EmpleadoPunto8.
    public <T extends EmpleadoPunto8> void imprimirElementos (List<T> lista) ///No anda...
    {
        for(T elemento: lista)
        {
            System.out.println(elemento);
        }
    }
}
