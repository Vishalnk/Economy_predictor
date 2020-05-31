package production;
public class Salarycalculate{
	public static double salarycalculator(int a){	//method overloading
		 double bs=8000;
		 double da=bs*0.4;
		 double hra=bs*0.2;
		 double months=12.0,total1;
		 double tax=0,netsalary=0;
		 double gs=bs+hra+da;
			double grosssalary=gs*months;
			if(grosssalary>250000&&grosssalary<5000000){
				tax=0.3*gs;
				 netsalary=gs-tax;
				System.out.println("Tax amount : "+tax);
				System.out.println("Net salary for one employee: "+netsalary);
				total1=a*netsalary;
				return total1;
				}
					else{
						System.out.println("No tax deducted for employees");
						total1=a*gs;
						return total1;
						}
			}
	
	public static double salarycalculator(double basic,int a){ //method overloading
	 double bs=basic;
	 double da=bs*0.4;
	 double hra=bs*0.2;
	 double months=12.0,total;
	 double tax=0,netsalary=0;
	 double gs=bs+hra+da;
		double grosssalary=gs*months;
		if(grosssalary>250000&&grosssalary<5000000){
			tax=0.3*gs;
			 netsalary=gs-tax;
			System.out.println("Tax amount : "+tax);
			System.out.println("Net salary for one employee: "+netsalary);
			total=a*netsalary;
			return total;
			}
				else{
					total=a*gs;
					return total;
					}
		}
	}	
	