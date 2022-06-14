package POO.exercicio1;

public class Professor extends Pessoa {

    String especialidade;
    int salario;

    public void quemSouEu(String cargo){
        if (cargo == "Professor"){
            System.out.println("Sou professor");
        }
    }

    public void Especialidade(){
        System.out.println("O Professor tem especialidade em: " + especialidade);
    }

    public void mostraSalario(){
        System.out.println("Mostra o salario: " + salario);
    }

    public void vaiReceberAumento(int idade, int salario){
        if (idade> 30 & salario <= 4.000){
            System.out.println("Vai receber salario");
        }else{
            System.out.println("Não vai receber salario");
        }
    }


}
