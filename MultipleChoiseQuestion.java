import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;

public class MultipleChoiseQuestion extends Question {
	private static final int MAX_ARRAY_SIZE = 10;
	protected MultipleChoiseAnswer[] answers;
	protected int answerId = 1;
	protected MultipleChoiseAnswer correctAnswer;
	protected String multipeChoiseQuestions;

	public MultipleChoiseQuestion(String question) {
		super(question);
		this.answers = new MultipleChoiseAnswer[MAX_ARRAY_SIZE];
		this.answerId = answerId++;
		this.question = multipeChoiseQuestions;
	}

	public MultipleChoiseAnswer[] getAnswers() {
		return answers;
	}

	public void setAnswers(MultipleChoiseAnswer[] answers) {
		this.answers = answers;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public MultipleChoiseAnswer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(MultipleChoiseAnswer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getMultipeChoiseQuestions() {
		return multipeChoiseQuestions;
	}

	public void setMultipeChoiseQuestions(String multipeChoiseQuestions) {
		this.multipeChoiseQuestions = multipeChoiseQuestions;
	}

	public String printMultipleChoiseQuestion() {
		StringBuffer sb = new StringBuffer(super.printQuestionNumber());
		for (int i = 0; i < answerId; i++) {
			sb.append("(" + (i + 1) + ")" + answers[i].toString());
			if (answers[i].equals(getCorrectAnswer())) {
				sb.append("Correct \n");
			} else {
				sb.append("Incorrect \n");
			}
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "MultipleChoiseQuestion [answers=" + Arrays.toString(answers) + ", answerId=" + answerId
				+ ", correctAnswer=" + correctAnswer + ", multipeChoiseQuestions=" + multipeChoiseQuestions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(answers);
		result = prime * result + Objects.hash(answerId, correctAnswer, multipeChoiseQuestions);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MultipleChoiseQuestion other = (MultipleChoiseQuestion) obj;
		return answerId == other.answerId && Arrays.equals(answers, other.answers)
				&& Objects.equals(correctAnswer, other.correctAnswer)
				&& Objects.equals(multipeChoiseQuestions, other.multipeChoiseQuestions);
	}

}
