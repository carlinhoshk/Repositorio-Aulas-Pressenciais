package POO;
// criando objeto garrafa

public class PrimeiroObjeto {

    public static void main(String[] args) {
        Garrafa garrafa = new Garrafa();
        // métodos
        garrafa.nova = false;
        garrafa.agua = 90;
        garrafa.tampa = true;
        garrafa.marca = "lindoya";
        garrafa.status();
        garrafa.JogarFora();
        garrafa.pegar();
        //garrafa.beber();
    }

}

