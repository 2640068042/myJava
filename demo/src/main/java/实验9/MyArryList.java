package 实验9;

import java.util.ArrayList;

/**
 * @author ZZM
 * @creater 2022-05-13  16:04
 * 书p403
 * 11.18
 */
public class MyArryList extends ArrayList{
    public static ArrayList<Character> toCharacterArry(String s){
        ArrayList<Character> list= new ArrayList<>();
        char a;
        for(int i=0;i<s.length();i++) {
            a=s.charAt(i);
            list.add(a);
        }
        return list;
    }
}
