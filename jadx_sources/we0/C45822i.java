package we0;

import a3d20260409.C0109v;
import android.content.Context;
import android.hardware.SensorEvent;
import android.os.SystemClock;

/* JADX INFO: renamed from: we0.i */
/* JADX INFO: loaded from: classes60.dex */
public class C45822i extends C45817d {

    /* JADX INFO: renamed from: n */
    public boolean f103308n;

    /* JADX INFO: renamed from: o */
    public a f103309o;

    /* JADX INFO: renamed from: we0.i$a */
    public interface a {
        /* JADX INFO: renamed from: n */
        void mo434n();
    }

    /* JADX INFO: renamed from: h */
    public void m101234h() {
        this.f103308n = false;
    }

    /* JADX INFO: renamed from: j */
    public void mo101226j() {
        this.f103308n = true;
        m101220b();
    }

    /* JADX INFO: renamed from: i */
    public void m101235i(a aVar) {
        this.f103309o = aVar;
    }

    @Override // we0.C45817d, android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArrM550y;
        if (sensorEvent.values.length >= 3 && (fArrM550y = C0109v.m550y()) != null) {
            if ("acceleration".equals(this.f103288b) && this.f103309o != null && (Math.abs(sensorEvent.values[0]) > fArrM550y[0] || Math.abs(sensorEvent.values[1]) > fArrM550y[1] || Math.abs(sensorEvent.values[2]) > fArrM550y[2])) {
                this.f103309o.mo434n();
            }
            if (this.f103308n) {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((sensorEvent.timestamp - SystemClock.elapsedRealtimeNanos()) / 1000000);
                if (m101223e(jCurrentTimeMillis)) {
                    m101221c(jCurrentTimeMillis - this.f103299m);
                    m101221c(sensorEvent.values[0]);
                    m101221c(sensorEvent.values[1]);
                    m101221c(sensorEvent.values[2]);
                }
            }
        }
    }

    public C45822i(Context context, int i11, String str, long j11) {
        super(context, i11, str, j11);
        this.f103308n = false;
        this.f103293g = 2048;
    }
}
