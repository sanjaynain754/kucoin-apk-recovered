package com.jumio.core.sensors;

import java.util.List;
import jumio.core.C40545I3;
import jumio.core.C40675i2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/core/sensors/Gyroscope;", "Lcom/jumio/core/sensors/ListBaseSensor;", "config", "Lcom/jumio/core/sensors/SensorConfig;", "<init>", "(Lcom/jumio/core/sensors/SensorConfig;)V", "createDataMap", "Lcom/jumio/core/sensors/SensorResult$ListSensorResult;", "timeDeltas", "", "", "sensorValues0", "", "sensorValues1", "sensorValues2", "roundDataValue", "eventValue", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Gyroscope extends ListBaseSensor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gyroscope(@NotNull SensorConfig config) {
        super(SensorType.GYROSCOPE, config);
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.jumio.core.sensors.ListBaseSensor
    @NotNull
    public C40545I3 createDataMap(@NotNull List<Long> timeDeltas, @NotNull List<Float> sensorValues0, @NotNull List<Float> sensorValues1, @NotNull List<Float> sensorValues2) {
        Intrinsics.checkNotNullParameter(timeDeltas, "timeDeltas");
        Intrinsics.checkNotNullParameter(sensorValues0, "sensorValues0");
        Intrinsics.checkNotNullParameter(sensorValues1, "sensorValues1");
        Intrinsics.checkNotNullParameter(sensorValues2, "sensorValues2");
        return new C40545I3(getF14557a(), new C40675i2("timestampOffsetMs", timeDeltas), new C40675i2("beta", sensorValues0), new C40675i2("gamma", sensorValues1), new C40675i2("alpha", sensorValues2));
    }

    @Override // com.jumio.core.sensors.ListBaseSensor
    public float roundDataValue(float eventValue) {
        return MathKt.roundToInt(eventValue * 1000) / 1000.0f;
    }
}
