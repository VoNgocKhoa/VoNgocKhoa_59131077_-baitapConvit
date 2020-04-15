/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypatterndemo;

/**
 *
 * @author long
 */
public class VitGioi extends  Duck
{

    @Override
    public String Display() 
    {
         return "xin chao em la vit gioi" + "\n0" +
                 performQuack()+"\n"+
                 performFly();
    }
      
}
