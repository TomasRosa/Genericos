import java.util.ArrayList;
///Preguntar si esta bien..
public class Contenedor <T>
{
    private ArrayList<? extends T> arrayListG;

    public Contenedor ()
    {
        this.arrayListG = new ArrayList<>();
    }
    public void agregarElemento (T elem)
    {
        // No se puede agregar directamente al ArrayList, ya que su tipo es desconocido
        // Puedes lanzar una excepción o simplemente no hacer nada en este caso
        // PREGUNTAR...
        throw new UnsupportedOperationException("No se puede agregar elementos al contenedor");
    }
    public void mostrarElementos ()
    {
        for(T elemento: this.arrayListG)
        {
            System.out.println(elemento);
        }
    }
}
