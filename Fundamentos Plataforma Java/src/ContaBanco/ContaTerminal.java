package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o numero da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite o numero da agencia:");
        agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo do cliente:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + "conta " + numero + "e seu saldo "
                           + saldo + "já esta disponível para saque.");
    }
}
