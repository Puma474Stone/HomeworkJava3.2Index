//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = (int) service.calculate(98,1.87);
        System.out.println("Ваш индекс массы тела: " +index);




        }
    }
