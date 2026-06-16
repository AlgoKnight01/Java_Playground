public abstract class Question{
    protected String questionText;
    protected AnswerOption correctAnswer;
    protected int points;

    public Question(String questionText, AnswerOption correctAnswer, int points){
        this.questionText=questionText;
        this.correctAnswer=correctAnswer;
        this.points=points;
    }

    public abstract void displayQuestion();
    public abstract boolean evaluate(AnswerOption answer) throws Exception;

    public int getPoints(){
        return points;
    }

    public String toString(){
        return questionText;
    }
}