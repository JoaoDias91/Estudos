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

	void mostraEmpregados(){
		for (int i = 0; i < this.funcionarios.length; i++){
			System.out.println("Funcionario na posicao: " + i);
			System.out.println(funcionarios[i].exibeDados() + "\n");
		}
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

	String exibeDados(){
		return "Nome: " + this.nome + "\nDepartamento: " + this.departamento + "\nSalario: " + this.salario + 
		"\nRegistro de Identidade: " + this.registroIdentidade + "\nData de Entrada: " + dataEntradaNoBanco.exibeData();
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
	empresa.funcionarios  = new Funcionario[2];

	Funcionario f1 = new Funcionario();
	f1.nome = "Alan";
	f1.departamento = "RH";
	f1.salario = 1000;
	f1.registroIdentidade = "123.456.789-10";
	f1.dataEntradaNoBanco.preencheData(01, 02, 2017);
	empresa.adiciona(f1);

	Funcionario f2 = new Funcionario();
	f2.nome = "Bella";
	f2.departamento = "Vendas";
	f2.salario = 1600;
	f2.registroIdentidade = "312.123.435-19";
	f2.dataEntradaNoBanco.preencheData(01, 03, 2017);
	empresa.adiciona(f2);

	empresa.mostraEmpregados();
	}
}