package com.unam.mismascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        //setHasOptionsMenu(true);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvFotos);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptadorMini ma = new MascotaAdaptadorMini(mascotas, getActivity());
        listaMascotas.setAdapter(ma);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy", 4));
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy", 3));
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy", 8));
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy", 9));
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy",6));
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy", 2));
        mascotas.add(new Mascota(R.drawable.perro3, "Mimzy", 1));
    }

}