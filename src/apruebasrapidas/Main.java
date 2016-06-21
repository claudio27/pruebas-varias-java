package apruebasrapidas;

public class Main {

	/**
	 * @param args
	 */
	public static void init() {
		String a = "";
		String b = null;

		if (a == b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (a.equals(b)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String s2 = "123456789"; ;
		System.out.println(s2.replace("-", ""));
	}

}
