import java.io.*;

class custfiletest {
    public static void main(String args[]) {
        float p1 = 0;
        float p2 = 0;
        float millcloth = 0;
        float Handloom = 0;
        // netvalue;
        int ch;
        try {
            do {
                
                millcloth = 0;
                Handloom = 0;
                System.out.println("\n========================================");
                System.out.println(" MENU ");
                System.out.println("========================================");
                System.out.println("1.Enter value of mill item");
                System.out.println("2.Enter value of Handloom item");
                System.out.println("3.Net value of item for customer");
                System.out.println("4.Exit");
                System.out.println("========================================");
                System.out.print("Enter your choice:");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                // DataInputStream in=new DataInputStream(System.in);
                // ch= DataInputStream.readInt();
                ch = Integer.parseInt(in.readLine());
                switch (ch) {
                    case 1:
                        System.out.println("Enter Purchase value of mill item:");
                        // p1=Double.parseDouble(in.readLine());
                        p1 = Float.parseFloat(in.readLine());
                        if (p1 <= 250)
                            millcloth = millcloth + p1 * 0.0f;
                        else if (p1 <= 500)
                            millcloth = millcloth + p1 * 0.050f;
                        else if (p1 <= 750)
                            millcloth = millcloth + p1 * 0.075f;
                        else
                            millcloth = millcloth + p1 * 0.10f;
                        System.out.println("\n The purchase value for mill item of the customer is " + p1
                                + " and discount amount is " + millcloth + "\n");
                        break;
                    case 2:
                        System.out.println("Enter Purchase value of Handloom item:");
                        // p2=Double.parseDouble(in.readLine());p2=Float.parseFloat(in.readLine());
                        if (p2 <= 250)
                            Handloom = Handloom + p2 * 0.05f;
                        else if (p2 <= 500)
                            Handloom = Handloom + p2 * 0.075f;
                        else if (p2 <= 750)
                            Handloom = Handloom + p2 * 0.10f;
                        else
                            Handloom = Handloom + p2 * 0.15f;
                        System.out.println("\n The purchase amount for Handloom item of the ");
                        System.out.println("customer is " + p2 + " & discountamount is " + Handloom + "\n");
                        break;
                    case 3:
                        Float Totalvalue = (Float) (p1 + p2);
                        Float TD = Float.sum(millcloth, Handloom);
                        double a4 = (double) (Totalvalue - TD);
                        System.out.println("\n Total Item Purchase value of ");
                        System.out.println("the customer is " + Totalvalue + " discount is 1" + TD + "\n");
                        System.out.println("Net amount paid by the customer is " + a4 + "\n");
                        in.close();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice! Try again");
                        break;
                }
            } while (ch != 3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
