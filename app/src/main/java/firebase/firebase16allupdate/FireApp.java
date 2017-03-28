package firebase.firebase16allupdate;

import android.app.Application;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

//import com.google.firebase.FirebaseApp;﻿

/**
 * Created by Yazdani on 3/19/2017.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (!FirebaseApp.getApps(this).isEmpty()){
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }


    }


}
