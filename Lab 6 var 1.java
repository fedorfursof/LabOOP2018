import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Demonstrate extends JFrame {
    private JButton button;
    private JPanel panel;
    private JTextField field;

    private int number;
    private int count = 3;
    Random rnd = new Random();

    public Demonstrate() {
        panel = new JPanel();
        button = new JButton("Проверить");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                boolean isExit = false;
                boolean isWin = false;
                Integer userNumber = 0;

                try {
                    userNumber = Integer.valueOf(field.getText());
                    if (userNumber > 20 || userNumber < 0) {
                        throw (new NumberFormatException());
                    }
                } catch (NumberFormatException ex) {
                    field.setText("");
                    JOptionPane.showMessageDialog(null, "Вы ввели неверное число. Повторите попытку");
                    return;
                }
                count--;
                if (number == userNumber) {
                    message = "Вы победили, угадав число " + number + " и программа закрывается.";
                    isExit = true;
                    isWin = true;
                } else if (number > userNumber) {
                    message = "Задуманное число больше";
                } else if (number < userNumber) {
                    message = "Задуманное число меньше";
                }

                if (count == 0 && !isWin) {
                    isExit = true;
                    message = "Вы не отгадали число " + number + " использовав все 3 попытки и проиграли. Программа закрывается.";
                }

                JOptionPane.showMessageDialog(null, message);
                if (isExit) {
                    dispose();
                    System.exit(0);
                }
            }
        });
        field = new JTextField(15);
        field.setSize(250, 35);
        panel.add(field);
        panel.add(button);
        add(panel);
        setSize(300, 80);
        number = rnd.nextInt(21);
    }


    public static void main(String[] arg) {
        new Demonstrate().setVisible(true);
    }
}
