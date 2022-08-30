public class Questao11 {
	/*Faça um programa que possa gerar uma sequencia como a seguinte:
	0-0
	0-1
	0-0
	0-1
	0-2
	...
	3-2*/
	public static void main(String[] args) {
		int i, j, n=0;
		for(i=0; i<=3; i++) {
			for(j=0; j<5; j++) {
				System.out.println(i+" - "+n);
				n++;
				if(j==1) {
					n=0;
				}
				if(j==4) {
					n=0;
				}
			}
		}
	}

}
