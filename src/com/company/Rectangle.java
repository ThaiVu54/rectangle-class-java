package com.company;

public class Rectangle {
    double width, height; //! cap phat bo nho

    //todo constructor mac dinh, được gọi một cách tự động khi và chỉ khi không có constructor nào được định nghĩa trong một lớp.
    public Rectangle() { //! constructor khong tham so
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //todo dinh nghia phuong thuc getArea(), getPerimeter(), display()
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{ width=" + width + ", height=" + height + "}";
    }



}
