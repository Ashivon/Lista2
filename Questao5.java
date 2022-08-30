public class Questao5 {
	/*Imprima a saída: {0,3,6,9 ...99}*/
	public static void main(String[] args) {
		
		int i=0;
		
		for(i=0; i<=100; i++) {
			if(i%3==0)
				System.out.println(i);
		}
	}

}
