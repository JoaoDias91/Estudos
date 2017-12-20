class Empresa{
	String nome;
	String cnpj;
	String endereco;
	Funcionario [] funcionarios;
	int livre = 0;

	void adiciona(Funcionario f){
		this.funcionarios[this.livre] = f;
		this.livre++;
	}
}

class Funcionario{
	String nome;
	String departamento;
	double salario;
	Data dataEntradaNoBanco = new Data();
	String registroIdentidade;

	void recebeAumento(double valorDoAumento){
		this.salario += valorDoAumento;
	}

	void calculaGanhoAnual(){
		System.out.println("Ganho anual: " + this.salario * 12);
	}

	void exibeDados(){
		System.out.println("Nome: " + this.nome + "\n" + "Departamento: " + this.departamento + "\n" + "Salario: " + this.salario);
		System.out.println("Registro de Identidade: " + this.registroIdentidade);
		System.out.println("Data de Entrada: " + dataEntradaNoBanco.exibeData());
	}

}

class Data{
	int dia;
	int mes;
	int ano;

	void preencheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String exibeData(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}


class Programa{
	public static void main(String[] args){

	Empresa empresa = new Empresa();
	empresa.funcionarios  = new Funcionario[10];

	Funcionario f1 = new Funcionario();
	f1.salario = 1000;
	f1.dataEntradaNoBanco.preencheData(01, 02, 2017);
	empresa.adiciona(f1);

	Funcionario f2 = new Funcionario();
	f2.salario = 1600;
	f2.dataEntradaNoBanco.preencheData(01, 03, 2017);
	empresa.adiciona(f2);

	empresa.funcionarios[0].exibeDados();
	System.out.println("\n");
	empresa.funcionarios[1].exibeDados();
	}
}