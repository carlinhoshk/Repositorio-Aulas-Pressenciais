//20:38 - 06/05/2022
// Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
//considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
//neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
package EstruturasDeRepeticao;


public class Exercicio5 {
    public static void main(String[] args) {
        int potencia = 3;
        int i = 1;
        int expoente = 0;

        while (expoente <=15){
            expoente++;
            i = i*potencia;
            System.out.println(i);
        }
    }
}
