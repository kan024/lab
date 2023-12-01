import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;


public class ListExamplesTests {
	@Test(timeout = 500)
	public void testMerge1() {
    		List<String> l1 = new ArrayList<String>(Arrays.asList("X"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("a"));
		assertArrayEquals(new String[]{ "X"}, ListExamples.capital(l1, l2).toArray());
	}
	
	@Test(timeout = 500)
        public void capitalTest() {
		List<String> l1 = new ArrayList<String>(Arrays.asList("A", "b"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("C", "d"));
		assertArrayEquals(new String[]{ "A", "C" }, ListExamples.capital(l1, l2).toArray());
        }

}
