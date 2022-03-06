public class Reverse_letter {  
    public static void main(String[] args) {  
        System.out.println(StringFormatter.reverseWord("my name is jaggu"));  
        System.out.println(StringFormatter.reverseWord("learning java"));    
        }  
    }  

 class StringFormatter{  
        public static String reverseWord(String str){  
            String words[]=str.split("\\s");  
            String reverseWord="";  
            for(String w:words){  
                StringBuilder sb=new StringBuilder(w);  
                sb.reverse();  
                reverseWord+=sb.toString()+" ";  
            }  
            return reverseWord.trim();  
        }  
        }  