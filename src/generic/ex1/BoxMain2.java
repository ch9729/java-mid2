package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();

        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();   //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();  //Object -> String 캐스팅
        System.out.println("str = " + str);

        ObjectBox doubleBox = new ObjectBox();
        doubleBox.set(3.14);
        Double double1  = (Double) doubleBox.get(); //Object -> Double 캐스팅
        System.out.println("double1 = " + double1);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자");
        Integer result = (Integer) integerBox.get();    //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);

    }
}
