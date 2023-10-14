 class CloneArr {
public static void main(String... args){

 int a[]={1,2,3,4};
 for(int i=0;i<a.length;i++) {
 System.out.println(a[i]);  }
 
 //cloning of 1D array
 int ac[]=a.clone();
 for(int x:ac){
 System.out.println("elements of clone array "+x); }
 System.out.println(a==ac);  // false because it cheks its reference
 // when cloning 1D its creates deep copy ,, that mean it copies its actual value
 // while for multidimesion , it creates shallow copy that means it copies only reference
 // hence == checks reference , it returns false...
System.out.println();
System.out.println();
System.out.println();
 }}
 
 
class CloneArr1  {
	public static void main(String... args) {
	System.out.println("Elements of original array ");	
	int b[][]={{2,3,4},{4,5,6}};
	for(int i=0;i<2;i++) {
		  for(int j=0;j<2;j++) {
		  System.out.print(b[i][j]); }
	System.out.println();  }
//Performing cloning for 2D
	
	int bc[][]=b.clone();
	
	System.out.println("Elemts of clone array");
	
	for(int k=0;k<2;k++) {
		  for(int l=0;l<2;l++) {
		  System.out.print(bc[k][l]); }
	System.out.println();  }
	
	System.out.println(b==bc);
}}
