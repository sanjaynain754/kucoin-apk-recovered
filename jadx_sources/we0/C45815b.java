package we0;

import android.content.Context;
import android.hardware.SensorEvent;
import android.os.SystemClock;

/* JADX INFO: renamed from: we0.b */
/* JADX INFO: loaded from: classes60.dex */
public class C45815b extends C45817d {
    @Override // we0.C45817d, android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values.length < 1) {
            return;
        }
        m101221c((System.currentTimeMillis() + ((sensorEvent.timestamp - SystemClock.elapsedRealtimeNanos()) / 1000000)) - this.f103299m);
        m101221c(sensorEvent.values[0]);
    }

    public C45815b(Context context, int i11, String str, long j11) {
        super(context, i11, str, j11);
    }
}
