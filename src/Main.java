import javax.xml.transform.Result;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        characteristics pet = new characteristics(20, 20, 20, 20);

        pet.PrintMenu();
        while (pet.isLife()) {
            pet.SwitchMenu(characteristics.inputInt("выберете пункт меню:", 0, 4));
            pet.printlCharacteristic();
        }
    }



}