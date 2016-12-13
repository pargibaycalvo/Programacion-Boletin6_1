
package boletin.pkg6_1;

public class calculo {
        //atributos
    private String nomCliente, numCuenta;
    private double sueldo;

    public calculo() {
    }

    public calculo(String nomCliente, String numCuenta, double sueldo) {
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.sueldo = sueldo;
    }

    public void setcliente(String nomCli){
        System.out.println("nombre: " + nomCli);
        nomCliente=nomCli;
    }
    
    public void setnumerocuenta(String numCuenta){
        System.out.println("numero de cuenta: " + numCuenta);
        
    }
    
    public void ingresardinero (calculo libreta, double ingreso){
        if (ingreso>=0){
            sueldo=ingreso+libreta.sueldo;
            System.out.println("Su sueldo es de: " + sueldo);
        }
        else
            System.out.println("En caso de ser actualizado su sueldo, indique el nuevo suedo: ");
    }
    public void retirardinero (calculo libreta, double retiro){
        if (retiro<= libreta.sueldo){
            sueldo=libreta.sueldo-retiro;
            System.out.println("Usted retiró: " + retiro);
        }
        else 
            System.out.println("Error, su saldo es insuficiente");
                    
    }
    public void transferenciabancaria (double cant1, String cuenta2){
        if(cant1>0)
            System.out.println("Acabas de transferir: " + cant1);
        else
            System.out.println("Error, su saldo es insuficiente para realizar la trabsferencia");
           
    }
    public void visualizar(){
        System.out.println( nomCliente  + " o seu número de conta é : " + numCuenta +  
                " e actualmente ten " + sueldo + " € na súa conta" );
    }
    
    }
    

