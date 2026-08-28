/* 
CRIA A CLASSE LIVRO
*/

public class Livro {
    String titulo; 
    String autor;
    double preco;
    int quantidade; 

    // CRIA O CONSTRUTOR

    public Livro(String titulo, String autor, double preco, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    // METODO PARA EXIBIR INFORMAÇÕES
    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorEstoque(){
        return preco * quantidade;

    }











}
