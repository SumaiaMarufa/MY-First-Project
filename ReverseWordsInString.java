public class  ReverseWordsInString
{
public static void main(String[] args)
 {
 System.out.println(reversWords("the sky is blue"));   
}

static String reversWords(String s)
{
    String[] words = s.split( " +");
    StringBuilder sb = new StringBuilder();
    for(int i = words.length-1;i>=0;i--)
    {
        sb.append(words[i]);
        sb.append(" ");

    }
 return  sb.toString().trim();
}

}