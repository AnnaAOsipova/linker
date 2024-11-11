import main.java.IBox;
import org.junit.jupiter.api.BeforeAll;

import javax.swing.*;

public abstract class AbstractTest {

   private IBox box;

   @BeforeAll
   static void setUp() {
      IBox box = new Box(); // Создаём коробку перед всеми тестами
  }
}

