package we0;

import android.content.Context;
import android.hardware.SensorEvent;

/* JADX INFO: renamed from: we0.e */
/* JADX INFO: loaded from: classes60.dex */
public class C45818e extends C45822i {

    /* JADX INFO: renamed from: p */
    public float f103300p;

    /* JADX INFO: renamed from: q */
    public long f103301q;

    /* JADX INFO: renamed from: r */
    public float f103302r;

    @Override // we0.C45822i
    /* JADX INFO: renamed from: j */
    public void mo101226j() {
        this.f103308n = true;
        m101220b();
        this.f103301q = System.currentTimeMillis();
    }

    public C45818e(Context context, long j11) {
        super(context, 9, "gravity", j11);
    }

    @Override // we0.C45822i, we0.C45817d, android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        super.onSensorChanged(sensorEvent);
        float f11 = sensorEvent.values[1];
        this.f103300p = f11;
        if (f11 > this.f103302r) {
            this.f103302r = f11;
        }
    }
}
