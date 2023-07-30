public class Item
{
    private String description ;
    private int location ;

        public Item(String description , int location)
        {
            this.description = description ;
            this.location = location ;

    public void display()
    {
        System.out.println("Description: "+description);
        System.out.println("The location is: "+location);
    }


}
