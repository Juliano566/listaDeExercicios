package Ado11;

import java.util.Scanner;

public class Ado11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int caminho, bomba;

        do {
            System.out.print("Numero de caminhos: ");
            caminho = sc.nextInt();

            System.out.print("Quantidades de bombas: ");
            bomba = sc.nextInt();

            if (caminho <= 1 || bomba < 1 || caminho < bomba) {
                System.err.println("Valor invalido");
            }

        } while (caminho <= 1 || bomba < 1 || caminho < bomba);

        int campo[] = new int[caminho];

        for (int i = 0; i < bomba; i++) {

            double b = Math.random();
            b = b * caminho;
            int b1 = Math.abs((int) b);

            if (campo[b1] != -1) {
                campo[b1] = -1;
            } else {
                i--;
            }

        }

        for (int j = 0; j < caminho; j++) {

            if (campo[j] != -1) {
                campo[j] = 0;
            }

        }

        int fim = caminho - bomba;
        int b = 0;
        int pontos = 0;

        do {
            for (int i = 0; i < campo.length; i++) {

                if (campo[i] == -1 || campo[i] == 0) {
                    System.out.print(" _ ");
                } else if (campo[i] == 1) {
                    System.out.print(" x ");
                } else if (campo[i] == 2) {
                    System.out.print(" B ");
                }
            }
            System.out.println("");

            for (int i = 0; i < campo.length; i++) {
                System.out.print(" " + i + " ");
            }

            System.out.println("");
            System.out.print("Escola uma posição: ");
            int escolha = sc.nextInt();

            if (escolha > campo.length) {
                System.err.println("Posição invalida");
            } else {

                if (escolha == 0 ) {
                    if (campo[escolha + 1] == -1) {
                        System.err.println("Cuidado bomba proxima");
                    }
                } else if (escolha == campo.length-1) {
                    if (campo[escolha - 1] == -1) {
                        System.err.println("Cuidado bomba proxima");
                    }
                } else {
                    if (campo[escolha - 1] == -1 || campo[escolha + 1] == -1) {
                        System.err.println("Cuidado bomba proxima");
                    }
                }

                if (escolha > caminho - 1) {
                    System.err.println("Posição invalida");
                } else if (campo[escolha] == -1) {
                    campo[escolha] = 2;
                    for (int i = 0; i < campo.length; i++) {

                        if (campo[i] == -1 || campo[i] == 0) {
                            System.out.print(" _ ");
                        } else if (campo[i] == 1) {
                            System.out.print(" x ");
                        } else if (campo[i] == 2) {
                            System.out.print(" B ");
                        }

                    }
                    b = 1;
                    System.err.println("Game Over");
                } else if (campo[escolha] == 0) {
                    campo[escolha] = 1;
                    pontos++;
                } else if (campo[escolha] == 1) {
                    System.err.println("Posição já escolhida");
                }
            }

        } while (b == 0 && pontos != fim);

        System.out.println(
                "");

        for (int i = 0;
                i < campo.length;
                i++) {

            if (campo[i] == -1 || campo[i] == 0) {
                System.out.print(" _ ");
            } else if (campo[i] == 1) {
                System.out.print(" x ");
            } else if (campo[i] == 2) {
                System.out.print(" B ");

            }

        }

        if (b
                == 0) {
            System.out.println("Parabens você ganhou o jogo");
        }

        System.out.print(
                "Quantidades de pontos: " + pontos);

    }

}
