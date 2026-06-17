public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String questionText,AnswerOption correctAnswer,int points)throws Exception {
        super(questionText, correctAnswer, points);
        if(correctAnswer==AnswerOption.C || correctAnswer==AnswerOption.D){
            throw new Exception("True/False have only valid options A and B");
        }
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
