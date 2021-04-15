import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int alunos;
		int nota = 0;
		int i = 0;
		double media = 0;
		
		System.out.print("Digite a quantidade de alunos: ");
		alunos = sc.nextInt();
		
		
		while(i < alunos) {
			i++;
			
			System.out.print("Nota do aluno: ");
			nota = sc.nextInt();
			
			media = media+nota;
			
		}
		
		
		
		System.out.println("Media de notas dos alunos da turma: " + media/alunos);
		

	}

}
