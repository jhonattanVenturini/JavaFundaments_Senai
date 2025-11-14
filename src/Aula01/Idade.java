package Aula01;

public class Idade {
    public static void main(String[] args) {

        // CadastroAluno = modelo de exemplo não tem dado só as intencia
        // Criando o objeto idade da classe CadastroAluno

        // criei um instancia que chama Aluno
        CadastroAluno aluno = new CadastroAluno();

        // Determinei os atributos dessa instancia
        aluno.idade = 23;
        aluno.setNomeAluno("Joanzinho");
        aluno.curso = "Arquiterura";
        aluno.idAluno = 1233;

        // - Get: pegar o dados que estão na instancia
        // - Set: manda o dados para a instancia

        // Exibindo os dados da instancia no terminal
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Olá " + aluno.getNomeAluno());
        System.out.println("Idade:\t\t"+ aluno.getIdade());
        System.out.println("Curso:\t\t"+ aluno.getCurso());
        System.out.println("ID :\t\t"+ aluno.getIdAluno() );
        System.out.println("-----------------------------");
    }
}
