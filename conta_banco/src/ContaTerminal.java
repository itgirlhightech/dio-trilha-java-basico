import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //TODO: conhecer e immportar a classe Scanneer

        //Exibir as mensagens para o user

        //Obter pelo scanner os valores ddigitados no terminal

        //exibir a mensagem conta criada
        System.out.println("-------------------");
        System.out.println("  CONTA BANCÁRIA");
        System.out.println("-------------------");

        System.out.println("Por favor, digite o número da Agência ! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite qual é a sua Agência!");
        String agência = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome para prosseguir");
        String sobrenome = scanner.next();
        
        System.out.println("Informe seu saldo!");
        Double saldo = scanner.nextDouble();

        System.out.print("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco!");
        System.out.print(" Sua agência é " + agência + ", conta  " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
