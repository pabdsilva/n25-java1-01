package br.com.senaisp.baur.aula04;

public class Exemplo01 {

	public static void main(String[] args) {
	 int vlr01 = 10;
	 int vlr02 = vlr01;
	 System.out.println("Vlr01: " + vlr01);
	 System.out.println("Vlr02: " + vlr02);
	 String str01 ="Abelha";
	 String str02 = new String ("Abelha");
	 //New força a criação de um novo objeto de memória em um novo endereço de memória.
	 System.out.println("Str01: " + str01);
	 System.out.println("Str02: " + str02);
	 System.out.println(str01==str02); //Compara endereço de memória do objeto.
	 System.out.println(str01 .equals(str02));
	 //Compara conteúdo do endereço de memória (obs. Podemos também utilizar o compare).
	 
	}

}
