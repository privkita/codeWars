package stage6kyu;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToCamelCaseTest {

	@Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }

}
