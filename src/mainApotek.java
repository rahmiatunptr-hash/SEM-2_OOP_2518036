public class mainApotek {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Apotek().setVisible(true);
            }
        });

    }
}