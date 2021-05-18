package com.example.mapexamplejdgp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huawei.hms.maps.HuaweiMap
import com.huawei.hms.maps.OnMapReadyCallback
import com.huawei.hms.maps.SupportMapFragment
import com.huawei.hms.maps.model.LatLng
import com.huawei.hms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {


    private lateinit var map:HuaweiMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment= supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    override fun onMapReady(huaweiMap: HuaweiMap) {
        map=huaweiMap
        val marker= MarkerOptions ().position(LatLng(48.893478,2.334595))
        map.addMarker(marker)
    }
}