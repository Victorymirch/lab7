package number4;

import number3.SubClass3;

public class SubClass44 extends SubClass4 {
    public int numb;

    public SubClass44(char ch, String str, int numb) {
        super(ch, str);
        this.numb = numb;
    }

    public SubClass44(SubClass44 anotherClass) {
        super(anotherClass);
        this.numb = anotherClass.numb;
    }
}