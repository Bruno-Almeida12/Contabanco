import java.util.Scanner;

	public class ContaTerminal{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Por favor, digite o número da Agência:");
	        String agencia = scanner.nextLine();

	        System.out.println("Por favor, digite o número da Conta:");
	        int numero = scanner.nextInt();
	        scanner.nextLine(); // Consumir a quebra de linha após o nextInt

	        System.out.println("Por favor, digite o nome do Cliente:");
	        String nomeCliente = scanner.nextLine();

	        double saldo = 234.88;

	        // Exibindo a mensagem final com concatenação
	        String mensagem = "Olá " + nomeCliente + 
	                          ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
	                          ", conta " + numero + 
	                          " e seu saldo de R$" + saldo + " já está disponível para saque.";

	        System.out.println(mensagem);
		}
	}