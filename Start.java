public class Start
 {
 public static void main(String[] args) {
     System.out.println("Hello World");
    printtcharacter();
    }
    public static void printtcharacter()
    {
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println(ch +" ");
        }
     for (char ch ='a'; ch <='z' ; ch++) 
     {
      System.out.println(ch+" ");    
     }
    System.out.println();
    }

}