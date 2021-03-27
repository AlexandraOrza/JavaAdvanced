package JavaAdvancedHomework;

import java.util.Arrays;

public class IntSequence implements IntNumbers{

    @Override
    public void getList() {
        System.out.println("List is" + Arrays.toString(list));
    }
}
