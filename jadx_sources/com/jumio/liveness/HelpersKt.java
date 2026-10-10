package com.jumio.liveness;

import android.hardware.SensorEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Helpers.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m90084d2 = {"toDaClient2Event", "Lcom/jumio/liveness/DaClient2$Event;", "Landroid/hardware/SensorEvent;", "timestamp", "", "dasdk_withoutAssetsRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class HelpersKt {
    @Nullable
    public static final DaClient2.Event toDaClient2Event(@NotNull SensorEvent sensorEvent, long j11) {
        Intrinsics.checkNotNullParameter(sensorEvent, "<this>");
        int type = sensorEvent.sensor.getType();
        if (type == 2) {
            return new DaClient2.Event("magnet", j11, new Pair[]{TuplesKt.m90091to("x", String.valueOf(sensorEvent.values[0])), TuplesKt.m90091to("y", String.valueOf(sensorEvent.values[1])), TuplesKt.m90091to("z", String.valueOf(sensorEvent.values[2]))});
        }
        if (type == 4) {
            return new DaClient2.Event("gyro", j11, new Pair[]{TuplesKt.m90091to("x", String.valueOf(sensorEvent.values[0])), TuplesKt.m90091to("y", String.valueOf(sensorEvent.values[1])), TuplesKt.m90091to("z", String.valueOf(sensorEvent.values[2]))});
        }
        if (type != 10) {
            return null;
        }
        return new DaClient2.Event("accel", j11, new Pair[]{TuplesKt.m90091to("x", String.valueOf(sensorEvent.values[0])), TuplesKt.m90091to("y", String.valueOf(sensorEvent.values[1])), TuplesKt.m90091to("z", String.valueOf(sensorEvent.values[2]))});
    }
}
