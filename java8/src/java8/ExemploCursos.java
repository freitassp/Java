package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}
    
}




public class ExemploCursos {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));//curso me devolve alunos
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));//dado aluno me devolve 
		
		cursos.forEach(System.out::println);
		
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(curso -> curso.getAlunos() >= 50)
			.forEach(curso -> System.out.println(curso.getNome())); //para imprimir nome 
			//.map(curso -> curso.getAlunos())
			//.map(curso::getAlunos())
			//.forEach(total -> System.out.println(total));
		
		//Optional<Curso> optionalCurso = cursos.stream()
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)//devolve stream
			.findAny()//devolve optional encontre m deles
			.ifPresent(c -> System.out.println(c.getNome()));
		
		
		
		System.out.println("------------------");
//		Curso curso = optionalCurso.orElse(null);
//		System.out.println(curso.getNome());
		
		//optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.collect(Collectors.toList());
//		
//		cursos.stream()	
//			.forEach(c -> System.out.println(c.getNome()));
		
//		Map<String, Integer> map = cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.collect(Collectors.toMap(
//					c -> c.getNome(),
//					c -> c.getAlunos()));
		
		//System.out.println(map);
		
		cursos.parallelStream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
						c -> c.getNome(),
						c -> c.getAlunos()))
				.forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos") );

	}
	
}
