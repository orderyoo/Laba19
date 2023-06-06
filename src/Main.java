public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.a;
        calculator.setCalculator(5, 43);
        calculator.calculateFunction();
      
    }
}
enum Calculator{
  a;
    private int x, y;
    public void setCalculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void calculateFunction(){
        double rez = 2*x+3/y;
        System.out.println(rez);
    }
}