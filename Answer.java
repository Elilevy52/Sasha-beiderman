import java.util.Objects;

public class Answer {
	protected String answer;
	protected int answerId;
	
	public Answer(String answer) {
		this.answer = answer;
		this.answerId = answerId++;
	}

	public int getAnswerId() {
		return answerId;
	}

	public String getAnswer() {
		return answer;
	}
	public void showAnswer() {
		System.out.println("answer:" + answer);
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Answer [answer=" + answer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(answer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		return Objects.equals(answer, other.answer);
	}
	
}
