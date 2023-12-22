import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executarRegistroDePessoas();
    }

    private static void executarRegistroDePessoas() {
        String continuarRegistrarNomesSexo;
        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();

        do {
            String nome = obterNomeDoUsuario();
            String sexo = obterSexoDoUsuario();

            if (sexo.equalsIgnoreCase("M")) {
                listaMasculino.add(nome);
            } else {
                listaFeminino.add(nome);
            }

            continuarRegistrarNomesSexo = obterEscolhaContinuarRegistro();

        } while (continuarRegistrarNomesSexo.equalsIgnoreCase("S"));

        imprimirListasDePessoas(listaMasculino, listaFeminino);
    }

    private static String obterEscolhaContinuarRegistro() {
        Scanner s = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Deseja registrar mais alguma pessoa? 'S' para sim/ 'N' para nao");
            continuar = s.next();

            if (continuar.equalsIgnoreCase("S")) {
                System.out.println("-----------------------------------------");
            }

            if (!(continuar.equalsIgnoreCase("S") ||
                    continuar.equalsIgnoreCase("N"))) {
                System.out.println("Por favor digite 'S' ou 'N'");
            }
        } while (!(continuar.equalsIgnoreCase("S") ||
                continuar.equalsIgnoreCase("N")));

        return continuar;
    }

    private static void imprimirListasDePessoas(List<String> listaMasculino, List<String> listaFeminino) {
        if (!listaMasculino.isEmpty()) {
            System.out.println("Lista de pessoas do sexo masculino");
            System.out.println(listaMasculino);
        }
        if (!listaFeminino.isEmpty()) {
            System.out.println("Lista de pessoas do sexo feminimo");
            System.out.println(listaFeminino);
        }
    }

    private static String obterSexoDoUsuario() {
        Scanner s = new Scanner(System.in);
        String sexo;

        do {
            System.out.println("Digite o sexo da pessoa | 'M' para masculino e 'F' para feminino ");
            sexo = s.next();

            if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
                System.out.println("Por favor digite um sexo valido");
            }
        } while (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")));

        return sexo;
    }

    private static String obterNomeDoUsuario() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");

        return s.next();
    }
}