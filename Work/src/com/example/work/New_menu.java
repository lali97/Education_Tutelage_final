package com.example.work;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class New_menu extends Activity {
	MenuItem m1,m2,m3,m4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_menu);
		m1=(MenuItem) findViewById(R.id.item1);
		//m2=(MenuItem) findViewById(R.id.item2);
		//m3=(MenuItem) findViewById(R.id.item3);
		//m4=(MenuItem) findViewById(R.id.item4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.item1) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
