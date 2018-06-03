package lab4;

public class ExportArray {

    public ExportArray(){//Класс это уществительное ExporterArray

    }

    public void print(int from, int to) {
        IntRandom intRandom = new IntRandom();
        //Зачем передовать параметр в методе, если ты все равно костылишь число?
        int[][] array = /*Что за конструкция богов?))) Ты думаешь JVM на столько тупенькая, что не поймет как вызвать свой метод из класса?*/this.TwoDArray(10);

        /*
        * Что ты такое?!
        * */

        //От сюда удаляем
        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                array[i][j] = intRandom.Random(from, to);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //Вот тут заканчиваем удалять) Чекни пример в инете по созданию двумерного массива


    }

    public int[][] TwoDArray(int line) {
        //Чувак, очень не красиво писать размер массива ручками, как минимум вывести в переменную!
        //Название методов с маленькой буквы! Методы это действия = глагол!
        int[][] array = new int[2][line];
        return array;
    }
}