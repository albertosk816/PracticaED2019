package datos;

public class operarArray {

	public static void main(String[] args) {
		rellenaArray();
		imprimeArray();

	}

	private static void rellenaArray() {
		
		
		int num[] =  new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.round(Math.random()*20);
			System.out.println(num[i]);
		}
		
	}
	
private static void imprimeArray() {
		
		
		int num[] =  new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.round(Math.random()*20);
			System.out.println(num[i]);
		}
		
	}


}
