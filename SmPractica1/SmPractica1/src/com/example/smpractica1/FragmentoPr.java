package com.example.smpractica1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * En este fragmento se presenta la informacion de la practica
 * y los nombre de los autores.
 */
public class FragmentoPr extends Fragment 
{

	public View onCreateView(LayoutInflater l, ViewGroup vg, Bundle savedInstaceState)
	{
		return l.inflate(R.layout.fragmento_pr, vg, false);
	}	
}