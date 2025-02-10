import compairingdifferentdatastructuresforthesearching.CompairisonDataStructures;
import org.junit.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static compairingdifferentdatastructuresforthesearching.CompairisonDataStructures.searchArray;

public class DataStructuresComparisionTesting {


    int[] datasetSizes = {1000, 100000, 1000000};

    // Creating an array, HashSet, and TreeSet
    int [] arr = new int [1000];
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    // Element to search for
    int target = 999;
    // Creating object of CompairisonDataStructures class
    CompairisonDataStructures ob = new CompairisonDataStructures();

    @Test
    public void arrayTesting(){
        searchArray(arr,target);
    }

    @Test
    public void hashSetTesting(){
        ob.searchInHashSet( hashSet,target);
    }

    @Test
    public void treeSetTesting(){
        ob.treeSetSearch(treeSet, target);
    }
}
