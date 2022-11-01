import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatFiyat = 1.11;
		double muzFiyat = 0.95;
		double patFiyat = 5.00;
		
		System.out.print("Armut kaç kilo? : ");
		double armutKilo = scanner.nextDouble();
		
		System.out.print("Elma kaç kilo? : ");
		double elmaKilo = scanner.nextDouble();
		
		System.out.print("Domates kaç kilo? : ");
		double domatKilo = scanner.nextDouble();
		
		System.out.print("Muz kaç kilo? : ");
		double muzKilo = scanner.nextDouble();
		
		System.out.print("Patlıcan kaç kilo? : ");
		double patKilo = scanner.nextDouble();
		
		double toplam = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) + (domatFiyat*domatKilo) +
						(muzFiyat*muzKilo) + (patFiyat*patKilo);
		
		System.out.println("Toplam tutar: " + toplam + " TL");
		
	}

}
