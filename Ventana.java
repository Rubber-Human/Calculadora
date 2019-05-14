import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame  implements ActionListener{
    JPanel panel1, panel2;
    JTextField pantalla;
    JButton sum, res, mul, div, bot_igual, num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, punto, botCE, botC, bot_blanco;
    Font fuente1, fuente2;
    GridLayout GL = new GridLayout();
    GridLayout GL2 = new GridLayout();

    public Ventana(){
        fuente1 = new Font("Segoe UI",1,22);
        fuente2 = new Font("Segoe UI",1,16);

        GL.setRows(2);
        GL.setColumns(1);

        GL2.setRows(5);
        GL2.setColumns(6);

        this.setSize(500,500);
        this.setTitle("Calculadora");
        this.setResizable(false);
        this.setLayout(GL);

        //CREACIÓN DE PÁNELES
        panel1 = new JPanel(null);
        panel2 = new JPanel(null);

        panel2.setLayout(GL2);

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
        bot_igual = new JButton("=");
        bot_igual.addActionListener(this);
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
        bot_blanco = new JButton("");

        //PANEL 1 QUE INCLUYE LA PANTALLA
        pantalla.setBounds(40,30,420,80);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(fuente1);
        pantalla.setBackground(Color.white);
        panel1.add(pantalla);

        //PANEL 2 QUE INCLUYE LOS BOTONES
        sum.setFont(fuente2);
        sum.setVerticalAlignment(JTextField.CENTER);
        sum.setBorder(null);
        sum.setBackground(Color.LIGHT_GRAY);
        sum.setForeground(Color.black);

        
        res.setFont(fuente2);
        res.setVerticalAlignment(JTextField.CENTER);
        res.setBorder(null);
        res.setBackground(Color.LIGHT_GRAY);
        res.setForeground(Color.black);


        mul.setFont(fuente2);
        mul.setVerticalAlignment(JTextField.CENTER);
        mul.setBorder(null);
        mul.setBackground(Color.LIGHT_GRAY);
        mul.setForeground(Color.black);


        div.setFont(fuente2);
        div.setVerticalAlignment(JTextField.CENTER);
        div.setBorder(null);
        div.setBackground(Color.LIGHT_GRAY);
        div.setForeground(Color.black);


        num7.setFont(fuente2);
        num7.setVerticalAlignment(JTextField.CENTER);
        num7.setBorder(null);
        num7.setBackground(Color.LIGHT_GRAY);
        num7.setForeground(Color.black);


        num8.setFont(fuente2);
        num8.setVerticalAlignment(JTextField.CENTER);
        num8.setBorder(null);
        num8.setBackground(Color.LIGHT_GRAY);
        num8.setForeground(Color.black);


        num9.setFont(fuente2);
        num9.setVerticalAlignment(JTextField.CENTER);
        num9.setBorder(null);
        num9.setBackground(Color.LIGHT_GRAY);
        num9.setForeground(Color.black);


        botCE.setFont(fuente2);
        botCE.setVerticalAlignment(JTextField.CENTER);
        botCE.setBorder(null);
        botCE.setBackground(Color.LIGHT_GRAY);
        botCE.setForeground(Color.black);


        num4.setFont(fuente2);
        num4.setVerticalAlignment(JTextField.CENTER);
        num4.setBorder(null);
        num4.setBackground(Color.LIGHT_GRAY);
        num4.setForeground(Color.black);


        num5.setFont(fuente2);
        num5.setVerticalAlignment(JTextField.CENTER);
        num5.setBorder(null);
        num5.setBackground(Color.LIGHT_GRAY);
        num5.setForeground(Color.black);


        num6.setFont(fuente2);
        num6.setVerticalAlignment(JTextField.CENTER);
        num6.setBorder(null);
        num6.setBackground(Color.LIGHT_GRAY);
        num6.setForeground(Color.black);


        botC.setFont(fuente2);
        botC.setVerticalAlignment(JTextField.CENTER);
        botC.setBorder(null);
        botC.setBackground(Color.LIGHT_GRAY);
        botC.setForeground(Color.black);


        num1.setFont(fuente2);
        num1.setVerticalAlignment(JTextField.CENTER);
        num1.setBorder(null);
        num1.setBackground(Color.LIGHT_GRAY);
        num1.setForeground(Color.black);


        num2.setFont(fuente2);
        num2.setVerticalAlignment(JTextField.CENTER);
        num2.setBorder(null);
        num2.setBackground(Color.LIGHT_GRAY);
        num2.setForeground(Color.black);


        num3.setFont(fuente2);
        num3.setVerticalAlignment(JTextField.CENTER);
        num3.setBorder(null);
        num3.setBackground(Color.LIGHT_GRAY);
        num3.setForeground(Color.black);


        bot_igual.setFont(fuente2);
        bot_igual.setVerticalAlignment(JTextField.CENTER);
        bot_igual.setBorder(null);
        bot_igual.setBackground(Color.LIGHT_GRAY);
        bot_igual.setForeground(Color.black);

        bot_blanco.setBorder(null);
        bot_blanco.setBackground(new Color(238,238,238));
        bot_blanco.setEnabled(false);

        num0.setFont(fuente2);
        num0.setVerticalAlignment(JTextField.CENTER);
        num0.setBorder(null);
        num0.setBackground(Color.LIGHT_GRAY);
        num0.setForeground(Color.black);


        punto.setFont(fuente2);
        punto.setVerticalAlignment(JTextField.CENTER);
        punto.setBorder(null);
        punto.setBackground(Color.LIGHT_GRAY);
        punto.setForeground(Color.black);



        panel2.add(sum);
        panel2.add(res);
        panel2.add(mul);
        panel2.add(div);
        panel2.add(num7);
        panel2.add(num8);
        panel2.add(num9);
        panel2.add(botCE);
        panel2.add(num4);
        panel2.add(num5);
        panel2.add(num6);
        panel2.add(botC);
        panel2.add(num1);
        panel2.add(num2);
        panel2.add(num3);
        panel2.add(bot_igual);
        panel2.add(bot_blanco);
        panel2.add(num0);
        panel2.add(punto);


        add(panel1);
        add(panel2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numero1 = "0", numero2 = "0", operacion = "";
        double resultado = 3.0;

        if(num0.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "0");
        }

        if(num1.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "1");
        }

        if(num2.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "2");
        }

        if(num3.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "3");
        }

        if(num4.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "4");
        }

        if(num5.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "5");
        }

        if(num6.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "6");
        }

        if(num7.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "7");
        }

        if(num8.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "8");
        }

        if(num9.equals(e.getSource())){
            pantalla.setText(pantalla.getText() + "9");
        }

        if(botCE.equals(e.getSource())){
            pantalla.setText("");
            punto.setEnabled(true);
        }

        if(botC.equals(e.getSource())){
            numero1 = "0";
            numero2 = "0";
            resultado = 0.0;
            punto.setEnabled(true);

            pantalla.setText("");
        }


        if (punto.equals(e.getSource())) {
            if (!pantalla.getText().equals("")) {
                pantalla.setText(pantalla.getText() + ".");

                punto.setEnabled(false);
            }
            else{
                if(pantalla.getText().equals("")){
                    pantalla.setText("0.");
                    punto.setEnabled(false);
                }
            }
        }


        if(sum.equals(e.getSource())){
            numero1 = pantalla.getText();
            operacion = "+";
            pantalla.setText("");
        }

        if(bot_igual.equals(e.getSource())){
            numero2 = pantalla.getText();
            if(operacion.equals("+")){
                resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
            }
            pantalla.setText("" + resultado);
        }

       /* if(res.equals(e.getSource())){

        }
        if(mul.equals(e.getSource())){

        }
        if(div.equals(e.getSource())){
            if(numero2 == 0){
                pantalla.setText("No se puede dividir entre cero");
            }
            else {
               pantalla.setText("" + division);
            }
        }*/
    }
}
