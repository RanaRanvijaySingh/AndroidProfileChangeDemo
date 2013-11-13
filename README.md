AndroidProfileChangeDemo
========================
This application shows how to change the phone profile from normal to silent and from silent to normal in an application.
<br/>Step 1:  Create the layout with two buttons.
<br/>Step 2:  Create the class to handle the onclick functions to change the profile .
<br/><br/>
____________________________________________________________________________________________________________________________________________________________
Step 1:  Create the layout with two buttons.

    <Button
        android:id="@+id/buttonSilent"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="silent" />

    <Button
        android:id="@+id/buttonNormal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="normal" />
____________________________________________________________________________________________________________________________________________________________
Step 2:  Create the class to handle the onclick functions to change the profile . 

	AudioManager mode;

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


____________________________________________________________________________________________________________________________________________________________
