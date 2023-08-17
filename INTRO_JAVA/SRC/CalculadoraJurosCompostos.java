public class CalculadoraJurosCompostos {
    public static void main(String[]args){
        double valorAcumulado=10000;
        double taxaJurosMensal=0.8;
        int periodoEmMeses=12;

        for(int mes=1; mes<=periodoEmMeses;mes++){
            valorAcumulado=valorAcumulado+(valorAcumulado*taxaJurosMensal/100);
            System.out.println("Mês "+mes+" = "+valorAcumulado);
        }

        


    }
}
