package Exercise1_4;

public class Question_4 {
    public static void main (String[] args) {
        int com = 1;
        for (int i = 1; i<=200; i++) {
            com*=Math.pow(i,2);
        }
        System.out.println(com);

    }
}
