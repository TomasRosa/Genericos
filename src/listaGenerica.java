import java.util.ArrayList;

public class listaGenerica <T>
{
    private ArrayList<T> listaGenericos;

    public listaGenerica ()
    {
        this.listaGenericos = new ArrayList<>();
    }
    public void agregarElementos (T elemento)
    {
        this.listaGenericos.add(elemento);
    }
    public void mostrarLista ()
    {
        for(T elemento: this.listaGenericos)
        {
            System.out.println(elemento);
        }
    }
    public int tamanioDeLaLista()
    {
        return this.listaGenericos.size();
    }
    public T obtenerElementoPosEspecifica (int pos)
    {
        ///Si la posicion pasada por parametro es mayor a 0 y menor al tamaño de la lista retorna
        ///el elemento que se encuentra en dicha posicion.
        if(pos >= 0 && pos <= this.listaGenericos.size())
        {
            return this.listaGenericos.get(pos);
        }
        ///Si no ocurre esto se ejecuta una excepcion que indica error.
        else
        {
            throw new RuntimeException("Error.");
        }
    }
    public void intercambiarElementos(int pos1, int pos2) ///Preguntar...
    {
        ///Si las posiciones son menores a 0 o mayores a el tamaño de la lista tira error.
        if(pos1 < 0 || pos1 >= this.listaGenericos.size() || pos2 < 0 || pos2 >= this.listaGenericos.size())
        {
            throw new RuntimeException("ERRORRRRRRRRRRRR");
        }
        ///Si no, intercambia los elementos, guarda el elemento 1 en aux para no perderlo ya que va a ser sobreescrito.
        ///Setea el elemento de la posicion 2 en la posicion 1, sobreescribiendo el valor que habia en la posicion uno, por eso anteriormente fue guardado en aux.
        ///Setea el elemento de la posicion aux (1) en la posicion 2.
        else
        {
            T aux = this.listaGenericos.get(pos1);
            this.listaGenericos.set(pos1,this.listaGenericos.get(pos2));
            this.listaGenericos.set(pos2,aux);
        }
    }
    public void intercambiarElementos (T elemento1, T elemento2)
    {
        T aux = elemento1;
        elemento1 = elemento2;
        elemento2 = aux;
    }
}
