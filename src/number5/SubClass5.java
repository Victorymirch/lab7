package number5;

import number4.SubClass4;

public class SubClass5 extends SuperClass5 {
    protected int numb;

    public SubClass5(String str, int numb) {
        super(str);
        this.numb = numb;
    }


    public void ShowClassNameAndField() {
        System.out.println(
                "Class name: " + this.getClass().getSimpleName() +
                        "\nField string value: " + super.getStr() +
                        "\nField int value: " + this.numb);
    }


}