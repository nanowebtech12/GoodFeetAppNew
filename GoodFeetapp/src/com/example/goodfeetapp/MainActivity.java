package com.example.goodfeetapp;

import java.util.ArrayList;
import java.util.List;

import android.R.color;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;

import com.example.goodfeetapp.TestCRM.CRMAddActivity;
import com.example.goodfeetapp.fragment.Bring;
import com.example.goodfeetapp.fragment.Fragment1;
import com.example.goodfeetapp.fragment.Loginfrag;
import com.example.goodfeetapp.fragment.MyFragment;
import com.example.goodfeetapp.fragment.Returning;

public class MainActivity extends FragmentActivity {
	Context con;
	ImageView imageView1;
	Button btn;

	private String[] choices = { "Customer Info", "Product Guide",
			"Step by Step" };
	
	int fragmentCount = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				MainActivity.this, android.R.layout.simple_dropdown_item_1line,
				choices);

		final ActionBar actionBar = getActionBar();
		actionBar.hide();
		actionBar.setCustomView(R.layout.actionbar_item);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayUseLogoEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);

		btn = (Button) findViewById(R.id.dropdown);
		btn.setOnClickListener(new OnClickListener() {  
	           
	           @Override  
	           public void onClick(View v) {  
	            //Creating the instance of PopupMenu  
	            final PopupMenu popup = new PopupMenu(MainActivity.this, btn);  
	            //Inflating the Popup using xml file  
	            popup.getMenuInflater().inflate(R.menu.main_dropdown, popup.getMenu());  
	           
	            //registering popup with OnMenuItemClickListener  
	            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {  
	             public boolean onMenuItemClick(MenuItem item) {  
	            	 

						if (item.getTitle().toString().equalsIgnoreCase("Customer Info")) {
							System.out.println("Customer Info CLICKED-------");
							btn.setText(item.getTitle().toString());
							
							popup.inflate(color.black);
						

						}
						if (item.getTitle().toString().equalsIgnoreCase("Product Guide")) {
							System.out.println("Product Guide CLICKED-------");
							btn.setText(item.getTitle().toString());
						

						}
						if (item.getTitle().toString().equalsIgnoreCase("Step by Step")) {
							System.out.println("Step by Step CLICKED-------");
							btn.setText(item.getTitle().toString());
							//btn.setTextColor(Color.RED);
							PopupMenu mypopup = new PopupMenu(MainActivity.this, btn);
							// Inflating the Popup using xml file
							mypopup.getMenuInflater().inflate(R.menu.popup_section,
									mypopup.getMenu());
							mypopup.show();
							mypopup.setOnMenuItemClickListener(new OnMenuItemClickListener() {
								
								@Override
								public boolean onMenuItemClick(MenuItem item) {
									// TODO Auto-generated method stub
									if (item.getTitle().toString().equalsIgnoreCase("Questionnaire")) {
										System.out.println("Questionnaire  CLICKED-------");
										btn.setText(item.getTitle().toString());
									

									}
									return true;
								}
							});

						};
	             
	              return true;  
	             }  
	            });  
	  
	            popup.show();//showing popup menu  
	           }  
	          });//closing
		// Spin2 = (Spinner) findViewById(R.id.spinner2);

		//Spin1.setAdapter(adapter);

		/*Spin1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				Log.e("In main listener", "In main listener block======="
						+ position);
				// TODO Auto-generated method stub
				if (position == 2) {
					Log.e("In action listener", "In listener block=======");
					PopupMenu popup = new PopupMenu(MainActivity.this, Spin1);
					// Inflating the Popup using xml file
					popup.getMenuInflater().inflate(R.menu.popup_section,
							popup.getMenu());
					popup.show();

				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});*/
		/*
		 * Spin1.setOnItemClickListener(new OnItemClickListener() {
		 * 
		 * @Override public void onItemClick(AdapterView<?> arg0, View arg1, int
		 * arg2, long arg3) { // TODO Auto-generated method stub PopupMenu popup
		 * = new PopupMenu(MainActivity.this, Spin1); // Inflating the Popup
		 * using xml file popup.getMenuInflater().inflate(R.menu.popup_menu,
		 * popup.getMenu()); } });
		 */
		// Spin2.setAdapter(adapter);
		// spnr = (Spinner) findViewById(R.id.quicklink);
		/*
		 * ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(this,
		 * android.R.layout.simple_spinner_item, state); adapter_state
		 * .setDropDownViewResource
		 * (android.R.layout.simple_spinner_dropdown_item);
		 * spinnerOsversions.setAdapter(adapter_state);
		 * spnr.setAdapter(adapter_state);
		 */
		// actionbarUI();
		// List<Fragment> fragments = getFragments();
		frag_create();
		imageView1 = (ImageView) findViewById(R.id.imageView1);

		imageView1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Creating the instance of PopupMenu
				final PopupMenu popup = new PopupMenu(MainActivity.this,
						imageView1);
				// Inflating the Popup using xml file
				popup.getMenuInflater().inflate(R.menu.popup_menu,
						popup.getMenu());

				// registering popup with OnMenuItemClickListener

				popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					public boolean onMenuItemClick(MenuItem item) {
						

						if (item.getTitle().toString().equalsIgnoreCase("Home")) {
							System.out.println("HOME CLICKED-------");

							getActionBar().hide();
							FragmentTransaction ft = getSupportFragmentManager()
									.beginTransaction();
							Fragment1 home = new Fragment1();
							// Replace the container with the new fragment
							ft.replace(R.id.your_placeholder, home,
									Fragment1.TAG);
							ft.addToBackStack(null);
							ft.commit();

						}
						if (item.getTitle().toString()
								.equalsIgnoreCase("New Customer")) {
							System.out.println("New Customer-------");

							getActionBar().hide();
							FragmentTransaction ft = getSupportFragmentManager()
									.beginTransaction();
							Loginfrag login = new Loginfrag();
							// Replace the container with the new fragment
							ft.replace(R.id.your_placeholder, login,
									Loginfrag.TAG);
							ft.addToBackStack(null);
							ft.commit();

						}
						if (item.getTitle().toString()
								.equalsIgnoreCase("Existing Customer")) {
							System.out
									.println("Existing Customer CLICKED-------");

							getActionBar().hide();
							FragmentTransaction ft = getSupportFragmentManager()
									.beginTransaction();
							Returning returnfrag = new Returning();
							// Replace the container with the new fragment
							ft.replace(R.id.your_placeholder, returnfrag,
									Returning.TAG);
							ft.addToBackStack(null);
							ft.commit();

						}
						
						if(item.getTitle().toString().equalsIgnoreCase("Lookup CRM"))
						{
							
							getActionBar().hide();
//							FragmentTransaction ft = getSupportFragmentManager()
//									.beginTransaction();
//							Lookup_crm lookup = new Lookup_crm();
//							// Replace the container with the new fragment
//							ft.replace(R.id.your_placeholder, lookup,Lookup_crm.TAG);
//							ft.addToBackStack(null);
//							ft.commit();
//							
							Intent it=new Intent(MainActivity.this,CRMAddActivity.class);
							startActivity(it);
							
							
						}
						

						return true;
					}
				});

				// Testing portion

				popup.show();// showing popup menu
			}
		});

		System.out.println("end of activity============");
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		FrameLayout fl = (FrameLayout) findViewById(R.id.your_placeholder);
		// System.out.println(fl.getChildCount());
		// Fragment myFragment =
		// getSupportFragmentManager().findFragmentByTag("Fragment1");
		// Fragment1 fragment1=new Fragment1();
		int mycount = getSupportFragmentManager().getBackStackEntryCount();
		Log.v("Child count is------ ", mycount + "");
		// fragment1.getTag().equalsIgnoreCase("Fragment1");
		System.out.println("back hardware clicked--");
		Fragment fragment = getSupportFragmentManager().findFragmentByTag(
				"Fragment1");
		Bring brings = new Bring();
		Fragment bringfrag = getSupportFragmentManager().findFragmentByTag(
				"Bring");
		int count = fl.getChildCount();

		if (fragment instanceof Fragment1) {

			new AlertDialog.Builder(this)
					.setTitle("Close App?")

					.setMessage("Do you really want to close this app?")
					.setPositiveButton("YES",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									finish();
								}
							})
					.setNegativeButton("NO",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
								}
							}).show();

		} else if (getSupportFragmentManager().getBackStackEntryCount() == 3)

		{
			System.out.println("in block i wanted---");
			// getSupportFragmentManager().popBackStackImmediate();
			getActionBar().hide();
			super.onBackPressed();
		} else {
			System.out.println("normal back");
			super.onBackPressed();
		}
	}

	public void frag_create() {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		Fragment1 frag1 = new Fragment1();
		// Replace the container with the new fragment
		ft.add(R.id.your_placeholder, frag1, Fragment1.TAG);
		ft.addToBackStack(null);
		//getActionBar().hide();
		System.out.println("fragment applied===");
		// or ft.add(R.id.your_placeholder, new FooFragment());
		// Execute the changes specified
		ft.commit();
	}

	private List<Fragment> getFragments() {
		List<Fragment> fList = new ArrayList<Fragment>();

		fList.add(MyFragment.newInstance("Home"));
		fList.add(MyFragment.newInstance("Home1"));
		fList.add(MyFragment.newInstance("Home2"));

		return fList;
	}

	public void actionbarUI() {/*
								 * 
								 * ArrayAdapter<String> adapter = new
								 * ArrayAdapter<String>( getBaseContext(),
								 * android
								 * .R.layout.simple_spinner_dropdown_item,
								 * actions);
								 */
		/** Enabling dropdown list navigation for the action bar */
		/*
		 * getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		 *//** Defining Navigation listener */
		/*
		 * ActionBar.OnNavigationListener navigationListener = new
		 * OnNavigationListener() {
		 * 
		 * @Override public boolean onNavigationItemSelected(int itemPosition,
		 * long itemId) { Toast.makeText(getBaseContext(), "You selected : " +
		 * actions[itemPosition], Toast.LENGTH_SHORT).show(); return false; } };
		 *//**
		 * Setting dropdown items and item navigation listener for the
		 * actionbar
		 */
		/*
		 * getActionBar().setListNavigationCallbacks(adapter,
		 * navigationListener);
		 */}

}
