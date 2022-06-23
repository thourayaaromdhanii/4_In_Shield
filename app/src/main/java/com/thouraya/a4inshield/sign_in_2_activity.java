package com.thouraya.a4inshield;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

    public class sign_in_2_activity extends Activity {


        private View _bg__sign_in_2_ek2;
        private View noise_texture_light_ek1;
        private View drop_shadow_2_ek3;
        private View background_color_ek3;
        private TextView button_label_ek3;
        private View bounds_ek3;
        private ImageView path_ek3;
        private View background_color_ek4;
        private View inner_shadow_1;
        private View background_color_ek5;
        private View inner_shadow_1_ek1;
        private TextView welcome_john__sign_in_to_continue_ek1;
        private View dark_color_13_ek1;
        private TextView username;
        private TextView forgot_password_;
        private TextView password;
        private View underline_ek1;
        private ImageView microsoftteams_image__23__2;
        private RelativeLayout SignIn;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.sign_in_2);


            button_label_ek3 = (TextView) findViewById(R.id.button_label_ek3);
            path_ek3 = (ImageView) findViewById(R.id.path_ek3);
            welcome_john__sign_in_to_continue_ek1 = (TextView) findViewById(R.id.welcome_john__sign_in_to_continue_ek1);
            dark_color_13_ek1 = (View) findViewById(R.id.dark_color_13_ek1);
            forgot_password_ = (TextView) findViewById(R.id.forgot_password_);
            underline_ek1 = (View) findViewById(R.id.underline_ek1);
            microsoftteams_image__23__2 = (ImageView) findViewById(R.id.microsoftteams_image__23__2);
            SignIn = (RelativeLayout) findViewById(R.id.component___button___normal_ek3);

           SignIn.setOnClickListener(new View.OnClickListener(){
               public void onClick(View v) {
                   Intent intent = new Intent(sign_in_2_activity.this,addprofile_activity.class);

                   startActivity(intent);
               }
           });

        }
    }
	
	