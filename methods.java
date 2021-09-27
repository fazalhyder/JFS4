import java.util.Scanner;
public class methods{
	public static int even(){
		int i;
		System.out.println("------------------------------------");
		System.out.println("printing even number up to 10");
		System.out.println("------------------------------------");
		for(i=0;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}

		}
		return 0;
	}
	public static int odd(){
		int i;
		System.out.println("------------------------------------");
		System.out.println("printing odd number up to 10");
		System.out.println("------------------------------------");
		for(i=0;i<=10;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		return 0;
	}
	public static int factorial() {
		System.out.println("------------------------------------");
		System.out.println(" factorial number ");
		System.out.println("------------------------------------");
		System.out.println("enter the no : ");
		Scanner in = new Scanner(System.in);
		int number =in.nextInt();
        int i,fact=1;     
        for(i=1;i<=number;i++){    
         fact=fact*i;    
	   }    
       System.out.println("Factorial of "+number+" is: "+fact);
	   return 0;
    }  
	public static int mt(){
		System.out.println("------------------------------------");
		System.out.println(" Multiplication table ");
		System.out.println("------------------------------------");
		System.out.println("enter the no : ");
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		int i,l=10;
		for(i=0;i<=10;i++){
			System.out.println(+t+"*"+i+"="+(t*i));
		}
		return 0;
	}
	public static int prime(){
		System.out.println("------------------------------------");
		System.out.println("Checking weather the given number is Prime or Not");
		System.out.println("------------------------------------");
	    System.out.println("enter the no : ");
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		if(t%t==0 && t%1==0){
			System.out.println(" is prime");
		}
		if(t%t!=0 && t%1!=0){
			System.out.println("is not prime");
			
		}
		return 0;
	}
	
	public static int max(){
		System.out.println("------------------------------------");
		System.out.println("method to find max of 3 numbers.");
		System.out.println("------------------------------------");
		System.out.println("enter the no 1 : ");
		Scanner in = new Scanner(System.in);
		int v1 =in.nextInt();
		System.out.println("enter the no 2 : ");
		int v2 =in.nextInt();
		System.out.println("enter the no 3 : ");
		int v3 =in.nextInt();
		if(v1>v2 && v1>v3){
			System.out.println(" The no 1 : "+v1+" is maximum of three numbers");
		}
		if(v2>v1 && v2>v3){
			System.out.println(" The no 1 : "+v2+" is maximum of three numbers");
		}
		if(v3>v2 && v3>v1){
			System.out.println(" The no 1 : "+v3+" is maximum of three numbers");
		}
		return 0;
	}
	public static int oe(){
		System.out.println("------------------------------------");
		System.out.println("method to find whether the given number is odd or even.: ");
		System.out.println("------------------------------------");
		System.out.println("enter the no  : ");
		Scanner in = new Scanner(System.in);
		int v1 =in.nextInt();
		if(v1%2==0){
				System.out.println("THE GIVEN NO IS EVEN");
			}
		if(v1%2!=0){
				System.out.println("THE GIVEN NO IS ODD");
			}
			return 0;
	}
	public static void bodd(){
		System.out.println("------------------------------------");
		System.out.println("method to check whether the given number is odd or not. (return true/false)");
		System.out.println("------------------------------------");
		System.out.println("enter the no  : ");
		Scanner in = new Scanner(System.in);
		int v =in.nextInt();
		if(v%2!=0){
				System.out.println("TRUE");
			}
			if(v%2==0){
			System.out.println("False");
			}
	}
	public static void main (String[] args){
		methods m = new methods();
		m.even();
		m.odd();
		m.factorial();
		m.mt();
		m.prime();
		m.max();
		m.oe();
		m.bodd();
	}

}


