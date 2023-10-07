import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class usingCollectionsShuffle{
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Collections.shuffle(arr);
        for(int num: arr)
            System.out.print(num + " ");
    }

}