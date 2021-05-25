import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        int vVetor[] = new int[10], vSoma = 0;

		for(int i = 0; i <= 9; i++){
			(vVetor[i]) = entrada.nextInt();
			vSoma += vVetor[i];
		}
		for(int i = 0; i <= 9; i++){
			System.out.println(" valor do "+ (i+1) +"º vetor: " + vVetor[i]);
		}
		System.out.println("--------------------------------------");
		System.out.println("a Soma dos valors do vetor é: " + vSoma);
    }
}
