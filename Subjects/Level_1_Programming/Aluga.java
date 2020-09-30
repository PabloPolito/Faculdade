import java.util.Scanner;

class Aluga {
    private String dia;
    private String mes;
    private String ano;
    
    //Construtor
    public Aluga(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}

class Livro1 {
    private Aluga aluga;
    private String nome;
    private String escritor;
    private String quem;

    public Livro1(Aluga aluga, String nome, String escritor, String quem) {
        this.aluga = aluga;
        this.nome = nome;
        this.escritor = escritor;
        this.quem = quem;
    }

    public String getNome() {    
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEscritor() {
        return escritor;
    }
    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
    public String getQuem(String quem){
        return quem;
    }
    public void setQuem(String quem){
        this.quem = quem;
    }
    public Aluga getAluga() {
        return aluga;
    }
    public void setAluga(Aluga aluga) {
        this.aluga = aluga;
    }
    public String toString(){
        return "----------------------\nNome do livro: " + nome + "\nNome do escritor: " + escritor + "\nQuem alugou:  " + quem +  "\nData que alugou: " + aluga + "\n----------------------";
    }
}

//Classe principal
class Livraria {
    public static void main(String[] args) {
        Scanner info = new Scanner( System.in );

        Livro1 livroUm = new Livro1(null,"","","");
        System.out.print("Digite o nome do livro: ");
        livroUm.setNome(info.nextLine());
        System.out.print("Digite o escritor do livro: ");
        livroUm.setEscritor(info.nextLine());
        System.out.print("Digite o quem vai alugar: ");
        livroUm.setQuem(info.nextLine());
        
        Aluga alugaUm  = new Aluga("","","");
        System.out.print("Digite o dia que vai alugar: ");
        alugaUm.setDia(info.nextLine());
        System.out.print("Digite o mes que vai alugar:  ");
        alugaUm.setMes(info.nextLine());
        System.out.print("Digite o ano que vai alugar: ");
        alugaUm.setAno(info.nextLine());

        //vincula o endereço
        livroUm.setAluga(alugaUm);
        System.out.println(livroUm);
        info.close();
    }
}