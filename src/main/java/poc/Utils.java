/**
 * 
 */
package poc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ayoub
 */
public class Utils {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i=0; i< 10000000; i++) {
      numbers.add(i);
    }
    System.out.println(Utils.partition(numbers, 1024));
  }

  public static List<List<?>> partition(List<?> list, int num) {
    long startTime = System.currentTimeMillis();
    List<List<?>> splittedList = new ArrayList<List<?>>();
    int i = 0;
    while (i < list.size()) {
      splittedList.add(list.subList(i, Math.min(list.size(), i + num)));
      i += num;
    }
    long spentTime = System.currentTimeMillis() - startTime;
    System.out.println("###################################");
    System.out.println("Temps d'execution: " + spentTime + " ms");
    System.out.println("###################################");
    return splittedList;
  }

}
