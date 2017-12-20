package com.example.benjaminbowen.toptrees;

import java.util.ArrayList;

/**
 * Created by benjaminbowen on 19/12/2017.
 */

public class TopTrees {

    private ArrayList<Tree> treeList;

    public TopTrees(){
        this.treeList = new ArrayList<>();
        treeList.add(new Tree(1, "Silver birch", "Northern Europe", 25));
        treeList.add(new Tree(2, "Pedunculate Oak", "Worldwide", 40));
        treeList.add(new Tree(3, "Beech", "Europe", 18));
        treeList.add(new Tree(4, "Spruce", "Northern Europe", 40));
        treeList.add(new Tree(5, "Rowan", "UK", 15));
        treeList.add(new Tree(6, "Sycamore", "Europe", 35));
        treeList.add(new Tree(7, "Hazel", "Western Europe", 10));
        treeList.add(new Tree(8, "Douglas fir", "North America", 50));
        treeList.add(new Tree(9, "Elm", "Europe", 35));
        treeList.add(new Tree(10, "Cypress leylandii", "North America", 30));

    }

    public ArrayList<Tree> getTreeList() {
        return treeList;
    }
}
