package mesame;

public class Test1 extends Test{
    int count = 0;
   public void countVowel(String str){
       for (int i = 0 ; i < str.length(); i++){
           if (str.charAt(i) == 'a'||str.charAt(i) == 'A'|| str.charAt(i) == 'e'|| str.charAt(i) == 'E'
                   || str.charAt(i) == 'i'|| str.charAt(i) == 'I'|| str.charAt(i) == 'o'|| str.charAt(i) == 'O'
                   || str.charAt(i) == 'u'|| str.charAt(i) == 'U'){
               count++;
           };

       }
       System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");
    }
}
