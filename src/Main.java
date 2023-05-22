import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ver: ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                listaGenerica<String> listaString = new listaGenerica<>();

                listaString.agregarElementos("Hola");
                listaString.agregarElementos("Adios");

                System.out.println("Lista de strings: ");
                listaString.mostrarLista();

                System.out.println("Tamaño de la lista de strings: " + listaString.tamanioDeLaLista());

                listaGenerica<Integer> listaInteger = new listaGenerica<>();

                listaInteger.agregarElementos(1);
                listaInteger.agregarElementos(2);
                listaInteger.agregarElementos(3);

                System.out.println("Lista de enteros: ");
                listaInteger.mostrarLista();

                System.out.println("Tamaño de la lista de enteros: " + listaInteger.tamanioDeLaLista());

                System.out.println("Ingrese la posicion del elemento que desea ver de la lista de enteros. ");
                int pos = scan.nextInt();

                int retorno = listaInteger.obtenerElementoPosEspecifica(pos);
                System.out.println("Numero obtenido: " + retorno);
                ///Punto 2
                System.out.println("Ingrese las posiciones que desea intercambiar en el arreglo de Enteros.");
                System.out.println("Pos 1: ");
                int pos1 = scan.nextInt();
                System.out.println("Pos 2: ");
                int pos2 = scan.nextInt();

                listaInteger.intercambiarElementos(pos1,pos2);

                System.out.println("Lista luego de haber intercambiado elementos: ");
                listaInteger.mostrarLista();

                System.out.println("Ingrese las posiciones que desea intercambiar en el arreglo de Strings.");
                System.out.println("Pos 1: ");
                int pos1S = scan.nextInt();
                System.out.println("Pos 2: ");
                int pos2S = scan.nextInt();

                listaString.intercambiarElementos(pos1S,pos2S);

                System.out.println("Lista luego de haber intercambiado elementos: ");
                listaString.mostrarLista();

                break;
            }
            case 2:
            {
                ///Punto 3
                pilaGenerica pilita = new pilaGenerica<>();

                pilita.agregarElementoALaPila(1.6);
                pilita.agregarElementoALaPila(0.9);
                pilita.agregarElementoALaPila(3L);
                pilita.agregarElementoALaPila(5);
                pilita.agregarElementoALaPila(9);

                System.out.println("Pila: ");
                pilita.mostrar();

                System.out.println("Tope de la pila: " + pilita.tope());

                if(pilita.estaVacia())
                {
                    System.out.println("Esta vacia. ");
                }
                else
                {
                    System.out.println("Tiene datos. ");
                }
                ///Punto 4. Preguntar si esta bien hecho en la clase pilaGenerica
                LinkedList<Integer> linkedList = new LinkedList<>(); /// No comparable.
                linkedList.add(1);
                linkedList.add(2);
                linkedList.add(3);

                ArrayList<Double> arrayList = new ArrayList<>(); /// Utiliza comparable
                arrayList.add(3.5);
                arrayList.add(3.8);
                arrayList.add(2.2);

                System.out.println("Arraylist. Comparable: ");
                pilita.imprimirLista(arrayList);

                System.out.println("LinkedList. No comparable: ");
                pilita.imprimirLista(linkedList);

                break;
            }
        }
    }
}