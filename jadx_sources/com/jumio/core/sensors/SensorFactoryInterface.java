package com.jumio.core.sensors;

import com.jumio.core.Injected;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/sensors/SensorFactoryInterface;", "", "getSensor", "Lcom/jumio/core/sensors/SensorInterface;", "type", "Lcom/jumio/core/sensors/SensorType;", "config", "Lcom/jumio/core/sensors/SensorConfig;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SensorFactoryInterface {
    @NotNull
    SensorInterface getSensor(@NotNull SensorType type, @NotNull SensorConfig config);
}
