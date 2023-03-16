package com.basic.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method is invoked when the "EAT COOKIE" button is clicked.
     */
    public void changeStatus(View view) {
        // Show "after_cookie" image.
        ImageView cookieImageView = findViewById(R.id.cookie_image_view);
        cookieImageView.setImageResource(R.drawable.after_cookie);

        // Update status TextView text.
        TextView statusTextView = findViewById(R.id.status_text_view);
        statusTextView.setText(R.string.after_eating);
    }
}