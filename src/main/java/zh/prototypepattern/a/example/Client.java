package zh.prototypepattern.a.example;

public class Client {
    public static void main(String[] args) throws Exception {

        StudentRegistry studentRegistry = new StudentRegistry();
        initializeStudentRegistry(studentRegistry);


        // Multiple object can be created on Demand or in the loops
        Student original = studentRegistry.get("Batch1");
        System.out.println("Original: " + original);
        Student copy = original.copy();
        copy.setAge(20);
        copy.setName("Ankit");
        System.out.println("Copy: " + copy);

        Student intelligentStudentOriginal = studentRegistry.get("IntelligentStudentBatch1");
        System.out.println("intelligentStudentOriginal: " + (IntelligentStudent)intelligentStudentOriginal);
        Student intelligentStudentCopy = intelligentStudentOriginal.copy();
        intelligentStudentCopy.setName("Aman");
        intelligentStudentCopy.setAge(17);
        ((IntelligentStudent)intelligentStudentCopy).setIq(180);
        System.out.println("intelligentStudentCopy: " + intelligentStudentCopy);
    }

    private static void initializeStudentRegistry(StudentRegistry studentRegistry) {
        Student s = new Student();
        s.setBatchName("Batch1");
        s.setBatchId("Batch@751");
        s.setAge(10);
        s.setName("Vikas");

        studentRegistry.register("Batch1", s);

        IntelligentStudent viswa = new IntelligentStudent();
        viswa.setAge(10);
        viswa.setName("viswa");
        viswa.setBatchId("Sample batch");
        viswa.setBatchName("Sample batch Name");
        viswa.setIq(150);

        studentRegistry.register("IntelligentStudentBatch1", viswa);
    }
}
