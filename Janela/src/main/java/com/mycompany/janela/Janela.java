/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janela;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {
    JLabel rot1,rot2;
    private JTextField txt1,txt2;
    JButton add,sub,div,mult,sqr,cub,root,cls;

    //programando a janela:
    public Janela(){
        super ("Calc");
            Container tela = getContentPane();
            tela.setBackground(new Color(53, 110, 99));
            setLayout(null);
        setSize(250, 275);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

        //programando os rótulos:
        rot1 = new JLabel("1° Número");
        rot2 = new JLabel("2° Número");
        rot1.setBounds(10, 10, 60, 20);
        rot2.setBounds(10, 40, 60, 20);
        rot1.setForeground(Color.black);
        rot2.setForeground(Color.black);

        //programando os campos de texto:
        txt1 = new JTextField(15);
        txt2 = new JTextField(15);
        txt2.setBounds(85,40,135,25);
        txt1.setBounds(85,10,135,25);

        //programando o botão add:
        add = new JButton("+") ;
        add.setFont(new Font("Arial",Font.BOLD,10));
        add.setBounds(15,75,55,30);

        //programando o botão sub:
        sub = new JButton("-") ;
        sub.setFont(new Font("Arial",Font.BOLD,10));
        sub.setBounds(90,75,55,30);

        //programando o botão mult:
        mult = new JButton("*") ;
        mult.setFont(new Font("Arial",Font.BOLD,10));
        mult.setBounds(165,75,55,30);

        //programando o botão div:
        div = new JButton("/") ;
        div.setFont(new Font("Arial",Font.BOLD,10));
        div.setBounds(15,115,55,30);

        //programando o botão sqr:
        sqr = new JButton("x^2") ;
        sqr.setFont(new Font("Arial",Font.BOLD,10));
        sqr.setBounds(90,115,55,30);

        //programando o botão cub:
        cub = new JButton("x^3") ;
        cub.setFont(new Font("Arial",Font.BOLD,10));
        cub.setBounds(165,115,55,30);

        //programando o botão root:
        root = new JButton("√") ;
        root.setFont(new Font("Arial",Font.BOLD,10));
        root.setBounds(15,155,55,30);

        //programando o botão rslt:
        cls = new JButton("Close") ;
        cls.setFont(new Font("Arial",Font.BOLD,10));
        cls.setBounds(90,155,130,30);

        //Ação do botão add:
        add.addActionListener(
                new ActionListener(){
public void actionPerformed(ActionEvent e){
   double num1,num2,soma ;
   soma = 0;
   num1 = Double.parseDouble(txt1.getText()) ;
   num2 = Double.parseDouble(txt2.getText());
   soma = num1 + num2 ;
   txt1.setText(null);
   txt2.setText(null);
   setVisible(true);
    JOptionPane.showMessageDialog(null,"O resultado é: "+ soma);
    }
});

        //ação botão sub:
        sub.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double num1,num2,sub ;
                        sub = 0;
                        num1 = Double.parseDouble(txt1.getText()) ;
                        num2 = Double.parseDouble(txt2.getText());
                        sub = num1 - num2 ;
                        txt1.setText(null);
                        txt2.setText(null);
                        setVisible(true);
                        JOptionPane.showMessageDialog(null,"O resultado é: "+ sub);
                    }
                });

        //ação botão mult:
        mult.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double num1,num2,result ;
                        result = 0;
                        num1 = Double.parseDouble(txt1.getText()) ;
                        num2 = Double.parseDouble(txt2.getText());
                        result = num1 * num2 ;
                        txt1.setText(null);
                        txt2.setText(null);
                        setVisible(true);
                        JOptionPane.showMessageDialog(null,"O resultado é: "+ result);
                    }
                });

        //Ação botão Div:
        div.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double num1,num2,result ;
                        result = 0;
                        num1 = Double.parseDouble(txt1.getText()) ;
                        num2 = Double.parseDouble(txt2.getText());
                        result = num1 / num2 ;
                        txt1.setText(null);
                        txt2.setText(null);
                        setVisible(true);
                        JOptionPane.showMessageDialog(null,"O resultado é: "+ result);
                    }
                });

        //ação botão sqr:
        sqr.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double num1,num2,result1,result2 ;
                        result1 = 0;
                        result2 = 0;
                        num1 = Double.parseDouble(txt1.getText()) ;
                        num2 = Double.parseDouble(txt2.getText());
                        result1 = num1 * num1;
                        result2 = num2 * num2;
                        txt1.setText(null);
                        txt2.setText(null);
                        setVisible(true);
                        JOptionPane.showMessageDialog(null,"O quadrado do primeiro número é: "+ result1 + "\nO quadrado do segundo número é" + result2);
                    }
                });


        //Ação botão cub:
        cub.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double num1,num2,result1,result2 ;
                        result1 = 0;
                        result2 = 0;
                        num1 = Double.parseDouble(txt1.getText()) ;
                        num2 = Double.parseDouble(txt2.getText());
                        result1 = num1 * num1 * num1;
                        result2 = num2 * num2 * num2;
                        txt1.setText(null);
                        txt2.setText(null);
                        setVisible(true);
                        JOptionPane.showMessageDialog(null,"O cubo do primeiro número é: "+ result1 + "\nO cubo do segundo número é" + result2);
                    }
                });

        //Ação botão root:
        root.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double num1,num2,result1,result2 ;
                        result1 = 0;
                        result2 = 0;
                        num1 = Double.parseDouble(txt1.getText()) ;
                        num2 = Double.parseDouble(txt2.getText());
                        result1 = Math.sqrt(num1);
                        result2 = Math.sqrt(num2);
                        txt1.setText(null);
                        txt2.setText(null);
                        setVisible(true);
                        JOptionPane.showMessageDialog(null,"A raiz do primeiro número é: "+ result1 + "\nA raiz do segundo número é" + result2);
                    }
                });

        //Ação Botão Close
        cls.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                        setVisible(true);
                    }
                });



        tela.add(rot1);
        tela.add(rot2);
        tela.add(txt1);
        tela.add(txt2);
        tela.add(add) ;
        tela.add(sub) ;
        tela.add(mult) ;
        tela.add(div);
        tela.add(sqr);
        tela.add(cub) ;
        tela.add(root);
        tela.add(cls);

    }
        public static void main(String[] args) {
            Janela app = new Janela();
           app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }