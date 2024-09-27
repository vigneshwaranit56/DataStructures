package learning.nonlinear.tree;


import java.util.ArrayList;
import java.util.List;


public class TrieNode<T> {

    private T data;
    private Boolean isEnd;
    private List<TrieNode<T>> trieNodeList;
    private Integer count;

    public TrieNode(T t, Boolean isEnd, List<TrieNode<T>> trieNodeList) {
        this.data = t;
        this.isEnd = isEnd;
        this.trieNodeList = trieNodeList;
    }



    public TrieNode(T t) {
        this.data = t;
        this.count = 0;
        this.isEnd = Boolean.FALSE;
        this.trieNodeList = new ArrayList<>();
    }


    public T getData() {
        return data;
    }



    public Boolean getEnd() {
        return isEnd;
    }


    public void setEnd(Boolean isEnd) {
         this.isEnd =isEnd;
    }

    public Integer getCount(){
        return count;
    }


    public List<TrieNode<T>> getTrieNodeList() {
        return trieNodeList == null ? new ArrayList<>():trieNodeList;
    }

    public TrieNode<T> getChildList(T t) {

        if(trieNodeList == null){
            return null;
        }

        for (TrieNode trieNode:trieNodeList
             ) {
            if(trieNode.getData() == t){
                return trieNode;
            }
        }
        return null;
    }

    public void incrementCount(){
        count++;
    }

    public void decrementCount(){
        count--;
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "data=" + data +
                ", isEnd=" + isEnd +
                ", trieNodeList=" + trieNodeList +
                ", count=" + count +
                '}';
    }
}
