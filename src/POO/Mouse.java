package POO;

public class Mouse {
    int id;
    String nome;
    String marca;
    String cor;
    double valor;

    public Mouse() {
    }

    void apresentarProduto(){
        System.out.println("Apresentando Produtos ");
        System.out.println("-----------------------");
        System.out.println("Id do produto: " + id);
        System.out.println("Produto: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
        System.out.println("------------------------");
    }



}
