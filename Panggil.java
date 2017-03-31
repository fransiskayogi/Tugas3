import java.util.Scanner;

public class Panggil{
	public static void main (String[] args){


		Scanner input = new Scanner(System.in);
		char jenisKelamin;
		int tinggiBadan;

		System.out.print("Masukan jenisKelamin : ");
		jenisKelamin = input.next().charAt(0);

		System.out.print("Masukan tinggiBadan : ");
		tinggiBadan = input.nextInt();

		System.out.println("=====================");


		Mahasiswa mhs = new Mahasiswa("Fransiska Yogi Pangestu");
		System.out.println(mhs.nama);
		System.out.println(jenisKelamin);
		System.out.println(tinggiBadan);

	}
}