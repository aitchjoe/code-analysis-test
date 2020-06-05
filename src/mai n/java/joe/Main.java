package joe;

public class Main {
	public static void main(String[] args) {
		for (int i = 0;; i += 2) {
			if (i > 9)
				break;
			System.out.println("good loop: " + i);
		}
		for (int i = 0;; i += 2) {
			if (i == 9)
				break;
			System.out.println("complex bad loop: " + i);
		}
		for (int i = 0; i != 9; i += 2) {
                        System.out.println("complex? bad loop: " + i);
		}
		if (true) {
			for (;;) {
				System.out.println("bad loop");
			}
		}
	}
}
