class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
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
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return "\n===== Pessoa =====" + "\nNome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade;
    }
}





class Aluno extends Pessoa {
    private double notaFinal;
    private String email;

    public Aluno(double notaFinal, String email, String nome, int idade, String cidade) {
        super(nome, idade, cidade);
        this.notaFinal = notaFinal;
        this.email = email;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "\n===== Aluno =====" + "\nNota Final: " + notaFinal + "\nEmail: " + email + "\n" + super.toString();
    }
}


class Professor extends Aluno {
    private String disciplina;

    public Professor(String disciplina, double notaFinal, String email, String nome, int idade, String cidade) {
        super(notaFinal, email, nome, idade, cidade);
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    @Override
    public String toString() {
        return "\n===== Professor =====" + "\nDisciplina: " + disciplina + "\n" + super.toString();
    }
}



public class GerarPessoas {

    public static void main(String[] args) {
        
        Pessoa pessoaUm = new Pessoa("Marta",62,"Bauru");
        System.out.println(pessoaUm);
        
        Aluno alunoUm = new Aluno(10,"marte@ite.com.br", "Marta", 18, "Bauru");
        System.out.println(alunoUm);

        Professor professorUm = new Professor("Logica Programacao",10,"marta@ite.com.br","Mario",21,"Bauru");
        System.out.println(professorUm);

        alunoUm.setIdade(23);
        System.out.println("\nNova idade do individuo: " + alunoUm.getIdade() + "\n");
    }
}