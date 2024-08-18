public class Sumethod
{
public static void main(String[] args) 
{
 int sum = calculateSum();
 System.out.println("The sum of numbers form 1 to 10 is "+ sum);

}

public static int calculateSum()
{
    int[] numbers = new int[10];
    for(int i =0 ; i<10; i++)
    {
        numbers[i] = i+1;
    }
    int sum =0;

    for (int i = 0; i < numbers.length; i++) 
    {
     sum += numbers[i];    
    }
 return sum;
}
}
