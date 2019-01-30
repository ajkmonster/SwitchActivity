
import java.util.Scanner;

public class SwitchActivity {
    public static void main(String[] args){
        String key;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the product code (ALL CAPS): ");
        key = input.next();
        switch(key){
            case "BALL":
                System.out.println("Product: Golf Balls (1 dozen), Price: $38.00");
                break;
            case "DRV01":
                System.out.println("Product: Big Bertha Driver, Price: $449.95");
                break;
            case "DRV02":
                System.out.println("Product: Vaporizer Driver, Price: $375.00");
                break;
            case "DRV03":
                System.out.println("Product: Fly-Z Driver, Price: $179.00");
                break;
            case "SET01":
                System.out.println("Product: Project Manager Gold Club Set" +
                       "\n"+ "Price: $179.00");
                break;
            case "SET02":
                System.out.println("Product: Junior VP Golf Club Set"+ "\n" + "Price: $225.00");
                break;
            case "SET03":
                System.out.println("Product: Executive Golf Club Set"+ "\n" + "Price: $299.95");
                break;
            case "SET04":
                System.out.println("Product: CEO Golf Club Set" + "\n" + "Price: $374.95");
                break;
            case "SET05":
                System.out.println("Product: Chairman of the Board Club" +"\n"+ "Price: $495.00");
                break;
        }
    }
}
