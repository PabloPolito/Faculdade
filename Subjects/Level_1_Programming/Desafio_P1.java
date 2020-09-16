import java.util.Scanner;

class Paciente {
    public String nome;
    public String tipoEnfermidade;

    public Paciente(String nome, String tipoEnfermidade){
        this.nome = nome;
        this.tipoEnfermidade = tipoEnfermidade;
    }

    public void alterarEnfermidade(String tipoEnfermidade){
        this.tipoEnfermidade = tipoEnfermidade;
    }

    public String relatorioPaciente(){
        return "individuo " + nome +  "  doenca  " + tipoEnfermidade + "\n" ;
    }
}


class Hospital {
	public static void main (String args[]) {

		Scanner info = new Scanner( System.in ); 
		System.out.println("Digite o nome do paciente");
    		String variavelNome = info.nextLine();
		System.out.println("Digite o tipo de enfermidade do mesmo");
    		String variavelDoenca = info.nextLine();
	Paciente pacienteUm = new Paciente(variavelNome,variavelDoenca);

while(true) {
	Scanner entradaDados = new Scanner( System.in ); 
	System.out.println("Digite uma opcao do Menu, sendo: \n [1] Relatorio \n [2] Alterar Doenca \n");   
	int opcao = entradaDados.nextInt();
    	if (opcao==1){
			System.out.println("" + pacienteUm.relatorioPaciente());
	    }
	    
		else
		if (opcao==2){
		System.out.println("Digite o novo tipo de enfermidade do mesmo");
		pacienteUm.alterarEnfermidade(info.nextLine());
					
					}
          			else
					    {
					    System.out.println("Fim");
		  				break;
						}
	}   }   }
