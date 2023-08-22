

public class AlgoritimosDeOrdenacao{


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array desordenado:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("\nArray ordenado:");
        printArray(arr);
    }
 // Função para ordenar um array usando Bubble Sort
 static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;
    
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        
        // Itera sobre o array, comparando elementos adjacentes
        for (int j = 0; j < n - i - 1; j++) {
            // Se o elemento atual for maior que o próximo, troque-os
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
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