package com.example.benjaminbowen.toptrees;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopTreesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_top_trees);

        TopTrees topTrees = new TopTrees();
        ArrayList<Tree> treeList = topTrees.getTreeList();

        TopTreesAdapter treeAdapter = new TopTreesAdapter(this, treeList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(treeAdapter);
    }

    public void getTree(View listItem){
        Tree tree = (Tree) listItem.getTag();
        Intent intent = new Intent(this, TreeActivity.class);
        intent.putExtra("tree", tree);
        startActivity(intent);
    }
}
