package hello;

import java.util.Scanner;
import java.math.*;		
		
public class hello {

	public static void main(String[] args) {
		float a, b, c, delta, sqrtdelta, raiz1, raiz2;
		Scanner entrada = new Scanner(System.in);
		
		  System.out.println("Equação do 2o grau: ax² + bx + cx = 0");
	        System.out.print("Entre com o valor de a: ");
	        a = entrada.nextFloat();
	        System.out.print("Entre com o valor de b: ");
	        b = entrada.nextFloat();
	        System.out.print("Entre com o valor de c: ");
	        c = entrada.nextFloat();
		
		if (a != 0){
			
			delta = (b*b) - (4*a*c);
			sqrtdelta = (float)Math.sqrt(delta);
			
			if(delta>=0) {
				raiz1 = ((-1)*b + sqrtdelta)/(2*a);
                raiz2 = ((-1)*b - sqrtdelta)/(2*a);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
			}
			else {
				delta = -delta;
				sqrtdelta = (float)Math.sqrt(delta);
				System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
				}
			
			}
		  else{
	            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
		  }
	}
}
