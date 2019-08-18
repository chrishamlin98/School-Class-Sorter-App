package implementaions;

import operations;

interface DatabaseRead
{
    public void deleteString();
}

class Deletion implements DatabaseDelete
{
    System.out.println(deleteString + " has been deleted from the database");
    
    public static void main(String[]args)
    {
        DatabaseDelete obj = new Deletion();
        obj.deleteString();
    }
}
