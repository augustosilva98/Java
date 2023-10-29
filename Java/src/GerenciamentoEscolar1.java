import java.util.Scanner;

public class GerenciamentoEscolar1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        
        System.out.println("Digite a turma: ");
        String turma = scanner.nextLine();
        
        System.out.println("Digite a materia: ");
        String materia = scanner.nextLine();
        
        System.out.println("Digite a nota obtida durante o ano: ");
        double nota = scanner.nextDouble();
        
        System.out.println("Informacoes do Aluno:");
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Nome do Professor: " + nomeProfessor);
        System.out.println("Turma: " + turma);
        System.out.println("Materia: " + materia);
        System.out.println("Nota Obtida: " + nota);
        
        if (nota >= 6) {
            System.out.println("Situacao: Aprovado");
        } else if (nota >= 4 && nota <= 6) {
            System.out.println("Situacao: Em recuperacao");
        } else {
            System.out.println("Situacao: Reprovado");
        }
        
        scanner.close();
    }
}
