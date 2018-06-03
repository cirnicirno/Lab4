package lab4;

public class RandomNumbers {

    public void RandomNumbers() {
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
        exportArray.print(from, to);



    }
}
