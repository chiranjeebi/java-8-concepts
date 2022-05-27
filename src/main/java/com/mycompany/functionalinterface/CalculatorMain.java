package com.mycompany.functionalinterface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num 1 value");
	Double num1 = sc.nextDouble();
   System.out.println("Enter num 2 value");
	Double num2 = sc.nextDouble();
	sc.nextLine();

	System.out.print("Enter: 1.Add, 2. sub. 3. div, 4. mul");
	String option=sc.nextLine();

	Calculator calculator = null;
	Double result = null;
	
switch (option) {
case "1":
	calculator = (Double num11,Double num22) -> {
		  return num11 + num22;
};
	result = calculator.operation(num1, num2);
	break;

case "2":
	calculator = (Double num11,Double num22) -> {
		  return num11 - num22;
};
	result = calculator.operation(num1, num2);
	
	break;
case "3":
	calculator = (Double num11,Double num22) -> {
		  return num11 / num22;
};
	result = calculator.operation(num1, num2);
	
	break;
case "4":
	calculator = (Double num11,Double num22) -> {
		  return num11 * num22;
};
	result = calculator.operation(num1, num2);
	
	break;	
	
default:
	   System.out.println("Incorret option");

	break;
}
if(result != null) {
	   System.out.println("Result:" +result);

}else {
	   System.out.println("looks like you chose wrong option");

}
	
}
}
