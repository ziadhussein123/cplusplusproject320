package taskService;

import java.util.ArrayList;


public class taskService {
   public static ArrayList<task> tasks;
  
      
   public static boolean addTask(task task) {
       boolean alreadyTask = false;

       for (task taskList : tasks) {
           if (taskList.getID().equals(task.getID())) {
               alreadyTask = true;
           }
       }
       if (!alreadyTask) {
           tasks.add(task);
          
       }
       return alreadyTask;
   }
  
   public static boolean deleteTask(task task) {
       for (task taskList : tasks) {
           if (taskList.getID().equals(task.getID())) {
               tasks.remove(task);
               return true;
           }
       }
       return false;
   }
  
   public static boolean updateTask(task task) {
       for (task taskList : tasks) {
           if (taskList.getID().equals(task.getID())) {
               taskList.updateName(task.getName());
               taskList.updateDesc(task.getDesc());
               return true;
           }
       }
       return false;
   }
}