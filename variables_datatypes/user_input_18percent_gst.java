package variables_datatypes;
import java.util.*;

public class user_input_18percent_gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();            //pencil cost
        float pen = sc.nextFloat();              //pen cost
        float eraser = sc.nextFloat();          //eraser cost
        float sum = pencil + pen + eraser;     //total cost = sum
        float bill = sum + (sum * 18 / 100);  // bill = total cost (sum) + 18% gst of that cost (sum)
        System.out.println(bill);
    }
}
