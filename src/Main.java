import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean main_loop=true;
        while(main_loop){
            System.out.println("entrez un chiffre selon le type de valeur en entrée: ");
            System.out.println("1 = texte: ");
            System.out.println("2 = hexadecimal: ");
            System.out.println("3 = decimal: ");
            System.out.println("5 = binaire: ");
            System.out.println("6 = quitter: ");
            String main_menu= sc.nextLine();
            if (main_menu.equals("1")){
                System.out.println("choisis: texte: ");
            }
            else if (main_menu.equals("2")) {
                System.out.println("choisis: hexadecimal: ");
            }
            else if (main_menu.equals("3")) {
                System.out.println("choisis: decimal: ");
            }
            else if (main_menu.equals("4")) {
                System.out.println("choisis: octal: ");
            }
            else if (main_menu.equals("5")) {
                System.out.println("choisis: binaire: ");
            }
            else if (main_menu.equals("6")) {
                main_loop=false;
            }
            else{
                System.out.println("option indisponible: ");
            }
        }
    }
}