package demo.ksq.com.garnisherdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import demo.ksq.com.garnisherdemo.bedeck.GreenHair;
import demo.ksq.com.garnisherdemo.jacket.WhiteJacket;
import demo.ksq.com.garnisherdemo.pants.BlackPants;
import demo.ksq.com.garnisherdemo.profession.Hunter;

/**
 * 装饰者模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GreenHair greenHair = new GreenHair(new WhiteJacket(new BlackPants(new Hunter())));
        Log.d("zzzz", greenHair.describe());
    }
}
