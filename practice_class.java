class calculator {
    public int add(int num1,int num2)
    {
        int result = num1 + num2;
        return result;
    }
}

public class practice_class {
    public static void main(String[] args)
    {
        calculator calc=new calculator();
        int sum =calc.add(5,20);
        System.out.println(sum);

    }
    
}
