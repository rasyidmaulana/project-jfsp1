package latihan;

import java.util.Scanner;

public class LamaPerjalanan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan jam keberangkatan: ");
		int jam1 = input.nextInt();
		System.out.print ("Masukan menit keberangkatan: ");
		double menit1 = input.nextDouble();
		double waktu1 = jam1 + (menit1/60);
		
		System.out.print("Masukan jam kedatangan: ");
		int jam2 = input.nextInt();
		System.out.print("Masukan jam kedatangan: ");
		double menit2 = input.nextDouble();
		double waktu2 = jam2 + (menit2/60);
		
		String error = "";
		if( jam1>23 || jam2>23) error += "Jam tidak boleh lebih dari 23, ";
		if( menit1>59 || menit2>59) error += "Menit tidak boleh lebih dari 59 ";
		
		if(error.equals("")){
			// jam3 = 10,25 - 8,5 = 1,.. -->
			// menit = 0,.. * 60
			double jam3 = waktu2 - waktu1;
			int jam = (int)jam3;
			double menit = (jam3-jam)*60;
			
			System.out.println("Lama perjalanan anda "+jam3+" jam");
			System.out.println("Atau "+jam+" jam, "+(int)menit+" menit");
		}else{
			System.err.println(error);
		}
		
	}	
}