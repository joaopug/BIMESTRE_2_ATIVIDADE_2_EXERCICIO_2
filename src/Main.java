import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarteiraDigital carteira = new CarteiraDigital();
        Scanner sc = new Scanner(System.in);
        char input = ' ';

        System.out.println("\nBem-vindo à sua Carteira Digital!");


        while (input != '4') {
            System.out.println("\n"+menu());
            System.out.print("\nUsuário: ");

            input = lerEntradaDoUsuario(carteira, sc);
        }
    }

    public static String menu() {
        return "Escolha uma opção:\n" +
               "1 - Adicionar Saldo\n" +
               "2 - Realizar Pagamento\n" +
               "3 - Verificar Saldo\n" +
               "4 - Sair";
    }

    public static char lerEntradaDoUsuario(CarteiraDigital carteira, Scanner sc) {
        char entrada = sc.next().charAt(0);
        if (entrada == '1') {
            carteira.adicionarSaldo(sc);
        } else if (entrada == '2') {
            carteira.realizarPagamento(sc);
        } else if (entrada == '3') {
            carteira.verificarSaldo();
        } else if (entrada == '4') {
            System.out.println("Obrigado por usar a sua Carteira Digital!");
        } else {
            System.out.println("Caractere incorreto! Por favor digite novamente.");
        }
        return entrada;

    }
}