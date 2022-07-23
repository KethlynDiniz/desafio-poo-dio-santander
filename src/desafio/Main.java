package desafio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
				
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devKethlyn = new Dev();
		devKethlyn.setNome("Kethlyn");
		devKethlyn.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Kethlyn" + devKethlyn.getConteudosInscritos());
		
		devKethlyn.progredir();
		devKethlyn.progredir();
		devKethlyn.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Kethlyn" + devKethlyn.getConteudosInscritos());
		System.out.println("\nConteudos Concluidos Kethlyn" + devKethlyn.getConteudosConcluidos());
		System.out.println("XP: " + devKethlyn.calcularTotalXP());
		
		System.out.println("--------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
		
		
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("\nConteudos Concluidos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXP());
	}

}
