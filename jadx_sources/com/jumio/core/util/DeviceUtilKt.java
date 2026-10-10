package com.jumio.core.util;

import com.jumio.core.ServiceLocator;
import com.jumio.core.interfaces.DeviceUtilInterface;
import com.jumio.core.util.DeviceUtilKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"DeviceUtil", "Lcom/jumio/core/interfaces/DeviceUtilInterface;", "getDeviceUtil", "()Lcom/jumio/core/interfaces/DeviceUtilInterface;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DeviceUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final DeviceUtilInterface m14599a() {
        return new DefaultDeviceUtil(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public static final DeviceUtilInterface getDeviceUtil() {
        return (DeviceUtilInterface) ServiceLocator.INSTANCE.getServiceImplementation(DeviceUtilInterface.class, new Function0() { // from class: x9.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUtilKt.m14599a();
            }
        });
    }
}
