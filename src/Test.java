// Java program to demonstrate functional interface
 
class Test
{
    public static void main(String args[])
    {
      /*  // create anonymous inner class object
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        
        // lambda expression to create the object
        new Thread(()->
           {System.out.println("New thread created");}).start();*/
        
        Square s = (int x)->x*x;
        
        int a = 5;
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}