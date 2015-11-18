package com.example.smpractica1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Este fragmento consta del boton "Entrar", el cual una vez pulsado
 * inicia la vista "fr_sesion".
 */


public class FragmentoPr2 extends Fragment 
{

	public View onCreateView(LayoutInflater l, ViewGroup vg, Bundle savedInstaceState)
	{
		View vista = l.inflate(R.layout.fragmento_pr2, vg, false);
		
		ImageButton buttonInicio = (ImageButton) vista.findViewById(R.id.botonEntrar);
		
		buttonInicio.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				FragmentManager frm3 = getFragmentManager();
				FragmentTransaction frt3 = frm3.beginTransaction();
				FragmentoSesion frSesion = new FragmentoSesion();
				
				frt3.replace(R.id.container, frSesion);
				frt3.commit();
			}
		});
		
		return vista;
	}	
}