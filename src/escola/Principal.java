package escola;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a = new Aluno();
		a.cpf = "111.222.000-55";
		a.nome="joao";
		a.matricula=2200;
		
		a.info();
		
		Aluno b = new Aluno(1100,"mario","555.641.054-04");
		
		b.info();
		
		//Aluno c = new Aluno(1003);
		
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno(1004,"carlos","111.333.555-66"));
		
	}	

}
