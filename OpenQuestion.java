import java.util.Objects;

public class OpenQuestion extends Question 
{
	protected String openAnswer;
	
	public OpenQuestion(String question) {
		super(question);
		openAnswer = "";
	}
	public OpenAnswer getOpenAnswer() {
		return openAnswer;
	}
	public void setOpenAnswer(OpenAnswer openAnswer) {
		this.openAnswer = openAnswer;
	}
	public String getOpenQuestion() {
		return openQuestion;
	}
	public void setOpenQuestion(String openQuestion) {
		this.openQuestion = openQuestion;
	}
	@Override
	public String toString() {
		return "OpenQuestion [openQuestion=" + openQuestion + ", openAnswer=" + openAnswer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(openAnswer, openQuestion);
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
		OpenQuestion other = (OpenQuestion) obj;
		return Objects.equals(openAnswer, other.openAnswer) && Objects.equals(openQuestion, other.openQuestion);
	}

}
