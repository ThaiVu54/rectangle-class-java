package com.company;

import java.util.Scanner;

//todo tao class main chua phuong thuc main de thuc thi chuong trinh
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the width: ");
        double width = sc.nextDouble();
        System.out.print("enter the height: ");
        double height = sc.nextDouble();

        //todo khoi tao doi tuong thuoc lop rectangle voi phuong thuc khoi tao chua 2 tham so width, height
        Rectangle rectangle = new Rectangle(width, height);

        //todo Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle đã tạo để hiển thị các
        //todo thông số của hình chữ nhật
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
