package com.company;

public class Main {

    public static void main(String[] args) {

        Integer[] array1 =  {18, 43, 100, 4, 24, 6, 63};

        ListGen list = new ListGen(array1);
        System.out.println("Cреднее арифметическое значение элементов списка = " + HoumW19.task1(list));

        String[] array2 =  {"понедельник", "вторник", "среда", "четверг", "пятница"};

        ListGen list2 = new ListGen(array2);

        HoumW19.task2(list2);

        String[] array3 =  {"Африка", "Австралия", "Евразия", "Антарктида", "Америка"};

        ListGen list3 = new ListGen(array3);

        System.out.println("Количество слов в списке, которые начинаются и заканчиваются на одну букву = " + HoumW19.task5(list3));

       // String[] array4 =  {"Африка", "Австралия", "Ягуар", "Россия", "яблоко" };
        String[] array5 =  {"Африка", "", "Ягуар","Австралия", "Россия", "яблоко"};

        ListGen list4 = new ListGen(array5);
        HoumW19.task6(list4);

        String[] array6 =  {"Африка", "Африка", "","Ягуар","Австралия","яблоко", "Африка", "Россия", "яблоко"};

        ListGen list5 = new ListGen(array6);
        HoumW19.task7(list5);


    }

}
