package practice6;

import javax.swing.*;

public class Pr06_18t {
    static Boolean isNumber(String str){
        boolean result = true;
        for (int i = 0; i <str.length() ; i++) {
        if(str.charAt(i)>='0' && str.charAt(i)<='9');
            else{
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String input = "";
        do{
            input = JOptionPane.showInputDialog("숫자 판별 프로그램입니다. 입력하세요");
            if(input!=null && !input.equals("")){
            System.out.println(input+"은/는 숫자입니까?");
            System.out.println(isNumber(input)?"숫자입니다.":"숫자가 아닙니다.");
            }else{
                JOptionPane.showInputDialog(null, "비어있습니다.");
                continue;
            }
        }while(!input.equalsIgnoreCase("Q"));
    }
}
