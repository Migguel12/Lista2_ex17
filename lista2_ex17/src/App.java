import java.util.Scanner;
import java.time.Year;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = ler.nextInt();
        System.out.println("");
        
        if(Year.isLeap(ano) == true){
            System.out.printf("O ano %d e ano bissexto.",ano);
        }
        else{
            System.out.printf("O ano %d nao e ano bissexto.",ano);
        }
    }
}
