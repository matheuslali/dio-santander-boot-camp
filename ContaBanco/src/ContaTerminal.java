import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        var leitura = new Scanner(System.in);

        System.out.println("\nPor favor, digite o numero da Agência: ");
        agencia = leitura.nextLine();

        var agenciaFormatada = new StringBuilder(agencia);
        int ultimoDigito = agenciaFormatada.length() - 1;
        agenciaFormatada.insert(ultimoDigito, "-");

        System.out.println("\nPor favor, digite o numero da conta: ");
        numero = leitura.nextInt();
        leitura.nextLine();

        System.out.println("\nPor favor, digite o seu nome: ");
        nomeCliente = leitura.nextLine();

        System.out.println("\nPor favor, digite o valor do seu deposito inicial para conta: ");
        saldo = leitura.nextBigDecimal().setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nOlá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaFormatada+", conta "+numero+" e seu saldo "+saldo+" já esta disponivel para saque.");
    }
}
