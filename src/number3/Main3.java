package number3;

import number2.SuperClassTest2;

public class Main3 {
    public static void main(String[] args) {

        SuperClassTest3 superObj = new SuperClassTest3(2);
        String toStr = superObj.toString();
        System.out.println(toStr + "\n");

        SubClassTest3 subObj = new SubClassTest3('a', 5);
        toStr = subObj.toString();
        System.out.println(toStr + "\n");

        SubClass3 subSObj = new SubClass3('p', 4, "in sub sub class");
        toStr = subSObj.toString();
        System.out.println(toStr);
    }
}