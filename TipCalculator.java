public class TipCalculator {
    private double total;
    private int tip_percentage;
    private int people;

    public TipCalculator(double total, int tip_percentage, int people)
    {
        this.total = total;
        this.tip_percentage = tip_percentage;
        this.people = people;
    }


    public double getTotal() {
        return total;
    }


    public int getPercentage() {

        return tip_percentage;
    }

    public int getPeople() {
        return people;
    }

    public double bill_perPerson() {
        return total / people;
    }

    public double tip_perPerson() {
        return total * (tip_percentage / 100.0) / people;
    }

    public String toString() {
        String str = "------------------------------------------------" + "\n"
        + "|     Note! Do not Forget to pay the bill!     |" + "\n" +
        "------------------------------------------------";
        str += "\n" + "| Total Bill: $" + total + "|" + "\n";
        str += "-----------------------------" + "\n" + "| Tip Percentage: " + tip_percentage + "|" + "\n";
        str += "-----------------------------" + "\n" + "| Number of People: " + people + "|" + "\n";
        str += "-----------------------------" + "\n" + "| Bill per person: " + bill_perPerson() + "|" + "\n";
        str += "-----------------------------" + "\n" + "| Tip per person: " + tip_perPerson() + "|" + "\n";
        return str;
         }
}
