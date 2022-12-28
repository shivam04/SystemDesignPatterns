package zi.bridgepattern.b.example;

public class QuestionFormat extends QuestionManager{
    public QuestionFormat(String catalog, Question q) {
        super(catalog, q);
    }

    @Override
    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }
}
