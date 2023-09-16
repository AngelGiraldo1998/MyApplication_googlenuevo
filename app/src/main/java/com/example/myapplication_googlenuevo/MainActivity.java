package com.example.myapplication_googlenuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng sydney = new LatLng(-1.012446148437241, -79.46942795298675);
        mMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("UTEQ-Elabo:AngeL Giraldo")
        .snippet("Universidad Tecnica Estatal de Quevedo"));
                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo)));

        //LatLng sydney2 = new LatLng(-1.0801191171866176, -79.50145479050174);
       // mMap.addMarker(new MarkerOptions()
        // .position(sydney)
                //.title("UTEQ")
                //.snippet("UTEQ Ext.:La Maria"));
                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo)));
        float zoomLevel = 15.0f;
        mMap.setMaxZoomPreference(4);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,6));

    }

    }
