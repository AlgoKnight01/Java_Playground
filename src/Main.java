import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
  public static AnswerOption convInput(String input){
    input = input.trim().toUpperCase();

    switch (input) {
        case "A": return AnswerOption.A;
        case "B": return AnswerOption.B;
        case "C": return AnswerOption.C;
        case "D": return AnswerOption.D;
        default: return null;
    }
  }  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Your Name: ");
        String name= sc.nextLine();
        //sc.nextLine();

        System.out.print("How many question do you like to answer: ");
        int numofQues=sc.nextInt();
        sc.nextLine();
        
        ArrayList<Question> questionBank = QuestionBank.getQuestions();
        Collections.shuffle(questionBank);
        ArrayList<Question>selected = new ArrayList<>(questionBank.subList(0, Math.min(numofQues, questionBank.size())));

        int score=0; int correct=0; int wrong=0;
        
        for(int i=0; i<selected.size(); i++){
            Question q= selected.get(i);
            System.out.println("\nQuestion " + (i + 1));
            q.displayQuestion();

            AnswerOption userAnswer=null;
            while(userAnswer==null){
                System.out.print("Your answer (A/B/C/D): ");
                String input = sc.nextLine();
                userAnswer = convInput(input);
                if (userAnswer == null) {
                    System.out.println("Invalid input! Try again.");
                }else{
                    try{
                        q.evaluate(userAnswer);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        userAnswer=null;
                    }
                }

            }
            try{
                boolean result =q.evaluate(userAnswer);
                if (result) {
                    System.out.println("✓ Correct!");
                    score += q.getPoints();
                    correct++;
                } else {
                    System.out.println("✗ Wrong!");
                    wrong++;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        printScore(name,score,correct,wrong,numofQues);
    }
    public static void printScore(String name, int score, int correct, int wrong, int numofQues ){
        int maxScore = numofQues * 10;
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║               QUIZ COMPLETE!                 ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.printf ("║ Player : %-35s ║%n", name);
        System.out.printf ("║ Score  : %-35s ║%n", score + " / " + maxScore);
        System.out.printf ("║ Correct: %-5d | Wrong: %-21d║%n", correct, wrong);
        System.out.printf ("║ Rank   : %-35s ║%n", getRank(score, numofQues));
        System.out.println("╚══════════════════════════════════════════════╝");
    }
    public static String getRank(int score, int numofQues){
        double percentage=(score * 100.0) / (numofQues * 10);
        if(percentage >= 90){
            return "★★★★★ Excellent!";
        }else if(percentage >= 70){
            return "★★★★☆ Great job!";
        }else if(percentage >= 50){
            return "★★★☆☆ Not bad!";
        }else if(percentage >= 30){
            return "★★☆☆☆ Keep practicing!";
        }else{
            return "★☆☆☆☆ Better luck next time!";
        }
    }

}
