public class quadratic {
    public static void main(string args[]){
        double a,b,c,d,r1,r2;
        Scanner sc = new Scanner(System.in)
        System.out.println("Enter the value of a,b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;
        if (d==0){
            System.out.println("Real and Equal roots");
            r1=-b/2*a;
            r2=-b/2*a;
            System.out.println("roots are"+r1+" "+r2);
        }
        else if(d>0){
            System.out.println("Distinct and Real roots");
            r1=((-b)+Math.sqrt(d))/2*a;
            r2=((-b)-Math.sqrt(d))/2*a;
            System.out.println("roots are"+r1+" "+r2);
        }
        else{
            System.out.println("Imaginary roots");
        }
    }
}
