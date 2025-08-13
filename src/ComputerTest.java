
import static org.junit.Assert.*;

import org.junit.Test;

import office.*;

public class ComputerTest {
	

  @Test
  public void test_Computer_implements_BasicComputer() {
      assertTrue("Truck should implement Vehicle interface", BasicComputer.class.isAssignableFrom(Computer.class));
  }

  @Test
  public void test_Computer_implements_OfficeComputer() {
      assertTrue("Truck should implement Car interface", OfficeComputer.class.isAssignableFrom(Computer.class));
  }

}
