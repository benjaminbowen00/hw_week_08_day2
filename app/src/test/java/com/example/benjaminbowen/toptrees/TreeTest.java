package com.example.benjaminbowen.toptrees;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by benjaminbowen on 19/12/2017.
 */

public class TreeTest {

    Tree tree;

    @Before
    public void before(){
        tree = new Tree(1, "Silver birch", "Northern Europe", 12);
    }

    @Test
    public void canGetSpecies(){
        assertEquals("Silver birch", tree.getSpecies());
    }
}
