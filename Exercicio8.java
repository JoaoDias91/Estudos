class Exercicio8{
	public static void main(String[] args ){
		int num = 30;

		for (int i = num; i > 1; i--){
		if (num % 2 == 0){
			num = num / 2;
		}
		else{
			num = 3 * num + 1;
		}
		System.out.println(num);
	}
	}
}