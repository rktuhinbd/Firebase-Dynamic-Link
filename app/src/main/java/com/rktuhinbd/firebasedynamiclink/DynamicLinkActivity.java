package com.rktuhinbd.firebasedynamiclink;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DynamicLinkActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_link);

        textView = findViewById(R.id.tvDeeplink);

        getExtras();
    }

    private void getExtras() {
        String dynamicLink = getIntent().getStringExtra("DynamicLink");
        if (dynamicLink != null && !dynamicLink.isEmpty()) {
            textView.setText(dynamicLink);
        }
    }
}