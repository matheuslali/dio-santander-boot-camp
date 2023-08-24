import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        var param1 = leitura.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        var param2 = leitura.nextInt();

        try{
            contar(param1, param2);
        }catch (ParametrosInvalidosException e){
            System.out.println("Atenção! "+ e.getMessage());
        }


    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if(param1 > param2){
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo parâmetro");
        }

        var contagem = param2 - param1;
        for (int x=0; x<=contagem; x++){
            System.out.println("\nImprimindo o número "+x);
        }
    }
}
