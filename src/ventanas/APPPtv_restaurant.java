
package ventanas;

public class APPPtv_restaurant {

    public static void main(String[] args) {
        run();
        
    }

    private static void run() {
       VentanaPadre v = new VentanaPadre();
       v.setLocationRelativeTo(null);
       v.setTitle("POS ONUP");
       v.setSize(1366, 730);
       v.setVisible(true);
    }
    
}
