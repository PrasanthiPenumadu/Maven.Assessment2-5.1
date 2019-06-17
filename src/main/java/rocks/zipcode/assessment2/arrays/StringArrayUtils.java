package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

//        String[] array=new String[length];
//        Integer j=startingIndex;
//        if(j<endingIndex){
//        for(int i=0;i<length;i++){
//            array[i]=arrayToBeSpliced[j];
//            j++;
//
//        }}
        ArrayList<String> al=new ArrayList<>(Arrays.asList(arrayToBeSpliced));
        List<String> al2=al.subList(startingIndex, endingIndex);
        String[] array1 = al2.toArray(new String[al2.size()]);
        return array1;

    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        ArrayList<String> al=new ArrayList<>(Arrays.asList(arrayToBeSpliced));
       List<String> al2=al.subList(startingIndex, al.size());
        String[] array1 = al2.toArray(new String[al2.size()]);
        return array1;
    }
}
