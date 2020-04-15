/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypatterndemo;


public class MallareDuck extends Duck
{
    
    public MallareDuck()
    {
        
    }

    @Override
    public String Display() 
    {
         return "xin chao em la vit co xanh ne" + "\n"+
                 performQuack()+"\n"+
                 performFly();
    }
    
}
