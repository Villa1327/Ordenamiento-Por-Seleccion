import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Villa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //ARRAYLIST PARA LA LISTA DE LOS ATLETAS
    private static ArrayList<Atleta> atletas = new ArrayList();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el numero de tiempos a registrar: ");
        int input = scan.nextInt();
        for(int i = 0; i < input; i++){
            System.out.println("Digite el tiempo del atleta numero: " + (i + 1));
            double tiempoAtleta = scan.nextDouble();
            registrarTiempos(tiempoAtleta);
              
        }
        System.out.println("Listado de los tiempos");
        mostrarTiempos();
        
        int option = 0;
        do {
            System.out.println("1. ordenar por seleccion");
            System.out.println("2. ordenar por insercion");
            System.out.println("3. ordenar Burbuja");
            System.out.println("4. salir");
            System.out.println("ingrese la opcion");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    OrdenarPorSeleccion();
                    mostrarTiempos();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opción no valida");
                    break;

            }
        } while (option != 4);
    }
    
    // ALGORITMO PARA REGISTRAR LOS TIEMPOS
    public static void registrarTiempos(double tiempo) {
        Atleta nuevoTiempo = new Atleta(tiempo);
        atletas.add(nuevoTiempo);
    }
    
     // ALGORITMO PARA ORGANIZAR LOS TIEMPOS
    public static void mostrarTiempos() {
        for (Atleta a : atletas) {
            System.out.println(a.getTiempo());
        }
    }
    
    // ALGORITMO PARA ORGANIZAR POR SELECCION
    public static void OrdenarPorSeleccion() {
        for (int i = 0; i < atletas.size() - 1; i++) {

            Atleta menor = atletas.get(i);
            int PosMenor = i;

            for (int j = i + 1; j < atletas.size(); j++) {
                Atleta actual = atletas.get(j);

                if (actual.getTiempo() < menor.getTiempo()) {
                    menor = actual;
                    PosMenor = j;
                }
            }
            Atleta temp = atletas.get(i);
            atletas.set(i, menor);
            atletas.set(PosMenor, temp);
        }
    }

}
