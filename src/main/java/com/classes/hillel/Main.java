package main.java.com.classes.hillel;



public class Main {
    public static void main(String[] args) {


         String [] alphabet = {"a", "b", "c", "d", "e","f" ,"g", "h", "i" ,"j" ,"k", "l" ,"m" ,"n" ,"o", "p" ,"q" ,"r" ,"s", "t", "u" ,"v" ,"w", "x" ,"y" ,"z"};


         String encryptedWord = encrypt("Hello", alphabet, 3);
         String encryptedWord2 = encrypt(" world", alphabet, 3);

        System.out.println(encryptedWord +" "+  encryptedWord2);

    }
    private static String encrypt(String word, String[] alphabet,int shift ){

        String encrypted = "";
        for ( int i = 0; i< word.length(); i++ ){
        int index =  findIndex(alphabet, word.charAt(i));

        if (index+shift > alphabet.length-1){
            int innerIndex =  (index+shift) - alphabet.length;
            index = innerIndex-1;
        }
         encrypted=encrypted.concat(alphabet[index+shift]);
        }
        return encrypted;
    }


    private  static int findIndex(String[] alphabet, char letter){

        int index=0;

        for (int i = 0; i < alphabet.length; i++){
            String ch = alphabet[i];
            if(ch.equals(String.valueOf(letter))){
                return i;
            }
        }
        return index;
    }
}
