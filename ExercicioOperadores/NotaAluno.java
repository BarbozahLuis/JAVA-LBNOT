package ExercicioOperadores;

import java.util.Scanner;

public class NotaAluno {
    Scanner sc = new Scanner(System.in);
    public void notasFrequencia() {
        System.out.println("Informe a Nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno");
        int nota2 = sc.nextInt();
        double mediaNotas = (nota1+nota2)/2;
        double notaMaiorIgual = sc.nextInt();

        System.out.println("Informe a frequencia do aluno");
        int frequencia1 = sc.nextInt();

        System.out.println("Valor da media e maior");
        boolean aprovado = mediaNotas >= notaMaiorIgual;
        
    }
}
