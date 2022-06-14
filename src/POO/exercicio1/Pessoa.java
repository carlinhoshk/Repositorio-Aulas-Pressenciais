package POO.exercicio1;

public class Pessoa {
    String nome;
    int idade;
    int dia;
    int mes;
    int ano;

    String sexo;
    String cargo;              // criar método especialidade ou não e incluir direto no como cargo
    boolean cadastro;        // criar método se não tem cadastro então é visitante


    public void mostraCadastro(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sexo:" + sexo);
    }
    public void temCadastro() {
        if (cadastro) {
            System.out.println("Não tem cadastro é visitante");
        } else {
            System.out.println("Tem cadastro não é visitante");
        }
    }

    public void fazerAniversario(){
        if (mes == 10){
            System.out.println("parabéns mês do seu aniversario");
        }else {
            System.out.println("Hoje não é seu aniversario");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }
}