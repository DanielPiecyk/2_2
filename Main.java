import java.util.Scanner;
class Main {
  
  public static void main(String[] args) 
  {
    int dlugosc,M=0,D=0 ;
    System.out.println("Podaj tekst");
    Scanner sc = new Scanner(System.in);
    String tekst = sc.nextLine();
    dlugosc = tekst.length();
    //char[] zdanie = new char[dlugosc];
    char[] zdanie = tekst.toCharArray();
    //for (int i = 0; i < dlugosc ; i++) 
   // {
    //  zdanie[i] = new Character(tekst.charAt(i));
   // }
   for (int i = 0; i < dlugosc ; i++)
     {
    if (Character.isUpperCase(zdanie[i])) 
    {
      zdanie[i] = Character.toLowerCase(zdanie[i]);
      M++;
    }  
    else 
    {
    zdanie[i] = Character.toUpperCase(zdanie[i]);
    D++;
    }
    }
    System.out.println("wynik ;");
   for (int i = 0; i < dlugosc ; i++)
     {
       System.out.print(zdanie[i]);
     }
System.out.println("\n Liczba zmian z dużej na małą "+M+"\n Liczba zmian z małej na dużą "+ D);
    sc.close();
    
  }
}