package com.teachmeskills.lesson_7.task_2;

public class Rectangle extends Figure{

    public int width;
    public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateTheArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+length);
    }

}
