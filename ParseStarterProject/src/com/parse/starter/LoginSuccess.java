package com.parse.starter;

import com.parse.ParseQueryAdapter;
import com.parse.ParseUser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginSuccess extends Activity {

    Button logout;
    private ParseQueryAdapter<Post> queryAdapter;
    private ParseQueryAdapter.QueryFactory<Post> queryRequirements;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_success);
        ParseUser currentUser = ParseUser.getCurrentUser();
        String struser = currentUser.getUsername().toString();
        TextView txtuser = (TextView) findViewById(R.id.txtuser);
        txtuser.setText("You are logged in as " + struser);
        logout = (Button) findViewById(R.id.logout);















        logout.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                ParseUser.logOut();
                finish();
            }
        });
    }
}
