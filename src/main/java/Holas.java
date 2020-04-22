import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean palindromo=false;
        System.out.println("Palindromo\n");
        System.out.print("Inserta frase: ");
        String frase=sc.nextLine();
        frase=frase.toLowerCase();
        frase=frase.replace(" ", "");
        
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) != frase.charAt(frase.length()-1-i)){
                palindromo=true;  //No es Palindromo
            }
            else{
                palindromo=false; //Si es Palindromo
            }
        }
        if(palindromo==false){
            System.out.println("Ingresaste Palindromo: "+frase);
        }
        if(palindromo==true){
            System.out.println("No ingresaste Palindromo: "+frase);
        }           
    }
}