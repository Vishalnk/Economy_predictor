package economypredictor;
import java.io.*;
import production.*;
import java.util.Scanner;
																							//administration class
abstract class administration{
	abstract void custom();																	//abstract method
	double basic_salary,da,hra,tax,months,grosssalary,netsalary,salary_for_1_month;
	protected double salaryadministrartion;
	public int no_of_emp_admin;																//constructor
	administration(){
		basic_salary=18439;
		da=basic_salary*0.4;
		hra=basic_salary*0.2;
		months=12.0;
		salary_for_1_month=basic_salary+da+hra;
		grosssalary=salary_for_1_month*months;
		}
	
	void admin()/*throws InterruptedException*/{											//method overriding
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Enter the number of employees for Administration Dept ");
		no_of_emp_admin=sc.nextInt();
		try{
			if(no_of_emp_admin==0)
				throw new MyException("You have entered 0 which is invalid");
			else{
				salaryadministrartion=Salarycalculate.salarycalculator( basic_salary, no_of_emp_admin, da, hra, months, salary_for_1_month,grosssalary);
				System.out.println("Total salary for "+no_of_emp_admin +" is"+salaryadministrartion);
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
		}while(no_of_emp_admin==0);
	}
}

													
class customerservice extends administration{
	double bs=11439;
	double da=bs*0.4;
	double hra=bs*0.2;
	double months=12.0;
	public double tax,gs,grosssalary,netsalary,salarycustom,salaryadministrartion,salary_choice;
	int no_of_emp_admin,stop1=0,stop2=0;
	void admin() {																				//method overriding
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***********************");
		conn:
		do{
		System.out.println("Welcome to Administration Department");
		System.out.println("Enter 1:To calculate salary based on incremented basic salary");
		System.out.println("      2:To calculate salary based on normal basic salary");
		salary_choice=sc.nextInt();
		if(salary_choice==1){
			super.admin();
			stop1=-1;
		}
		else if(salary_choice==2){
			do{
				stop1=-1;
				System.out.println("Enter the number of employees");
				no_of_emp_admin=sc.nextInt();
				try{
					if(no_of_emp_admin==0)
						throw new MyException("You have entered 0 which is invalid");
					else{
						stop2=-1;
						salaryadministrartion=Salarycalculate.salarycalculator(bs, no_of_emp_admin);
						System.out.println("No tax redemption");
						System.out.println("Total salary for "+no_of_emp_admin+" employees is "+salaryadministrartion);
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
				}while(stop2==0);
		}
		else {
			System.out.println("ERROR");
			continue conn;
		}
	}while(stop1==0);
		
	}
	
																							//administration method
																							//customer service method
	void custom(){																			//abstract definition
		double bs=10000;
		int no_of_emp_cs;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***********************");
		System.out.println("Welcome to Customer Service Department");
		do{
		System.out.println("Enter the number of employees for Customer Service Dept ");
		no_of_emp_cs=sc.nextInt();
		try{
			if(no_of_emp_cs==0)
				throw new MyException("You have entered 0 which is invalid");
				
			else{
				salarycustom=Salarycalculate.salarycalculator(bs, no_of_emp_cs);
				System.out.println("Total salary for "+no_of_emp_cs+"employees is"+salarycustom);
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
		}while(no_of_emp_cs==0);
		
		}
	

void calculate(){
	System.out.println("Total salary amount for admin dept "+salaryadministrartion);
	System.out.println("Total salary amount for customer serivce dept "+salarycustom);
	}


}
@SuppressWarnings("serial")
class MyException extends Exception {
MyException(String message) {
super(message);}

}


public class Economy {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int choice_1=0,choice_2=0;
	int pc;
	customerservice cs=new customerservice();
	 Sale sale=new Sale();
	 conn:
	do{
	System.out.println("***************Introducing you the Economy Predictor***************");
	System.out.println("This application will help you to analyse the profit and loss of a company");
	System.out.println();
	System.out.println("1. USER ");
	System.out.println("2. ADMIN ");
	System.out.println("3. PRODUCT REVIEW");
	System.out.println("**NOTE:If you want to view the details of budget and sale then login as admin");
	Scanner choice =new Scanner(System.in);
	try{
		choice_1=choice.nextInt();
	}
	catch(Exception e){
		System.out.println("*Please enter a valid number*");
		continue conn;
	}
	switch(choice_1){
				case 1:System.out.println("Enter your company name");
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String scc=br.readLine();
						System.out.println("Welcome "+scc+" pvt limited");
						cs.admin();
						 cs.custom();
						 sale.products();
						 sale.salaryproduction();
						 sale.salarysales();
						 sale.exports();
						 break;
				case 2:
						System.out.println("Enter your password");
						pc=choice.nextInt();
						if(sale.product_1==null||sale.product_2==null){
							System.out.println("No production of products has started");
						}
						else{
							if(pc==1234){
								cs.calculate();
								sale.calculate_main(cs.salaryadministrartion,cs.salarycustom);
								sale.display();
								 
							}
							else
								System.out.println("Wrong username or password");
						}
						
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
							continue conn;
						
	}	System.out.println("Do you want to continue?  1.yes or 2.no");
	 choice_2=choice.nextInt();
	}while(choice_2!=2);
		
	}
}
