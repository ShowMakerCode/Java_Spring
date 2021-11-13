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
    public static DAO ql = new QLProduct();
    public static DAO cl2r = new QLProduct();

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
                case 4:
                    Delete();
                    break;
                case 5:
                    Update();
                    break;
                case 6:
                    Xuat();
                    break;
                    
                case 99:
                    khoiTao();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }

        }

    }

    public static void menu() {
        System.out.println("\n*********************************************************");
        System.out.println("*1. Nhập Xuất 5 Sản Phẩm (Bài 2)                         *");
        System.out.println("*2. Tạo sản phẩm trong đó 1 sản phẩm không thuế (Bài 3)  *");
        System.out.println("*3. Tạo 3 sản phẩm trong đó 1 sản phẩm không thuế (Bài 4)*");
        System.out.println("*4.Xóa                                                   *");
        System.out.println("*5.Sửa                                                   *");
        System.out.println("*6.Xuất                                                  *");
        System.out.println("**********************************************************");
        System.out.println("0. Thoát Trương Trình");

    }

    public static void nhap() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name : ");
            String nameAdd = sc.nextLine();
            System.out.println("Price : ");
            double priceAdd = Double.parseDouble(sc.nextLine());
            System.out.println("Sản Phầm có tính thuế không : Y(es)/N(o) ");
            if (sc.nextLine().equalsIgnoreCase("Y")) {
                ql.insert(new Product(nameAdd, priceAdd));

            } else {
                ql.insert(new NoTaxProduct(nameAdd, priceAdd));
            }

        }
    }

    public static void Xuat() {
        ql.select();
    }

    public static void SPKTHUE() {
        Product p1 = new Product("Sản Phẩm x", 50000);
        p1.Output();
        Product p2 = new Product("Sản Phẩm y", 50000);
        p2.Output();
        Product p3 = new NoTaxProduct("Sản Phẩm z", 1000000);
        p3.Output();

    }

    public static void khoiTao() {
        ql.insert(new Product("Sản Phẩm 1", 6000));
        ql.insert(new Product("Sản Phẩm 2", 1600));
        ql.insert(new Product("Sản Phẩm 3", 7500));
        ql.insert(new Product("Sản Phẩm 4", 2000));
        ql.insert(new Product("Sản Phẩm 5", 60000));
        ql.select();

    }

//Test Chức Năng
    public static void Delete() {
        System.out.println("Nhập Vị trí cần xóa");
        int bienxoa = Integer.parseInt(sc.nextLine()) - 1;
        ql.delete(bienxoa);
        System.out.println("Ds sau khi Xóa");
        ql.select();

    }

    public static void Update() {
        System.out.println("Nhập Vị Trí Cần Sửa");
        int vitri = Integer.parseInt(sc.nextLine()) - 1;
        System.out.println("Nhập tên muốn sửa cho sản phẩm : ");
        String nameUpdate = sc.nextLine();
        System.out.println("Nhập Giá bạn muốn sửa cho sản phẩm : ");
        double SpriceUpdate = Double.parseDouble(sc.nextLine());
        System.out.println("Sản Phầm có tính thuế không : Y(es)/N(o) ");
        System.out.println("vui lòng chọn Y or N");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            ql.update(vitri, new Product(nameUpdate, SpriceUpdate));
            System.out.println("Ds sau khi sửa");
            ql.select();
        } else {
            ql.update(vitri, new NoTaxProduct(nameUpdate, SpriceUpdate));
            System.out.println("Ds sau khi sửa");
            ql.select();
        }

    }

    public static void Nhaplieubai4() {
        cl2r.insert(new Product("Iphone 13 Promax", 55000));
        cl2r.insert(new Product("Ipad Pro", 45500));
        cl2r.insert(new NoTaxProduct("MacBook Pro", 55000));
        cl2r.select();
        while (true) {
            System.out.println("______________________________________");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Select");
            System.out.println("0.Exit");

            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    System.out.println("Sản Phẩm Đó Có Thuế Không : Y(ES)/N(O)");
                    String bien = sc.nextLine();
                    if (bien.equalsIgnoreCase("Y")) {
                        System.out.println("Tên Muốn Thêm : ");
                        String nameAdd = sc.nextLine();
                        System.out.println("Giá Tiền Của Sản Phẩm Muốn Thêm : ");
                        double priceAdd = Double.parseDouble(sc.nextLine());
                        cl2r.insert(new Product(nameAdd, priceAdd));
                        System.out.println("DS Sau Thêm");
                        cl2r.select();
                        break;
                    } else if (bien.equalsIgnoreCase("N")) {
                        System.out.println("Tên Muốn Thêm : ");
                        String nameAdd = sc.nextLine();
                        System.out.println("Giá Tiền Của Sản Phẩm Muốn Thêm : ");
                        double priceAdd = Double.parseDouble(sc.nextLine());
                        cl2r.insert(new NoTaxProduct(nameAdd, priceAdd));
                        System.out.println("DS Sau Thêm");
                        cl2r.select();
                        break;
                    } else {
                        System.out.println("Bạn Đã Nhập sai vui lòng chọn Y or N");
                        break;
                    }

                case 2:
                    try {
                        System.out.println("Nhập Vị trí cần xóa");
                        cl2r.delete(Integer.parseInt(sc.nextLine()) - 1);
                        System.out.println("Ds sau khi Xóa");
                        cl2r.select();
                        break;
                    } catch (Exception e) {
                        System.out.println("Bạn đã nhập sai , vui lòng chọn menu và nhập lại ");
                        break;
                    }

                case 3:
                    System.out.println("Nhập Vị Trí Cần Sửa");
                    int vitri = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.println("Nhập tên muốn sửa cho sản phẩm : ");
                    String nameUpdate = sc.nextLine();
                    System.out.println("Nhập Giá bạn muốn sửa cho sản phẩm : ");
                    double SpriceUpdate = Double.parseDouble(sc.nextLine());
                    System.out.println("Sản Phầm có tính thuế không : Y(es)/N(o) ");
                    System.out.println("vui lòng chọn Y or N");
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        cl2r.update(vitri, new Product(nameUpdate, SpriceUpdate));
                        System.out.println("Ds sau khi sửa");
                        cl2r.select();
                        break;
                    } else {
                        cl2r.update(vitri, new NoTaxProduct(nameUpdate, SpriceUpdate));
                        System.out.println("Ds sau khi sửa");
                        cl2r.select();
                        break;
                    }
                case 4:
                    cl2r.select();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
    }

}
