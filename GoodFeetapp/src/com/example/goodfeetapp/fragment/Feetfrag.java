package com.example.goodfeetapp.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goodfeetapp.R;

public class Feetfrag extends Fragment  implements OnClickListener{
	String[] choices = {"1", "2", "3", "4", "5"};
	Button btn_a,btn_b,btn_c,btn_d,btn_e,btn_f,btn_g,btn_h,btn_i,btn_j,btn_k,btn_l,btn_m,btn_n,btn_o,btn_p,btn_q,btn_r,btn_s,btn_t,btn_u,btn_v;
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.feet, container, false);
	      
			btn_a = (Button) view.findViewById(R.id.btn_A);
			btn_b = (Button) view.findViewById(R.id.btn_B);
			
			btn_c = (Button) view.findViewById(R.id.btn_C);
			btn_d = (Button) view.findViewById(R.id.btn_D);
			btn_e = (Button) view.findViewById(R.id.btn_E);
			btn_f = (Button) view.findViewById(R.id.btn_F);
			btn_g = (Button) view.findViewById(R.id.btn_G);
			btn_h = (Button) view.findViewById(R.id.btn_H);
			
			btn_i = (Button) view.findViewById(R.id.btn_I);
			btn_j = (Button) view.findViewById(R.id.btn_j);
			btn_k = (Button) view.findViewById(R.id.btn_k);
			btn_l = (Button) view.findViewById(R.id.btn_l);
			btn_m = (Button) view.findViewById(R.id.btn_M);
			btn_n = (Button) view.findViewById(R.id.btn_N);
			btn_o = (Button) view.findViewById(R.id.btn_o);
			btn_p = (Button) view.findViewById(R.id.btn_p);
			btn_q = (Button) view.findViewById(R.id.btn_q);
			btn_r = (Button) view.findViewById(R.id.btn_r);
			btn_s = (Button) view.findViewById(R.id.btn_S);
			btn_t = (Button) view.findViewById(R.id.btn_T);
			btn_u = (Button) view.findViewById(R.id.btn_U);
			btn_v = (Button) view.findViewById(R.id.btn_V);
			
			btn_a.setOnClickListener((OnClickListener) this);
			btn_b.setOnClickListener((OnClickListener) this);
			btn_c.setOnClickListener((OnClickListener) this);
			btn_d.setOnClickListener((OnClickListener) this);
			btn_e.setOnClickListener((OnClickListener) this);
			btn_f.setOnClickListener((OnClickListener) this);
			btn_g.setOnClickListener((OnClickListener) this);
			
			btn_h.setOnClickListener((OnClickListener) this);
			btn_i.setOnClickListener((OnClickListener) this);
			btn_j.setOnClickListener((OnClickListener) this);
			btn_k.setOnClickListener((OnClickListener) this);
			btn_l.setOnClickListener((OnClickListener) this);
			
			btn_m.setOnClickListener((OnClickListener) this);
			btn_n.setOnClickListener((OnClickListener) this);
			btn_o.setOnClickListener((OnClickListener) this);
			btn_p.setOnClickListener((OnClickListener) this);
			btn_q.setOnClickListener((OnClickListener) this);
			
			btn_r.setOnClickListener((OnClickListener) this);
			btn_s.setOnClickListener((OnClickListener) this);
			btn_t.setOnClickListener((OnClickListener) this);
			btn_u.setOnClickListener((OnClickListener) this);
			btn_v.setOnClickListener((OnClickListener) this);
	      System.out.println("in fragment login");
	      ImageView send = (ImageView) view.findViewById(R.id.next);
	     
	     
	      send.setOnClickListener(new OnClickListener() {
	    	  
			@Override 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getFragmentManager().beginTransaction();
	      		Bodyfrag body = new Bodyfrag();
	      		// Replace the container with the new fragment
	      		ft.replace(R.id.your_placeholder, body, Bodyfrag.TAG);
	      		ft.addToBackStack(null);
	      		// or ft.add(R.id.your_placeholder, new FooFragment());
	      		// Execute the changes specified
	      		ft.commit();
			}
		});
	     
	      ImageView previous = (ImageView) view.findViewById(R.id.previous);
	      previous.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 getFragmentManager().popBackStackImmediate(); 
					
				}
			});
	      return view;
	    }
	 
	 public void my_dialog(final View v)
		{

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
			final TextView myView = new TextView(getActivity());
			myView.setText("Please select on a scale from 1-5 how much pain you�re having in the selected area");
			myView.setGravity(Gravity.CENTER);
			myView.setTextSize(18);
			myView.setPadding(6,6,6, 6);
			builder.setCustomTitle(myView);
			//builder.setTitle("Please select on a scale from 1-5 how much pain you�re having in the selected area");
			
			builder.setItems(choices, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// the user clicked on colors[which]

					switch (which) {

					case 0:
						v.setBackgroundResource(R.drawable.step1_red);

						break;
					case 1:
						v.setBackgroundResource(R.drawable.step2_red);

						break;
					case 2:
						v.setBackgroundResource(R.drawable.step3_red);

						break;
					case 3:
						v.setBackgroundResource(R.drawable.step4_red);

						break;
					case 4:
						v.setBackgroundResource(R.drawable.step5_red);

						break;

					}
				}
			});
			
			builder.show().getWindow().setLayout(360,345);
			
			
			

		}
	@Override
	public void onClick(View v) {
		
		System.out.println("in on click====================");
		 switch(v.getId()) {
		    case R.id.btn_A:
		        //Play voicefile
		    	my_dialog(v);
		    	
		    	
		        break;
		    case R.id.btn_B:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_C:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_D:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_E:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_F:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		        
		    case R.id.btn_G:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_H:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_I:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_j:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		        
		    case R.id.btn_k:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_l:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_M:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_N:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_o:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		        
		    case R.id.btn_p:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_q:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_r:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		        
		    case R.id.btn_S:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_T:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_U:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		    case R.id.btn_V:
		        //Stop MediaPlayer
		    	my_dialog(v);
		        break;
		   
		    }
		 
		
		
		
		
		// TODO Auto-generated method stub
		
	}
}
