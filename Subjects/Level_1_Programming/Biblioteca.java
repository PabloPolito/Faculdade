class Livro {
    private String nome;
    private int isbn;
    private int edicao;
    private String autor;

    public Livro(String nome, int isbn, int edicao, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.edicao = edicao;
        this.autor = autor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\n===== Livro =====" + "\nNome: " + nome + "\nIsbn: " + isbn + "\nEdicao: " + edicao + "\nAutor: " + autor;
    }
}

class Editora extends Livro {
    private String nomeEdit;
    private int cnpj;
    private int numero;

    public Editora(String nomeEdit, int cnpj, int numero, String nome, int isbn, int edicao, String autor) {
        super(nome, isbn, edicao, autor);
        this.nomeEdit = nomeEdit;
        this.cnpj = cnpj;
    }
    public String getNomeEdit() {
        return nomeEdit;
    }
    public void getNomeEdit(String nomeEdit) {
        this.nomeEdit = nomeEdit;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "\n===== Editora =====" + "\nNome: " + nomeEdit + "\nCNPJ: " + cnpj + "\nFilial: " + numero + "\n" + super.toString();
    }
}


class Local extends Editora {
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private String bairro;
    private String num;


    public Local(String pais, String estado, String cidade, String rua, String bairro, String num, String nomeEdit, int cnpj, int numero, String nome, int isbn, int edicao, String autor) {
        super(nomeEdit, cnpj, numero, nome, isbn, edicao, autor);
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "\n===== Endereço =====" + "\nPais: " + pais + "\nEstado: " + estado + "\nCidade: " + cidade + "\nRua: " + rua + "\nBairro: " + bairro + "Numero: " + num + "\n" + super.toString();
    }
}


public class Biblioteca {

    public static void main(String[] args) {
        
        Local localUm = new Local("Brasil","SP","Sao Paulo","Rua dos Pregnolatos","Jardim Lucasane","18-22","Leolog",78366554,04,"A volta dos que nao foram",45553263,512,"Ronaldinho");
        System.out.println(localUm);
    }
}