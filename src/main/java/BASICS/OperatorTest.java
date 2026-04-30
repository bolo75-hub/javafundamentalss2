package BASICS;

public class OperatorTest {
	public static void main(String[] args) {

		operation();

	}

	private static void operation() {
		// declaring three integer variable
		int num1 = 3, num2 = 4, num3 = 20;
		int result;
		/*
		 * 1 Se leen los valores zde lso operandes del lado derecho 2 Se realizan las
		 * operaciones con operandes 3 Se asigna el resultado de las operaciones a la
		 * variable izquierdo
		 */
		result = num1 + num2;
		System.out.println(" the result is " + result);
		// el numero 3 que es = 20 resta el resultado ) a 7
		result = result - num3;
		System.out.println("El resultado de result - num3 es:" + result);
		// multiplica el resultado = 7 *2
		result = result * 2;
		System.out.println("el resultado de la multiplicación es:" + result);
		// divide el resultado = 7 /2
		result = result / 2;
		System.out.println("El resultado de la división es:" + result);
		System.out.println(5 % 2);
		result = result % 2;
		System.out.println("El resultado del porcentaje es:" + result);
		unaryOperatorTest();
		assigmentOperatorTest();
	}

	private static void assigmentOperatorTest() {
		int number1 = 3;
		int number2 = 20;
		float result = number1 + number2;
		System.out.println(result);
		result += number1;// result = result1 + result2
		System.out.println(result);
		result /= number1;//result = result /number1
		System.out.println(result);

	}

	private static void unaryOperatorTest() {
		// TODO Auto-generated method stub
		int num1 = -234;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);

		num1--;
		--num1;
		System.out.println(num1 < 234);

	}

}
