package Test.F;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

/*
- public boolean add(E e)：  把给定的对象添加到当前集合中 。
- public void clear() :清空集合中所有的元素。
- public boolean remove(E e): 把给定的对象在当前集合中删除。
- public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
- public boolean isEmpty(): 判断当前集合是否为空。
- public int size(): 返回集合中元素的个数。
- public Object[] toArray(): 把集合中的元素，存储到数组中

 */
public class Test {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("dasda");
        c.add("dasd");
        c.add("123214");
        String s = c.toString();
        System.out.println(s);
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            System.out.println(chars[i]+"");

        }
        c.remove("dasda");
        for (Object o : c) {
            System.out.println(o);
        }
        boolean contains = c.contains("123214");
        System.out.println(contains);
        Object[] objects = c.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
