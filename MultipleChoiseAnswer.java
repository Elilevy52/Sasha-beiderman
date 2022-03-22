import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;
public class MultipleChoiseAnswer extends Answer{
	protected String multipleChoiseAnswer;
	protected boolean trueAnswer;
	
	public MultipleChoiseAnswer(String answer, boolean trueAnswer) {
		super(answer);
		super.answer = multipleChoiseAnswer;
		this.trueAnswer = trueAnswer;
	}
	public boolean isTrueAnswer() {
		return trueAnswer;
	}
	public void setTrueAnswer(boolean trueAnswer) {
		this.trueAnswer = trueAnswer;
	}
	public String getAnswer() {
		return multipleChoiseAnswer;
	}
	public void setAnswer(String multipleChoiseAnswer) {
		this.multipleChoiseAnswer = multipleChoiseAnswer;
	}

	public String getMultipleChoiseAnswer() {
		return multipleChoiseAnswer;
	}
	public void setMultipleChoiseAnswer(String multipleChoiseAnswer) {
		this.multipleChoiseAnswer = multipleChoiseAnswer;
	}
	@Override
	public String toString() {
		return "MultipleChoiseAnswer [multipleChoiseAnswer=" + multipleChoiseAnswer + ", trueAnswer=" + trueAnswer
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(multipleChoiseAnswer, trueAnswer);
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
		MultipleChoiseAnswer other = (MultipleChoiseAnswer) obj;
		return Objects.equals(multipleChoiseAnswer, other.multipleChoiseAnswer) && trueAnswer == other.trueAnswer;
	}
}
