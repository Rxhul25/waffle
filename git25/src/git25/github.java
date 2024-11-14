package git25;

public class github {
  import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class git {

	
	void test() {
		git1 g=new git1();
		int[] arr= {1,2,3,4,5};
		Assertions.assertEquals(10, g.si(20, 40, 4));
		Assertions.assertEquals(20, g.discount(30));
		Assertions.assertEquals(10, g.arrs(arr));
	}

}


}
