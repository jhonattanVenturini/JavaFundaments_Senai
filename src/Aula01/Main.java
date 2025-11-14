package Aula01;

public class Main {
    public static void main(String[] args) {
        // existe somente na memoria do computador!
        CadastroAluno cad1 = new CadastroAluno();

        cad1.nomeAluno = "Fulano de Tal";
        cad1.idade = 25;
        cad1.idAluno = 123;
        cad1.curso = "Programção Java";

        //System- sistema computador
        // out - sair
        // print - printar no computador

        System.out.println("Olá:\t\t"+ cad1.nomeAluno);
        System.out.println("Idade:\t\t"+ cad1.idade );
        System.out.println("Curso:\t\t"+ cad1.curso );
        System.out.println("ID :\t\t"+ cad1.idAluno );

        // Esta instrução exibi a referencia do objeto.
        // ou seja o caminho que ele criou o objetivo, VM maquina virtual
        // Aula01.CadastroAluno@2a84aee7



    }
}
