package Aula02;

public class Teste {

    public static void main(String[] args) {
        POO instancia1 = new POO();

        instancia1.nomeFilme = "Piratas do Caribe";
        instancia1.anoLancamento = 2007;
        instancia1.genero = "Aventura";
        instancia1.notaCritica = 8;

        System.out.println();
        System.out.println("------------------------------");
        System.out.println( "Nome : " + instancia1.getNomeFilme());
        System.out.println( "Ano de Lançamento : " + instancia1.getAnoLancamento());
        System.out.println( "Genero: " + instancia1.getGenero());
        System.out.println( "Nota Critica : " + instancia1.getnotaCritica());
        System.out.println("------------------------------");


    }
}
