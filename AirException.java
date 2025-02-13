public class AirException {
    public static void main(String[] args) {
        int i = 5;
        except(i);
    }
    private static void except(int num){
        try{
            int div = num / 0;
        }catch(ArithmeticException e){
            System.out.println("Division" + e.getMessage());
        }
    }
}
