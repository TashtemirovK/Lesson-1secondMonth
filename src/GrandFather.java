public class GrandFather {
    private String name;
    private int age;
    private Enum anEnum;

    public GrandFather(String name, int age, Enum anEnum) {
        this.name = name;
        this.age = age;
        this.anEnum = anEnum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Enum getAnEnum() {
        return anEnum;
    }
}
