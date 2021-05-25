import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float vVetorAltura[]  = new float[5];
		String vVetorNome[] = new String[5]; 
				
		for(int indice = 0; indice <=4; indice++ ){
			System.out.println("\n insira o "+ indice + " nome: ");
				vVetorNome[indice] = entrada.nextLine();
			
                System.out.println("\n insira a altura: ");
				vVetorAltura[indice] = entrada.nextFloat();
				
		}
		for(int indice = 0; indice <=4; indice++ ){
			if (vVetorAltura[indice] >= 1.6){
				System.out.println(vVetorNome[indice]+ ": "+ vVetorAltura[indice]+"\n");
			}
		}
    }
}
