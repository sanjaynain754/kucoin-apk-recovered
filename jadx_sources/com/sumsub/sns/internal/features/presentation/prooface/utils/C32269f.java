package com.sumsub.sns.internal.features.presentation.prooface.utils;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.provider.Settings;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.utils.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32269f implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final Activity f65730a;

    /* JADX INFO: renamed from: b */
    public final Function0 f65731b;

    /* JADX INFO: renamed from: c */
    public SensorManager f65732c;

    /* JADX INFO: renamed from: d */
    public Sensor f65733d;

    /* JADX INFO: renamed from: e */
    public C32268e f65734e;

    /* JADX INFO: renamed from: f */
    public float f65735f = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m71079a() {
        SensorManager sensorManager = (SensorManager) this.f65730a.getSystemService("sensor");
        this.f65732c = sensorManager;
        this.f65733d = sensorManager != null ? sensorManager.getDefaultSensor(5) : null;
    }

    /* JADX INFO: renamed from: b */
    public final void m71081b() {
        SensorManager sensorManager = this.f65732c;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        C32268e c32268e = this.f65734e;
        if (c32268e == null || !((Boolean) this.f65731b.invoke()).booleanValue()) {
            return;
        }
        m71080a(c32268e);
        this.f65734e = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m71082c() {
        SensorManager sensorManager = this.f65732c;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.f65733d, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m71083d() {
        if (this.f65734e == null && this.f65735f < 10.0f && ((Boolean) this.f65731b.invoke()).booleanValue()) {
            int i11 = Settings.System.getInt(this.f65730a.getContentResolver(), "screen_brightness_mode", -1);
            int i12 = Settings.System.getInt(this.f65730a.getContentResolver(), "screen_brightness", -1);
            this.f65734e = (i11 == -1 || i12 == -1) ? null : new C32268e(i11, i12);
            m71080a(new C32268e(0, 255));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        AbstractC32267d.m71078a("ScreenBrightnessController: onAccuracyChanged: sensor: " + sensor + ", accuracy: " + i11);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f65735f = sensorEvent.values[0];
        m71083d();
    }

    public C32269f(FragmentActivity fragmentActivity, Function0 function0) {
        this.f65730a = fragmentActivity;
        this.f65731b = function0;
    }

    /* JADX INFO: renamed from: a */
    public final void m71080a(C32268e c32268e) {
        AbstractC32267d.m71078a("ScreenBrightnessController: changeScreenBrightness: illumination: " + this.f65735f);
        Settings.System.putInt(this.f65730a.getContentResolver(), "screen_brightness_mode", c32268e.f65728a);
        Settings.System.putInt(this.f65730a.getContentResolver(), "screen_brightness", c32268e.f65729b);
        WindowManager.LayoutParams attributes = this.f65730a.getWindow().getAttributes();
        attributes.screenBrightness = c32268e.f65729b / 255.0f;
        this.f65730a.getWindow().setAttributes(attributes);
    }
}
