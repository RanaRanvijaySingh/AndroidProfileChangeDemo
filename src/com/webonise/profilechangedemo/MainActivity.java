package com.webonise.profilechangedemo;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author Ranvijay This application shows how to change the profile of the
 *         phone . It's mainly switching between the silent mode and normal
 *         mode.
 */
public class MainActivity extends Activity implements OnClickListener {

	AudioManager mode;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();

	}

	/**
	 * Function to initialize all the objects of the class.
	 */
	private void init() {
		Button buttonSilent = (Button) findViewById(R.id.buttonSilent);
		Button buttonNormal = (Button) findViewById(R.id.buttonNormal);
		buttonNormal.setOnClickListener(this);
		buttonSilent.setOnClickListener(this);
		mode = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		/*switch to silent mode and show a toast.*/
		case R.id.buttonSilent:
			mode.setRingerMode(AudioManager.RINGER_MODE_SILENT);
			Toast.makeText(getBaseContext(), "Silent Mode Activated",
					Toast.LENGTH_LONG).show();
			break;
		/* switch to normal mode and show the toast. */
		case R.id.buttonNormal:
			mode.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
			Toast.makeText(getBaseContext(), "Normal Mode Activated",
					Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}
	}

}
