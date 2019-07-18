package com.gl.ledcontrol;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class LedControlAppService extends Service {
    static final String LOG_TAG = "LedControlAppService";
    public LedControlAppService() {
    }
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
//    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOG_TAG, "-> onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOG_TAG, "-> onStartCommand");
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // Return the interface
        return binder;
    }

    private final com.gl.ledcontrol.ILedControlApp.Stub binder = new com.gl.ledcontrol.ILedControlApp.Stub() {
        /**
         * LedControl initialization
         *
         * @return result 0 if successful, nonzero otherwise.
         */
        @Override public int initLedControl() throws android.os.RemoteException
        {
            Log.d(LOG_TAG, "-> initLedControl");
            return 0;
        }
        /**
         * LedControl setLedState
         *
         * @return result 0 if successful, nonzero otherwise.
         */
        @Override public int setLedState(int id, boolean status) throws android.os.RemoteException
        {
            Log.d(LOG_TAG, "-> setLedState");
            return 0;
        }
        /**
         * LedControl terminate
         *
         * @return result 0 if successful, nonzero otherwise.
         */
        @Override public int terminateLedState() throws android.os.RemoteException
        {
            Log.d(LOG_TAG, "-> terminateLedState");
            return 0;
        }
    };
}
