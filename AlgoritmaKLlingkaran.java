public class AlgoritmaKLlingkaran {
	public static void main (String [] args) {
		int r;
		double phi,luas,keliling;
		
		r = 14;
		phi = 3.14;
		
		luas = phi * r * r;
		keliling = 2 * phi * r;
		
		System.out.println ("Luas Lingkaran = "+ luas);
		System.out.println ("Keliling Lingkaran = "+ keliling);
	}
}