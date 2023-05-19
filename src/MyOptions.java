import javax.swing.*;

public class MyOptions extends JPanel {


    public MyOptions() {
        super();
        for (int i = 0; i < 2; i++) {
            System.out.println("Hallo");
        }
        System.out.println("Hi");
        add(new JCheckBox("Итоги"));
    }
}
