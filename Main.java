import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stream {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String listaDeNomes = entrada.nextLine();

        List<String> pessoas = List.of(listaDeNomes.split(", "));
        for (String s: pessoas) {
            System.out.println(s);

        }
        System.out.println("=====");
        System.out.println("lista de mulheres: ");
        pessoas.stream()
                .filter(s -> s.endsWith("-f"))
                .forEach(s -> System.out.println(s));
    }
}