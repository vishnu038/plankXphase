package com.exam.plankxphase;

import android.support.v7.app.ActionBarActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfActivities extends ListActivity {
	
	String classes[] = {"CreatePlaylist","DeletePlaylist"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		String username = getIntent().getStringExtra("Username");
		setListAdapter(new ArrayAdapter<String>(ListOfActivities.this, android.R.layout.simple_list_item_1, classes));
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		try {
		Class ourclass = Class.forName("com.exam.plankxphase." +cheese);
		Intent ourintent = new Intent(this,ourclass);
		startActivity(ourintent);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	
}


	
	
	
}
	
