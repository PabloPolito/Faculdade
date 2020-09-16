import java.util.Scanner;

class ContaBancaria { // Declarando a classe Contabancaria
    public String titular; // Declarando atributo texto classe bancaria
    public String senha; 
    public double saldo; 
        
    public void deposito(double valor) { // Criando um metodo deposito
         saldo = saldo + valor; //Guardando a conta de valor dentro do 
         System.out.println("Novo saldo: R$ " + saldo); //Exibindo em tela o novo valor da variavel saldo
    }
        
    public void saque(double valor) {
        if (saldo >= valor) {
            System.out.println("Retirada no valor de: R$ " + valor);
            saldo = saldo - valor;
        }
        else
            System.out.println("Aviso!!! \nSaldo insuficiente para a retirada de: R$ " + valor);
        }
        
        public String extratoSimples() { //Criando um metodo texto Extrato Simples
            return "Titular: " + titular + "\nValor atual da conta: R$  " + saldo; //Retornando o valor inserido nos atributos
        }
}
        
class ProgramaBanco{
    public static void main(String args[]) { //Criando função main para inicio do programa

        Scanner entradaDados = new Scanner( System.in ); //Criando objeto Scanner dentro da metodo entradaDados
        
        ContaBancaria contaUm = new ContaBancaria(); //Criando objeto referente a classe contaBancaria
        System.out.print("Digite o nome do titular da conta: ");
        contaUm.titular = entradaDados.nextLine();

        System.out.print("Digite o saldo inicial: ");
        contaUm.saldo = entradaDados.nextDouble();

        System.out.print("Digite o valor do saque: ");
        contaUm.saque(entradaDados.nextDouble());
            
        System.out.println(contaUm.extratoSimples()); 
            
        System.out.print("Digite o valor do deposito: ");
        contaUm.deposito(entradaDados.nextDouble());
            
        System.out.println(contaUm.extratoSimples());

        entradaDados.close();
    }
}