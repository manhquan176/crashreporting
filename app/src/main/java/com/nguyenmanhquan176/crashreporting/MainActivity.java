package com.nguyenmanhquan176.crashreporting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.crash.FirebaseCrash;

public class MainActivity extends AppCompatActivity {

  private Button btnTest;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btnTest =(Button) findViewById(R.id.btnTest);
    btnTest.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        float a = 5/0;
      }
    });
    Exception exception = new Exception("Oops! Firebase non-fatal error!");
    FirebaseCrash.report(exception);
    FirebaseCrash.log("Button clicked!");
  }
}
