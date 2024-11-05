import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarteiraDigital {
    Scanner sc = new Scanner(System.in);
    public List<Double> transacoes;

    public double saldo;

    public CarteiraDigital() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarSaldo(Scanner sc) {
        System.out.print("Digite o valor para adicionar ao saldo: ");
        double valorDeposito = sc.nextDouble();
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            transacoes.add(valorDeposito);
            System.out.println("Depósito feito com sucesso!");
        } else {
            System.out.println("Erro! Valor incorreto, depósito cancelado!");
        }

    }

    public void realizarPagamento(Scanner sc) {
        System.out.print("Digite o valor do pagamento: ");
        double valorPagamento = sc.nextDouble();
        if (saldo < valorPagamento) {
            System.out.println("Erro! Saldo insuficiente para pagamento!");
        } else {
            this.saldo -= valorPagamento;
            transacoes.add(-valorPagamento);
            System.out.println("Pagamento realizado com sucesso!");
        }
    }

    public void verificarSaldo() {
        System.out.println("Seu saldo atual é " + saldo);
    }

    public void historicoTransacoes() {
        System.out.println("Histórico de Transações:");
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (int i = 0; i < transacoes.size(); i++) {
                double transacao = transacoes.get(i);
                if (transacao > 0) {
                    System.out.println("Depósito: " + transacao);
                } else {
                    System.out.println("Pagamento: " + transacao);
                }
            }

        }
    }
}