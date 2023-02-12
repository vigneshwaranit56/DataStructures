package com.nonlinear.tree;

import com.nonlinear.tree.heap.TreeI;

import java.util.Iterator;


public class Trie extends AbstractTree implements TreeI<String> {

    private TrieNode<Character> head;

    public Trie()
    {
        head = new TrieNode(' ');
    }
    @Override
    public void insert(String s) throws Exception {

//        if(!search(s)){
//            return ;
//        }
        TrieNode<Character> current = head;

        for (Character c:s.toCharArray()) {
            TrieNode<Character>  child = current.getChildList(c);
            if(child == null) {
                current.getTrieNodeList().add(new TrieNode<Character>(c));
                current = current.getChildList(c);
            }else{
                current = child;
            }
            current.incrementCount();

        }

        current.setEnd(Boolean.TRUE);



    }

    @Override
    public void delete(String s) {
        if(!search(s)){
            return ;
        }
        TrieNode<Character> current = head;

        for (Character c:s.toCharArray()) {
            TrieNode<Character>  child = current.getChildList(c);


            if(current.getCount()==1){
                current.getTrieNodeList().remove(child);

            }else{
                current.decrementCount();
                current=child;
            }
        }
        current.setEnd(Boolean.TRUE);
    }

    @Override
    public Boolean search(String s) {
        if(head == null){
            return false;
        }
        TrieNode<Character> current = head;



        for (Character c:s.toCharArray()) {
            current = current.getChildList(c);
           if(current == null) {
               return Boolean.FALSE;
           }
        }
        return Boolean.TRUE;
    }

    @Override
    public void print() {
        for (TrieNode trieNode: head.getTrieNodeList()
             ) {

            System.out.print(trieNode.getData());


        }

    }

    public  void printAllWordsInTrie(TrieNode<Character> head, String s) {
        TrieNode current = head;
        if (head.getTrieNodeList() == null || this.head.getTrieNodeList().size() == 0)
            return;
        Iterator iter = current.getTrieNodeList().iterator();
        while (iter.hasNext()) {
            TrieNode node = (TrieNode) iter.next();
            s += node.getData();
           printAllWordsInTrie(node, s);
            if (node.getEnd() == true) {
                System.out.print(" " + s);
                s = s.substring(0, s.length() - 1);
            } else {
                s = s.substring(0, s.length() - 1);
            }
        }

    }

    public TrieNode<Character> getHead(){
        return head;
    }
    public static void main(String[] args) throws Exception {
        Trie t = new Trie();
        t.insert("dear");
        t.insert("deal");
        t.insert("do");
        t.insert("he");
        t.insert("hen");
        t.insert("heat");

        System.out.println("hen present in trie : "+t.search("hen"));
        System.out.println("hear present in trie : "+t.search("hear"));
        System.out.println("deal present in trie : "+t.search("deal"));
        System.out.println("========================");
        System.out.println("Printing all word present in trie : ");
//        t.print();
        t.printAllWordsInTrie(t.getHead(),"");
    }
}
