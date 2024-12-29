package number2;

public class Main2 {
    public static void main(String[] args) {

        SuperClassTest2 superObj = new SuperClassTest2("Передал в конструктор суперкласса!");
        String str = superObj.getVarStr();
        System.out.println(str);
        superObj.setVar("Изменил в методе суперкласса!");
        str = superObj.getVarStr();
        System.out.println(str + "\n");

        SubClassTest2 subObj = new SubClassTest2("Передал в конструктор подкласса!", 10);
        str = subObj.getVarStr();
        int numb = subObj.getVarInt();
        System.out.println(str + " " + numb);
        subObj.setVar("Изменил оба поля в методе подкласса!", 50);
        str = subObj.getVarStr();
        numb = subObj.getVarInt();
        System.out.println(str + " " + numb);

    }
}