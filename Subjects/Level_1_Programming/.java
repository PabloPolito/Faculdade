import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private double saldo;
    private double sacar;
    private double depositar;

    public ContaBancaria(String titular, double saldo, double sacar, double depositar) {
        this.titular = titular;
        this.saldo = saldo;
        this.sacar = sacar;
        this.depositar = depositar;
    }

    public void ValorSacar(double sacar){
        this.sacar = sacar;
    }

    public void ValorDepositar(double depositar){
        this.depositar = depositar;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\n===== Conta Bancaria =====" + "\nTitular: " + titular + "\nSaldo: " + saldo;
    }
}


class ContaEspecial extends ContaBancaria {
    private int limite;

    public ContaEspecial(int limite,String titular, double saldo, double sacar, double depositar) {
        super(titular, saldo, sacar, depositar);
        this.limite = limite;
    }
    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "\n===== Conta Especial =====" + "\nLimite: " + limite + super.toString();
    }
}


public class Agencia {

    public static void main(String[] args) {

        Scanner info = new Scanner( System.in ); 
        
        ContaBancaria contaUm = new ContaBancaria("",0,0,0);
        System.out.println("Digite o nome do titular: ");
        contaUm.setTitular(info.nextLine());
        System.out.println("Digite o saldo em conta: ");
        contaUm.setSaldo(info.nextLine());
        System.out.println("Digite o quem vai alugar: ");
        contaUm.setQuem(info.nextLine());
        
        ContaBancaria pessoaUm = new ContaBancaria("Marta",62,"Bauru");
        System.out.println(pessoaUm);

        alunoUm.setIdade(23);
        System.out.println("\nNova idade do individuo: " + alunoUm.getIdade() + "\n");
    }
}