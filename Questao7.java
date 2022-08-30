public class Questao7 {
	/*Imprima a saída:
0 - 0
1 - 3
2 - 6
...
100 - 300*/
	public static void main(String[] args) {

		int i;
		int j;
		
		for(i=0, j=0; i<=100 && j<=300; i++, j=j+3) {
			System.out.println(i+" - "+j);
		}
	}

}
