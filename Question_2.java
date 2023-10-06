package Chapter_2_Practice_set_2.Chapter_2_Practice_set_2;

public class Question_2 {
    public static void main(String[] args) {
        char grade = 'd';
        //encrypt
        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypt
        grade =(char) (grade - 8);
        System.out.println(grade);
    }
}
