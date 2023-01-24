package com.example.geofenceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ai.nextbillion.maps.annotations.Marker;
import ai.nextbillion.maps.core.MapView;
import ai.nextbillion.maps.core.NextbillionMap;
import ai.nextbillion.maps.core.OnMapReadyCallback;
import ai.nextbillion.maps.geometry.LatLng;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
    }

    //        LIFECYCLE      //
    @Override
    protected void onStart(){
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
        mapView.onStop();
    }


    @Override
    public void onMapReady(@NonNull NextbillionMap nextbillionMap) {

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory(){
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

//    ADDING A MARKER
//    public Marker addMarker(@NonNull LatLng position)
}