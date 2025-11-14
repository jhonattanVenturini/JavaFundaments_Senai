package Aula01;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------");
        // existe somente na memoria do computador!
        CadastroAluno cad1 = new CadastroAluno();
        cad1.setNomeAluno("Fulano de tal");
        cad1.idade = 25;
        cad1.idAluno = 123;
        cad1.curso = "Programção Java";

        //System- sistema computador
        // out - sair
        // print - printar no computador
        String nome = cad1.getNomeAluno();
        System.out.println("Olá:\t\t"+ nome);
        System.out.println("Idade:\t\t"+ cad1.idade );
        System.out.println("Curso:\t\t"+ cad1.curso );
        System.out.println("ID :\t\t"+ cad1.idAluno );

        // Esta instrução exibi a referencia do objeto.
        // ou seja o caminho que ele criou o objetivo, VM maquina virtual
        // Aula01.CadastroAluno@2a84aee7
        System.out.println();
        System.out.println("---------------------------------");

        // construtor com parametro do aluno 2
        CadastroAluno cad2 = new CadastroAluno(2334);
        cad2.setNomeAluno("Beltrano da silva");
        cad2.curso = "Letras";
        cad2.idade = 24;

        String nome2 = cad1.getNomeAluno();
        System.out.println("Olá:\t\t"+ nome2);
        System.out.println("Idade:\t\t"+ cad2.idade );
        System.out.println("Curso:\t\t"+ cad2.curso );
        System.out.println("ID :\t\t"+ cad2.idAluno );

        System.out.println("---------------------------------");

        CadastroAluno cad3 = new CadastroAluno(2333);
        cad3.setNomeAluno("Maria de tal ");

    }
}
