package jumio.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.jumio.core.models.TimeModel;
import com.jumio.core.sensors.BaseSensor;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C40687l implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseSensor f90314a;

    public C40687l(BaseSensor baseSensor) {
        this.f90314a = baseSensor;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] defaultValue;
        BaseSensor baseSensor = this.f90314a;
        if (sensorEvent == null || (defaultValue = sensorEvent.values) == null) {
            defaultValue = baseSensor.getF14558b().getDefaultValue();
        }
        baseSensor.setLatestData(defaultValue);
        if (this.f90314a.getF14560d() == 0) {
            BaseSensor baseSensor2 = this.f90314a;
            baseSensor2.setInitialTimestamp(TimeModel.getCurrentTime$default(baseSensor2.getF14558b().getTimeModel(), 0L, 1, null));
        }
        if (sensorEvent != null) {
            BaseSensor baseSensor3 = this.f90314a;
            baseSensor3.handleSensorEvent(sensorEvent);
            Function1 function1 = baseSensor3.f14564h;
            if (function1 != null) {
                function1.invoke(sensorEvent);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
