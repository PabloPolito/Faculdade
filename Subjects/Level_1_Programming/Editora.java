import java.util.Scanner;

class Revista {
    private String nome;
    private String issn;
    private String edicao;
    
    //Construtor
    public Revista(String nome, String issn, String edicao){
        this.nome = nome;
        this.issn = issn;
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }
    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String toString(){
        return "\n\n-----------------------------\nNome da Revista: " + nome + "\nISSN revista: " + issn + "\nEdicao revista: "  + edicao;
    }
}

class Edicao {
    //private Aluga numero;
    private Revista revista;
    private String numero;
    private String tiragem;
    private String artigo;

    public Edicao(Revista revista, String numero, String tiragem, String artigo) {
        this.revista = revista;
        this.numero = numero;
        this.tiragem = tiragem;
        this.artigo = artigo;
    }

    public String getNumero() {    
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTiragem() {
        return tiragem;
    }
    public void setTiragem(String tiragem) {
        this.tiragem = tiragem;
    }
    public String getArtigo(String artigo){
        return artigo;
    }
    public void setArtigo(String artigo){
        this.artigo = artigo;
    }
    public Revista getRevista() {
        return revista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }


    public String toString(){
        return "-----------------------------\nEdicao numero: " + numero + "\nTiragem: " + tiragem + "\nArtigo:  " + artigo + revista;
    }
}

class Artigo {
    private Edicao edicao;
    private String nomeArtigo;
    private String numeroPaginas;

    public Artigo(Edicao edicao, String nomeArtigo, String numeroPaginas) {
        this.edicao = edicao;
        this.nomeArtigo = nomeArtigo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeArtigo() {    
        return nomeArtigo;
    }
    public void setNomeArtigo(String nomeArtigo) {
        this.nomeArtigo = nomeArtigo;
    }
    public String getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public Edicao getEdicao() {
        return edicao;
    }
    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }
    
    public String toString(){
        return "-----------------------------\nNome do Artigo: " + nomeArtigo + "\nNumero de Paginas: " + numeroPaginas + "\n-----------------------------" + edicao;
    }
}

//Classe principal
class Editora {
    public static void main(String[] args) {
        Scanner info = new Scanner( System.in );

        Revista revistaUm = new Revista("","","");
        System.out.print("Digite o nome da revista: ");
        revistaUm.setNome(info.nextLine());
        System.out.print("Digite o ISSN da revista: ");
        revistaUm.setIssn(info.nextLine());
        System.out.print("Digite a edicao da revista: ");
        revistaUm.setEdicao(info.nextLine());
        
        Edicao edicaoUm  = new Edicao(null,"","","");
        System.out.print("Digite o numero da edicao: ");
        edicaoUm.setNumero(info.nextLine());
        System.out.print("Digite a tiragem:  ");
        edicaoUm.setTiragem(info.nextLine());
        System.out.print("Digite o numero do artigo: ");
        edicaoUm.setArtigo(info.nextLine());

        Artigo artigoUm = new Artigo(null,"","");
        System.out.print("Digite o nome do artigo: ");
        artigoUm.setNomeArtigo(info.nextLine());
        System.out.print("Digite o numero de paginas: ");
        artigoUm.setNumeroPaginas(info.nextLine());

        //vincula o endereço
        edicaoUm.setRevista(revistaUm);
        artigoUm.setEdicao(edicaoUm);
        System.out.println(artigoUm);
        info.close();
    }
}