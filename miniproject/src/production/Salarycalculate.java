package production;
public class Salarycalculate{
	public static double salarycalculator(int no_of_emp){	//method overloading
		 double basic_salary=8000;
		 double da=basic_salary*0.4;
		 double hra=basic_salary*0.2;
		 double months=12.0,total1;
		 double tax=0,netsalary=0;
		 double gross_salary=basic_salary+hra+da;
			double grosssalary=gross_salary*months;
			if(grosssalary>250000&&grosssalary<5000000){
				tax=0.3*gross_salary;
				 netsalary=gross_salary-tax;
				System.out.println("Tax amount : "+tax);
				System.out.println("Net salary for one employee: "+netsalary);
				total1=no_of_emp*netsalary;
				return total1;
				}
					else{
						System.out.println("No tax deducted for employees");
						total1=no_of_emp*gross_salary;
						return total1;
						}
			}
	
	public static double salarycalculator(double basic,int no_of_emp){ //method overloading
	 double basic_salary=basic;
	 double da=basic_salary*0.4;
	 double hra=basic_salary*0.2;
	 double months=12.0,total;
	 double tax=0,netsalary=0;
	 double gross_salary=basic_salary+hra+da;
	double grosssalary=gross_salary*months;
		if(grosssalary>250000&&grosssalary<5000000){
			tax=0.3*gross_salary;
			 netsalary=gross_salary-tax;
			System.out.println("Tax amount : "+tax);
			System.out.println("Net salary for one employee: "+netsalary);
			total=no_of_emp*netsalary;
			return total;
			}
		else{
				total=no_of_emp*gross_salary;
				return total;
			}
		}
	
	public static double salarycalculator(double basic,int no_of_emp,double da,double hra,double months,double salary_for_1_month,double grosssalary){
		
		double tax,netsalary;
		if(grosssalary>300000&&grosssalary<5500000){
			tax=0.3*salary_for_1_month;
			netsalary=salary_for_1_month-tax;
			System.out.println("Tax amount : "+tax);
			System.out.println("Net salary for one employee: "+netsalary);
			return (no_of_emp*netsalary);
			
		}
		else{
			System.out.println("No tax deducted for employees");
			return (no_of_emp*grosssalary);
			}
	}

}	
