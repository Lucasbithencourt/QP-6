import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int valor1, valor2;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite um numero: ");
                valor1 = sc.nextInt();
                

    
                
                try {
                    System.out.println("Digite outro numero: ");
                    valor2= sc.nextInt();
                    System.out.println("O resultado é: "+(valor1+valor2));
                   
    
          
                } catch (Exception e){
                 
                    System.out.println("Valor invalido, Somente numeros são aceitos");
                   break;
                }
    
               
            }catch(Exception e){
                System.out.println("Valor invalido, Somente numeros são aceitos");
                break;
            } 
         
         }
    }
}
