package com.thouraya.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

public class sign_in_1_activity extends Activity {


	private View _bg__sign_in_1_ek2;
	private View noise_texture_light;
	private View drop_shadow_2;
	private View background_color;
	private TextView button_label;
	private View bounds;
	private ImageView path;
	private View drop_shadow_2_ek1;
	private View background_color_ek1;
	private TextView button_label_ek1;
	private View bounds_ek1;
	private ImageView path_ek1;
	private View drop_shadow_2_ek2;
	private View background_color_ek2;
	private TextView button_label_ek2;
	private View bounds_ek2;
	private ImageView path_ek2;
	private TextView welcome_john__sign_in_to_continue;
	private View dark_color_13;
	private ImageView google_logo_1;
	private ImageView t_l_chargement_1;
	private ImageView icon_mail_png_transparent_background_mail_logo_11562851894ksatrtd2da_1;
	private ImageView microsoftteams_image__23__1;
	private TextView no_account__sign_up;
	private View underline;
	private RelativeLayout email;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in_1);

		button_label = (TextView) findViewById(R.id.button_label);
		path = (ImageView) findViewById(R.id.path);
		button_label_ek1 = (TextView) findViewById(R.id.button_label_ek1);
		path_ek1 = (ImageView) findViewById(R.id.path_ek1);
		button_label_ek2 = (TextView) findViewById(R.id.button_label_ek2);
		path_ek2 = (ImageView) findViewById(R.id.path_ek2);
		welcome_john__sign_in_to_continue = (TextView) findViewById(R.id.welcome_john__sign_in_to_continue);
		dark_color_13 = (View) findViewById(R.id.dark_color_13);
		google_logo_1 = (ImageView) findViewById(R.id.google_logo_1);
		t_l_chargement_1 = (ImageView) findViewById(R.id.t_l_chargement_1);
		icon_mail_png_transparent_background_mail_logo_11562851894ksatrtd2da_1 = (ImageView) findViewById(R.id.icon_mail_png_transparent_background_mail_logo_11562851894ksatrtd2da_1);
		microsoftteams_image__23__1 = (ImageView) findViewById(R.id.microsoftteams_image__23__1);
		no_account__sign_up = (TextView) findViewById(R.id.no_account__sign_up);
		underline = (View) findViewById(R.id.underline);
		email= (RelativeLayout) findViewById(R.id.component___button___normal_ek2) ;



		email.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				Intent intent = new Intent(sign_in_1_activity.this, sign_in_2_activity.class);

				startActivity(intent);
			}
		});
		no_account__sign_up.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				Intent intent = new Intent(sign_in_1_activity.this, sign_in_3_activity.class);

				startActivity(intent);
			}
		});
	}

}



	
	