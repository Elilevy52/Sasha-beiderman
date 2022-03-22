import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
public class OpenAnswer extends Answer{
	protected String openAnswer;
	
	public OpenAnswer(String answer) {
		super(answer);
		this.answer = openAnswer;
	}
	public String getOpenAnswer() {
		return openAnswer;
	}
	public void setOpenAnswer(String openAnswer) {
		this.openAnswer = openAnswer;
	}
	@Override
	public String toString() {
		return "OpenAnswer [openAnswer=" + openAnswer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(openAnswer);
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
		OpenAnswer other = (OpenAnswer) obj;
		return Objects.equals(openAnswer, other.openAnswer);
	}	
	
}