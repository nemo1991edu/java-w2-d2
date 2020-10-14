import java.util.Scanner;

public class VorC {

    public static void main(String[] args) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        boolean aux= false;
        char l;
        Scanner input = new Scanner(System.in);
        l= input.next().charAt(0);
        for(int i=0; i < vowels.length; i++){
            if(Character.toUpperCase(l) == vowels[i]){
                aux = true;
            }
        }

        if(aux == true){
            System.out.print(l + " is a vowel");
        }else{
            if(Character.isLetter(l)){
            System.out.print(l + " is a consonant");
            }else{
                System.out.print(" invalid");
            }
        }
        

    }
}