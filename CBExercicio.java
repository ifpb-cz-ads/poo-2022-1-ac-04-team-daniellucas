class Main {
  public static void main(String[] args) {
    int numero = 0;
    int contador = -1;

    while(numero>=0 && numero<=100){
      System.out.print(" " + numero + " ");
      numero++;
      contador++;
      
      if(contador==10){
            System.out.print("\n");
            contador=0;
      }
    }
  }
}