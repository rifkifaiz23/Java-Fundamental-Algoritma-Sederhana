public class AlgoritmaTokoBuku {
	public static void main (String [] args) {
		int HargaPena = 5000;
		int HargaBuku = 7500;
		int HargaPensil = 6500;
		
		int TotalHargaPena = HargaPena * 4;
		int TotalHargaBuku = HargaBuku * 5;
		int TotalHargaPensil = HargaPensil *3;
		
		int TotalBelanja = TotalHargaBuku + TotalHargaPena + TotalHargaPensil;
		
		System.out.println("Total Harga Pena = " + TotalHargaPena);
		System.out.println("Total Harga Buku = " + TotalHargaBuku);
		System.out.println("Total Harga Pensil = " + TotalHargaPensil);
		System.out.println("Total Belanja = " + TotalBelanja);
	}
}