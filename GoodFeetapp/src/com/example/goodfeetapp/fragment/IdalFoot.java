package com.example.goodfeetapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goodfeetapp.R;

public class IdalFoot extends Fragment {

	public static String TAG="IdalFoot";
	
	TextView txtleft1,txtleft2,txtright1,txtright2;
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.ideal_foot2, container, false);
	     ImageView img=(ImageView) view.findViewById(R.id.back);
	     img.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 getFragmentManager().popBackStackImmediate(); 
				
			}
		});
	  txtleft1=(TextView)view.findViewById(R.id.text1_left);
	  txtleft2=(TextView)view.findViewById(R.id.text2_left);
	  txtright1=(TextView)view.findViewById(R.id.text1_right);
	  txtright2=(TextView)view.findViewById(R.id.text2_right);
	     
	    txtleft1.setText("Toes are Evenly Spaced \n Color isnt darker than foot\n & space appears Between back\n of foot and toes");
	     txtleft2.setText("Color is consistent\n Letting you know\n that the  pressure is Evenly dispersed \n 1/3 of heel \n 1/3 on ball of foot \n 1/3 on Arch!");
	     txtright1.setText("Second toes lines up\n  with the in side of heel\n and  the fifth of the littel toe\n lines up with outer heel");
	     txtright2.setText("Arch cuts back nice \n and clean under the ball \n of the foot and the heel of foot");
	     
	     //txtleft1.setText(Html.fromHtml("Toes are Evenly Spaced"+"\n"+"Color isnt darker than foot" +"\n"+"& space appears Between back of foot and toes"));
	      
	      return view;
	    }
}
