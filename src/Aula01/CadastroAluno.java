package Aula01;
public class CadastroAluno {

        // private - só pode ser acessada de ontem ela está na classe da mesma, náo pode uma outra classe
        private String nomeAluno;
        int idade;
        String curso;
        public int idAluno;

        // Construto public nomeClasse(){
        public CadastroAluno(){

        }
        //Construtor alternativo com parametro idALUNO:
        public CadastroAluno(int idAluno){
                //vai carrgar a indentidade do aluno
                this.idAluno = idAluno;
        }

        public String getNomeAluno(){
                return nomeAluno;
        }
        public void setNomeAluno (String nomeAluno) {
                // this pega o da classe principal e atribui o parametro
                this.nomeAluno = nomeAluno;
        }
}
