class Main {
  public static void main(String[] args) {
    System.out.println("Stopnie Celcjusza     Stopnie Fahrenheita");
		int i,k;
		for (i=0; i<301; i=i+20)
		{
			k = i*5/9+32;
			System.out.print(i + "        -   " + k +"\n" );
		}
  }
}