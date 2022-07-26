package com.epam.pom;

class SingletonClassExample
{
    // declaring an instance of class SingletonClassExample which is null initially means not initialized.
    private static SingletonClassExample instanceOfSingletonClassExample = null;


    // Declaring constructor as private to restrict object creation outside of class
    private SingletonClassExample()
    {
        System.out.println("Object created.");
    }

    // static method to create instance of class SingletonClassExample
    public static SingletonClassExample getInstanceOfSingletonClassExample()
    {
        if (instanceOfSingletonClassExample == null)
            instanceOfSingletonClassExample = new SingletonClassExample();

        return instanceOfSingletonClassExample;
    }


}

// A normal class where we will try to instantiate class SingletonClassExample
class LetsTryToInstaltiateSingletonClassExample
{
    public static void main(String args[])
    {
        // instantiating Singleton class first time
        SingletonClassExample first= SingletonClassExample.getInstanceOfSingletonClassExample();

        // instantiating Singleton class second time
        SingletonClassExample second= SingletonClassExample.getInstanceOfSingletonClassExample();



    }
}