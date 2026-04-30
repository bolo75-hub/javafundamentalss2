package control;

import java.lang.annotation.ElementType;
import java.util.Random;

public class Control {

	public static void main(String[] args) {
		Random random = new Random();
		int num1 = 10;
		int num2 = 20;
		int result;
		result = num1 - num2;
		System.out.println(result);
		if (result > 0) {
			System.out.println("El numero que tienes es mayor que 0");
		} 
		else if (result == 0) {
		System.out.println("El numero es igual a 0");
	}
		else {
			System.out.println("El numero es menor que 0");
		}
	
	
	
	
	}
	
	
	
}
