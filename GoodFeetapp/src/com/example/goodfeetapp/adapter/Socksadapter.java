package com.example.goodfeetapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.goodfeetapp.R;

public class Socksadapter extends BaseAdapter {
	private Context mContext;
	
	boolean isClicked0=true;
	boolean isClicked1=true;
	boolean isClicked2=true;
	boolean isClicked3=true;																								
	boolean isClicked4=true;
	boolean isClicked5=true;
	boolean isClicked6=true;
	boolean isClicked7=true;
	
	

	public Socksadapter(Context c) {
		
		mContext = c;
		
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(final int position, View convertView, ViewGroup parent) {
		final Button imageView;
		if (convertView == null) { // if it's not recycled, initialize some
									// attributes
			imageView = new Button(mContext);
			// imageView.setBackgroundColor(Color.b);
			imageView.setLayoutParams(new GridView.LayoutParams(125, 70));
			imageView.setBackgroundResource(R.drawable.my_shape);
			imageView.setTextColor(Color.parseColor("#ffffff")); 
			imageView.setTextSize(18);
			imageView.setPadding(2, 2, 2, 2);

		} else {
			
			imageView = (Button) convertView;
			
		}
		
		imageView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Toast.makeText(mContext, " Hello This i position [0]" + position, Toast.LENGTH_SHORT).show();
				 if(position==0&&isClicked0==true)
				 {
					 
					
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red); 
					 isClicked0=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==0)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked0=true;
					 }
				 }
				 //1
				 
				 if(position==1&&isClicked1==true)
				 {
					 
					
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red); 
					 isClicked1=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==1)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked1=true;
					 }
				 }
				 
				 //2
				 
				 if(position==2&&isClicked2==true)
				 {
					 
					
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red); 
					 isClicked2=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==2)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked2=true;
					 }
				 }
				 
				 
				 //3
				 if(position==3&&isClicked3==true)
				 {
					 
					 
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red); 
					 isClicked3=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==3)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked3=true;
					 }
				 }
				 
				 //4
				 if(position==4&&isClicked4==true)
				 {
					 
					 
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red);  
					 isClicked4=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==4)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked4=true;
					 }
				 }
				 //5
				 
				 if(position==5&&isClicked5==true)
				 {
					 
					
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red); 
					 isClicked5=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==5)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked5=true;
					 }
				 }
				 
				 //6
				 
				 if(position==6&&isClicked6==true)
				 {
					 
					
					
				
					// btn_shoe.setBackgroundResource(R.drawable.red);
					 imageView.setBackgroundResource(R.drawable.clicked_red);  
					 isClicked6=false;
					 
					 System.out.println("a1 is true===========");
					 
				 }
				 else
				 {
					 System.out.println("a1 is false===========");
					 if(position==6)
					 {
						 imageView.setBackgroundResource(R.drawable.my_shape);
						
					isClicked6=true;
					 }
				 }
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		

		imageView.setText(mThumbIds[position]);
		return imageView;
	}

	// references to our images
	private String[] mThumbIds = { "Dress", "Cotton", "Compression",
			"Tech!", "Wool!", "Diabetic!",
			"Additional styles!"  };
}
