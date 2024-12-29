package number2;

public class SubClassTest2 extends SuperClassTest2 {
    public int numb;

    public SubClassTest2(String str, int numb) {
        this.numb = numb;
        setVar(str);
    }

    public int getVarInt() {
        return numb;
    }

    public void setVar() {
    }

    public void setVar(int numb) {
        this.numb = numb;
    }

    public void setVar(String str) {
        super.setVar(str);
    }

    public void setVar(String str, int numb) {
        setVar(str);
        this.numb = numb;
    }

}