package com.example.benjaminbowen.toptrees;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by benjaminbowen on 19/12/2017.
 */

public class TopTreesTest {

    TopTrees toptrees;

    @Before
    public void before(){
        toptrees = new TopTrees();
    }

    @Test
    public void canGetTopTreesList(){
        assertEquals(10, toptrees.getTreeList().size());
    }

}
