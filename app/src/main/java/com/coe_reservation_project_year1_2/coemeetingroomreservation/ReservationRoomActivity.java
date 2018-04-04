package com.coe_reservation_project_year1_2.coemeetingroomreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ReservationRoomActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView arrowBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_room);

        arrowBack = (ImageView) findViewById(R.id.arrow_from_calendar);
        arrowBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == (View) arrowBack){
            final Intent arrowIntent = new Intent(ReservationRoomActivity.this, MainMenuActivity.class);
            ReservationRoomActivity.this.startActivity(arrowIntent);
            ReservationRoomActivity.this.finish();
        }
    }
}
