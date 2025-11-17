package Aula02;

public class POO {

   String nomeFilme;
   int anoLancamento;
   String genero;
   double notaCritica;

   // --- Construtor ---
   public POO(String nomeFilme, int anoLancamento, String genero, double notaCritica) {
      this.nomeFilme = nomeFilme;
      this.anoLancamento = anoLancamento;
      this.genero = genero;
      this.notaCritica = notaCritica;
   }

   // Getters
   public String getNomeFilme() { return nomeFilme; }
   public int getAnoLancamento() { return anoLancamento; }
   public String getGenero() { return genero; }
   public double getnotaCritica() { return notaCritica; }

}
