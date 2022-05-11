package com.company;

public class HoumW19 <E> {
    //1.Найти среднее арифметическое значение элементов списка.
    public static double task1(ListGen list){
        ListIterator lstI = new ListIterator(list);
        lstI.getList().printList();
        Integer sum = 0;
        while (lstI.hasNext()) {
            sum += (Integer) lstI.next().getValue();
        }
        return (double) sum/ lstI.getCounter();
    }


    //2. Перенести в начало списка его последний элемент.
    public static void task2(ListGen list){
        ListIterator lstI = new ListIterator(list);
        lstI.getList().printList();
        NodeGen tmp = null;;
        while (lstI.hasNext()) {
            tmp = lstI.next();
        }
        lstI.getList().pop();
        lstI.getList().push(tmp.getValue(),0);
        lstI.getList().printList();
    }
//5. Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.

    public static int task5(ListGen list) {
        ListIterator lstI = new ListIterator(list);
        lstI.getList().printList();
        NodeGen tmp = null;
        int couter = 0;
        while (lstI.hasNext()) {
            tmp = lstI.next();
            if (!tmp.getValue().equals("")) {
                if (isChar(tmp, tmp))  {
                    couter ++;
                }
            }

        }
        return couter;
    }
    private static boolean isChar(NodeGen <String>sp1, NodeGen <String> sp2) {
        return sp1.getValue().toLowerCase().charAt(sp1.getValue().length()-1) == sp2.getValue().toLowerCase().charAt(0);
    }

    //6. Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего
    public static void task6(ListGen list) {
        ListIterator lstI = new ListIterator(list);
        lstI.getList().printList();
        NodeGen tmp = lstI.next();
        boolean f = true;
        while (lstI.hasNext()) {
            NodeGen tmp1 = lstI.next();
            if ((tmp.getValue().equals("")) || (tmp1.getValue().equals(""))) {
                f = false;
                break;
            } else {
                if (!isChar(tmp, tmp1)) {
                    f = false;
                    break;
                }
            }
            tmp = tmp1;
        }
        if (f) {
            System.out.println("Да! Cледующее слово в списке начинается с последней буквы предыдущего!");
        } else {
            System.out.println("Нет! Cледующее слово в списке не начинается с последней буквы предыдущего!");
        }
    }
// 7.Определить количество слов в списке, которые совпадают с первым (последним) словом списка

    public static void task7(ListGen list) {
        ListIterator lstI = new ListIterator(list);
        lstI.getList().printList();
        NodeGen tmp = lstI.next();
        int counterF = 0;
        String fist = (String) tmp.getValue();
        while (lstI.hasNext()) {
            NodeGen tmp1 = lstI.next();
            if (isWord(fist, tmp1)) {
                counterF++;
            }
            tmp = tmp1;
        }
        System.out.println("Первое слово " + fist + " встречается " + counterF + " раз(а)");

        String last = (String) tmp.getValue();
        int counterL = 0;
        lstI = new ListIterator(list);
        while (lstI.hasNext()) {
            if (isWord(last, lstI.next())){
                counterL++;
            }
        }
        counterL--;
        System.out.println("Последнее слово " + last + " встречается " + counterL + " раз(а)");
    }

    private static boolean isWord(String sp1, NodeGen sp2){
        return sp1.equals(sp2.getValue());
    }




}
