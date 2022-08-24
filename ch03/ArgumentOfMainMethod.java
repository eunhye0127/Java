package ch03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		System.out.println();
		
		for(String k : args) {
			System.out.println(k);
		}
	}

}
