package bublesort;

import java.util.Scanner;

public class BubleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] lista = new int[10];
        int aux = 0, cont= 0;
        //Scanner numeros;
       // recebendo numeros
        for(int i = 0; i < 10 ; i++){
            Scanner numeros = new Scanner(System.in);
            lista[i] = numeros.nextInt();
        }
       
        System.out.println("\nVetor sem ordenação\n");
        //imprimindo vetor sem ordenação
        for(int i = 0; i < 10 ; i++){
            System.out.println(lista[i]);
        }

        System.out.println("Comparações e trocas:");
        for (int i = 0; i < lista.length - 1; i++) {
            System.out.println("\n");
            System.out.print("i: " + i + "[" + lista[i] + "]: ");
            for (int j = 0; j < lista.length - i - 1; j++) {
                System.out.print(lista[j] + " ");
                if (lista[j] > lista[j + 1]) {
                    aux          = lista[j];
                    lista[j]     = lista[j + 1];
                    lista[j + 1] = aux;
                }
                cont++;
            }
        }
        System.out.println("\nNúmero de comparações e trocas: ");
        System.out.println("\n" + cont);
        System.out.println("\nVetor com ordenação\n");
        //imprimindo vetor com ordenação
        for(int i = 0; i < 10 ; i++){
            System.out.println(lista[i]);
        }
    }    
}
