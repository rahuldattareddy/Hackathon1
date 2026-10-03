public class CalculateTotalWaste{
    static double calculateTotalWaste(double point1Waste, double point2Waste){
        double totalWaste = point1Waste + point2Waste;
        return totalWaste;
    }
  public static void main(String[] args) {
     double totalWaste = calculateTotalWaste(2000, 3888);
     System.out.println("Total water consumption: " + totalWaste + " Litres");
    }
}
