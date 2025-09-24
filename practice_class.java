class calculator {
    int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
    double div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        double div=a/b;
        return div;
    }

    
}


public class practice_class {
    public static void main(String[] args)    
    {
        calculator cal=new calculator();
        int sum=cal.add(10,200);
        System.out.println(sum);
        int sub=cal.sub(1500,20);
        System.out.println(sub);
        double div=cal.div(100,0);
        System.out.println(div);
    }
    
}
