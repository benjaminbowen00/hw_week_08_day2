package com.example.benjaminbowen.toptrees;

import java.io.Serializable;

/**
 * Created by benjaminbowen on 19/12/2017.
 */

public class Tree implements Serializable {

    private Integer ranking;
    private String species;
    private String distribution;
    private Integer maxHeight;

    public Tree(Integer ranking, String species, String distribution, Integer maxHeight) {
        this.ranking = ranking;
        this.species = species;
        this.distribution = distribution;
        this.maxHeight = maxHeight;
    }

    public String getSpecies() {
        return species;
    }

    public String getDistribution() {
        return distribution;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public Integer getRanking() {
        return ranking;
    }
}
