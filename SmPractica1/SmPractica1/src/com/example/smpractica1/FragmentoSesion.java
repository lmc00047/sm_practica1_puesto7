package com.example.smpractica1;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Este fragmento consta de cuatro campos editables por el usuario
 * (usuario,password,ip,puerto) donde "usuario" es su nombre,
 * "password" es su contraseña, "ip" es la direccion ip del servidor al
 * cual quiere conectarse y "puerto" es la direccion en la cual escucha
 * el servidor. Despues de esto, se debe pulsar el boton "Login" para 
 * obtener el contenido de los campos editables y pasarlos a String para
 * poder almacenarlos y seguidamente cambiar a la vista "activity_2".
 */

public class FragmentoSesion extends Fragment
{
	public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle savedInstanceState)
	{
		View vista = li.inflate(R.layout.fr_sesion, vg, false);
		Button botonS = (Button) vista.findViewById(R.id.botonLoguearse);
		final EditText user = (EditText) vista.findViewById(R.id.UsuarioCampo);
		final EditText password = (EditText) vista.findViewById(R.id.PassCampo);
		final EditText ip = (EditText) vista.findViewById(R.id.IpCampo);
		final EditText port = (EditText) vista.findViewById(R.id.PuertoCampo);
		
		botonS.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				String usuario = user.getText().toString();
				String pass = password.getText().toString();
				String dirIP = ip.getText().toString();
				String puerto = port.getText().toString();
				
				Intent intent = new Intent(v.getContext(), Activity2.class);
				
				intent.putExtra("user", usuario);
				intent.putExtra("pass", pass);
				intent.putExtra("dirIP", dirIP);
				intent.putExtra("port", puerto);
				
				startActivity(intent);
			}
		});
		
		return vista;
	}
}