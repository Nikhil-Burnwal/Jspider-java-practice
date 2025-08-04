public class EvenChar_String {
    public static void  main(String[] args){
        String[] words = {"Java", "Python", "Code", "AI", "GPT", "Hello", "OpenAI"};
        int count=0;

        for(int i=0; i<words.length; i++){
            if(words[i].length() % 2 == 0){
                 
                System.out.println(words[i]);
                count++;
            } 
              
        }
        System.out.println(count);
    }
}
