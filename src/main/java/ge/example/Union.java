package ge.example;

public class Union implements Interface1, Interface2{

  public void replaceSymbolA(String name){
    System.out.println(name.replace('a', 'z'));
  }

  public void replaceSymbolB(String lastname){
    System.out.println(lastname.replace('b','w'));
  }

}
