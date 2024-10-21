import java.util.*;
abstract class Shape{
    double i;
    double j;
    abstract void area();
	Shape(double a,double b){
	 i=a;
         j=b;
	}
}

class Rectangle extends Shape{
	Rectangle(double a,double b){
		super(a,b);
	}
	void area(){
		System.out.println("area of rectangle is"+" "+i*j);
	}
}
class Triangle extends Shape{
	Triangle(double a,double b){
		super(a,b);
	}
	void area(){
		System.out.println("area of triangle is"+" "+0.5*i*j);
	}
}
class Circle extends Shape{
	Circle(double a,double b){
		super(a,b);
	}
	void area(){
		System.out.println("area of circle is"+" "+3.14*i*j);
	}
}
class Areademo{
	public static void main(String args[]){
		Rectangle r1=new Rectangle(10.0,20.0);
		Triangle t1=new Triangle(10.0,20.0);
		Circle c1=new Circle(10.0,10.0);
		Shape r;
		r=r1;
		r.area();
		r=t1;
		r.area();
		r=c1;
		r.area();
	}
}
