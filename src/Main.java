import SecretBox.SHA256Code;

public class Main {
    public static void main(String []args){
        String result = "1234567";
        System.out.println(SHA256Code.getSHA256StrJava(result));
    }
}
