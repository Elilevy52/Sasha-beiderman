import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MangerClass manger = new MangerClass();
		int op, innerOP, answer;

		String menu = ("Exam Creator Program. \n" + "Please select one of the following options:\n"
				+ "1) Show all questions and answers. \n" + "2) Add new question/answer. \n"
				+ "3) Edit an existing question. \n" + "4) Edit an existing answer. \n"
				+ "5) Delete an existing answer. \n");
		do {
			System.out.println(menu);
			op = scan.nextInt();
			switch (op) {
			case 1:
				System.out.println("___all questions and answers___");
				System.out.println("Show all Open Qusetion and their answers. Type -> '1'."
						+ "\nShow all Multiple Choice Questions and their answers. Type -> '2'."
						+ "\nShow all Questions. Type -> '3'." + "\nShow all Answers. Type -> '4'."
						+ "\nGo back to Main Menu. Type -> '-1'.\n");
				do {
					innerOP = scan.nextInt();
					switch (innerOP) {
					case 1:
						System.out.println("Printing all Open Questions and thier answers.");
						manger.printOpenQuestion();
						break;
					case 2:
						System.out.println("Printing all Multiple Choice Questions and their answers.");
						// need to add method body.
						break;
					case 3:
						System.out.println("Printing all Questions.");
						System.out.println(manger.toString());
						break;
					case 4:
						System.out.println("Printing all Answers.");
						manger.printOAnswer();
						break;
					default:
						System.out.println("You've insert bad number");
						break;
					}
				} while (innerOP != -1);
			case 2:
				System.out.println("___Add new question/answer___");
				System.out.println("To add an new Open Question. Type -> '1'."
						+ "\nTo add an new Multiple Choice Questions Type -> '2'."
						+ "\nGo back to Main Menu Type -> '-1'.\n");
				do
				{
					innerOP = scan.nextInt();
					scan.nextLine();
					switch(innerOP)
					{
					case  1:
						System.out.println("Please enter Question: ");
						String openQuestion = scan.nextLine();
						manger.addOpenQuestion(openQuestion.toString());
						System.out.println("Please enter the correct answer: ");
						String openAnswer = scan.nextLine();
						manger.addOpenAnswer(openAnswer.toString());
break;
					case 2:
						char resume = 0;
						System.out.println("Please enter Multiple Choice Questions: ");
						String MultipleChoiceQuestions = scan.nextLine();
						for (int i = 0; i < 10 && (resume == 'y' || resume == 'Y'); i++) 
						{
							System.out.println("Please enter an answer: ");
							String multipleChoiceAnswer = scan.nextLine();
							manger.addMultipleChoiseQuestion(MultipleChoiceQuestions);
							System.out.println("Is this the correct answer? (true/false): ");
							boolean trueAnswer = scan.nextBoolean();
							manger.addMultipleChoiseAnswer(multipleChoiceAnswer, trueAnswer);
							System.out.println("\nDo you want to add another answer? (y/n) ");
							resume = scan.next().charAt(0);
							if (resume != 'y' && resume != 'Y') 
							{
								
							}
						}
					break;
					default: 
						System.out.println("You've insert bad number");
						break;
					}
				}while(innerOP!=-1);
				break;
			case 3:
				int questionNumber = 0;
				System.out.println("___Edit an existing question___");
				System.out.println("To edit an Open Question Please type -> '1'."
						+ "\nTo edit an Multiple Choice Questions Please type -> '2'."
						+ "\nGo back to Main Menu Type -> '-1'.\n");
				innerOP = scan.nextInt();
				while (innerOP == 1 || innerOP == 2) {
					if (innerOP == 1)
						System.out.println("Please Chose one of the Following Question (Type its number): ");
					questionNumber = scan.nextInt();
					// need to add method body.
					if (innerOP == 2)
						System.out.println("Please Chose one of the Following Question (Type its number): ");
					questionNumber = scan.nextInt();
					// need to add method body.
					break;
				}
				if (innerOP == -1) {
					System.out.println(menu);
				}
				break;
			case 4:
				System.out.println("___Edit an existing answer___");
				System.out.println("To edit an Open Question - Answer Please type -> '1'."
						+ "\nTo edit an Multiple Choice Questions - Answer Please type -> '2'."
						+ "\nGo back to Main Menu Type -> '-1'.\n");
				innerOP = scan.nextInt();
				while (innerOP == 1 || innerOP == 2) {
					if (innerOP == 1)
						System.out.println("Please Chose one of the Following Answer (Type its number): ");
					answer = scan.nextInt();
					// need to add method body.
					if (innerOP == 2)
						System.out.println("Please Chose one of the Following Answer (Type its number): ");
					answer = scan.nextInt();
					// need to add method body.
					break;
				}
				if (innerOP == -1) {
					System.out.println(menu);
				}
				break;
			case 5:
				System.out.println("___Delete an existing answer__");
				System.out.println("To delete an Open Question - Answer Please type -> '1'."
						+ "\nTo delete an Multiple Choice Questions - Answer Please type -> '2'."
						+ "\nGo back to Main Menu Type -> '-1'.\n");
				innerOP = scan.nextInt();
				while (innerOP == 1 || innerOP == 2) {
					if (innerOP == 1)
						System.out.println("Please Chose one of the Following Answer (Type its number): ");
					answer = scan.nextInt();
					if (innerOP == 2)
						System.out.println("Please Chose one of the Following Answer (Type its number): ");
					answer = scan.nextInt();
					break;
				}
				if (innerOP == -1) {
					System.out.println(menu);
				}
				break;
			default:
				System.out.println("EXIT");
			}
			System.out.println("\nDo you want to go back to the menu? (y/n)");
			char resume = scan.next().charAt(0);
			if (resume == 'y' || resume == 'Y') {
				System.out.println(menu);
				op = scan.nextInt();
			} else {
				System.out.println("Exiting program...");
				System.exit(0);
			}
		} while (op != 8);
		System.out.println("Exiting program, thank you!");
		scan.close();
	}
}
