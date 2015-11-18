package com.example.smpractica1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Este metodo se ejecuta al pulsar el boton Login de "fr_sesion", en esta vista se presentan
 * los datos de usuario (user,password,ip,puerto)a traves del metodo setText(), introducidos
 * previamente en "fr_sesion" y obtenidos mediante getString().
 */

public class Activity2 extends Activity 
{
	String user;
	String pass;
	String dirIP;
	String port;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);
		
		final TextView userAct2 = (TextView) findViewById(R.id.textView3);
		final TextView passAct2 = (TextView) findViewById(R.id.textView2);
		final TextView ipAct2 = (TextView) findViewById(R.id.textView4);
		final TextView portAct2 = (TextView) findViewById(R.id.textView5);
		
		Bundle bd = getIntent().getExtras();
		
		this.user = bd.getString("user");
		this.pass = bd.getString("pass");
		this.dirIP = bd.getString("dirIP");
		this.port = bd.getString("port");
		
		userAct2.setText(user);
		passAct2.setText(pass);
		ipAct2.setText(dirIP);
		portAct2.setText(port);
	
	}
}