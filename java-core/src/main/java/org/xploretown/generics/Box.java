package org.xploretown.generics;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Box<T> {
    private T item;

    public void setItem(T item){
        log.info("Setting Object Info : {}", item);
        this.item = item;
    }

    public T getItem() {
        log.info("Returning the item : {}", this.item);
        return this.item;
    }

    public static void execute(){
        Box<String> box = new Box<>();
        box.setItem("Hello");
        String value = box.getItem();

        Box<Integer> box2 = new Box<>();
        box2.setItem(123);
        box2.getItem();
    }
}
