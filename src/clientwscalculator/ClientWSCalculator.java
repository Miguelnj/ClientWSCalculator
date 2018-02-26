/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author Miguel
 */
public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int zero = 0;
        System.out.println("Sum");
        System.out.println(sum(n1,n2));
        System.out.println("Rest");
        System.out.println(rest(n1,n2));
        System.out.println("Multiplication");
        System.out.println(mult(n1,n2));
        System.out.println("Divide");
        System.out.println(div(n1,n2));
        System.out.println("Divide with 0");
        System.out.println(div(n1,zero));
    }

    private static int div(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.div(n1, n2);
    }

    private static int mult(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.mult(n1, n2);
    }

    private static int rest(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }
    
}
