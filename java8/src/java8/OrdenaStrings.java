package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

//		Comparator<String> comparator = new ComparadorPorTamanho();
//		// Collections.sort(palavras,comparator);
//		palavras.sort(comparator);
//		System.out.println(palavras);
//		

//		palavras.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length())
//					return -1;
//
//				if (s2.length() > s1.length())
//					return 1;
//
//				return 0;
//			}
//		});
//		

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//
//			if (s2.length() > s1.length())
//				return 1;
//
//			return 0;
//
//		});
		
		//palavras.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));
		
	//	palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));//eu quero invocar o metodo length da string
		//explicação codigo acima^ codigo abaixo equivale codigo acima
		
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
		
		
		
		
		
		System.out.println(palavras);
		
		
		

//		for (String p : palavras) {
//			System.out.println(p);
//		}

//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//				
//			}
//			
//		};
		
		//----------------------------------------------------------------
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		
		palavras.forEach(s -> System.out.println(s)

		);
		
		//mesma coisa  mais usando reference
//		Consumer<String> impresso = System.out::println;
//		palavras.forEach(impresso);
//		
//		palavras.forEach(System.out::println);
		
		
//----------------------------------------------------		
		
		
		
		
		

//				
//		palavras.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//				
//			}
//		});

	}

}

//essa classe foi esumida acima criando assim uma classe anonima
//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//		
//	}

//}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		if (s1.length() < s2.length())
			return -1;

		if (s2.length() > s1.length())
			return 1;

		return 0;
	}

}