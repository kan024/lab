import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;


public class ListExamplesTests {
	@Test(timeout = 500)
	public void testMerge1() {
    		List<String> l1 = new ArrayList<String>(Arrays.asList("x", "y"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("a", "b"));
		assertArrayEquals(new String[]{ "a", "b", "x", "y"}, ListExamples.merge(l1, l2).toArray());
	}
	
	@Test(timeout = 500)
        public void capitalTest() {
		List<String> l1 = new ArrayList<String>(Arrays.asList("A", "b"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("C", "d"));
		assertArrayEquals(new String[]{ "A", "C" }, ListExamples.capital(l1, l2).toArray());
        }

}
