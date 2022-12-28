package zi.bridgepattern.b.example;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Question q = new JavaQuestion();
        QuestionFormat questions = new QuestionFormat("Java Programming Language", q);
        questions.displayAll();
        questions.delete("What is class?");
        questions.display();
        questions.newOne("What is inheritance?");
        questions.newOne("How many types of inheritance are there in java?");
        questions.next();
        questions.display();
        questions.next();
        questions.display();
        questions.previous();
        questions.previous();
        questions.display();
        questions.displayAll();
    }
}
