/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author 98tae
 */
public class MainProduct {

    public static Scanner sc = new Scanner(System.in);
    public static Product pr = new Product();
    public static QLProduct ql = new QLProduct();

    public static void main(String[] args) {
        while (true) {
            menu();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    nhap();
                    Xuat();
                   
                    break;
                case 2:
                    SPKTHUE();
                    break;
                case 3:
                    Nhaplieubai4();                 
                    break;
                case 99:
                    ql.Nhaptest();// insert dữ liệu k cần gõ tay
                    Xuat();
                    break;
  //                case 5:
//                    Delete();
//                    break;
//                case 6:
//                    Update();
//                    break;
                case 0:
                    System.exit(0);
                    break;

            }

        }

    }

    public static void menu() {
        System.out.println("**********************************************");
        System.out.println("1. Nhập Xuất 5 Sản Phẩm (Bài 2)");
        System.out.println("2. Nhâp 3 sản phẩm trong đó 1 sản phẩm không thuế (Bài 3)");
        System.out.println("3.Nhâp 3 sản phẩm trong đó 1 sản phẩm không thuế (Bài 4)");
//        System.out.println("5.Xóa");
//        System.out.println("6.Sửa ");
        System.out.println("0. Thoát Trương Trình");

    }

    public static void nhap() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name : ");
            String nameAdd = sc.nextLine();
            System.out.println("Price : ");
            double priceAdd = Double.parseDouble(sc.nextLine());
            ql.insert(new Product(nameAdd, priceAdd));
        }
    }

    public static void Xuat() {
        ql.xuatsp();
    }

    public static void SPKTHUE() {
//        System.out.println("Sản Phẩm này có thu thuế không : Y(es) or N(no)");
//        if(sc.nextLine().equalsIgnoreCase("Y")){  
//        }
        Product p1 = new Product("Sản Phẩm x", 50000);
        p1.select();
        Product p2 = new Product("Sản Phẩm y", 50000);
        p2.select();
        Product p3 = new NoTaxProduct("Sản Phẩm z", 1000000);
        p3.select();

    }
//Test Chức Năng
//    public static void Delete() {
//        System.out.println("Nhập Vị trí cần xóa");
//        ql.delete(Integer.parseInt(sc.nextLine()) - 1);
//        System.out.println("Ds sau khi Xóa");
//        ql.xuatsp();
//
//    }
//
//    public static void Update() {
//        System.out.println("Nhập Vị Trí Cần Sửa");
//        int vitri = Integer.parseInt(sc.nextLine()) - 1;
//        System.out.println("Nhập tên muốn sửa cho sản phẩm : ");
//        String nameUpdate = sc.nextLine();
//        System.out.println("Nhập Giá bạn muốn sửa cho sản phẩm : ");
//        double SpriceUpdate = Double.parseDouble(sc.nextLine());
//        ql.Update(vitri, new Product(nameUpdate, SpriceUpdate));
//        System.out.println("Ds sau khi sửa");
//        ql.xuatsp();
//    }

    public static void Nhaplieubai4() {
        ql.deleteAll();
        ql.add(new Product("Iphone 13 Promax", 55000));
        ql.add(new Product("Ipad Pro", 45500));
        ql.add(new NoTaxProduct("MacBook Pro", 55000));
        ql.xuatsp();
        while (true) {
            System.out.println("______________________________________");
            System.out.println("1.Nhập thêm");
            System.out.println("2.Xóa");
            System.out.println("3.Sửa");
            System.out.println("4.In danh sách");
            System.out.println("0.thoát");

            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    System.out.println("Tên Muốn Thêm : ");
                    String nameAdd = sc.nextLine();
                    System.out.println("Giá Tiền Của Sản Phẩm Muốn Thêm : ");
                    double priceAdd = Double.parseDouble(sc.nextLine());
                    ql.insert(new Product(nameAdd, priceAdd));
                    System.out.println("DS Sau Thêm");
                    ql.xuatsp();
                    break;
                case 2:
                    try {
                        System.out.println("Nhập Vị trí cần xóa");
                        ql.delete(Integer.parseInt(sc.nextLine()) - 1);
                        System.out.println("Ds sau khi Xóa");
                        ql.xuatsp();
                        break;
                    } catch (Exception e) {
                        System.out.println("Bạn đã nhập sai , vui lòng chọn menu và nhập lại ");
                        break;
                    }

                case 3:
                    System.out.println("Nhập Vị Trí Cần Sửa");
                    int vitri = Integer.parseInt(sc.nextLine()) - 1;
                    if (vitri < ql.list.size()) {
                        System.out.println("Nhập tên muốn sửa cho sản phẩm : ");
                        String nameUpdate = sc.nextLine();
                        System.out.println("Nhập Giá bạn muốn sửa cho sản phẩm : ");
                        double SpriceUpdate = Double.parseDouble(sc.nextLine());
                        ql.Update(vitri, new Product(nameUpdate, SpriceUpdate));
                        System.out.println("Ds sau khi sửa");
                        ql.xuatsp();
                        break;
                    } else {
                        System.out.println("Bạn đã nhập sai , vui lòng chọn menu và nhập lại ");
                        break;
                    }

                case 4:
                    ql.xuatsp();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
    }

}
