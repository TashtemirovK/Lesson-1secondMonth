import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Father extends GrandFather {

    private String car;
    private String name;

    public Father(String name, int age, Enum anEnum, String car) {
        super(name, age, anEnum);
        this.car = car;
    }

    public final String getCar() {
        return car;
    }
    public void car(){
        System.out.println("Black");
    }
    public void car(String work){
        System.out.println(Enum.LAWYER);
    }
    public void car(int speedCars){
        System.out.println("Скорость машины: " + speedCars);
    }

}
