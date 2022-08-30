public class Questao8 {
	/*Imprima a saída:
0 - 100
1 - 99
2 - 98
...
49 - 51*/
	public static void main(String[] args) {

		int i;
		int j;
		for(i=0, j=100; i<50 && j>50; i++, j--) {
			System.out.println(i+" - "+j);
		}
	}

}
