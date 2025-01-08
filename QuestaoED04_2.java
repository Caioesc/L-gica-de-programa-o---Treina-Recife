
import java.util.Scanner;
public class QuestaoED04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a letra desejada: ");
        char letra = sc.next().toUpperCase().charAt(0);
        sc.close();
        
        if(Character.isLetter(letra)){
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                System.out.println("É vogal.");
            }
            else{
                System.out.println("É consoante");
            }
        }
        else{
            System.out.println("Não é uma letra!");
        }          
    }
}