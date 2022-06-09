package POO;

public class Garrafa {

    public static void main(String[] args) {
        PrimeiroObjeto garrafa = new PrimeiroObjeto();
        garrafa.nova = true;
        garrafa.agua = 90;
        garrafa.tampa = true;
        garrafa.marca = "lindoya";
        garrafa.status();
        garrafa.JogarFora();
        garrafa.arremessar();
        garrafa.pegar();
        garrafa.beber();
    }

}
