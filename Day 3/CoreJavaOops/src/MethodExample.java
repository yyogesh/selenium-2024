public class MethodExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(5, 10);
        computer.add(15, 20);

        computer.playMusic();
        String result = computer.getMeAPen(5);
        System.out.println(result);

        computer.add(10, 20, 30);
    }
}


class Computer {
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }

    public void add(int fn, int sn){
        System.out.println(fn + sn);
    }

    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }

    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}


