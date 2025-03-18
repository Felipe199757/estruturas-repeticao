public class ForEmArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x < alunos.length; x++){
            System.out.printf("O aluno no indice x = %d é %s%n", x, alunos[x]);
        }

        // forEach
        for(String aluno: alunos){
            System.out.println("O aluno é: " + aluno);
        }
    }
}
