package sample;

import javafx.scene.control.TextArea;

import java.util.Scanner;

public class dongHoDemNguoc {
    public TextArea TA1;
    String so;

    public void submit() {

        Runnable run = new Runnable() {
            public void run() {
                for (int j = 9; j >= 0; j--) {
                    for (int i = 59; i >= 0; i--) {
                        String ono = String.format("%02d", j) + ":" + String.format("%02d", i);
                        so = ono;
//                        System.out.println(so);
                        TA1.setText("" + so);
                        try {
                            Thread.sleep(1000);
                        } catch (Exception E) {

                        }

                    }

                }
            }
        };
        new Thread(run).start();
    }
}
