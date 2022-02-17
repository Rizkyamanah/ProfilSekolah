package com.example.profilsekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class fasilitasActivity extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.ekskul1,
            R.drawable.ekskul2,R.drawable.ekskul1,R.drawable.ekskul2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
}