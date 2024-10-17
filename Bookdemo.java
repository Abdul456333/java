import java.util.*;
class Book{
	String name;
	String author;
	int price;
	int no_pages;
	
Book(String name,String author,int price,int no_pages){
	this.name=name;
	this.author=author;
	this.price=price;
	this.no_pages=no_pages;
}
 void setname(String name){
this.name=name;
}
 void setauthor(String author){
this.author=author;
}
 void setprice(int price){
this.price=price;
}
 void setno_pages(int no_pages){
this.no_pages=no_pages;
}
String getname(){
return this.name;
}
String getauthor(){
return this.author;
}
int getprice(){
return this.price;
}
int getno_pages(){
return this.no_pages;
}
public String toString(){
return "the book details are name:"+this.name+",author: "+this.author+",price: "+this.price+",no_of_pages: "+this.no_pages;
}
}
class Bookdemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number of books");
		n=sc.nextInt();
		sc.nextLine();
		Book book[]=new Book[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the details of"+ (i+1)+" book");
			System.out.println("enter the name of the book");
			String name=sc.nextLine();
			System.out.println("enter the author of the book");
			String author=sc.nextLine();
			System.out.println("enter the price of the book");
			int price=sc.nextInt();	
			System.out.println("enter the no_of_pages of the book");
			int no_pages=sc.nextInt();
			sc.nextLine();
			book[i]=new Book(name,author,price,no_pages);
			System.out.println(book[i]);
}
sc.close();
}
}