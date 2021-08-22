package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;
import taskService.*;


import org.junit.jupiter.api.Test;

class taskServiceTest {

   @Test
   void testAdd() {
       task test1 = new task("123", "clean", "clean stuff and that");  
       assertEquals(false, taskService.addTask(test1));
       }
  
   @Test
   void noDoubleIDTest() {      
       task test1 = new task("123", "clean", "clean stuff and that");
       taskService.addTask(test1);
       task test2 = new task("123", "cook", "cook ya nosh");
       assertEquals(false, taskService.addTask(test2));
   }
  
   @Test
   void deleteTest() {      
       task test1 = new task("123", "clean", "clean stuff and that");
       taskService.addTask(test1);
       assertEquals(true, taskService.deleteTask(test1));
   }
  
   @Test
   void updateTest() {      
       task test1 = new task("123", "clean", "clean stuff and that");
       taskService.addTask(test1);
       task test2 = new task("123", "cook", "cook ya nosh");
       taskService.updateTask(test2);
   }

  

  

}