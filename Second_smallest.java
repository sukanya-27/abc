package ex1;
//This is a second Smallest number project
public class Second_smallest {
	public static void main(String[] args) {
		int []a={10,2,5,6,8,3,5,1};
		for(int i=0;i<=a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
				}
			}
		System.out.println("Second largest Element: "+a[1]);

	}



}
