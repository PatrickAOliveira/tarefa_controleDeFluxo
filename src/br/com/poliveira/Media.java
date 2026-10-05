package br.com.poliveira;

import java.util.Scanner;

public class Media {

    private Integer notas[] = new Integer[4];
    private Integer media;

    public void calcMedia(Scanner s) {
        int soma = 0;

        for (int i = 0; i <= notas.length - 1; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota");
            notas[i] = s.nextInt();
            soma += notas[i];
        }

        this.media = soma / notas.length;
    }

    @Override
    public String toString() {
        if (media >= 7) {
            return "O aluno está aprovado";
        } else if (media >= 5) {
            return "O aluno está de recuperação";
        } else {
            return "O aluno está reprovado";
        }
    }
}
