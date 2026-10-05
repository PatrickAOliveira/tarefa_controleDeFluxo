import java.util.Scanner;

import br.com.poliveira.Media;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Media media = new Media();

        // Função para calcular a média
        media.calcMedia(scanner);

        // Imprime o resultado na tela
        System.out.print(media);
        scanner.close();
    }
}
