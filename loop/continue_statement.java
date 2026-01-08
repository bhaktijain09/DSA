package loop;

public class continue_statement {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
        if(i==3){
        continue;    //skips 3 and continues the range from 0 to 5
        }
        System.out.println(i);
        }
    }
}
