
import static org.junit.Assert.*;

import org.junit.Test;

import vehicles.*;

public class TruckTest {
	

  @Test
  public void testTruckImplementsVehicle() {
      assertTrue("Truck should implement Vehicle interface", Vehicle.class.isAssignableFrom(Truck.class));
  }

  @Test
  public void testTruckImplementsCar() {
      assertTrue("Truck should implement Car interface", Car.class.isAssignableFrom(Truck.class));
  }

  @Test
  public void testTruckImplementsEngine() {
      assertTrue("Truck should implement Engine interface", Engine.class.isAssignableFrom(Truck.class));
  }
}
