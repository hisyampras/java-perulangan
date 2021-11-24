package com.percabangan.main;

import java.util.Scanner;

public class JavaPercabangan {
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Masukkan data :");
//		int jam= input.nextInt();
//		
//		
//		if(jam<=10) {
//			System.out.println("Selamat Pagi");
//			
//		}else if (jam <=16) {
//			System.out.println("Selamat Siang");
//			
//		}else if(jam <=18) {
//			System.out.println("Selamat Sore");
//			
//		}else {
//			System.out.println("Selamat Malam");
//		}
		
		
		
		
		
		JavaPercabangan main = new JavaPercabangan();
		main.cekPajakMulti();
		
		
		
	}
	
	
	public static void cekPajak() {
		
		String jenisKelamin = "gay";
		boolean menikah=false;
		
		int pajak=0;
		
		if(jenisKelamin.equalsIgnoreCase("pria")) {
			if(menikah) {
				
			}
		}
	}
	public void cekPajakMulti() {
		String jenisKelamin="male";
		boolean menikah=false;
		int pajak=0;
	
		switch(jenisKelamin) {
		case "female":
		case "male":
		case "intersex":
		case "trans":
		
		
		if(menikah) {
			pajak=5;
			
		}else {
			pajak=10;
		}
		break;
		
		case "non_conforming":
		case "personal":
		case"eunuch":
			
			pajak= 10;
		break;
		
		default:
		
			pajak= 8;
		break;
		}
		System.out.println("Pajak anda adalah:" + pajak + "%");
	}
	
	public void hitungBidang() {
		
		int PERSEGI_PANJANG = 1;
		int SEGITIGA=2;
		
		int LUAS=1;
		int KELILING=2;
		
		
		int panjang;
		int lebar;
		int bentuk_bidang;
		int jenisHitungan;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Pilih Bentuk Bidang \r\n" +
				"1. Persegi Panjang \n" +
				"2. Segitiga \r\n" +
				"\r\n" +
				"\r\n"+
				"Pilih(1-2) : ");
		
		bentuk_bidang = scan.nextInt();
		
		System.out.print("Pilih hitungan yang akan diterapkan \r\n" +
				"1. Persegi Panjang \n" +
				"2. Segitiga \r\n" +
				"\r\n" +
				"\r\n"+
				"Pilih(1-2) : ");
		
		jenisHitungan = scan.nextInt();
		
		if(bentuk_bidang==PERSEGI_PANJANG) {
			if(jenisHitungan == LUAS){
				
				System.out.print("Masukkan Panjang:");
				panjang= scan.nextInt();
				System.out.print("Masukkan lebar: ");
				lebar=scan.nextInt();
				
				int luas = panjang*lebar;
				
				System.out.println("Luasnya adalah: "+luas);

			}
			else if(jenisHitungan == KELILING) {
				System.out.print("Masukkan Panjang sisi: ");
				panjang = scan.nextInt();
				int keliling = panjang*4;
				System.out.println("Kelilingnya adalah"+ keliling);
				
			}
		} else if (bentuk_bidang == SEGITIGA) {
			if(jenisHitungan==LUAS) {
				System.out.print("Masukkan alas:");
				panjang = scan.nextInt();
				System.out.print("Masukkan tinggi:");
				lebar = scan.nextInt();
				
				double luas = (0.5 *(panjang*lebar));
				
				System.out.println("Luasnya adalah");
			}
		}
	}
}
