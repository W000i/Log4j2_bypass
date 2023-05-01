package main.java;

import javax.swing.*;
import java.util.Random;

public class encode3 {
    public encode3(String text, JTextArea jTextArea3) {
        //随机取true或者false，
        // true add pad---随机取0-3个字段-----str
        // false
        // 随机取0-3个字段，添加一个混淆'''${zr-ch-Q(NGyN-yLkV:-}'''，添加混淆加-后面取的数量
        jTextArea3.setText(text3(text));
    }

    public String text3(String text){

        StringBuilder result = new StringBuilder();
        Random r=new Random();
        result.append('$');
        result.append('{');


        for (int i = 2; i < text.length();) {
            char cha = text.charAt(i);
//            if (cha=='{'){
//                result.append(cha);
//                i++;
//                continue;
//            }
            int numChars = r.nextInt(1)+1;
            result.append(String.format("${%s:%s:-", str(5), str(12)));
            for (int j = 0; j < numChars && i < text.length(); j++, i++) {
                result.append(cha);
            }
            result.append("}");
        }
        return (result.toString());
    }

    public String str(int i){
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+=()./\\!@#^*<>";
        Random r=new Random();
        StringBuilder builder = new StringBuilder();//存储生成的随机字符
        int length = r.nextInt(i)+1; // 随机生成整数
        for (int k = 0; k < length; k++) {
            int index = r.nextInt(charset.length()); // 随机选择一个字符
            builder.append(charset.charAt(index)); // 添加到 StringBuilder 中
        }
        return builder.toString(); // 转换为字符串
    }
}
