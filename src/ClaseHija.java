import java.util.List;
import java.util.Objects;

public class ClaseHija <T extends ClasePadreGenerica > extends ClasePadreGenerica<T>///preguntar
{
    int valor = 0;

    public ClaseHija ()
    {

    }
    public ClaseHija (int valor)
    {
        this.valor = valor;
    }

    @Override
    public void mostrarValor() {
        System.out.println(this.valor);
    }


    public boolean compararElementosIdentidad (T elemento1, T elemento2)
    {
       return elemento1 == elemento2;
    }
    public boolean compararElementosIgualdad (T elemento1, T elemento2)
    {
        return elemento1.equals(elemento2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaseHija<?> claseHija = (ClaseHija<?>) o;
        return valor == claseHija.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    public  <T extends ClasePadreGenerica> void imprimirElementos(List<T> lista)
    {
        for(T elementos: lista)
        {
            System.out.println(elementos);
        }
    }
}
