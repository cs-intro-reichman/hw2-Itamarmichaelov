public class Collatz {
	public static void main(String args[]) {
		int seedN = Integer.parseInt(args[0]);
		String command = args[1];
		
		int seed_min = 1;
		int tempNumber = 0;

		for (int i = 0; i < seedN; i++) {
			
			tempNumber = seed_min;
			int counter_steps = 1;

			while (tempNumber != 1 || counter_steps == 1) {
				if (tempNumber % 2 == 0) {
					if (command.equals("v")){
					System.out.print(tempNumber + " ");
					}
					tempNumber /= 2;
					counter_steps++;
				} else {
					if (command.equals("v")){
					System.out.print(tempNumber + " ");
					}
					tempNumber = (tempNumber * 3) + 1;
					counter_steps++;
				}
			}
			seed_min += 1;
			if (command.equals("v")){
			System.out.println(1 + " (" + counter_steps + ")");
			}
		}
		if (tempNumber == 1) {
			System.out.println("Every one of the first " + (seed_min - 1) + " hailstone sequences reached 1.");
		} else {
			System.out.println("ERROR");
		}
	}
}