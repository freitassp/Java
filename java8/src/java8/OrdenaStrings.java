package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
		
		palavras.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));

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

		palavras.forEach(s -> System.out.println(s)

		);

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