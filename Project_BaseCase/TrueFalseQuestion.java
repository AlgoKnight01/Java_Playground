public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String questionText,AnswerOption correctAnswer,int points) {
        super(questionText, correctAnswer, points);
    }

    @Override
    public void displayQuestion() {

        System.out.println(questionText);

        System.out.println("A. True");
        System.out.println("B. False");
    }

    @Override
    public boolean evaluate(AnswerOption answer) throws Exception {

        if (answer == AnswerOption.C || answer == AnswerOption.D) {
            throw new Exception("True/False only accepts A or B");
        }

        return answer == correctAnswer;
    }

}
