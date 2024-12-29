package number4;

import number3.SubClass3;

public class SubClass4 extends SuperClass4 {
    public String str;

    public SubClass4(char ch, String str) {
        super(ch);
        this.str = str;
    }

    public SubClass4(SubClass4 anotherClass) {
        super(anotherClass);
        this.str = anotherClass.str;
    }
}