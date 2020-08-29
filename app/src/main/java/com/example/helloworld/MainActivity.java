package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
//import org.kaldi.Model;
import org.kaldi.hello;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
//        System.loadLibrary("native-lib");
//        System.loadLibrary("hello");
        System.loadLibrary("hello_jni");
//        System.loadLibrary("kaldi_jni");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
//        Model model = new Model("/storage/emulated/0/Android/data/files/sync/model-android");
//        tv.setText("We are wanting hello world from so");
        tv.setText(hello.returnHelloWorld());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();


}
