public class Sum 
{
 public static void main(String[] args) 
 {
  Sumthenmbr();
 }
public static void Sumthenmbr()
 {
    int[]numbers = new int[100];
    int sum = 0 ;

    for (int i = 0; i < numbers.length ; i++)
    {
     numbers[i] = i+1;
     sum += numbers [i];  
   }    
 
   System.out.println("The sum is"+ sum);
}


}
