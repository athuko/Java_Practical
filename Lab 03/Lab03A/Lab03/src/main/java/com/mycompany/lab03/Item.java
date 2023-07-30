package com.mycompany.lab03;
public class Item 
{
    private String description;
    private int location;

    Item(int l , String d)
    {
        description = d;
        location = l;
    }
    public void display(){
         System.out.println("location "+l);
         System.out.println("Description "+d)}
    
    public static void main(String[] args) 
    {
        Item it = new Item();
        it.display();
    }
    
}
