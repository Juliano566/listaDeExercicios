package condicionais;

import java.util.Scanner;

public class Exe06 {


	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
	        
	        int a, b, c;
	        
	        System.out.print("Digite o primeiro numero dacimal: ");
	        a = sc.nextInt();
	        
	        System.out.print("Digite o segundo numero decimal: ");
	        b = sc.nextInt();
	        
	        System.out.print("Digite o terceiro numero decimal: ");
	        c = sc.nextInt();
	        
	        System.out.println("A área de um triângulo retângulo que tem "+a+" como base e "+c+" como alturara sera: "+(a*c)/2);
	        
	        System.out.println("A área de um circulo que tem como raio "+c+" sera: "+(3.14159*(Math.pow(c, 2))));
	
	        System.out.println("A área de um trapézio que tem "+a+" e "+b+" como base e "+c+" por alura sera: "+((a+b)*c/2));
	        
	        System.out.println("A área de um quadrado que tem como lado "+b+" sera: "+Math.pow(b, 2));
	        
	        System.out.println("A área de um reângulo que tem como lados "+a+" e "+b+" sera: "+(a*b));
	
	        System.out.println("O perímetro de um retângulo que tem lados "+a+" e "+b+" sera: "+(2*(a+b)));
	}

}
