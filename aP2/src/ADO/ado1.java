package ADO;

public class ado1 {

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
            System.out.print(" " + v[i]);
        }

    }

    public static void main(String[] args) {

        int v[] = {3, 6, 7, 8, 4, 5, 1, 2, 9};

        v = bolha(v);
        imprime(v);

    }
}
