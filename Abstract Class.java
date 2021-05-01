/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author admin
 */
//Abstract class allows us to create subclasses closely related to the parent class that we can define.
//It has a default function that can be set by the user.

abstract class GraphicObject {
    abstract void showObject();
    void display(){
        System.out.println("This is a non Abstract Class");
    }
}
class Rectangle extends GraphicObject{
    void showObject(){
        System.out.println("This is a Rectangle.");
    }
}
class Line extends GraphicObject{
    void showObject(){
        System.out.println("This is a Line.");
    }
}
class Bezier extends GraphicObject{
    void showObject(){
        System.out.println("This is a Bezier.");
    }
}
class Circle extends GraphicObject{
    void showObject(){
        System.out.println("This is a Circle.");
    }
}
public class Assignment1 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.showObject();
        c.display();
        Rectangle r = new Rectangle();
        r.showObject();
        r.display();
        Line l = new Line();
        l.showObject();
        l.display();
        Bezier b = new Bezier();
        b.showObject();
        b.display();
    }
}

    

    
