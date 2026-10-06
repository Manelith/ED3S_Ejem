/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_ejem2;

public class ED3S6_Ejem2 {

    public void suma(){
    int a=6;
    int b=1;
    int c=a+b;
    System.out.println("la suma de a+b es: " + c);
    mensaje();
    }
    
    private void mensaje(){
    System.out.println("Bienvenido, Programando ED");
    }
    
    public static void main(String[] args) {
        ED3S6_Ejem2 obj = new ED3S6_Ejem2();
        obj.suma();
        obj.mensaje();
    }
    
}
