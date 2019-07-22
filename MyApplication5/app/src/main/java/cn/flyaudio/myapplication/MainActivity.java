package cn.flyaudio.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private String TAG= "MainActivity";
    private VerticalSeekBar mseekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mseekbar = (VerticalSeekBar)this.findViewById(R.id.seekBar1);
        mseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.d(TAG,"onprogresschanged  b = "+b);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d(TAG,"onStartTrackingTouch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d(TAG,"onStopTrackingTouch");
            }
        });
    }
}
