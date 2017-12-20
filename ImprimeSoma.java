class ImprimeSoma{
	public static void main(String[] args){
		int num = 1;
		int soma = 0;

		while (num <= 1000){
			soma = soma + num;
			num++;
		}

		System.out.println("Resultado da soma: " + soma);
	}
}