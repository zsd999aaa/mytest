class D{
	public static void main(String[] args){
		/*int a=10;
		int b=10;
		int c=10;
		a=b++;//a10 b11
		c=--a;//a9 c9
		b=++a;//a10 b10
		a=c--;//a9 c8
		
		System.out.println(a);
		System.out.println(c);

	*/

		int x=5;

		//     5     7     70 
		int y=(x++)+(++x)+(x*10);
		//     6     6     60 

		System.out.println(y);
	}
}