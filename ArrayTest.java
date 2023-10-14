class ArrayTest{
public static void main(String... args){
   int a[]={2,3,4,5,6};
   
 for(int i=0;i<a.length;i++){
	 if(a[i]==3 && a[i+1]==4){
	 a[1]=0;  }
System.out.println(a[i]);
}}}