public class Main {
    public static void main(String[] args) {
        Father father = new Father("Akylbai", 45, Enum.LAWYER, "Toyota");
        Son son = new Son("Emir", 22, Enum.STUDENT, " ", "University");
        Son son2 = new Son("Umar", 20, Enum.SCHOOL, " ", "University");

        System.out.println("------------------------");
        System.out.println("AGE: " + father.getAge() + "NAME: " + father.getName() +
                " WORK: " + father.getAnEnum() + " CAR: " + father.getCar());
        System.out.println("------------------------");
        System.out.println("AGE: " + son.getAge() + "NAME: " + son.getName() +
                "WORK: " + son.getStudying());
        System.out.println("------------------------");
        System.out.println("AGE: " + son2.getAge() + "NAME: " + son2.getName() +
                "WORK: " + son2.getStudying());
        System.out.println("------------------------");

        father.car();
        father.car(12);
        father.car("Lawyer");
        System.out.println("--------------------------");
        son.car();
        son.car(16);
        son2.car();
        son2.car("Studying");
    }
}