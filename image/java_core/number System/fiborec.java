class fiborec {
    
    int fibo(int n){
        if (n == 1 || n == 2) {
            return 1; 
        } 
		else if(n==0)
		{
          return 0;
		}
		else {
             
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        fiborec x = new fiborec();
        int num = 7; 
		
		for (int i=0;i<num ;i++ )
		{
			System.out.println(x.fibo(i));
		}
         
		
    }
}