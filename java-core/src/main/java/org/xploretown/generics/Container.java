package org.xploretown.generics;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Container<T> {
    private T value;

    /**
     * Sets the value for the value
     * @param value
     */
    public  void setValue(T value){
        log.info("Setting {}: ", value);
        this.value = value;
    }

    /**
     * Getter for the value
     * @return value
     */
    public T getValue(){
        return this.value;
    }


    public boolean isEmpty(){
        return this.value == null;
    };

    public static void execute(){
        Container<String> container1 = new Container<>();
        container1.setValue("Content of first Container");
    }
}
