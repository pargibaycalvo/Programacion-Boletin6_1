
package boletin.pkg6_1;

public class Boletin6_1 {

    public static void main(String[] args) {
        // Modificacion harrison fork en busca del commit perdido
        
        calculo per1 = new calculo();
        per1.setcliente("miguel");
        per1.setnumerocuenta("123456789");
        per1.ingresardinero(per1,500);
        per1.retirardinero(per1,200);
        
      
     
        calculo trabajo = new calculo("trabajo","informatico",46318);
        trabajo.transferenciabancaria(2500, "123456789");
    }
    
}
