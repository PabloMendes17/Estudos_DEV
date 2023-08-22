

public class AlgoProprio{

    public static void main(String[]args){

        int [] arbuble ={3,7,5,6,1,2};

       for (int n:arbuble){
        System.out.print(n+" ");
       }
       int tamArr=arbuble.length;
       for(int i=0;i<tamArr-1;i++){
        boolean troca=false;
        for(int j=0;j<tamArr-i-1;j++){
            if(arbuble[j]>arbuble[j+1]){
                int temp=0;
                temp=arbuble[j+1];
                arbuble[j+1]=arbuble[j];
                arbuble[j]=temp;
                troca=true;
            }
        } if(!troca){
            break;
        }

       }
       for (int n:arbuble){
        System.out.print(n+" ");
       }
     

    }

}