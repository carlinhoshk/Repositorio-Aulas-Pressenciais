package POO;

public class Garrafa {
    // atributos
    int agua;
    boolean tampa;
    String marca;

    boolean nova;

    void status(){
        System.out.println("A garrafa está " + this.agua + "%  cheia");
        System.out.println("A marca da garrafa é: " + this.marca);
        if (this.tampa){
            System.out.println("A garaffa está fechada");
        }else {
            System.out.println("A garrafa está aberta");
        }

    }
    /*void beber(){
        if (this.tampa == false){
            System.out.println("você não está bebendo");
        }else{
            System.out.println("você está bebendo");
        }
    }*/

    void JogarFora(){
        if (this.agua <= 0){
            System.out.println("jogar fora");
        }else{
            System.out.println("garrafa cheia você não precisa jogar fora");
        }
    }

    void pegar(){
        if (this.nova) {
            System.out.println("garrafa nova pegue para beber");
        }
    }

}
