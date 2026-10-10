package com.jumio.core.sensors;

import com.jumio.core.ServiceLocator;
import com.jumio.core.sensors.SensorFactoryInterfaceKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"SensorFactory", "Lcom/jumio/core/sensors/SensorFactoryInterface;", "getSensorFactory", "()Lcom/jumio/core/sensors/SensorFactoryInterface;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SensorFactoryInterfaceKt {
    /* JADX INFO: renamed from: a */
    public static final SensorFactoryInterface m14595a() {
        return new DefaultSensorFactory();
    }

    @NotNull
    public static final SensorFactoryInterface getSensorFactory() {
        return (SensorFactoryInterface) ServiceLocator.INSTANCE.getServiceImplementation(SensorFactoryInterface.class, new Function0() { // from class: w9.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorFactoryInterfaceKt.m14595a();
            }
        });
    }
}
