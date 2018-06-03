package lab4;

public class RandomNumbers {

    //Где конструктор?

    public void RandomNumbers() {//Методы называются с маленькой буквы!
        int from;
        int to;
        NumberScanner scanner = new NumberScanner();
        while(true) {
            System.out.print("Введите первое целое число: ");
            if (scanner.isIntNumber()) {
                System.out.print("Введите второе целое число: ");
                from = scanner.getNumber();
                if (scanner.isIntNumber() && scanner.getNumber() >= from) {
                    to = scanner.getNumber();
                    break;
                }
            }

            System.out.println("Что-то пошло не так, повторите ввод!");
        }
        ExportArray exportArray = new ExportArray();
        //Метод принт = создание + печать, по моему это не правильно, не думаешь?
        exportArray.print(from, to);



    }
}
