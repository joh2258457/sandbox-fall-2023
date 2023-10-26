package org.example.generics;

public class GenericsDriver {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1234);
        System.out.println(box.getValue());

        Box<String> box2 = new Box<>();
        box2.setValue("String Test");
        System.out.println(box2.getValue());

        Box<Float> box3 = new Box<>();
        box3.setValue(12.3f);
        System.out.println(box3.getValue());

//        Box<? extends Object> box4 = new Box<>();
//        box4.setValue("String");
//        box4.setValue(1234);

        Crate<Box<?>> cr = new Crate<>();
        cr.addBox(box);
        cr.addBox(box2);
        cr.addBox(box3);
    }
}
