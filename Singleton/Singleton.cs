using System;

public class Singleton
{
    private static Singleton instance;

    public static Singleton instance
    {
        get {
            if instance == null {
                instance = new Singleton()
            }
return instance;
        }
    }
}

