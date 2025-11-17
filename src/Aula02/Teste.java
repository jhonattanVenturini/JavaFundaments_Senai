package Aula02;

public class Teste {

    public static void main(String[] args) {
        // Criando vários filmes com o construtor
        POO filme1 = new POO("Piratas do Caribe", 2007, "Aventura", 8.0);
        POO filme2 = new POO("Blade Runner 2049", 2017, "Ficção Científica", 9.0);
        POO filme3 = new POO("Homem-Aranha 2", 2004, "Ação", 8.5);

        exibirFilme(filme1);
        exibirFilme(filme2);
        exibirFilme(filme3);
    }

    // Criando um método para imprimir (melhor organização)
    public static void exibirFilme(POO filme) {
        System.out.println("------------------------------");
        System.out.println("Nome : " + filme.getNomeFilme());
        System.out.println("Ano de Lançamento : " + filme.getAnoLancamento());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Nota Crítica : " + filme.getnotaCritica());
        System.out.println("------------------------------");
    }
}
