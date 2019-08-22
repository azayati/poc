package poc;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ayoub
 *
 */
public class TestUtils {

  @org.junit.Test
  public void testPartition() {
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i=0; i< 100000; i++) {
      numbers.add(i);
    }
    assertEquals(302, Utils.partition(numbers, 3).get(100).get(2));
    assertEquals(33334, Utils.partition(numbers, 3).size());
  }
}
