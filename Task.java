package taskService;

public class task {

   private String ID;
   private String name;
   private String desc;
  
   public task(String id, String name, String desc) {
       if (id.length() > 10 || id == null) { //checks the ID length
           throw new IllegalArgumentException("Invalid Id"); //error message if it's invalid
       }
       if (name.length() > 20 || name == null) { //checks the name length
           throw new IllegalArgumentException("Invalid name"); //error message if it's invalid
       }
       if (desc.length() > 50 || desc == null) { //checks the description length
           throw new IllegalArgumentException("Invalid description");//error message if it's invalid
       }
      //this functions to set those variables
       this.ID = id;
       this.name = name;
       this.desc = desc;
   }


   public String getName() {//function to  retrieve the current name
       return name;
   }
   
   public String getID() {//function to  retrieve the current ID
       return ID;
   }

 

   public void updateName(String name) { //function to set the name to the new name
       this.name = name;
   }

   public void updateDesc(String desc) { //function to set the description to the new description
       this.desc = desc;
   }
   public String getDesc() { //function to  retrieve the current description
       return desc;
   }
}

