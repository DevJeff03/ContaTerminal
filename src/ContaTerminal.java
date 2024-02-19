import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contaNumero;
        String agencia;
        String nomeCliente;
        double saldo = 0;


        System.out.println("Favor digite o número da conta: ");
        contaNumero = sc.nextInt();
        System.out.println("Número da agência: ");
        agencia = sc.next();
        System.out.println("Nome do cliente: ");
        nomeCliente = sc.next();

        System.out.printf("Olá %s, obrigado por criar a conta em nosso banco, " +
         "sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, contaNumero, saldo);
    }
}
