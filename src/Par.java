public class Par <K,V>
{
    private K claveNombre; ///key
    private V valorEdad; ///edad

    public Par ()
    {

    }
    public Par (K claveNombre, V valorEdad)
    {
        this.claveNombre = claveNombre;
        this.valorEdad = valorEdad;
    }
    public void  mostrarPar ()
    {
        System.out.println("Clave...");
        System.out.println(this.claveNombre);
        System.out.println("Valor...");
        System.out.println(this.valorEdad);
    }
}
