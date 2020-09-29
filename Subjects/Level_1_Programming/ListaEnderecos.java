import java.util.Scanner;

class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    
    public Endereco(String rua, String numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString(){
        return numero + rua + cidade;
    }
}

class Individuo {
    private Endereco endereco;
    private String nome;
    private String cpf;

    public Individuo(Endereco endereco, String nome, String cpf) {
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {    
    return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String toString(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nLogradouro: " + endereco;
    }
}


class ListaEnderecos {
    public static void main(String[] args) {
        Scanner info = new Scanner( System.in );

        Individuo individuoUm = new Individuo(null,"","");
        System.out.print("Digite o nome do individuo: ");
        individuoUm.setNome(info.nextLine());
        System.out.print("Digite o cpf do individuo: ");
        individuoUm.setCpf(info.nextLine());
        
        Endereco enderecoUm = new Endereco("","","");
        System.out.print("Digite a cidade do individuo: ");
        enderecoUm.setCidade(info.nextLine());
        System.out.print("Digite a rua do individuo: ");
        enderecoUm.setRua(info.nextLine());
        System.out.print("Digite o numero da casa do individuo: ");
        enderecoUm.setNumero(info.nextLine());

        //vincula o endereço
        individuoUm.setEndereco(enderecoUm);
        System.out.println(individuoUm);
    }
}