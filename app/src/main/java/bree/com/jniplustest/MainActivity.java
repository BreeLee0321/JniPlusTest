package bree.com.jniplustest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {


static {
    System.loadLibrary("hello");
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "plus(1,2):" + plus(1, 2));

    }
    public native int plus(int x,int y);
}
