package zi.bridgepattern.b.example;

public abstract class QuestionManager {
    protected Question question;
    public String catalog;

    public QuestionManager(String catalog, Question q) {
        this.catalog = catalog;
        this.question = q;
    }

    public void next() {
        question.nextQuestion();
    }

    public void previous() {
        question.previousQuestion();
    }

    public void newOne(String quest) {
        question.newQuestion(quest);
    }

    public void delete(String quest) {
        question.deleteQuestion(quest);
    }

    public void display() {
        question.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        question.displayAllQuestions();
    }
}
