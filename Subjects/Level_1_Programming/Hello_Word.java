class Teste{
    public String nome;
    public String email;
    public int cargaHoraria;
    public double salario;
    public String titulacao;
    
        public String exibirTeste(){
            return nome + "\n" + "E-mail: " + email + "\n" + "Carga: " + cargaHoraria + "\n"  + "Salario: " + salario + "\n" + "Titulacao: " + titulacao + "\n" ;
        }
}

class Faculdade{
    public static void main(String args[]){
        Teste testeUm = new Teste();
        testeUm.nome = "Pablo";
        testeUm.email = "pablo.polito@totvs.com.br";
        testeUm.cargaHoraria = 30;
        testeUm.salario = 10000;
        testeUm.titulacao = "Professor";
        System.out.println("Docente: " + testeUm.exibirTeste());
    }
}