package 实验9;

import java.util.ArrayList;

/**
 * @author ZZM
 * @creater 2022-05-13  15:42
 * 书p401
 * 11.10
 */
public class MyStack extends ArrayList {
    public int getSize(){
        return size();
    }
    public void push(Object o){
        add(o);
    }
    public Object pop(){
        Object o=get(size()-1);
        remove(size()-1);
        return o;
    }
    public Object peek(){
        Object o=get(size()-1);
        return o;
    }

}
