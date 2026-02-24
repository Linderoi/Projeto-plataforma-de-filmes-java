public class condicional {
    public static void  main(String[] args){
        int anoDeLancamento = 2014;
        boolean incluindoNoPlano = true;
        double notaDoFilme = 9.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2014){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retro que vale a pena assistir");
        }
        boolean incluidoNoPlano = true;
        if ((incluidoNoPlano == true) && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve pagar o aluguel");
        }
    }
}
