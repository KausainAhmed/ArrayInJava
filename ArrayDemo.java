public class ArrayDemo{
  public static void main(String... args){
  
  int a[]=new int[4];
  
  a[0]=2;
  a[1]=3;
  a[2]=4;
  a[3]=5;
  
  System.out.println("elements of array are :"+ a[0]+" "+a[1]+" "
  +a[2]+" "+a[3]+"   using print()");
  
  for(int i=0;i<a.length;i++){
  System.out.println("Elements of array using for loop  "+a[i]); }
  
  for(int x:a){
  System.out.println("Using for each loop "+x);}
  }
  
}
