package array;

public class AlphaArray {

    public static void main(String[] args) {
        char[][] Alphabet = new char[13][2];
        char ch = 'a';

        for(int i =0; i< Alphabet.length; i++){
            for(int j=0; j<Alphabet[i].length; j++){
                Alphabet[i][j]=ch;
                System.out.println(Alphabet[i][j] + " ");
                ch++;
            }
            System.out.println();
        }


    }
}
