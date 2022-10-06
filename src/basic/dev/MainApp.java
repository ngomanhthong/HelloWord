package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thong Tin Sinh Vien");

		System.out.println("nhap vao ten");
		String ten = sc.nextLine();

		System.out.println("nhap vao mxv");
		String mxv = sc.nextLine();

		System.out.println("nhap vao cmnd");
		String cmnd = sc.nextLine();

		System.out.println("nhap vao ten lop");
		String tenLop = sc.nextLine();
		
		System.out.println("nhap vao ten truong");
		String tenTruong = sc.nextLine();

		System.out.println("nhap vao dtb");
		double dtb = sc.nextDouble();

		
		System.out.println("Thong Tin Cong Dan");
		
		System.out.println("nhap vao ten cong dan");	
		String congDan = sc.nextLine();
		
		System.out.println("nhap vao dia chi");
		String diaChi = sc.nextLine();

		System.out.println("nhap vao sdt");
		String sdt = sc.nextLine();

		System.out.println("nhap vao he so luong");
		String heSoLuong = sc.nextLine();

		
		System.out.println("Thong Tin Mot Chiec Xe Car");

		System.out.println("nhap vao ten xe");
		String tenXe = sc.nextLine();

		System.out.println("nhap vao hang xe");
		String hangXe = sc.nextLine();

		System.out.println("nhap vao gia");
		String giaXe = sc.nextLine();

		System.out.println("nhap vao mau son");
		String mauSon = sc.nextLine();

		System.out.println("Ten: " + ten + "-Mxv: " + mxv + "-Cmnd: " + cmnd + "-Ten Lop: " + tenLop + "-Ten Truong: "
				+ tenTruong + "-dtb: " + dtb);

		System.out.println("--------");

		System.out.println(
				"Ten Cong Dan: " + congDan + "-Dia Chi: " + diaChi + "-sdt: " + sdt + "-He So Luong: " + heSoLuong);

		System.out.println("--------");

		System.out.println("Ten Xe: " + tenXe + "-Hang Xe: " + hangXe + "-Gia Xe: " + giaXe + "-Mau Son: " + mauSon);

	}

}
