package com.jumio.core.sensors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/sensors/LinearAccelerometer;", "Lcom/jumio/core/sensors/BaseSensor;", "config", "Lcom/jumio/core/sensors/SensorConfig;", "<init>", "(Lcom/jumio/core/sensors/SensorConfig;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LinearAccelerometer extends BaseSensor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearAccelerometer(@NotNull SensorConfig config) {
        super(SensorType.LINEAR_ACCELEROMETER, config);
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
