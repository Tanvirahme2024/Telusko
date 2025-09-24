class computer
{
    public void playmusic()
    {
        System.out.println("Playing music");

    }
    public String getpen(int cost)
    {
        if(cost>=10)
        return "buy pen";

        return"do not buy pen";
    }

}

public class method {
    public static void main(String[]args)
    {
        computer com=new computer();
        com.playmusic();

        String s=com.getpen(10);
        System.out.println(s);
    }
    
}
