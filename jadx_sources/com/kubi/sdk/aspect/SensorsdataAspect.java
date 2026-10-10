package com.kubi.sdk.aspect;

import com.sensorsdata.analytics.android.sdk.network.RealResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SensorsdataAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/aspect/SensorsdataAspect;", "", "<init>", "()V", "safeGetRealResponse", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "createFakeResponse", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SensorsdataAspect {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f46476a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SensorsdataAspect f46477b;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56539b() {
        f46477b = new SensorsdataAspect();
    }

    /* JADX INFO: renamed from: c */
    public static SensorsdataAspect m56540c() {
        SensorsdataAspect sensorsdataAspect = f46477b;
        if (sensorsdataAspect != null) {
            return sensorsdataAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.SensorsdataAspect", f46476a);
    }

    /* JADX INFO: renamed from: d */
    public final Object m56541d() {
        try {
            Constructor declaredConstructor = RealResponse.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
            Field declaredField = RealResponse.class.getDeclaredField("code");
            declaredField.setAccessible(true);
            declaredField.setInt(objNewInstance, -200);
            Field declaredField2 = RealResponse.class.getDeclaredField("errorMsg");
            declaredField2.setAccessible(true);
            declaredField2.set(objNewInstance, "safeGetRealResponse errorMsg");
            return objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m56542e(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            return point.mo82133d(point.mo82131b());
        } catch (Throwable unused) {
            return m56541d();
        }
    }

    static {
        try {
            m56539b();
        } catch (Throwable th2) {
            f46476a = th2;
        }
    }
}
