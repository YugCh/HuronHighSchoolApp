package com.example.yug.huronhighschoolapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.security.interfaces.ECKey;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap1 = googleMap;

        // Add a marker for Huron High School
        LatLng HuronHighSchool = new LatLng(42.281477, -83.703014);
        mMap1.addMarker(new MarkerOptions().position(HuronHighSchool).title("Huron High School"));

        // Add a marker for every popular restaurant near Huron High School
        LatLng Potbelly = new LatLng(42.256204, -83.686153);
        mMap1.addMarker(new MarkerOptions().position(Potbelly).title("Potbelly"));

        LatLng Chilis = new LatLng(42.255850, -83.686926);
        mMap1.addMarker(new MarkerOptions().position(Chilis).title("Chili's"));

        LatLng Fiveguys = new LatLng(42.256099, -83.688088);
        mMap1.addMarker(new MarkerOptions().position(Fiveguys).title("Five Guys"));

        LatLng Blaze = new LatLng(42.254782, -83.689288);
        mMap1.addMarker(new MarkerOptions().position(Blaze).title("Blaze Pizza"));

        LatLng Hungryhowies = new LatLng(42.256639, -83.692273);
        mMap1.addMarker(new MarkerOptions().position(Hungryhowies).title("Hungry Howie's"));

        LatLng Jjs = new LatLng(42.255850, -83.686926);
        mMap1.addMarker(new MarkerOptions().position(Jjs).title("Jimmy John's"));

        LatLng Elevation = new LatLng(42.256796, -83.692539);
        mMap1.addMarker(new MarkerOptions().position(Elevation).title("Elevation Burger"));

        LatLng Chipotle = new LatLng(42.255575, -83.693248);
        mMap1.addMarker(new MarkerOptions().position(Chipotle).title("Chipotle"));

        LatLng Qdoba = new LatLng(42.257172, -83.696101);
        mMap1.addMarker(new MarkerOptions().position(Qdoba).title("Qdoba"));

        LatLng Panera = new LatLng(42.258001, -83.697165);
        mMap1.addMarker(new MarkerOptions().position(Panera).title("Panera"));

        LatLng Zola = new LatLng(42.257023, -83.699144);
        mMap1.addMarker(new MarkerOptions().position(Zola).title("Zola Bistro"));

        LatLng Starbucks = new LatLng(42.255677, -83.688003);
        mMap1.addMarker(new MarkerOptions().position(Starbucks).title("Starbucks"));

        mMap1.moveCamera(CameraUpdateFactory.newLatLng(HuronHighSchool));
        mMap1.animateCamera(CameraUpdateFactory.zoomTo(13.0f));

    }
}
