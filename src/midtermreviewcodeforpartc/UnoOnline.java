/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;



/**
 * The signIn page for UnoOnline.
 * Takes in a user name and password and then
 * validates the password before creating a new user in the list
 * of possible users. To be used as the beginning code for MidtermReview C.
 * @author dancye, 2019
 */
public class UnoOnline 
{
    private User users[] = new User[10];//room for 100 online players!
     
     
    public static void main(String[] args) 
     {
       UnoOnline newPortal = new UnoOnline();
       newPortal.run();
    }
     
   public void run()
    {
        
}//end class
}