package bttailop;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        scanner.nextLine();
        String gioitinh = scanner.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String chuyennganh = scanner.nextLine();
        System.out.println("Nhap GPA: ");
        float GPA = scanner.nextFloat();
        System.out.println("Nhap que quan: ");
        scanner.nextLine();
        String quequan = scanner.nextLine();
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Chuyennganh: " + chuyennganh);
        System.out.println("GPA: " + GPA);
        System.out.println("Que quan: " + quequan);
       
    }

}
