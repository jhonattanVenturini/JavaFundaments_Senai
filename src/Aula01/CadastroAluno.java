package Aula01;
public class CadastroAluno {

        // private - só pode ser acessada de ontem ela está na classe da mesma, náo pode uma outra classe
        private String nomeAluno;
        int idade;
        String curso;
        int idAluno;

        public String getNomeAluno(){
                return nomeAluno;
        }
        public void setNomeAluno (String nomeAluno) {
                // this pega o da classe principal e atribui o parametro
                this.nomeAluno = nomeAluno;
        }
}
