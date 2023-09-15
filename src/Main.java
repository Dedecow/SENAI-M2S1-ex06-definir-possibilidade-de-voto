import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: (no formato DD/MM/AAAA) ");
        //int dataNascimento = Integer.parseInt(sc.nextLine());
        String dataNascimento = sc.nextLine();
        String[] partesData = dataNascimento.split("/");
        String anoStr = partesData[2];
        int anoNascimento = Integer.parseInt(anoStr);
        //System.out.println("Você nasceu no ano de " + anoNascimento);

        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        //System.out.println("Estamos no ano de: " + anoAtual);
        int idadeUsuario = (anoAtual - anoNascimento);
        System.out.println("Você tem atualmente " + idadeUsuario + " anos de idade.");

        if (idadeUsuario == 17 || idadeUsuario == 16 || idadeUsuario >= 59){
            System.out.println("O voto para menores de 18 anos ou maiores de 59 anos é facultativo. ");
        } else if (idadeUsuario <= 16) {
            System.out.println("De acordo com a legislação atual, você ainda não pode votar.");
        }else {
            System.out.println("Voto obrigatório.");
        }


        sc.close();
    }
}