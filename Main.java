//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TipCalculator t = new TipCalculator(23.45, 30, 3);
        System.out.println(t.getPercentage());
        System.out.println(t.getPeople());
        System.out.println(t.getTotal());
        System.out.println(t.toString());
    }
}