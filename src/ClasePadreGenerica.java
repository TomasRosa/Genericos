public abstract class ClasePadreGenerica <T>
{
    int valor = 0;
    public ClasePadreGenerica ()
    {

    }
    public ClasePadreGenerica (int valor)
    {
        this.valor = valor;
    }public abstract void mostrarValor();
}
