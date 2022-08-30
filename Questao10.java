import java.util.Scanner;
public class Questao10 {
	/*10)Faça um programa que possa exibir uma sequência como a abaixo,
sendo o teto dos pares da esquerda e direita informados pelo usuário.
Exemplo: com pares da esquerda e direta com o teto de 2 unidades.
0 - 0
0 - 1
0 - 2
1 - 0

1 - 1
1 - 2
2 - 0
2 - 1
2 - 2
3 - 0
3 - 1
3 - 2*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int i, j, linhas, colunas;
		
		System.out.println("Digite a quantidade de linhas:");
		linhas = ler.nextInt();
		System.out.println("Digite a quantidade de linhas:");
		colunas = ler.nextInt();
		for(i=0; i<=linhas; i++) {
			for(j=0; j<=colunas; j++) {
				System.out.println(i+" - "+j);
			}
		}
	}

}
