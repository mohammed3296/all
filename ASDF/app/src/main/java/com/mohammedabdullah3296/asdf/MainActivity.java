package com.mohammedabdullah3296.asdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.rilixtech.Country;
import com.rilixtech.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    String countryCodeAndroid = "91";
    CountryCodePicker ccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asd);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        ccp.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected(Country country) {
                countryCodeAndroid = ccp.getSelectedCountryCode();
                Log.d("Country Code", countryCodeAndroid);
                Toast.makeText(MainActivity.this, countryCodeAndroid, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
