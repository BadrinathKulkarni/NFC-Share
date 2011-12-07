package com.nfc.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NFCShareActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = (Button) findViewById(R.id.share);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent i = new Intent();
				i.setClassName(v.getContext(), "com.nfc.share.ShareViaNFC");
				startActivity(i);				
			}
		});
    }
}