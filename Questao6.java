public class Questao6 {
	/*Imprima a saída:
0 - 33
1 - 32
2 - 31
...
99 - -66*/
	public static void main(String[] args) {

		int i;
		int j;
		for(i=1, j=33; i<100 && j>-68;  i++, j--) {
			System.out.println(i+" - "+j);
		}
	}

}
