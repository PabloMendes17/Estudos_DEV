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
        
    
    int[] arrSelection = {64, 34, 25, 12, 22, 11, 90};
        
                System.out.println("Array desordenado");
                printArray(arrSelection);  
        
                selectionSort(arrSelection);
        
                System.out.println("\nArray ordenado:");
                printArray(arrSelection);  
                
                

                int[] arrQUICK = {64, 34, 25, 12, 22, 11, 90};

                System.out.println("Array desordenado:");
                printArrayQ(arrQUICK);
        
                quickSort(arrQUICK, 0, arrQUICK.length - 1);
        
                System.out.println("\nArray ordenado:");
                printArrayQ(arrQUICK);            
    
    
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
        static void printArray(int[] arrSelection) {
            int n = arrSelection.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arrSelection[i] + " ");
            }
            System.out.println();
        }

        
           
        
            // Função para ordenar um array usando Selection Sort
            static void selectionSort(int[] arrSelection) {
                int n = arrSelection.length;
        
                for (int i = 0; i < n - 1; i++) {
                    // Encontra o índice do menor elemento no restante do array
                    int minIndex = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arrSelection[j] < arrSelection[minIndex]) {
                            minIndex = j;
                        }
                    }
        
                    // Troca o menor elemento encontrado com o elemento atual
                    int temp = arrSelection[i];
                    arrSelection[i] = arrSelection[minIndex];
                    arrSelection[minIndex] = temp;
                    for (int b:arrSelection){
                        System.out.print(b+" ");
                    }
                }
            }
        
    // Função para ordenar um subarray usando Quick Sort
    static void quickSort(int[] arrQUICK, int low, int high) {
        if (low < high) {
            // Encontra o índice de partição, onde o array é dividido em duas partes
            int partitionIndex = partition(arrQUICK, low, high);

            // Ordena as duas partes separadamente
            quickSort(arrQUICK, low, partitionIndex - 1);
            quickSort(arrQUICK, partitionIndex + 1, high);
        }
    }

    // Função para encontrar o índice de partição
    static int partition(int[] arrQUICK, int low, int high) {
        // Escolhe o elemento pivot (geralmente o último elemento)
        int pivot = arrQUICK[high];

        // Índice do menor elemento
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // Se o elemento atual for menor ou igual ao pivot
            if (arrQUICK[j] <= pivot) {
                i++;

                // Troca arr[i] e arr[j]
                int temp = arrQUICK[i];
                arrQUICK[i] = arrQUICK[j];
                arrQUICK[j] = temp;
            }
        }

        // Troca arr[i+1] e arr[high] (pivot)
        int temp = arrQUICK[i + 1];
        arrQUICK[i + 1] = arrQUICK[high];
        arrQUICK[high] = temp;

        return i + 1;
    }

    // Função para imprimir um array
    static void printArrayQ(int[] arrQUICK) {
        int n = arrQUICK.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arrQUICK[i] + " ");
        }
        System.out.println();
    }
}        
        
        
    



