package zh.prototypepattern.a.example;

public class Student implements Prototype<Student> {

    private String name;
    private Integer age;
    private String batchId;
    private String batchName;

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.batchId = s.batchId;
        this.batchName = s.batchName;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchId='" + batchId + '\'' +
                ", batchName='" + batchName + '\'' +
                '}';
    }
}
