import java.util.ArrayList;
import java.util.List;
 public class Program {

     public static void main(String[] args) {
         // объявление коллекции
         List<Integer> my_int = new ArrayList<>();
         // добавление элементов в коллекцию
         my_int.add(1);
         my_int.add(10);
         my_int.add(25);
         my_int.add(17);
         my_int.add(10);

         // результат: коллекция {1,10,25,17,10}
         // определение количества элементов коллекции
         int size = my_int.size();// результат: 5
         System.out.println("Количество элементов: " + size);

         // определение индекса элемента коллекции
         int ind = my_int.indexOf(25);
         System.out.println("Индекс элемента 25: " + ind);
         // результат: 2

         // удаление из коллекции
         // первого вхождения элемента
         my_int.remove((Integer) 10);
         System.out.println("После удаления 10: " + my_int);
         // результат: коллекция {1,25,17,10}

         // удаление из коллекции элемента
         // с указанным индексом
         my_int.remove(2);
         System.out.println("После удаления элемента с индексом 2: " + my_int);
         // результат: коллекция {1,25,10}


         // проверка коллекции на наличие элемента
         boolean cont = my_int.contains(25);
         System.out.println("Содержит ли коллекция 25? " + cont);
         // результат: True


         // вставка элемента по указанному
         // индексу(сдвиг вправо)
         my_int.add(0, 5000);
         System.out.println("После вставки 5000: " + my_int);

         // результат: коллекция {5000,1,25,10}
         // сортировка коллекции
         my_int.sort(null);
         // результат: коллекция  {1,10,25,5000}
         System.out.println("Отсортированная коллекция: " + my_int);
     }
 }
