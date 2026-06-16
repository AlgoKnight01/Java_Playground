import java.util.ArrayList;

public class QuestionBank{
    public static ArrayList<Question> getQuestions(){
        ArrayList<Question> questionBank=new ArrayList<>();
            //Add MCQ questois bellow:
                questionBank.add(new MCQQuestion("Java keyword for inheritance?",AnswerOption.B,"implements","extends","inherits","super",10));
                questionBank.add(new MCQQuestion("What is the size of int in Java?", AnswerOption.B, "2 bytes", "4 bytes", "8 bytes", "16 bytes", 10));
                questionBank.add(new MCQQuestion("Which method is the entry point of a Java program?", AnswerOption.A, "main()", "start()", "run()", "init()", 10));
                questionBank.add(new MCQQuestion("Which keyword is used to create an object in Java?", AnswerOption.C, "create", "object", "new", "make", 10));
                questionBank.add(new MCQQuestion("What does OOP stand for?", AnswerOption.B, "Object Oriented Procedure", "Object Oriented Programming", "Ordered Object Processing", "Object Operation Program", 10));
                questionBank.add(new MCQQuestion("Which of these is not a primitive type in Java?", AnswerOption.D, "int", "char", "boolean", "String", 10));
                questionBank.add(new MCQQuestion("What is the default value of a boolean in Java?", AnswerOption.A, "false", "true", "0", "null", 10));
                questionBank.add(new MCQQuestion("Which keyword is used to inherit a class?", AnswerOption.B, "implements", "extends", "inherits", "super", 10));
                questionBank.add(new MCQQuestion("Which collection allows duplicate elements?", AnswerOption.A, "ArrayList", "HashSet", "TreeSet", "LinkedHashSet", 10));
                questionBank.add(new MCQQuestion("What is the output of 10 % 3 in Java?", AnswerOption.C, "3", "0", "1", "2", 10));
                questionBank.add(new MCQQuestion("Which keyword prevents a method from being overridden?", AnswerOption.D, "static", "private", "abstract", "final", 10));
                questionBank.add(new MCQQuestion("What does JVM stand for?", AnswerOption.B, "Java Virtual Memory", "Java Virtual Machine", "Java Variable Method", "Java Verified Model", 10));
                questionBank.add(new MCQQuestion("Which loop is guaranteed to execute at least once?", AnswerOption.C, "for", "while", "do-while", "foreach", 10));
                questionBank.add(new MCQQuestion("What is the parent class of all classes in Java?", AnswerOption.A, "Object", "Base", "Super", "Root", 10));
                questionBank.add(new MCQQuestion("Which access modifier makes a member accessible only within its class?", AnswerOption.D, "public", "protected", "default", "private", 10));
                questionBank.add(new MCQQuestion("What is the correct way to declare an array in Java?", AnswerOption.B, "int array(5)", "int[] array = new int[5]", "array int[5]", "int array = new[5]", 10));
                questionBank.add(new MCQQuestion("Which keyword is used to handle exceptions?", AnswerOption.A, "try", "catch", "throw", "handle", 10));
                questionBank.add(new MCQQuestion("What does the 'static' keyword mean?", AnswerOption.C, "Cannot be changed", "Belongs to object", "Belongs to class", "Hidden from subclass", 10));
                questionBank.add(new MCQQuestion("Which symbol is used for single line comments in Java?", AnswerOption.B, "##", "//", "**", "%%", 10));
                questionBank.add(new MCQQuestion("What is the size of a char in Java?", AnswerOption.D, "1 byte", "4 bytes", "8 bytes", "2 bytes", 10));
                questionBank.add(new MCQQuestion("Which interface must be implemented for sorting objects?", AnswerOption.A, "Comparable", "Serializable", "Runnable", "Iterable", 10));
            //End of MCQ questions;
            
            //Add TF Questions bellow: 
                questionBank.add(new TrueFalseQuestion("Java is a platform-independent language.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("In Java, a class can extend multiple classes.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("The default value of an int variable in Java is 0.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("A constructor can have a return type.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("Java supports operator overloading.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("An abstract class can have a constructor.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("The String class in Java is immutable.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("A static method can access non-static variables directly.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("ArrayList is faster than LinkedList for random access.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("The 'finally' block always executes after try-catch.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("In Java, char is a numeric data type.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("A private method can be overridden in a subclass.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("Java is a purely object-oriented language.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("An interface can have a constructor.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("The 'super' keyword can call a parent class constructor.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("In Java, arrays are fixed in size.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("A class can implement multiple interfaces in Java.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("The == operator compares object content in Java.", AnswerOption.B, 10));
                questionBank.add(new TrueFalseQuestion("Java automatically manages memory through garbage collection.", AnswerOption.A, 10));
                questionBank.add(new TrueFalseQuestion("A 'void' method can have a return statement.", AnswerOption.B, 10));
            //End of TF questions;
        
        return questionBank;

    }
}