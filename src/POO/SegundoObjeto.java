package POO;

public class SegundoObjeto {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.id = 1010;
        mouse.nome = "Mouse";
        mouse.marca = "Positivo";
        mouse.cor = "Branco";
        mouse.valor = 25;

        mouse.apresentarProduto();
    }
}
