package ADO;

import java.io.BufferedReader;
import java.io.FileReader;

public class ado1 {

    public static int[] leArquivo(String nomeArquivo) throws Exception {

        FileReader arquivo = new FileReader("C:\\Users\\Julia\\NetBeansProjects\\aP2\\src\\ADO\\arquivo.txt");
        BufferedReader leitor = new BufferedReader(arquivo);

        String linha1 = leitor.readLine();
        String linha2 = leitor.readLine();

        leitor.close();

        int tam = Integer.parseInt(linha1);

        int[] vetor = new int[tam];

        String[] dados = linha2.split(" ");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(dados[i]);
        }

        return vetor;
    }

    public static int[] bolha(int[] v) {
        int aux;

        for (int i = v.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (v[j] % 2 != 0) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;

                }
            }
        }

        return v;
    }

    public static void imprime(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println("");

    }

    public static void main(String[] args) throws Exception {

        int[] vetor = leArquivo("C:\\Users\\Julia\\NetBeansProjects\\aP2\\src\\ADO\\arquivo.txt");
        System.out.println("Vetor");
        imprime(vetor);

        vetor = bolha(vetor);
        System.out.println("Vetor ordenado");
        imprime(vetor);

    }
}
