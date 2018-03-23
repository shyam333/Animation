package helloworld.demo.com.pongal;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    AnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

imageView = findViewById(R.id.img);

if(imageView == null)throw new AssertionError();

imageView.setBackgroundResource(R.drawable.animation);
anim = (AnimationDrawable)imageView.getBackground();

anim.start();



    }
}
