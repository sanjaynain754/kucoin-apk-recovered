package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.camera.C9298a;
import com.journeyapps.barcodescanner.camera.CameraSettings;

/* JADX INFO: loaded from: classes56.dex */
public final class AmbientLightManager implements SensorEventListener {
    private static final float BRIGHT_ENOUGH_LUX = 450.0f;
    private static final float TOO_DARK_LUX = 45.0f;
    private C9298a cameraManager;
    private CameraSettings cameraSettings;
    private Context context;
    private Handler handler = new Handler();
    private Sensor lightSensor;

    private void setTorch(final boolean z11) {
        this.handler.post(new Runnable() { // from class: com.google.zxing.client.android.AmbientLightManager.1
            @Override // java.lang.Runnable
            public void run() {
                AmbientLightManager.this.cameraManager.m14413s(z11);
            }
        });
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f11 = sensorEvent.values[0];
        if (this.cameraManager != null) {
            if (f11 <= TOO_DARK_LUX) {
                setTorch(true);
            } else if (f11 >= BRIGHT_ENOUGH_LUX) {
                setTorch(false);
            }
        }
    }

    public void start() {
        if (this.cameraSettings.m14389d()) {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.lightSensor = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void stop() {
        if (this.lightSensor != null) {
            ((SensorManager) this.context.getSystemService("sensor")).unregisterListener(this);
            this.lightSensor = null;
        }
    }

    public AmbientLightManager(Context context, C9298a c9298a, CameraSettings cameraSettings) {
        this.context = context;
        this.cameraManager = c9298a;
        this.cameraSettings = cameraSettings;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
