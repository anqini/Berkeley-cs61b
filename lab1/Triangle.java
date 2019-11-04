public class Triangle {
	public static void main(String[] args) {
		if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
            System.exit(1);
        }
		try {
			int n =  Integer.parseInt(args[0]);
			for (int i = 1; i < n + 1 ; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			System.out.println("Input invalid!");
			System.out.println();
		}
		
	}
}