import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {
   private StudentGroup group;
   private Sex male;
   private Sex female;

   @Before
   public void onStart(){
       male = new Sex("male");
       female = new Sex("female");

       group = new StudentGroup(new ArrayList<User>(Arrays.asList(
               new User(1, "Ivan1", 19, male),
               new User(2, "Ivan2", 29, male),
               new User(3, "Ivan3", 49, male),
               new User(4, "Ivan4", 9, male),
               new User(5, "Ivan5", 12, male),
               new User(6, "Ivan6", 32, female),
               new User(7, "Ivan7", 25, female),
               new User(8, "Ivan8", 29, female),
               new User(9, "Ivan9", 3, female)
       )));
   }

   @Test
   public void checkUsers(){
      var expected = new StudentGroup(new ArrayList<User>(Arrays.asList(
              new User(1, "Petr", 19, female),
              new User(2, "Ivan2", 29, male),
              new User(3, "Ivan3", 49, male),
              new User(4, "Ivan4", 9, male),
              new User(5, "Ivan5", 12, male),
              new User(6, "Ivan6", 32, female),
              new User(7, "Ivan7", 25, female),
              new User(8, "Ivan8", 29, female),
              new User(9, "Ivan9", 3, female)
      )));

       for (var userActual: group.getAll()) {
           for (var userExpected: expected.getAll()) {
               Assert.assertEquals(userActual.getName(), userExpected.getName());
           }
       }
   }

   @Test
   public void getAllCheck(){
       Assert.assertNotNull(group.getAll());
   }

   @Test
    public void checkEqualsBySex(){
       long malesCount = group.getAmountBySex(male);
       long femalesCount = group.getAmountBySex(female);

       Assert.assertEquals(malesCount, femalesCount);
   }



}
