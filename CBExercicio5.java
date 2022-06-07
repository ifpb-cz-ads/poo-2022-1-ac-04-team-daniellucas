class Main {
  public static void main(String[] args) {
    
    int i, num;
    int contador = -1;
    
    for (i=0; i<=100; i++) {
        num= i%2;
      
        if (num == 0){
          System.out.print(" " + i + " ");
          contador++;
          
          if(contador==10){
            System.out.println("\n");
            contador=0;
          }
        }
    }
  }
}