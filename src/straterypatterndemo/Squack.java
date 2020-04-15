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
public class Squack implements IQuackBehavior
{

    @Override
    public String quack() 
    {
        return "hello moi nguoi ! quack quack quack ";
    }
    
}
