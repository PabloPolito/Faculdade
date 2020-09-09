class Conta {
	public String titular;
	public String email;
	public double saldo;
	 
	    public void saque(double valor ) {
            if (saldo >= valor ) {
                System.out.println("retirada  " + valor);
                saldo = saldo - valor;
            }
            else {
                System.out.println("saldo insuficiente para a retirada de  " + valor);
		    }
        }
        public void deposito(double valor2 ) {
            if (valor2 >= 0  ) {
                System.out.println(" Deposito de:  " + valor2);
                saldo = saldo + valor2;
            }
            else {
                System.out.println("Voce nao pode depositar o valor de:   " + valor2);
		    }
        }


    public String Extrato() {
		 return "\n Correntista:  " + titular + "\n Valor atual da conta:   " + saldo + "\n Email: " + email;
	    }
}

class Agencia {
    public static void main(String args[]) {

        Conta contaUm = new Conta();
            contaUm.titular = "Eliane";
            contaUm.saldo = 100;
            System.out.println(contaUm.Extrato());
            
        Conta contaDois = new Conta();
            contaDois.titular = "Henrique";
            contaDois.saldo = 600;
            System.out.println(contaDois.Extrato());
            
        Conta contaTres = new Conta();
            contaTres.titular = "Pablo";
            contaTres.saldo = 15000;
            contaTres.email = "pablopietropolito@gmail.com";
            System.out.println(contaTres.Extrato()); 
 
            System.out.println("");
            
            contaTres.deposito(1000);
            System.out.println(contaTres.Extrato());

    }
}
