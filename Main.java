class Main
{
  public static void main(String[] args) 
  {

    int n = 48;
    String s;
    switch (n)
    {

      case 29:
        s = "Small";
        break;

      case 42:
   	    s = "Medium";
        break;
        
      case 44:
        s = "Large";
        break;

      case 48:
        s = "Extra Large";
        break;
      
      default:
        s = "Unknown";
        break;

    }
    System.out.println("Size: " + s);
  }
}