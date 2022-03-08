package src.generics.challengesolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumericalOperations<N extends Number & Comparable<N>>{

    private List<N> operands;

    public NumericalOperations(List<N> operands){
        this.operands = new ArrayList<>(operands);
    }

    public List<N> sortNUmbers(){
        Collections.sort(operands);
        return operands;
    }

    public N getmax(){
        return Collections.max(operands);
    }

}
