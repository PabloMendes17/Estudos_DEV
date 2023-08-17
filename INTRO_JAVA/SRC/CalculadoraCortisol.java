public class CalculadoraCortisol {
    public static void main(String[]args){
        double cortisol=18.2;

        boolean resultadoNormal= cortisol>=6.0 && cortisol <=18.4;
        boolean resultadoAnormal= cortisol<6.0 || cortisol >18.4;
        boolean resultadoAnormal2=!resultadoNormal;
        System.out.println("Cortisol normal: "+resultadoNormal);
        System.out.println("Cortisol Anormal: "+resultadoAnormal);
        System.out.println("Cortisol Anormal: "+resultadoAnormal2);

        if(cortisol>=6.0 && cortisol <=18.4){
            System.out.println("Seu Cortisol esta normal");
        }else if(cortisol >18.4){
            System.out.println("Seu Cortisol esta alto");
        }else{
            System.out.println("Seu Cortisol esta baixo");
        }



    }
}
