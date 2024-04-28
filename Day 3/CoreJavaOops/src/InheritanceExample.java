

class Employee {
    float Salary = 40000;
}

class ContractEmployee extends  Employee {
    float Salary1 = 30000;
}

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class AdvCalc extends Calc
{
    @Override
    public int add(int n1, int n2)
    {
        return n1 + n2 + 1;
    }
}

class VeryAdvCalc extends Calc
{
    @Override
    public int add(int n1, int n2)
    {
        return n1 + n2 + 1;
    }
}

public class InheritanceExample extends ContractEmployee {
    public static void main(String[] args) {
        // Junit
        InheritanceExample obj = new InheritanceExample();
        System.out.println(obj.Salary);
        System.out.println(obj.Salary1);

        Calc calc = new AdvCalc();
        AdvCalc advCalc = new AdvCalc();
        System.out.println(calc.add(10, 20));

        System.out.println(new AdvCalc().add(10, 20));
    }
}




