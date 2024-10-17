import java.util.*;
class Student{
	String usn;
	String name;
	int no_of_subjects;
	
	Student(String usn,String name,int no_of_subjects){
		this.usn=usn;
		this.name=name;
		this.no_of_subjects=no_of_subjects;
	}
	void SGPA(){
		Scanner sc=new Scanner(System.in);
		int numcredits[]=new int[no_of_subjects];
		int totcredits[]=new int[no_of_subjects];
		int marks[]=new int[no_of_subjects];
		for(int i=0;i<no_of_subjects;i++){
			System.out.println("enter the marks for"+(i+1)+"subject");
			marks[i]=sc.nextInt();
			System.out.println("enter the credits for"+(i+1)+"subject");
			numcredits[i]=sc.nextInt();
		}
		for(int i=0;i<no_of_subjects;i++){
			if(marks[i]<=100 && marks[i]>=90){
				totcredits[i]=numcredits[i]*10;
			}
			else if(marks[i]<90 && marks[i]>=80){
				totcredits[i]=numcredits[i]*9;
			}
			else if(marks[i]<80 && marks[i]>=70){
				totcredits[i]=numcredits[i]*8;
			}
			else if(marks[i]<70 && marks[i]>=60){
				totcredits[i]=numcredits[i]*7;
			}
			else if(marks[i]<60 && marks[i]>=50){
				totcredits[i]=numcredits[i]*6;
			}
			else if(marks[i]<50 && marks[i]>=40){
				totcredits[i]=numcredits[i]*5;
			}
			else if(marks[i]<40){
				System.out.println("fail");
				continue;
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<no_of_subjects;i++){
			sum1+=totcredits[i];
			sum2+=numcredits[i];
		}
		double a=sum1/sum2;
		System.out.println("SGPA is"+a);
	}


	void display(){
		System.out.println("USN:"+usn);
		System.out.println("NAME"+name);
	}
}
class SGPA{
	public static void main(String args[]){
		Scanner nc=new Scanner(System.in);
		Student s[]=new Student[3];
		for(int i=0;i<3;i++){
			System.out.println("enter usn");
			String usn=nc.nextLine();
			System.out.println("enter the name of the"+ (i+1) +"student");
			String name=nc.nextLine();
			System.out.println("enter the number of subjects");
			int no_of_subjects=nc.nextInt();
			nc.nextLine();
			s[i]=new Student(usn,name,no_of_subjects);
			s[i].SGPA();
			s[i].display();
		}
}
}






		