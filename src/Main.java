import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ver: ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1: {
                ///Punto 1
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

                listaInteger.intercambiarElementos(pos1, pos2); ///ESTE CREO QUE LO HICE MAL PREGUNTAR

                System.out.println("Lista luego de haber intercambiado elementos: ");
                listaInteger.mostrarLista();

                System.out.println("Ingrese las posiciones que desea intercambiar en el arreglo de Strings.");
                System.out.println("Pos 1: ");
                int pos1S = scan.nextInt();
                System.out.println("Pos 2: ");
                int pos2S = scan.nextInt();

                listaString.intercambiarElementos(pos1S, pos2S);

                System.out.println("Lista luego de haber intercambiado elementos: ");
                listaString.mostrarLista();

                break;
            }
            case 2: {
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

                if (pilita.estaVacia()) {
                    System.out.println("Esta vacia. ");
                } else {
                    System.out.println("Tiene datos. ");
                }
                ///Punto 4. Preguntar si esta bien hecho en la clase pilaGenerica

                ArrayList<Double> arrayList = new ArrayList<>(); /// Utiliza comparable
                arrayList.add(3.5);
                arrayList.add(3.8);
                arrayList.add(2.2);

                ArrayList<PersonaProbarComparable> arrayListNoComparable = new ArrayList<>(); ///No utiliza comparable.
                PersonaProbarComparable p1 = new PersonaProbarComparable("Tomas", 15);
                PersonaProbarComparable p2 = new PersonaProbarComparable("Luquitas", 18);
                arrayListNoComparable.add(p1);
                arrayListNoComparable.add(p2);

                System.out.println("Arraylist. Comparable: ");
                pilita.imprimirLista(arrayList);

                System.out.println("ArrayList. No comparable:");
                pilita.imprimirLista(arrayListNoComparable);
                break;
            }
            case 3:
            {
                ///Punto 5.
                ///ArrayList de ClasePadreGenerica con datos de claseHija
                ArrayList<ClasePadreGenerica> arrayListClaseHija = new ArrayList<>();
                ///Agrego elementos de clase hija al ArrayList de clasePadre, los admite xq es subclase.
                ClaseHija h1 = new ClaseHija<>(2);
                ClaseHija h2 = new ClaseHija<>(2);
                ///ClasePadreGenerica o1 = new ClasePadreGenerica<>(5);

                arrayListClaseHija.add(h1);
                arrayListClaseHija.add(h2);
                ///arrayListClaseHija.add(o1);

                h1.mostrarValor();
                h2.mostrarValor();

                ///Punto 6.

                h1 = h2;

                boolean resultado = h1.compararElementosIdentidad(h1,h2);
                if(resultado)
                {
                    System.out.println("Son iguales en identidad. ");
                }
                else
                {
                    System.out.println("No son iguales en identidad. ");
                }

                boolean resultado2 = h1.compararElementosIgualdad(arrayListClaseHija.get(0),arrayListClaseHija.get(1));
                if(resultado2)
                {
                    System.out.println("Son iguales en igualdad. ");
                }
                else
                {
                    System.out.println("No son iguales en igualdad.");
                }

                break;
            }
            case 4:
            {
                ///Punto 7.
                System.out.println("Ingrese el nombre.");
                scan.nextLine();
                String nombre = scan.nextLine();
                System.out.println("Ingrese la edad. ");
                int edad = scan.nextInt();

                Par par1 = new Par<>(nombre,edad);

                System.out.println("Ingrese altura en cm. ");
                double altura = scan.nextDouble();
                System.out.println("Ingrese peso en kg. ");
                int peso = scan.nextInt();

                Par par2 = new Par<>(altura,peso);

                System.out.println("Par 1: ");
                par1.mostrarPar();
                System.out.println("Par 2: ");
                par2.mostrarPar();
                break;
            }
            case 5:
            {
                ///Punto 8.
                PersonaProbarComparable p1 = new PersonaProbarComparable("Tomas",18);
                PersonaProbarComparable p2 = new PersonaProbarComparable ("Floky",28);
                PersonaProbarComparable probar = new PersonaProbarComparable<>();

                ArrayList<PersonaProbarComparable> arrayListp8 = new ArrayList<>();

                arrayListp8.add(p1);
                arrayListp8.add(p2);

                System.out.println("Array de personas (SuperClase de Empleado)");

                probar.imprimirElementos(arrayListp8);


                /*
                ArrayList<Integer> arrayListInt = new ArrayList<>();

                arrayListInt.add(18);
                arrayListInt.add(20);

                System.out.println("Array de int (Tendria que tirar error. )");

                p2.imprimirElementos(arrayListInt);
                 */
            }

        }

    }
}