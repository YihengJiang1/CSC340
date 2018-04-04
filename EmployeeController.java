package Manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yiheng JIang
 */

public class EmployeeController{
   private final EmployeeModel model;
   private final EmployeeView view;
   public  EmployeeController(EmployeeModel model,EmployeeView view){
       this.model=model;
       this.view=view;
   }
  
    public String getCustomerusername() 
    {
        return model.getCustomerusername();
    }

    public void setCustomerusername(String name) 
    {
        model.setCustomerusername(name);
    }
    public void setID(int ID){
           model.setID(ID);
}    
    public int getID(){
      return model.getID();		
   }   
    public void setStreet(String street) 
    {
         model.setStreet(street);
    }
    public String getStreet()
    {
        return  model.street;
    }
    public void setTown(String town) 
    {
        model.setTown(town);
    }
    public String getTown() 
    {
         return  model.getTown();
    }
     public void setPostcode(String postcode) 
    {
          model.setPostcode(postcode);
    }
      public String getPostcode() 
    {
        return model.postcode;
    }

 
      public String getUsername()
    {
        return model.username;
    }
    public void setUsername(String username)
    {
        
          model.setUsername(username);
    }
    
    public String getPassword()
    {
        return model.password;
    }
    public void setPassword (String password)
    {
       model.setPassword(password);
    }

   

   public void updateView(){				
      view.printCustomerinformation(model.getCustomerusername(), model.getID(),model.getTown(),model.getStreet(),model.getPassword(),model.getPostcode(),model.getUsername());
   }	
}
