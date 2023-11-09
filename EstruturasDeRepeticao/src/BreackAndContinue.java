import java.sql.SQLOutput;

public class BreackAndContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i == 3){
                System.out.println(i);
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }



    }
}
