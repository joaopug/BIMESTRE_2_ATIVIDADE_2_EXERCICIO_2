import java.util.Scanner;

public class CarteiraDigital {
    Scanner sc = new Scanner(System.in);

    public double saldo;

    public void adicionarSaldo(Scanner sc) {
        System.out.print("Digite o valor para adicionar ao saldo: ");
        double valorDeposito = sc.nextDouble();
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        } else {
            System.out.println("Erro! Valor incorreto, depósito cancelado!");
        }

    }

    public void realizarPagamento(Scanner sc) {
        System.out.print("Digite o valor do pagamento: ");
        double valorPagamento = sc.nextDouble();
        if (saldo < valorPagamento) {
            System.out.println("Erro! Saldo insuficiente para pagamento!");
        } else if (saldo > 0) {
            this.saldo -= valorPagamento;
            System.out.println("Pagamento realizado com sucesso!");
        }
    }

    public void verificarSaldo() {
        System.out.println("Seu saldo atual é " + saldo);
    }

    public int historicoTransacoes;

}
