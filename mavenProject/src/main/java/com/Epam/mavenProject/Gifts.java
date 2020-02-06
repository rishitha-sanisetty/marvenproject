package com.Epam.mavenProject;

import java.util.ArrayList;
import java.util.Collections;

public class Gifts {
	public int weight;
	public int cost;
	public static ArrayList<Integer> wt = new ArrayList<Integer>();
	public int getWeight(){
		int W = 0;
		for(int i = 0;i < wt.size(); i++){
			W += wt.get(i);
		}
		return W;
	}
	
}
