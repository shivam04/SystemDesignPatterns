package zh.prototypepattern.a.example;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(IntelligentStudent s) {
        super(s);
        this.iq = s.iq;
    }

    public IntelligentStudent() {
        super();
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return super.toString() + " " +
         "IntelligentStudent{" +
                "iq=" + iq +
                '}';
    }
}
