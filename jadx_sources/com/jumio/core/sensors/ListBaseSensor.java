package com.jumio.core.sensors;

import android.content.Context;
import android.hardware.SensorEvent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import jumio.core.C40530F3;
import jumio.core.C40545I3;
import jumio.core.InterfaceC40550J3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J@\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\tH&J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH&R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/jumio/core/sensors/ListBaseSensor;", "Lcom/jumio/core/sensors/BaseSensor;", "type", "Lcom/jumio/core/sensors/SensorType;", "config", "Lcom/jumio/core/sensors/SensorConfig;", "<init>", "(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)V", "sensorDataList", "", "Lcom/jumio/core/sensors/SensorData;", "lastTimestamp", "", "minSensorCaptureDelayThreshold", "", "start", "", "context", "Landroid/content/Context;", "resetAllData", "handleSensorEvent", "event", "Landroid/hardware/SensorEvent;", "getResult", "Lcom/jumio/core/sensors/SensorResult;", "createDataMap", "Lcom/jumio/core/sensors/SensorResult$ListSensorResult;", "timeDeltas", "sensorValues0", "", "sensorValues1", "sensorValues2", "roundDataValue", "eventValue", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ListBaseSensor extends BaseSensor {

    /* JADX INFO: renamed from: i */
    public final ArrayList f14566i;

    /* JADX INFO: renamed from: j */
    public long f14567j;

    /* JADX INFO: renamed from: k */
    public final double f14568k;

    @NotNull
    public abstract C40545I3 createDataMap(@NotNull List<Long> list, @NotNull List<Float> list2, @NotNull List<Float> list3, @NotNull List<Float> list4);

    @Override // com.jumio.core.sensors.BaseSensor, com.jumio.core.sensors.SensorInterface
    @NotNull
    public synchronized InterfaceC40550J3 getResult() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        try {
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            arrayList4 = new ArrayList();
            for (C40530F3 c40530f3 : this.f14566i) {
                arrayList.add(Long.valueOf(c40530f3.f89963a));
                arrayList2.add(Float.valueOf(roundDataValue(c40530f3.f89964b)));
                arrayList3.add(Float.valueOf(roundDataValue(c40530f3.f89965c)));
                arrayList4.add(Float.valueOf(roundDataValue(c40530f3.f89966d)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return createDataMap(arrayList, arrayList2, arrayList3, arrayList4);
    }

    public abstract float roundDataValue(float eventValue);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListBaseSensor(@NotNull SensorType type, @NotNull SensorConfig config) {
        super(type, config);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14566i = new ArrayList();
        this.f14568k = ((double) config.getCaptureDelay()) * 0.9d;
    }

    @Override // com.jumio.core.sensors.BaseSensor, com.jumio.core.sensors.SensorInterface
    public void start(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14567j = SystemClock.elapsedRealtime();
        super.start(context);
    }

    @Override // com.jumio.core.sensors.BaseSensor
    public void handleSensorEvent(@Nullable SensorEvent event) {
        float f11;
        float f12;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14567j == 0) {
            this.f14567j = jElapsedRealtime;
        }
        long j11 = jElapsedRealtime - this.f14567j;
        if (j11 >= this.f14568k) {
            float f13 = 0.0f;
            if (event != null && (fArr3 = event.values) != null) {
                f11 = fArr3[0];
            } else {
                f11 = 0.0f;
            }
            if (event != null && (fArr2 = event.values) != null) {
                f12 = fArr2[1];
            } else {
                f12 = 0.0f;
            }
            if (event != null && (fArr = event.values) != null) {
                f13 = fArr[2];
            }
            this.f14566i.add(new C40530F3(j11, f11, f12, f13));
            this.f14567j = jElapsedRealtime;
        }
    }

    @Override // com.jumio.core.sensors.BaseSensor, com.jumio.core.sensors.SensorInterface
    public void resetAllData() {
        super.resetAllData();
        this.f14566i.clear();
        this.f14567j = SystemClock.elapsedRealtime();
    }
}
