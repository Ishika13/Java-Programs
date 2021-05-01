
import java.util.*;
class Shape
 {
    void draw()
    {
        System.out.println("Shape draw()");
    }
    
    void erase() 

    {
        System.out.println ("Shape erase()");
    }
 }

class Circle extends Shape
 {
     void draw()
 {
    System.out.println ("Circle draw()");
 }
     void erase()
 {
    System.out.println ("Circle erase()");
 }
}


class Square extends Shape
 {
        void draw()
 {
        System.out.println ("Square draw()");
 }
        void erase()
 {
        System.out.println ("Square erase()");
 }
}


class Triangle extends Shape
 {
        void draw()
 {
    System.out.println("Triangle erase()");
 }
}


class GetShape {
  private Random rand = new Random();
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
}

public class Shapes
 {
 public static Shape randshape()
 {
 switch((int)(Math.random()*3))
 {
     
 case 0: return new Circle();
 case 1: return new Square();
 case 2: return new Triangle();

 }
     return null;
}
 public static void main (String arg[])
 {
 Shape shape[] = new Shape[9];
 for(int i = 0;i< shape.length; i++) 

 shape[i] = randshape();
 for(int i= 0;i < shape.length; i++)
 shape[i].draw();
 }

} 