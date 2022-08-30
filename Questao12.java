import java.util.Scanner;
public class Questao12 {
/*12)Para cada item abaixo imprima as formas apresentadas. Permita que o
usuário escolha o número de linhas e colunas desejado, para os itens
abaixo foram utilizados com 6 linhas e 6 colunas. Porém,
independentemente do número de linhas e colunas, as formas devem
ser mantidas para cada item.*/
	public static void itemA(int a, int b) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				System.out.print("*");
				if(j==i)
					j=b+j;
			}
			System.out.println("");
		}
	}
	public static void itemB(int a, int b) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				if(j==i)
					System.out.print("#");
				else if(i+j==b+1) 
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
		itemC(a, b);
	}
	public static void itemC(int a, int b) {
		System.out.println("\nItem C:");
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				if(i%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
		itemD(a,b);
	}
	public static void itemD(int a, int b) {
		System.out.println("\nItem C:");
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				if(i==1 || j==1 || i==a || j==b)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
		itemE(a,b);
}
	public static void itemE(int a, int b) {
		System.out.println("\nItem D:");
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				if(i<=a/2)
					System.out.print("*");
				if(i>a/2) {
					if(j%2==1)
						System.out.print("#");
					else
						System.out.print("$");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {

		int  linhas, colunas;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas:");
		linhas = ler.nextInt();
		System.out.println("Digite o numero de colunas:");
		colunas = ler.nextInt();
		
		System.out.println("\nItem A:");
		itemA(linhas,colunas);
		System.out.println("\nItem B:");
		itemB(linhas,colunas);
	}

}