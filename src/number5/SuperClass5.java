package number5;

import number4.SuperClass4;

public class SuperClass5 {
    private String str;

    public SuperClass5(String str) {
        this.str = str;
    }

    public void ShowClassNameAndField() {
        System.out.println(
                "Class name: " + this.getClass().getSimpleName() + "\nField value: " + this.str);
    }

    public String getStr() {
        return str;
    }
}