package com.trnkarthik.splitimage;

import com.trnkarthik.splitimage.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button splitImage = (Button)findViewById(R.id.button1);
        splitImage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
                        R.drawable.karthik);
				Bitmap scaledBitmap = Bitmap.createScaledBitmap(icon, 240, 240, true);
				Bitmap[] imgs = new Bitmap[9];
				imgs[0] = Bitmap.createBitmap(scaledBitmap, 0, 0, 80 , 80);
				
				ImageView iv = (ImageView)findViewById(R.id.imageView1);
				//iv.setImageBitmap(imgs[0]);
				iv.setImageBitmap(scaledBitmap);
				
				Toast.makeText(getApplicationContext(), "Fuck off!", Toast.LENGTH_LONG).show();
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
