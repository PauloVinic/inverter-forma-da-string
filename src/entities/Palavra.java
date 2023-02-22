package entities;

public class Palavra {
	
	public static void palavraInvertida(String palavra) {
		for (int i = palavra.length() - 1; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}
}
