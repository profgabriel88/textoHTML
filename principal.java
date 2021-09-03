import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    public static void main(String[] args) {

        ExtraiTexto et = new ExtraiTexto();

        JFrame frame = new JFrame("Extrai Texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Link");
        JTextField tf = new JTextField(30);
        JButton button = new JButton("Extrair");
        JButton mais = new JButton("+");
        JButton menos = new JButton("-");

        panel.add(label);
        panel.add(tf);
        panel.add(button);
        panel.add(mais);
        panel.add(menos);


        JEditorPane ta = new JEditorPane();
        ta.setEditable(false);

        ta.setOpaque(true);
        JScrollPane scrollPane = new JScrollPane(ta);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = tf.getText();
                et.getNoticia(url, ta);
            }
        });

        mais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                et.setSizeMais(ta);
            }
        });

        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                et.setSizeMenos(ta);
            }
        });


    }
}