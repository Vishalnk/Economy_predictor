package production;
import java.util.Scanner;

class Produce{
	public long c1=1000,c2=1000,count=0,counts=0,count00=0,count11=0,count0=0,count1=0;
	final long day=1;
	public double salaryproductions=0;
	public long t1,t2;
	public long z1,z2,cost1,cost2;
	int y=0,a1;
	public String a,b,c,d;
	public void products(){
		Scanner st =new Scanner(System.in);
		System.out.println("***********************");
	System.out.println("Welcome to Production Department");
	
	System.out.println("Enter the 1st product name that you are going to produce");
	 a=st.next();
	 c=a;
	System.out.println("Enter the 2nd product name that you are going to produce");
	 b=st.next();
	 d=b;
	for(int i=1;i<3;i++)
	{
		
		System.out.println("1. "+a);
		System.out.println("2. "+b);
		if(i==1){

			System.out.println("Enter the raw material cost for  "+a);
			z1=st.nextLong();
			System.out.println("Enter the number of days within which the "+a+" has to be produced");
			y=st.nextInt();
			counts=(y*c1)/day;
			System.out.println("Enter the cost of one "+a+" that you want to declare");
			cost1=st.nextLong();
			System.out.println("Total products which can be produced in "+y+" days are "+counts);
			count00=counts;
			t1=cost1*counts;
			System.out.println("Total cost of "+counts+" products is "+t1);	
		}
		else{
			System.out.println("Enter the raw material cost for "+b);
			z2=st.nextLong();
			System.out.println("Enter the number of days within which the "+b+" has to be produced");
			y=st.nextInt();
			count=(y*c2)/day;
			System.out.println("Enter the cost of one "+b+" that you want to declare");
			 cost2=st.nextLong();
			System.out.println("Total products which can be produced in "+y+" days are "+count);
			count11=count;
			t2=cost2*count;
			System.out.println("Total cost of "+count+" products is "+t2);
		}
	
		}
	
	}
	public void salaryproduction(){
		 a1=0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter the number of employees for production dept");
			a1=sc.nextInt();
			try{
				if(a1==0)
					throw new MyException("You have entered 0 which is invalid");
				else{
					salaryproductions= Salarycalculate.salarycalculator(a1);
					System.out.println("Total salary for "+a1+"employees is"+this.salaryproductions);
				}
			}
					catch (MyException e) {
						System.out.println("There was an issue");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						System.out.println(e.getMessage());
						System.out.println();
						}
						catch (Exception e) {
							System.out.println(e);	
							
							}
			
			}while(a1==0);
		
	}
}
public class Sale extends Produce{
	public double bs=14000,saleamt1=0,saleamt2=0;
	public double rawcost,totalbudget,saleamt,profit,loss;
	public double netsalary,tax,grosssalary,gs,salarysales,e=0,f=0;
	int P1,p1,p=0;
	int s;
	
	public void exports(){
		Scanner scan=new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Welcome to Sales Department");
		do{
		System.out.println();
		System.out.println("1."+c+" : "+counts);
		System.out.println("2."+d+" : "+count);
		System.out.println("Which product do you want to export (enter 1 or 2)and how many products");
		p1=scan.nextInt();
		P1=scan.nextInt();
		switch(p1){
			case 1: if(P1>counts||P1<0)
					{	System.out.println("Sorry you have exceeded the number");
						System.out.println("enter the number of products again");
						c1=scan.nextInt();
							while(c1>counts||c1<0){
								System.out.println("Sorry you have exceeded the number");
								System.out.println("enter the number of products again");
								c1=scan.nextInt();
								}
						counts=counts-c1;
						saleamt1=cost1*c1;
						e=e+saleamt1;
						System.out.println("Sale amount for"+p1+"."+c+" is "+saleamt1);
						System.out.println("reamining "+c+" is " +counts );
						
				   }
				  else{
					
					  counts=counts-P1;
					  saleamt1=cost1*P1;
					  e=e+saleamt1;
					  System.out.println("Sale amount for"+p1+"."+c+" is "+saleamt1);
						System.out.println("reamining "+c+" is " +counts );
				  }
				count0=count00-counts;
					break;
			case 2:	 if(P1>count||P1<0)
						{	System.out.println("Sorry you have exceeded the number");
							System.out.println("enter the number of products again");
							c1=scan.nextInt();
							while(c1>count||c1<0){
									System.out.println("Sorry you have exceeded the number");
									System.out.println("enter the number of products again");
									c1=scan.nextInt();
				
								}
							count=count-c1;
							saleamt2=cost2*P1;
							f=f+saleamt2;
							System.out.println("Sale amount for"+p1+"."+c+" is "+saleamt2);
							System.out.println("reamining "+d+" is " +count);
						}
					else{
		                
						count=count-P1;
						saleamt2=cost2*P1;
						f=f+saleamt2;
						System.out.println("Sale amount for"+p1+"."+c+" is "+saleamt2);
						System.out.println("reamining "+d+" is " +count);
					}
					count1=count11-count;
					break;
			default :System.out.println("Enter either 1 or 2");
						break;
			}
		System.out.println("Do you want to export again? 1.yes or 2.no");
		s=scan.nextInt();
		}while(s!=2);
			
		}
	public void salarysales(){
		int a1=0;
		do{
			double bs=10000;
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter the number of employees for Sales dept");
			a1=sc.nextInt();
			try{
				if(a1==0)
					throw new MyException("You have entered 0 which is invalid");
				else{
					salarysales=Salarycalculate.salarycalculator(bs,a1);
					System.out.println("Total salary for "+a1+" employees is "+salarysales);
					}
				}
					catch (MyException e) {
						System.out.println("There was an issue");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						System.out.println(e.getMessage());
						System.out.println();
						}
						catch (Exception e) {
							System.out.println(e);	
							
							}
			}while(a1==0);
		
	}
	
	
	public void calculate1(){
		System.out.println("Total salary amount for sales dept "+salarysales);
		System.out.println("Total salary amount for production dept "+salaryproductions);
		System.out.println("Total production of "+a+" is :"+count00+"and total cost is :"+t1);
		System.out.println("Total production of "+b+" is :"+count11+"and total cost is :"+t2);
		rawcost=z1+z2;
		System.out.println("Raw materials cost for both "+a+" and "+b+" is "+rawcost);
		totalbudget=salarysales+salaryproductions+rawcost+430240+560000;
		saleamt=e+f;
		System.out.println("total sales of "+a+" is "+count0+" Rs."+e);
		System.out.println("total sales of "+b+" is "+count1+" Rs."+f);
		System.out.println("***************************************");
		profit=saleamt-totalbudget;
		loss=totalbudget-saleamt;
		System.out.println("Total sales is :Rs."+saleamt);
		System.out.println("Total budget for the prodution :"+totalbudget);
				
	}
	public void display(){
		if(this.totalbudget<this.saleamt){
			System.out.println("Your company will be experiencing profit with the above criteria's");
			System.out.println("Your yearly turnover is "+profit);	
		}
		else
		{
			System.out.println("Your company will BE  under a loss if it follows the above criteria");
			System.out.println("You will face a loss of "+loss);
		}
	}

}

class MyException extends Exception {
		MyException(String message) {
				super(message);
				}

			}