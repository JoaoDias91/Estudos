class MultiplosTres{
	public static void main(String[] args){
		int numero = 0;
		int i = 1;

		System.out.println("Multiplos de tres entre 1 e 100");

		while (i <= 100){
			if (numero % 3 == 0){
				System.out.println(numero);
			}
			
			numero++;
			i++;

		}

	}
}