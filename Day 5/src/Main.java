//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

    }
}