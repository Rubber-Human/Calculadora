import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame  implements ActionListener{
    JPanel panel1, panel2;
    JTextField pantalla;
    JButton sum, res, mul, div, resultado, num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, punto, botCE, botC;
    Font fuente1, fuente2;
    public Ventana(){
        fuente1 = new Font("Segoe UI",1,22);
        fuente2 = new Font("Segoe UI",1,16);

        setSize(500,700);
        setTitle("Calculadora");
        setResizable(false);
        setLayout(new GridLayout(6,4));

        //CREACIÓN DE PÁNELES
        panel1 = new JPanel(null);
        panel2 = new JPanel(null);

        //CREACIÓN DE BOTONES Y CAJA DE TEXTO
        pantalla = new JTextField();
        sum = new JButton("+");
        sum.addActionListener(this);
        res = new JButton("-");
        res.addActionListener(this);
        mul = new JButton("*");
        mul.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        resultado = new JButton("=");
        resultado.addActionListener(this);
        num1 = new JButton("1");
        num1.addActionListener(this);
        num2 = new JButton("2");
        num2.addActionListener(this);
        num3 = new JButton("3");
        num3.addActionListener(this);
        num4 = new JButton("4");
        num4.addActionListener(this);
        num5 = new JButton("5");
        num5.addActionListener(this);
        num6 = new JButton("6");
        num6.addActionListener(this);
        num7 = new JButton("7");
        num7.addActionListener(this);
        num8 = new JButton("8");
        num8.addActionListener(this);
        num9 = new JButton("9");
        num9.addActionListener(this);
        num0 = new JButton("0");
        num0.addActionListener(this);
        botCE = new JButton("CE");
        botCE.addActionListener(this);
        botC = new JButton("C");
        botC.addActionListener(this);
        punto = new JButton(".");
        punto.addActionListener(this);


        //PANEL 1 QUE INCLUYE LA PANTALLA
        pantalla.setBounds(40,30,420,80);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(fuente1);
        pantalla.setBackground(Color.white);
        panel1.add(pantalla);

        //PANEL 2 QUE INCLUYE LOS BOTONES
        botCE.setFont(fuente2);
        botCE.setBorder(null);
        botCE.setBackground(Color.LIGHT_GRAY);
        botCE.setForeground(Color.black);
        botCE.setBounds(40,40,160,30);

        botC.setFont(fuente2);
        botC.setBorder(null);
        botC.setBackground(Color.LIGHT_GRAY);
        botC.setForeground(Color.black);
        botC.setBounds(210,40,160,30);

        num7.setFont(fuente2);
        num7.setVerticalAlignment(JTextField.TOP);
        num7.setBorder(null);
        num7.setBackground(Color.LIGHT_GRAY);
        num7.setForeground(Color.black);
        num7.setBounds(40,80,90,50);

        num8.setFont(fuente2);
        num8.setVerticalAlignment(JTextField.TOP);
        num8.setBorder(null);
        num8.setBackground(Color.LIGHT_GRAY);
        num8.setForeground(Color.black);
        num8.setBounds(140,80,90,50);

        num9.setFont(fuente2);
        num9.setVerticalAlignment(JTextField.TOP);
        num9.setBorder(null);
        num9.setBackground(Color.LIGHT_GRAY);
        num9.setForeground(Color.black);
        num9.setBounds(240,80,90,50);

        sum.setFont(fuente2);
        sum.setVerticalAlignment(JTextField.TOP);
        sum.setBorder(null);
        sum.setBackground(Color.LIGHT_GRAY);
        sum.setForeground(Color.black);
        sum.setBounds(340,80,90,50);

        num4.setFont(fuente2);
        num4.setVerticalAlignment(JTextField.TOP);
        num4.setBorder(null);
        num4.setBackground(Color.LIGHT_GRAY);
        num4.setForeground(Color.black);
        num4.setBounds(40,160,90,50);

        num5.setFont(fuente2);
        num5.setVerticalAlignment(JTextField.TOP);
        num5.setBorder(null);
        num5.setBackground(Color.LIGHT_GRAY);
        num5.setForeground(Color.black);
        num5.setBounds(140,160,90,50);

        panel2.add(botCE);
        panel2.add(botC);
        panel2.add(resultado);
        panel2.add(num1);
        panel2.add(num2);
        panel2.add(num3);
        panel2.add(num4);
        panel2.add(num5);
        panel2.add(num6);
        panel2.add(num7);
        panel2.add(num8);
        panel2.add(num9);
        panel2.add(sum);
        panel2.add(res);
        panel2.add(mul);
        panel2.add(div);

        add(panel1);
        add(panel2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int numero1 = 0, numero2 = 0;
        if(sum.equals(e.getSource())){
            int sum = numero1 + numero2;
            resultado.setText(""+sum);
        }
        if(res.equals(e.getSource())){
            int res = numero1 - numero2;
            resultado.setText(""+res);
        }
        if(mul.equals(e.getSource())){
            int mul = numero1 * numero2;
            resultado.setText(""+mul);
        }
        if(div.equals(e.getSource())){
            int div = numero1 / numero2;
            resultado.setText(""+div);
        }
    }
}
