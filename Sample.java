import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long mobile = s.nextLong();
        System.out.println("Mobile number: " + mobile);

        s.nextLine(); // 🔹 consume leftover newline

        String pincode = s.nextLine();
        System.out.println("Pincode: " + pincode);

        if (pincode.equals("p1")) {
            System.out.println("Recharge Amount: 190");
        } 
        else if (pincode.equals("p2")) {
            System.out.println("Recharge Amount: 399");
        } 
        else if (pincode.equals("p3")) {
            System.out.println("Recharge Amount: 500");
        } 
        else {
            System.out.println("Invalid Pin");
        }

        s.close();
    }
}
