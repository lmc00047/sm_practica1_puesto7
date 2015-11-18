package com.example.smpractica1;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;


/**
 * Este es el metodo principal que se ejecuta al iniciar la aplicacion
 * y en el cual se añaden de forma dinamica 2 fragmentos en sus correspondientes
 * contenedores.
 */
public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		FragmentManager fManager = getFragmentManager();
		FragmentTransaction fTransaction = fManager.beginTransaction();
		
		FragmentoPr fr1 = new FragmentoPr();
		FragmentoPr2 fr2 = new FragmentoPr2();
		
		Fragment fm1 = fManager.findFragmentById(R.id.container);
		Fragment fm2 = fManager.findFragmentById(R.id.container2);
		
		if(fm1 == null && fm2 == null)
		{
			fTransaction.add(R.id.container, fr1);
			
			fTransaction.add(R.id.container2, fr2);
			
			fTransaction.commit();
		
		}	
	}
}