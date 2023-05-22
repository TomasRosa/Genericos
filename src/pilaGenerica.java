import java.util.List;
import java.util.Stack;

public class pilaGenerica<T extends Number> ///Preguntar si esta es la restriccion.
{
    private Stack<T> pilaGenericaNumber;

    public pilaGenerica ()
    {
        this.pilaGenericaNumber = new Stack<>();
    }
    public void agregarElementoALaPila (T elemento)
    {
        this.pilaGenericaNumber.push(elemento);
    }
    public T desapilar () //Preguntar como guardo datos de metodos que retornan genericos.
    {
        T guardar = this.pilaGenericaNumber.get(this.pilaGenericaNumber.size()-1);
        this.pilaGenericaNumber.remove(this.pilaGenericaNumber.size()-1);
        return guardar;
    }
    public T tope ()
    {
        return this.pilaGenericaNumber.get(this.pilaGenericaNumber.size()-1);
    }
    public boolean estaVacia ()
    {
        return this.pilaGenericaNumber.isEmpty();
    }
    public void mostrar ()
    {
        for(int i = 0; i<  this.pilaGenericaNumber.size(); i++)
        {
            System.out.println(this.pilaGenericaNumber.get(i));
        }
    }
    public <T extends Comparable<T>> void imprimirLista (List<T> listaComparable)///Preguntar xq imprime si o si. ESTA MAL.
    {
        for(T elemento: listaComparable)
        {
            System.out.println(elemento);
        }
    }
}
