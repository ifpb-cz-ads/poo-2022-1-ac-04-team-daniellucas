/*Escreva um programa que implemente um laço while que execute 20 vezes, imprimindo o valor da variável x que inicialmente está com valor 10.*/

class Main {
  public static void main(String[] args) {
    int numero=10;
    int contador=1;
    
    while(contador<=20){
      System.out.println("" + numero + "");
      numero++;
      contador++;
    }
  }
}