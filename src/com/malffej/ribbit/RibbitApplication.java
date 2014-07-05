package com.malffej.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "30Pulvm2exhchVNArHXW33woxkGVKMLqituLDiPh", "zXkudOpoLP0TWjyaNacyNyT9fFsMGB0k5hRfK5pj");
		  
		  
		}
}
