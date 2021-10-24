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

}