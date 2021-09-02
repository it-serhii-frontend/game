
import java.util.Random;
import java.util.Scanner;

public class Controller {

	private static int count = 0;
	private int min = 0;
	private int max = 100;
	private int number;

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public int random(int min, int max) {
		Random rand = new Random();
		int num = rand.nextInt((max - min) + 1) + min;
		return num;
	}

	public void processUser() {
		int rightValue = random(0, 100);
		System.out.println(View.OUR_INT + rightValue);

		Scanner sc = new Scanner(System.in);

		view.printMessage("The range is from 0 to 100 ");

		while (rightValue != number) {

			view.printMessage(View.INPUT_INT_DATA);
			number = sc.nextInt();
			model.setValue(number);

			if (number == rightValue) {
				view.printMessage(View.YOU_WON);
				if (count == 0) {
					System.out.print(" Without mistakes");
				}
				if (count == 1) {
					System.out.println(" You made " + count + " mistake");
				}
				if (count > 1) {
					System.out.println(" You made " + count + " mistakes");
				}
			} else if (number < rightValue) {
				count++;
				min = number;
				view.printMessage(View.BETWEEN, min, max);
			} else if (number > rightValue) {
				count++;
				max = number;
				view.printMessage(View.BETWEEN, min, max);
			} else {
				view.printMessage("You should check the number from the range");
				view.printMessage(View.BETWEEN, min, max);
			}
		}

	}

}
