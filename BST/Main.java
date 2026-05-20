import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArbolBST arbol = new ArbolBST();

        int opcion;

        do {

            mostrarMenu();

            System.out.print("Seleccione una opcion: ");
            opcion = leerEntero(sc);

            switch (opcion) {

                case 1:

                    System.out.println("\n===== INSERTAR FINCA =====");

                    System.out.print("Codigo: ");
                    int codigo = leerEntero(sc);

                    System.out.print("Nombre de la finca: ");
                    String nombre = sc.nextLine();

                    System.out.print("Municipio: ");
                    String municipio = sc.nextLine();

                    arbol.insertar(codigo, nombre, municipio);

                    System.out.println("Finca insertada correctamente.");
                    break;


                case 2:

                    System.out.println("\n===== BUSCAR FINCA =====");

                    System.out.print("Ingrese el codigo a buscar: ");
                    int codigoBuscar = leerEntero(sc);

                    NodoBST finca = arbol.buscar(codigoBuscar);

                    if (finca != null) {

                        System.out.println("\nFinca encontrada:");
                        System.out.println("Codigo: " + finca.getCodigo());
                        System.out.println("Nombre: " + finca.getNombreFinca());
                        System.out.println("Municipio: " + finca.getMunicipio());

                    } else {

                        System.out.println("No existe una finca con ese codigo.");
                    }

                    break;


                case 3:

                    System.out.println("\n===== RECORRIDO PREORDEN =====");

                    if (arbol.estaVacio()) {
                        System.out.println("El arbol esta vacio.");
                    } else {
                        arbol.preOrden();
                    }

                    break;


                case 4:

                    System.out.println("\n===== RECORRIDO INORDEN =====");

                    if (arbol.estaVacio()) {
                        System.out.println("El arbol esta vacio.");
                    } else {
                        arbol.inOrden();
                    }

                    break;

                case 5:

                    System.out.println("\n===== RECORRIDO POSTORDEN =====");

                    if (arbol.estaVacio()) {
                        System.out.println("El arbol esta vacio.");
                    } else {
                        arbol.postOrden();
                    }

                    break;

                case 0:

                    System.out.println("\nSaliendo del programa...");
                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        sc.close();
    }


    private static void mostrarMenu() {

        System.out.println("\n==================================");
        System.out.println("      MENU ARBOL BST FINCAS");
        System.out.println("==================================");
        System.out.println("1. Insertar finca");
        System.out.println("2. Buscar finca");
        System.out.println("3. Recorrido PreOrden");
        System.out.println("4. Recorrido InOrden");
        System.out.println("5. Recorrido PostOrden");
        System.out.println("0. Salir");
        System.out.println("==================================");
    }


    private static int leerEntero(Scanner sc) {

        while (!sc.hasNextInt()) {

            System.out.print("Entrada invalida. Ingrese un numero entero: ");
            sc.next();
        }

        int valor = sc.nextInt();
        sc.nextLine();

        return valor;
    }
}