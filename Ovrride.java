/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package over;

/**
 *
 * @author shrimeenatchi
 */
public class override {
    public static void main(String[] args) {
        Bond a[]=new Bond[6];
        a[0]=new Bond();
        a[1]=new ConvertibleBond();
        a[2]=new Bond();
        a[3]=new ConvertibleBond();
        a[4]=new Bond();
        a[5]=new ConvertibleBond();
    for (int i=0;i<6;i++)
    {
        a[i].show();
    }
    }
}

class Bond
{
    void show()
    {
        System.out.println("Bond");
    }
}
class ConvertibleBond extends Bond
{
    void show()
    {
        System.out.println("ConvertibleBond");
    }   
}