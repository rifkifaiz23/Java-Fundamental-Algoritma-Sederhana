import  java.util.Scanner;

public class AlgoritmaLsegitiga{
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan tinggi = ");
		int t = scan.nextInt();
		System.out.print("Masukkan alas = ");
		int a = scan.nextInt();
		
		int luasSegitiga = (a*t)/2;
		System.out.println("Luas Lingkaran = " + luasSegitiga);
		
	}
}