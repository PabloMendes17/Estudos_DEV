import java.util.Arrays;

public class AlgoritimosDeOrdenacao{

   
        public static void main(String[] args) {

        int[] arSort = {5, 2, 9, 1, 5, 6};
        System.out.println("Array sem ordenação: "+Arrays.toString(arSort));
        Arrays.sort(arSort); // Usando o algoritmo Tim Sort
        System.out.println("Array com ordenação: "+Arrays.toString(arSort));

        int[] arBuble = {1, 34, 25, 64, 22, 11, 2};
           
        System.out.println("Array desordenado:");
        printArray(arBuble);
        bubbleSort(arBuble);
            
        System.out.println("\nArray ordenado:");
        printArray(arBuble);
        }
    
        // Função para ordenar um array usando Bubble Sort
        static void bubbleSort(int[] arBuble) {
            int n = arBuble.length;
            boolean swapped;
           
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
              
                // Itera sobre o array, comparando elementos adjacentes
                for (int j = 0; j < n - i - 1; j++) {
                    // Se o elemento atual for maior que o próximo, troque-os
                  System.out.println(Arrays.toString(arBuble));     
                    if (arBuble[j] > arBuble[j + 1]) {
                        int temp = arBuble[j];
                        arBuble[j] = arBuble[j + 1];
                        arBuble[j + 1] = temp;
                        swapped = true;
                    System.out.println(Arrays.toString(arBuble));    
                    }
                }
                
                // Se nenhum elemento foi trocado nesta iteração, o array está ordenado
                if (!swapped) {
                    break;
                }
            }
        }
    
        // Função para imprimir um array
        static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    



}