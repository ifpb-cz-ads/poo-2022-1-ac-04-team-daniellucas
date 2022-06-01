class Main {
  public static void main(String[] args) {
    
    int i, num;
    int contador = -1;
    
    for (i=1; i<=100; i++) {
        num= i%3;
      
        if (num == 0){
          System.out.print(" " + i + " ");
          contador++;
          
          if(contador==11){
            System.out.println("\n");
            contador=0;
          }
        }
    }
  }
}