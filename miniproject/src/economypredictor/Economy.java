package economypredictor;

import java.io.*;

import production.*;
import java.util.Scanner;
																				//administration class
abstract class administration{
	abstract void custom();								//abstract method
	double bs,da,hra,tax,months,gs,grosssalary,netsalary;
	protected double salaryadministrartion;
	public int a;										//constructor
	administration(){
		bs=13439;
		da=bs*0.4;
		hra=bs*0.2;
		months=12.0;
		}
	void admin()throws InterruptedException{			//method overriding
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Welcome to Administration Department");
		do{
		System.out.println("Enter the number of employees for Administration Dept ");
		a=sc.nextInt();
		try{
			if(a==0)
				throw new MyException("You have entered 0 which is invalid");
			else{
				if(grosssalary>300000&&grosssalary<5500000){
					tax=0.3*gs;
					 netsalary=gs-tax;
					System.out.println("Tax amount : "+tax);
					System.out.println("Net salary for one employee: "+netsalary);
					salaryadministrartion=a*netsalary;
					System.out.println("Total salary for "+a+"is : "+salaryadministrartion);
					}
						else{
							System.out.println("No tax deducted for employees");
							salaryadministrartion=a*gs;
							System.out.println("Total salary for "+a+"is : "+salaryadministrartion);
							}
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
		}while(a==0);
	}
}

													
class customerservice extends administration{
	double bs=11439;
	double da=bs*0.4;
	double hra=bs*0.2;
	double months=12.0;
	public double tax,gs,grosssalary,netsalary,salarycustom,salaryadministrartion;
	int a;
	void admin() {									//method overriding
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Welcome to Administration Department");
		do{
		System.out.println("Enter the number of employees");
		a=sc.nextInt();
		try{
			if(a==0)
				throw new MyException("You have entered 0 which is invalid");
			else{
				salaryadministrartion=Salarycalculate.salarycalculator(bs, a);
				System.out.println("Total salary for "+a+" employees is "+salaryadministrartion);
				}
			}	
				catch (MyException e) {
					System.out.println("There was an issue");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println(e.getMessage());
					System.out.println();
					}
					catch (Exception e) {
						System.out.println(e);	
						
						}
		}while(a==0);
	}
																		
	void custom(){														
		double bs=10000;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Welcome to Customer Service Department");
		do{
		System.out.println("Enter the number of employees for Customer Service Dept ");
		b=sc.nextInt();
		try{
			if(b==0)
				throw new MyException("You have entered 0 which is invalid");
				
			else{
				salarycustom=Salarycalculate.salarycalculator(bs, b);
				System.out.println("Total salary for "+a+"employees is"+salarycustom);
				}
			}	
				catch (MyException e) {
					System.out.println("There was an issue");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println(e.getMessage());
					System.out.println();
					}
				catch (Exception e) {
						System.out.println(e);	
						
			}
		}while(b==0);
		
		}
	

void calculate(){
	System.out.println("Total salary amount for admin dept "+salaryadministrartion);
	System.out.println("Total salary amount for customer serivce dept "+salarycustom);
	}


}
class MyException extends Exception {
MyException(String message) {
super(message);}

}


public class Economy {
	public static void main(String[] arg) throws Exception{
		int x,y;
	int pc;
	customerservice cs=new customerservice();
	 Sale p=new Sale();
	do{
	System.out.println("***************Introducing you the Economy Predictor***************");
	System.out.println("This application will help you to analyse the profit and loss of a company");
	System.out.println();
	System.out.println("1. USER ");
	System.out.println("2. ADMIN ");
	System.out.println("3. PRODUCT REVIEW");
	System.out.println("**NOTE:If you want to view the details of budget and sale then login as admin");
	Scanner choice =new Scanner(System.in);
	x=choice.nextInt();
	switch(x){
				case 1:System.out.println("Enter your company name");
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String scc=br.readLine();
						System.out.println("Welcome "+scc+" pvt limited");
						cs.admin();
						 cs.custom();
						// sa.start();
						 p.products();
						 p.salaryproduction();
						 p.salarysales();
						 p.exports();
						 break;
				case 2:
						System.out.println("Enter your password");
						pc=choice.nextInt();
						if(pc==1234){
							cs.calculate();
							 p.calculate1();
							 p.display();
							 
						}
						else
							System.out.println("Wrong username or password");
						break;
						
				case 3:System.out.println("Enter review about the product quality");
							System.out.println("1.Excellent");
							System.out.println("2.Good");
							System.out.println("3.Average");
							System.out.println("4.Satisfactory");
							System.out.println("5.Not upto the mark");
							int bc=choice.nextInt();
							try{
							File outfile=new File("D:\\Economy.txt");
							PrintWriter pw=new PrintWriter(outfile);
							
							
								switch(bc){
								case 1: pw.println("The user felt that the quality of product produced was Excellent!!");
										pw.println("Rating **5/5**");
										System.out.println("Your response was recorded.");
										System.out.println("Thankyou!!");
										pw.close();
										break;
								case 2:
										pw.println("The user felt that the quality of product produced was Good!!");
										pw.println("Rating **4/5**");
										System.out.println("Your response was recorded.");
										System.out.println("Thankyou!!");
										pw.close();
										break;
									
								case 3:
										pw.println("The user felt that the quality of product produced was Average!!");
										pw.println("Rating **3/5**");
										pw.close();
										System.out.println("Your response was recorded.");
										System.out.println("Thankyou!!");
										break;
								case 4:
										pw.println("The user felt that the quality of product produced was Satisfactory!!");
										pw.println("Rating **2/5**");
										System.out.println("Your response was recorded.");
										System.out.println("Thankyou!!");
										pw.close();
										break;
								case 5:pw.println("The user felt that the quality of product produced was Not upto the mark!!");
										pw.println("Rating **1/5**");
										System.out.println("Your response was recorded.");
										System.out.println("Thankyou!!");
										pw.close();
										break;
								default:System.out.println("You have entered invalid option");
								
								}
							
							
							}catch(IOException e){
								System.out.println("There was error reading your review");
							}
						
							break;
							
				default: 	System.out.println("Invalid option!!Try again");
							break;
	}	System.out.println("Do you want to continue?  1.yes or 2.no");
	 y=choice.nextInt();
	}while(y!=2);
		
	}
}