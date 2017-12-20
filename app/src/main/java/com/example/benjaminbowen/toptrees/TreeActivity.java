package com.example.benjaminbowen.toptrees;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TreeActivity extends AppCompatActivity {


    TextView treeSpecies;
    TextView treeRanking;
    TextView treeDistribution;
    TextView treeMaxHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        Intent intent = getIntent();
        Tree tree = (Tree) intent.getSerializableExtra("tree");

        treeSpecies = findViewById(R.id.tree_species);
        treeRanking = findViewById(R.id.tree_ranking);
        treeDistribution = findViewById(R.id.tree_distribution);
        treeMaxHeight = findViewById(R.id.tree_max_height);

        treeSpecies.setText("Species: " + tree.getSpecies());
        treeRanking.setText("Ranking: " + tree.getRanking());
        treeDistribution.setText("Distribution: " + tree.getDistribution());
        treeMaxHeight.setText("Max Height: " + tree.getMaxHeight()+" m");

    }
}
