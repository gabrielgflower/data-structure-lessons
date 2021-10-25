import java.util.Scanner;

public class Vetores {
    secondExercise[] pessoas = new secondExercise[5];

    public static void populateAndPrint () {
        Vetores vetor = new Vetores();
        vetor.pessoas[0] = new secondExercise();
        vetor.pessoas[1] = new secondExercise();
        vetor.pessoas[2] = new secondExercise();
        vetor.pessoas[3] = new secondExercise();
        vetor.pessoas[4] = new secondExercise();

        vetor.pessoas[0].name = "Gabriel";
        vetor.pessoas[1].name = "João";
        vetor.pessoas[2].name = "Mariana";
        vetor.pessoas[3].name = "Augusto";
        vetor.pessoas[4].name = "Rafaela";

        vetor.pessoas[0].age = 23;
        vetor.pessoas[1].age = 15;
        vetor.pessoas[2].age = 27;
        vetor.pessoas[3].age = 12;
        vetor.pessoas[4].age = 40;

        for (int i = 0; i < vetor.pessoas.length; i++) {
            System.out.printf("Nome: %s, idade: %s", vetor.pessoas[i].name, vetor.pessoas[i].age);
            if (vetor.pessoas[i].age < 18) {
                System.out.print("- Menor de idade\n");
            } else {
                System.out.print("- Maior de idade\n");
            }
        }
    }

    public static void dinamycMatrice () {
        //Escreva um programa que pergunte ao usuário o tamanho de uma matriz,
        // inicialize-a, e em seguida preencha a matriz com inteiros, de
        // forma crescente (1, 2, 3, etc.). Por fim, imprima a matriz preenchida.
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantas colunas a matriz terá: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.print("Digite quantas linhas a matriz terá: ");
        int y = Integer.parseInt(input.nextLine());
        Integer[][] integersMatrice = new Integer[x][y];

        int counter = 0;
        for (int i = 0; i < x; i++) {
            System.out.print("\n");
            for (int j = 0; j < y; j++) {
                integersMatrice[i][j] = counter;
                System.out.printf("%s\t", integersMatrice[i][j]);
                counter++;
            }
        }
    }

    public static void findTextInMatrice (String[][] matrice, String text) {
        // Escreva um método que receba uma matriz de Strings e uma
        // String "texto" como parâmetros. O método deve fazer uma busca
        // na matriz para encontrar a posição que contém o texto informado.
        // Obs: o conteúdo armazenado na matriz não precisa ser idêntico ao buscado,
        // mas sim conter o conteúdo buscado em parte de seu conteúdo.

        for (int i = 0; i < matrice.length; i++) {
            int vectorLength = matrice[i].length;
            for (int j = 0; j < vectorLength; j++) {
                if (matrice[i][j] != null && matrice[i][j].contains(text)) {
                    System.out.printf("\nA posição [%s][%s] contém a substring '%s'\n", i, j, text);
                }
            }
        }
    }

}
