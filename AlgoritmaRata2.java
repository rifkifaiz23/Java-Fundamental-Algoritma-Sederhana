import java.util.Scanner;

public class AlgoritmaRata2 {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nilai Tugas 1 = ");
		int tgs1 = scan.nextInt();
		System.out.print("Nilai Tugas 2 = ");
		int tgs2 = scan.nextInt();
		System.out.print("Nilai Tugas 3 = ");
		int tgs3 = scan.nextInt();
		
		int sum = ( tgs1 + tgs2 + tgs3 )/3;
		System.out.println("Rata-Ratamu Adalah = "+sum);
	}
}