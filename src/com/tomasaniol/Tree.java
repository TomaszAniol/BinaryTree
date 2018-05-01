package com.tomasaniol;

public class Tree {

    private int key;
    private Tree leftTree;
    private Tree righTree;

    public Tree(int key) {
        this.key = key;
    }

    public void AddValue(int n){
        if (n < key){
            if (leftTree == null)
            {
                leftTree = new Tree(n);
            }
            else
            {
                leftTree.AddValue(n);
            }
        }
        else

            if (righTree == null)
            {
                righTree = new Tree(n);
            }
            else
            {
                righTree.AddValue(n);
            }

    }

    public void SortIncrease(){
        if (leftTree == null){
            System.out.println(key);
        }
        else{
            leftTree.SortIncrease();
            System.out.println(key);
        }
        if (!(righTree == null))
            righTree.SortIncrease();
    }

    public void SortDecrease(){
        if (righTree == null){
            System.out.println(key);
        }
        else {
            righTree.SortDecrease();
            System.out.println(key);
        }
        if (!(leftTree == null)){
            leftTree.SortDecrease();
        }
    }
}
