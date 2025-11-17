package Aula02;

/*
* Classes Objetos são "modelos" pra criar as intâncias.
* Estas classes contem as variaveis que caracterizam o objeto.
* Metodo(s) Construtor(es) -> possuem as intruções para cirar a "instância"
* Metodos próprios do objeto:
 */
public class POO {
    // Exemplo -> Ficaha de cadastro de Filmes
    // Primeiramente declaramos as variaveis do objeto(atributos)


   String nomeFilme;
   int anoLancamento;
   String genero;
   int notaCritica;

   //Construtor
   public String getNomeFilme(){
      return nomeFilme;
   }
   public int getAnoLancamento (){
      return anoLancamento;
   }
   public String getGenero(){
      return genero;
   }
   public int getnotaCritica(){
      return notaCritica;
   }

}
