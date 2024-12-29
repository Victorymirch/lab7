package number5;

public class SubClass55 extends SuperClass5 {
    protected char ch;

    public SubClass55(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    public void ShowClassNameAndField() {
        System.out.println(
                "Class name: " + this.getClass().getSimpleName() +
                        "\nField string value: " + super.getStr() +
                        "\nField char value: " + this.ch);
    }
}