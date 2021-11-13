/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesoon7;

/**
 *
 * @author 98tae
 */
public class demoMult {

   
    public static void main(String[] args) {
        String [] s = {"1","2","3",null,"5"};
        for (int i = 0; i < 6; i++) {
            try {
                 int t = Integer.parseInt(s[i]);
            System.out.println(t);  
            } catch (NumberFormatException e) {
                System.out.println("11-----------");
                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("1________________");
                e.printStackTrace();
            }finally{
                System.out.println("+++++++++++++++++++++");
            
            }
            
          
            
            
            
            
        }
        
        
    }
    
}
