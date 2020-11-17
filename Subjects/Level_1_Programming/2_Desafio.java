import java.util.Scanner; 

class Teste {
public String titulo;
public String autor;
public int numeroPaginas;
	
public String exibirLivro(){
 return "\nLivro: " + titulo + "\nEscritor: " + autor + "\nNumero de paginas: " + numeroPaginas;
}}

class CriarLivros{
	public static void main (String args[])  {
	
	Scanner entradaDados = new Scanner( System.in );
	Teste livroUm = new Teste();
	
	System.out.print( "Digite o titulo do livro:  "); 
	livroUm.titulo = entradaDados.nextLine(); 

	System.out.print( "Digite o nome do autor:  "); 
	livroUm.autor = entradaDados.nextLine(); 
	
	System.out.print( "Digite o numero de paginas:  "); 
	livroUm.numeroPaginas = entradaDados.nextInt();
 
    System.out.println(livroUm.exibirLivro());

    entradaDados.close();
}}
