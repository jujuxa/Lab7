import lsp.Bird;
import lsp.Penguin;
import lsp.Sparrow;
import ocp.DiscountCalculator;
import srp.ReportManager;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------- S ----------
        List<Integer> data = Arrays.asList(5,10,15,20);
        ReportManager manager = new ReportManager(data,new srp.ConsoleOutput(), new srp.FileSaver());
        manager.generateReport();

        // ---------- O ----------
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular: " + calculator.calculateDiscount("regular", 1000));
        System.out.println("VIP: " + calculator.calculateDiscount("vip", 1000));
        System.out.println("Super VIP: " + calculator.calculateDiscount("super_vip", 1000));

        // ---------- L ----------
        displayBird(new Sparrow());
        displayBird(new Penguin());     // Здесь будет исключение
    }

    public static void displayBird(Bird bird) {
        bird.eat();
        bird.fly();
    }
}