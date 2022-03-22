import java.util.Objects;

public class Question {
	protected String question;
	protected boolean[] answer;
	protected String[] answers;
	
	private Question(String question)
	{
		this.question = question;	
	}
	
	public Question(String question, boolean ans) 
	{
		this(question);
		this.answer = new boolean[1];
		this.answer[0] = ans;
	}
	
	public Question(String question, String ans) 
	{
		this(question);
		this.answers = new String[1];
		this.answers[0] = ans;
	}
	
	public Question(String question, boolean[] ans) 
	{
		this(question);
		this.answer = new boolean[ans.length];
		for (int i=0;i<ans.length;i++)
			this.answer[i] = ans[i];
	}
	
	public Question(String question, String[] ans) 
	{
		this(question);
		this.answers = new String[ans.length];
		for (int i=0;i<ans.length;i++)
			this.answers[i] = ans[i];
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String[] getStringAnswers()
	{
		return answers;	
	}
	
	public void setStringAnswers(String[] answers)
	{
		this.answers = answers;	
	}
	
	public boolean[] getBooleanAnswers()
	{
		return answer;	
	}
	
	@Override
	public String toString() 
	{
		StringBuilder str = new StringBuilder(question + " ");
		if(answer != null)
		{
			for(int i=0;i<answer.length;i++)
				str.append(answer[i]);
			return str.toString();
		}
		for(int i=0;i<answers.length;i++)
			str.append(answers[i]);
		return str.toString();	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(question, other.question);
	}
}
