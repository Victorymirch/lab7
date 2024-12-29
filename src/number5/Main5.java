package number5;

public class Main5 {
    public static void main(String[] args) {

        SuperClass5 supObj = new SuperClass5("В Супер классе");
        supObj.ShowClassNameAndField();
        System.out.println();

        SubClass5 subObjOne = new SubClass5("В первом подклассе", 55);
        subObjOne.ShowClassNameAndField();
        System.out.println();

        SubClass55 subObjTwo = new SubClass55("Во втором подклассе", 'U');
        subObjTwo.ShowClassNameAndField();
        System.out.println();

        supObj = subObjOne;
        supObj.ShowClassNameAndField();
    }
}