/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;


import java.util.Scanner;


public class Grafos {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 1, salir = 1;
        String nombre;
        
        
        System.out.println("Ingrese la cantidad de vertices:");
        GrafoMatriz grafo = new GrafoMatriz(sc.nextInt());
        sc.nextLine();
    
        while(menu!=0){
            System.out.println("Elija una opcion:");
            System.out.println("1.Ingresar vertice");
            System.out.println("2.Agregar arco");
            System.out.println("3.Imprimir matriz");
            System.out.println("0.Salir");
            menu = sc.nextInt();
            sc.nextLine();
            switch(menu){
                case 1:
                    salir = 1; //se vuelve a 1 para poder entrar al bucle while despues de asignarle 0 a salir
                    while(salir != 0){
                        System.out.println("Ingrese el nombre del vertice:");
                        nombre = sc.nextLine();
                        grafo.nuevoVertice(nombre);
                        System.out.println("Desea seguir agregando vertices?");
                        System.out.println("1.Si");
                        System.out.println("0.No");
                        salir = sc.nextInt();
                        sc.nextLine();
                    }
                    break;
                    
                case 2:
                    salir = 1;
                    while(salir != 0){
                        System.out.println("Ingrese el nombre de dos vertices:");
                        try {
                            grafo.nuevoArco(sc.nextLine(), sc.nextLine());
                        } catch (Exception ex) {
                            System.out.println("No existen los vertices ingresados");
                        }
                        System.out.println("Desea seguir agregando arcos?");
                        System.out.println("1.Si");
                        System.out.println("0.No");
                        salir = sc.nextInt();
                        sc.nextLine();
                    }
                    break;
                   
                case 3:
                    grafo.mostrarMatriz();
                    break;                                        
            }
        }
    }
}
