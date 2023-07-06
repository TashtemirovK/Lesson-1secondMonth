public final class  Son extends Father{
    private String studying;

    public Son(String name, int age, Enum anEnum, String car, String studying) {
        super(name, age, anEnum, car);
        this.studying = studying;
    }

    public String getStudying() {
        return studying;
    }

    @Override
    public void car(String work) {
        super.car(work);
        System.out.println("Studying in University and play the basketball");
    }

}
