public class Loops {
    public static void main(String[] args) {
        Loops l = new Loops();

        String linha1 = "Texto da linha 1";
        String linha2 = "Texto da linha 2";
        String linha3 = "Texto da linha 3";
        String linha4 = "Texto da linha 4";
        String linha5 = "Texto da linha 5";

        String[] pagina = new String[5];

        pagina[0] = linha1;
        pagina[1] = linha2;
        pagina[2] = linha3;
        pagina[3] = linha4;
        pagina[4] = linha5;


        // Inicializando matriz do livro
        int paginas = 5;
        int linhas = 5;
        String[][] livro = new String[paginas][linhas];
        for (int i = 0; i < paginas; i++) {
            System.arraycopy(pagina, 0, livro[i], 0, linhas);
        }

        Vetores.dinamycMatrice();

        String[][] matrice = new String[3][3];
        matrice[0][0] = "aqui nao contem nada";
        matrice[0][1] = "aqui também não";
        matrice[1][0] = "aqui contém a substring 'interessante'";
        matrice[1][1] = "aqui também contém a substring 'interessante'";
        matrice[2][0] = "aqui tem é nada";
        matrice[2][2] = "nada por aqui";
        Vetores.findTextInMatrice(matrice, "interessante");

    }


    // Neste caso, não preciso de uma quantidade indeterminada de loops (retries), por isso escolhi
    // utilizar o for-loop
    public void lerMatriz(String[][] livro) {
        for (int i = 0; i < livro.length; i++) {
            int paginas = livro[i].length;
            for (int j = 0; j < paginas; j++) {
                System.out.printf("Página número %s, conteúdo da linha: %s\n", i, livro[i][j]);
            }
        }
    }
}