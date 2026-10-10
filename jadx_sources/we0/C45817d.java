package we0;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: renamed from: we0.d */
/* JADX INFO: loaded from: classes60.dex */
public class C45817d implements SensorEventListener {

    /* JADX INFO: renamed from: c */
    public SensorManager f103289c;

    /* JADX INFO: renamed from: e */
    public HandlerThread f103291e;

    /* JADX INFO: renamed from: f */
    public Handler f103292f;

    /* JADX INFO: renamed from: h */
    public int f103294h;

    /* JADX INFO: renamed from: i */
    public StringBuilder f103295i;

    /* JADX INFO: renamed from: m */
    public long f103299m;

    /* JADX INFO: renamed from: b */
    public String f103288b = "sensor";

    /* JADX INFO: renamed from: d */
    public Sensor f103290d = null;

    /* JADX INFO: renamed from: g */
    public int f103293g = 512;

    /* JADX INFO: renamed from: j */
    public int f103296j = 100000;

    /* JADX INFO: renamed from: k */
    public Long f103297k = null;

    /* JADX INFO: renamed from: l */
    public final DecimalFormat f103298l = new DecimalFormat("#.###", new DecimalFormatSymbols(Locale.ENGLISH));

    /* JADX INFO: renamed from: c */
    public synchronized void m101221c(float f11) {
        try {
            if (this.f103294h > this.f103293g) {
                return;
            }
            if (this.f103295i == null) {
                this.f103295i = new StringBuilder();
            }
            StringBuilder sb2 = this.f103295i;
            sb2.append(this.f103298l.format(f11));
            sb2.append(",");
            this.f103294h++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m101219a() {
        Sensor sensor = this.f103290d;
        return sensor == null ? "unavailable" : sensor.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m101220b() {
        this.f103295i = new StringBuilder();
    }

    /* JADX INFO: renamed from: d */
    public void m101222d(Context context, int i11, String str) {
        this.f103288b = str;
        HandlerThread handlerThread = new HandlerThread("SensorUtil_" + this.f103288b);
        this.f103291e = handlerThread;
        handlerThread.start();
        this.f103292f = new Handler(this.f103291e.getLooper());
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f103289c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(i11);
        this.f103290d = defaultSensor;
        if (defaultSensor != null) {
            try {
                this.f103289c.registerListener(this, defaultSensor, this.f103296j, this.f103292f);
            } catch (Exception unused) {
                this.f103290d = null;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m101223e(long j11) {
        Long l11 = this.f103297k;
        if (l11 != null && j11 - l11.longValue() <= (((double) this.f103296j) / 1000.0d) * 0.699999988079071d) {
            return false;
        }
        this.f103297k = Long.valueOf(j11);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public String m101224f() {
        StringBuilder sb2 = this.f103295i;
        if (sb2 == null) {
            return "null";
        }
        String string = sb2.toString();
        return string.endsWith(",") ? string.substring(0, string.length() - 1) : string;
    }

    /* JADX INFO: renamed from: g */
    public void m101225g() {
        SensorManager sensorManager;
        try {
            if (this.f103290d != null && (sensorManager = this.f103289c) != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
        HandlerThread handlerThread = this.f103291e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        m101220b();
        this.f103297k = null;
    }

    public C45817d(Context context, int i11, String str, long j11) {
        this.f103299m = 0L;
        m101222d(context, i11, str);
        this.f103299m = j11;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
