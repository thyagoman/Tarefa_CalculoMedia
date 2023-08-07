import java.util.Scanner;
/* Realizado um vetor de 4 posicoes, com a soma das notas nele mesmo , e realizado a media da soma de todas as notas dividido
 * pela quantidade
 * realizado um loop para gerar as 4 notas e pedido a cada loop para o usuario digitar a nota equivalente
 * realizado casting com o resultado da media final */


public class Notas_media {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int [] vetor = new int [4];
		int soma = 0;
		int media = 0;
		int quantidadeNotas = 1;
		
		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Digite o valor da nota "+quantidadeNotas++);
			vetor[i] = input.nextInt(); 
			soma += vetor[i];
		}
		media = soma/vetor.length;
		System.out.println("A media dos alunos foi de = "+(double)media);
		
		
		
	}

}
