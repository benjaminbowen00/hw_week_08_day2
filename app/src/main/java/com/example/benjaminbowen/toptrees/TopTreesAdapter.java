package com.example.benjaminbowen.toptrees;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.benjaminbowen.toptrees.Tree;

import java.util.ArrayList;

/**
 * Created by benjaminbowen on 19/12/2017.
 */

public class TopTreesAdapter extends ArrayAdapter<Tree> {

    public TopTreesAdapter(Context context, ArrayList<Tree> trees){
        super(context, 0, trees);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tree_list_item, parent, false);
        }

        Tree currentTree = getItem(position);

        TextView species = (TextView) listItemView.findViewById(R.id.species);
        String speciesInfo = "Species: "+currentTree.getSpecies();
        species.setText(speciesInfo);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        String rankingInfo = currentTree.getRanking().toString();
        ranking.setText(rankingInfo);

        TextView distribution = (TextView) listItemView.findViewById(R.id.distribution);
        String distributionInfo = "Distribution: "+currentTree.getDistribution();
        distribution.setText(distributionInfo);

        TextView maxHeight = (TextView) listItemView.findViewById(R.id.max_height);
        String heightInfo = "Maximum height: "+currentTree.getMaxHeight().toString()+" m";
        maxHeight.setText(heightInfo);

        listItemView.setTag(currentTree);

        return listItemView;

    }




}
