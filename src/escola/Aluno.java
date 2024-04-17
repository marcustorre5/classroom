package escola;

public class Aluno {
	
	int matricula;
	String nome;
	String cpf;

	
	Aluno(){
		
	}
	
	Aluno(int matricula, String nome, String cpf){
		
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	void info() {
		
		System.out.println("Matricula: " + matricula);
		System.out.println("nome: " + nome);
		System.out.println("cpf: " + cpf);
		System.out.println("");
		
	}
	
}
