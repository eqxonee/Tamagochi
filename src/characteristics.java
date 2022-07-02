import java.util.Scanner;
import java.util.stream.Collector;

public class characteristics {

        private int health;
        private int gigiena;
        private int sitost;
        private int son;


        private boolean isLife = true;

        public boolean isLife(){
            return true;
        }

        public characteristics(int health, int gigiena, int sitost, int son) {
            this.health = health;
            this.gigiena = gigiena;
            this.sitost = sitost;
            this.son = son;
            this.isLife = true;
        }



    public void PrintMenu(){
        System.out.println("Добро пожаловать в игру тамагочи!");


        System.out.println("1. Уложить спать тамагочи + 10");
        System.out.println("2. Помыть тамагочи + 5");
        System.out.println("3. Накормить тамагочи + 15");
        System.out.println("4. Отправить на лечебные процедуры + 15");


    }

    static int inputInt(String message, int min, int max) {
        boolean isValidInput;
        int output = 0;
        do {
            try {
                isValidInput = true;
                Scanner scanner = new Scanner(System.in);

                System.out.print(message);
                output = scanner.nextInt();

                if (output < min || output > max) {
                    System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                    throw new Exception();
                }

            } catch (Exception e) {
                isValidInput = false;
                System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
            }

        } while (isValidInput == false);

        return output;
    }


    int food = 15;
    int wash = 5;
    int medicine = 15;
    int ToSleep = 10;
    int zdor = 100;

    public void SwitchMenu(int a){




            switch (a) {
                case 1: {
                    if (son < 0) {
                        System.out.println("Недоспал твой котик");
                        isLife = false;
                    } else if (son + ToSleep > 100) {
                        System.out.println("Переспал твой котик");
                        isLife = false;
                    } else {
                        son += ToSleep;
                        health = health + 5;
                    }

                }
                break;


                case 2: {
                    if (gigiena < 0) {
                        System.out.println("Ваш котик подхватил ковид");
                        isLife = false;
                    } else if (gigiena > 100) {
                        System.out.println("Ваш кот утонул нахрен");
                        isLife = false;
                    } else {
                        gigiena = gigiena + wash;
                        health = health + 10;

                        break;
                    }
                }


                case 3: {
                    if (sitost < 0) {
                        System.out.println("Нужно было больше кормить, ваш кот умер");
                        isLife = false;
                    } else if (sitost > 100) {
                        System.out.println("Ваш кот лопнул");
                        isLife = false;
                    } else {
                        sitost = sitost + food;
                        health = health + 10;

                    }
                    break;
                }

                case 4: {

                    health = health + 50;
                    System.out.println("Наконец-то водные процедуры! Ваш кiт вам очень благодарен, + 50 к общему здоровью");
                }

                break;
            }




    }

    public void printlCharacteristic () {
        System.out.println("Шкала здоровья питомца - " + health);
    }



}
