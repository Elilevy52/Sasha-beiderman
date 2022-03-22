import java.util.Scanner;

public class MangerClass 
{
	private final int ARRAY_FACCTOR = 2;
	private Question[] allQuestions;
	private int count;

	public MangerClass() 
	{
		this.allQuestions = new Question[1];
		this.count = allQuestions.length;
	}

	public void addOpenQuestion(String openQuestion) 
	{
		if (count == allQuestions.length) {
			extendQuestionArraySize();
		}
		if (allQuestions[count] == null) {
			allQuestions[count] = new OpenQuestion(openQuestion);
			System.out.println("Open Question added.1");
		} else {
			allQuestions[count++] = new OpenQuestion(openQuestion);
			System.out.println("Open Question added.");
		}
	}

	public void addOpenAnswer(String answer) {
		if (count == allAnswers.length) {
			extendAnswersArraySize();
		}

		if (allAnswers[count] == null) {
			allAnswers[count] = new OpenAnswer(answer);
			System.out.println("Open Question - Answer added.");

		} else {
			allAnswers[count++] = new OpenAnswer(answer);
			System.out.println("Open Question - Answer added.");
		}
	}

	public void addMultipleChoiseQuestion(String question) {
		if (count == allQuestions.length) {
			extendQuestionArraySize();
		}
		if (allQuestions[count] == null) {
			allQuestions[count] = new MultipleChoiseQuestion(question);
			System.out.println("Multiple Choise Question added.");
		}else {
		allQuestions[count++] = new MultipleChoiseQuestion(question);
		System.out.println("Multiple Choise Question added.");
		}
	}

	public void addMultipleChoiseAnswer(String answer, boolean isTrue) {
		if (count + 1 == allAnswers.length) {
			extendAnswersArraySize();
		}
		if (allAnswers[count] == null) {
			allAnswers[count] = new MultipleChoiseAnswer(answer, isTrue);
			System.out.println("Multiple Choise Question - Answer added.");
		} else {
			allAnswers[count++] = new MultipleChoiseAnswer(answer, isTrue);
			System.out.println("Multiple Choise Question - Answer added.");
		}
	}

	private void extendQuestionArraySize() 
	{
		Question[] newArray = new Question[ARRAY_FACCTOR * allQuestions.length];
		for (int i = 0; i < allQuestions.length; i++)
			newArray[i] = allQuestions[i];
		allQuestions = newArray;
		System.out.println("Array extended Successfully");
	}

	public void removeAnswer(int index) 
	{
		Scanner scan = new Scanner(System.in);
		String[] ans = 	allQuestions[index].getStringAnswers();
		if(ans != null)
		{
			for(int i=0;i<ans.length;i++)
				System.out.println((i+1) + ". " + ans[i]);
			int choice = scan.nextInt() - 1;
			int i;
			for(i = 0;i<ans.length - 1;i++)
				if(i >= choice)
					ans[i + 1] = ans[i];
			ans[i] = "";
			allQuestions[index].setStringAnswers(ans);
		}
		
	}
	public void printOAnswer(int index) 
	{
		for(int i = 0 ; i < count; i++) 
			System.out.println(allQuestions[index].toString());
	}
	
	public void printOpenQuestion() {
		for (int i = 0; i < count; i++) {
			System.out.println(allQuestions[i].getQuestion().toString());
		}
	}
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < allQuestions.length; i++) 
			sb.append(allQuestions[i].toString() + "\n");
		return sb.toString();
	}

}
