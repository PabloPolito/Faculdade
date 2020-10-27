class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "\n===== Pessoa =====" + "\nNome: " + nome + "\nIdade: " + idade;
    }
}

class Aluno extends Pessoa {
    private double notaFinal;

    public Aluno(double notaFinal, String nome, int idade) {
        super(nome, idade);
        this.notaFinal = notaFinal;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    @Override
    public String toString() {
        return "\n===== Aluno =====" + "\nNota Final: " + notaFinal + "\n" + super.toString();
    }
}

public class GerarPessoas {

    public static void main(String[] args) {
        
        Pessoa pessoaUm = new Pessoa("Marta",62);
        System.out.println(pessoaUm);
        
        Aluno alunoUm = new Aluno(10,"Mario",21);
        System.out.println(alunoUm);
        alunoUm.setIdade(23);
        System.out.println("\nNova idade do individuo: " + alunoUm.getIdade() + "\n");
    }
}