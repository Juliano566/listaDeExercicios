import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int i = 1;
        int idade;
        int idadeA = 0;
        String sexo;
        String sexoA = " ";
        String nome;
        String nomeA = " ";
        
        do{
            System.out.print("Nome: ");
            nome = sc.next();
            
            System.out.print("Sexo: ");
            sexo = sc.next();
            
            System.out.print("Idade: ");
            idade = sc.nextInt();
            
            System.out.println("");
            
            if(idade > idadeA){
                idadeA = idade;
                sexoA = sexo;
                nomeA = nome;
            }
            
            i++;
                                   
        }while(i <= 5);

        System.out.println("Aluno mais velho: ");
        System.out.println("Nome: " + nomeA);
        System.out.println("Sexo: " + idadeA);
        System.out.println("Idade: "+ idadeA);
        
		
		
		

	}

}
