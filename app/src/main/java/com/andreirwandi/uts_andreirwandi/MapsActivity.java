package com.andreirwandi.uts_andreirwandi;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap Loc;
    ArrayList<LatLng> arrayList = new ArrayList<LatLng>();
    LatLng EzyFoodyJakarta = new LatLng( -6.1472, 106.8361);
    LatLng EzyFoodySurabaya = new LatLng( -7.2892, 112.7344);
    LatLng EzyFoodyMedan = new LatLng(3.5852, 98.6756);
    LatLng EzyFoodyBandung = new LatLng(-6.9147, 107.6098);
    LatLng EzyFoodySemarang = new LatLng(-6.9667, 110.4167);
    LatLng EzyFoodyBali = new LatLng(-8.7255, 115.1779);
    LatLng EzyFoodyBalikpapan = new LatLng(-1.2658, 116.8977);
    LatLng EzyFoodyLampung = new LatLng(-5.1158, 105.2868);

    private String[] name = {"EzyFoody Jakarta", "EzyFoody Surabaya", "EzyFoody Medan",
            "EzyFoody Bandung", "EzyFoody Semarang", "EzyFoody Bali", "EzyFoody Balikpapan", "EzyFoody Lampung"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(EzyFoodyJakarta);
        arrayList.add(EzyFoodySurabaya);
        arrayList.add(EzyFoodyMedan);
        arrayList.add(EzyFoodyBandung);
        arrayList.add(EzyFoodySemarang);
        arrayList.add(EzyFoodyBali);
        arrayList.add(EzyFoodyBalikpapan);
        arrayList.add(EzyFoodyLampung);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        Loc = googleMap;

        // Add a marker in Sydney and move the camera
        for (int i = 0;i<arrayList.size();i++){
            Loc.addMarker(new MarkerOptions().position(arrayList.get(i)).title(name[i]));
            CameraPosition cameraPosition = new CameraPosition.Builder().target(arrayList.get(i)).zoom(17).build();
            Loc.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
        }
    }
}