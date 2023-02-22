/* Fazer um programa que receba uma string do usuário e mostre o conteúdo desta
string de forma invertida.*/

package application;

import java.util.Scanner;

import entities.Palavra;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite uma palavra qualquer: ");
		palavra = sc.next();
		Palavra.palavraInvertida(palavra);
		
	}

}
