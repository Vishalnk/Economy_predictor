package production;
import java.util.Scanner;

class Produce {
	public long c1=1000,c2=1000,count=0,counts=0,count00=0,count11=0,count0=0,count1=0;
	final long day=1;
	public double salaryproductions=0;
	public long time1,time2;
	public long raw_cost_of_1,raw_cost_of_2,cost1,cost2;
	int y=0,no_of_emp_production;
	public String product_1,product_2,copy_of_1,copy_of_2;
	public void products(){
		@SuppressWarnings("resource")
		Scanner st =new Scanner(System.in);
		System.out.println();
		System.out.println("***********************");
		System.out.println("Welcome to Production Department");
		System.out.println("Enter the 1st product name that you are going to produce");
		product_1=st.next();
		copy_of_1=product_1;
		System.out.println("Enter the 2nd product name that you are going to produce");
		product_2=st.next();
		copy_of_2=product_2;
		for(int i=1;i<3;i++)
		{
			System.out.println("1. "+product_1);
			System.out.println("2. "+product_2);
				if(i==1){
					System.out.println("Enter the raw material cost for  "+product_1);
					raw_cost_of_1=st.nextLong();
					System.out.println("Enter the number of days within which the "+product_1+" has to be produced");
					y=st.nextInt();
					counts=(y*c1)/day;
					System.out.println("Enter the cost of one "+product_1+" that you want to declare");
					cost1=st.nextLong();
					System.out.println("Total products which can be produced in "+y+" days are "+counts);
					count00=counts;
					time1=cost1*counts;
					System.out.println("Total cost of "+counts+" products is "+time1);	
				}
				else{
					System.out.println("Enter the raw material cost for "+product_2);
					raw_cost_of_2=st.nextLong();
					System.out.println("Enter the number of days within which the "+product_2+" has to be produced");
					y=st.nextInt();
					count=(y*c2)/day;
					System.out.println("Enter the cost of one "+product_2+" that you want to declare");
					cost2=st.nextLong();
					System.out.println("Total products which can be produced in "+y+" days are "+count);
					count11=count;
					time2=cost2*count;
					System.out.println("Total cost of "+count+" products is "+time2);
				}
		}
	}
	public void salaryproduction(){
		 no_of_emp_production=0;
		do{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter the number of employees for production dept");
			no_of_emp_production=sc.nextInt();
			try{
				if(no_of_emp_production==0)
					throw new MyException("You have entered 0 which is invalid");
				else{
					salaryproductions= Salarycalculate.salarycalculator(no_of_emp_production);
					System.out.println("Total salary for "+no_of_emp_production+"employees is"+this.salaryproductions);
				}
			}
			catch (MyException e) {
					System.out.println("There was an issue");
			try {
					Thread.sleep(5000);
				}
			catch (InterruptedException e1) {
					e1.printStackTrace();
					}
						System.out.println(e.getMessage());
						System.out.println();
					}
			catch (Exception e) {
					System.out.println(e);	
				}
			
			}while(no_of_emp_production==0);
	}
}
public class Sale extends Produce{
	public double bs=14000,saleamt1=0,saleamt2=0;
	public double rawcost,totalbudget,saleamt,profit,loss;
	public double netsalary,tax,grosssalary,salarysales,total_sale_amt_of_product1=0,total_sale_amt_of_product2=0;
	int P1,p1,p=0;
	int s;
	
	public void exports(){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println("***********************");
		System.out.println("Welcome to Sales Department");
		do{
			System.out.println();
			System.out.println("1."+copy_of_1+" : "+counts);
			System.out.println("2."+copy_of_2+" : "+count);
			System.out.println("Which product do you want to export (enter 1 or 2)and how many products");
			p1=scan.nextInt();
			P1=scan.nextInt();
		switch(p1){
			case 1: if(counts==0){
					System.out.println("Sucessfully sold all the "+copy_of_1+"'s");
					}
					else{
						if(P1>counts||P1<0)
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
							total_sale_amt_of_product1=total_sale_amt_of_product1+saleamt1;
							System.out.println("Sale amount for "+P1+" "+copy_of_1+"  products is "+saleamt1);
							System.out.println("reamining "+copy_of_1+" is " +counts );
							
					   }
					  else{
						  counts=counts-P1;
						  saleamt1=cost1*P1;
						  total_sale_amt_of_product1=total_sale_amt_of_product1+saleamt1;
						  System.out.println("Sale amount for "+P1+" "+copy_of_1+"  products is "+saleamt1);
							System.out.println("reamining "+copy_of_1+" is " +counts );
					  }
						count0=count00-counts;
					}
							
					break;
					
			case 2:	 if(count==0){
						System.out.println("Sucessfully sold all the "+copy_of_2+"'s");
					}
					else{
						if(P1>count||P1<0)
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
							total_sale_amt_of_product2=total_sale_amt_of_product2+saleamt2;
							System.out.println("Sale amount for "+P1+" "+copy_of_2+" products is "+saleamt2);
							System.out.println("reamining "+copy_of_2+" is " +count);
						}
					else{
							count=count-P1;
							saleamt2=cost2*P1;
							total_sale_amt_of_product2=total_sale_amt_of_product2+saleamt2;
							System.out.println("Sale amount for "+P1+" "+copy_of_2+"  products is "+saleamt2);
							System.out.println("reamining "+copy_of_2+" is " +count);
						}
					count1=count11-count;
					}
					
					break;
			default :System.out.println("Enter either 1 or 2");
						break;
			}
				System.out.println("Do you want to export again? 1.yes or 2.no");
				s=scan.nextInt();
		}while(s!=2);
			
		}
	public void salarysales(){
		int no_of_emp_sales=0;
		do{
			double bs=10000;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter the number of employees for Sales dept");
			no_of_emp_sales=sc.nextInt();
			try{
				if(no_of_emp_sales==0)
					throw new MyException("You have entered 0 which is invalid");
				else{
					salarysales=Salarycalculate.salarycalculator(bs,no_of_emp_sales);
					System.out.println("Total salary for "+no_of_emp_sales+" employees is "+salarysales);
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
			}while(no_of_emp_sales==0);
		
	}
	
	
	public void calculate_main(double salaryadministrartion,double salarycustom){
		System.out.println("Total salary amount for sales dept "+salarysales);
		System.out.println("Total salary amount for production dept "+salaryproductions);
		System.out.println("Total production of "+product_1+" is :"+count00+"and total cost is :"+time1);
		System.out.println("Total production of "+product_2+" is :"+count11+"and total cost is :"+time2);
		rawcost=raw_cost_of_1+raw_cost_of_2;
		System.out.println("Raw materials cost for both "+product_1+" and "+product_2+" is "+rawcost);
		totalbudget=salarysales+salaryproductions+rawcost+salaryadministrartion+salarycustom;
		saleamt=total_sale_amt_of_product1+total_sale_amt_of_product2;
		System.out.println("total sales of "+product_1+" is "+count0+" Rs."+total_sale_amt_of_product1);
		System.out.println("total sales of "+product_2+" is "+count1+" Rs."+total_sale_amt_of_product2);
		System.out.println();
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

@SuppressWarnings("serial")
class MyException extends Exception {
		MyException(String message) {
				super(message);
				}

			}