package com.jumio.core.sensors;

import jumio.core.AbstractC40562M0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/sensors/DefaultSensorFactory;", "Lcom/jumio/core/sensors/SensorFactoryInterface;", "<init>", "()V", "getSensor", "Lcom/jumio/core/sensors/BaseSensor;", "type", "Lcom/jumio/core/sensors/SensorType;", "config", "Lcom/jumio/core/sensors/SensorConfig;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultSensorFactory implements SensorFactoryInterface {
    @Override // com.jumio.core.sensors.SensorFactoryInterface
    @NotNull
    public BaseSensor getSensor(@NotNull SensorType type, @NotNull SensorConfig config) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(config, "config");
        int i11 = AbstractC40562M0.f90048a[type.ordinal()];
        if (i11 == 1) {
            return new Accelerometer(config);
        }
        if (i11 == 2) {
            return new GravitySensor(config);
        }
        if (i11 == 3) {
            return new Gyroscope(config);
        }
        if (i11 == 4) {
            return new LightSensor(config);
        }
        if (i11 == 5) {
            return new LinearAccelerometer(config);
        }
        throw new NoWhenBranchMatchedException();
    }
}
