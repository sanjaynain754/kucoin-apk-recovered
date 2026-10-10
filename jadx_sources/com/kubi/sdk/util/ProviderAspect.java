package com.kubi.sdk.util;

import android.content.ContentProvider;
import com.blankj.utilcode.util.C5264d;
import com.google.android.gms.actions.SearchIntents;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.q0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ProviderAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/util/ProviderAspect;", "", "<init>", "()V", SearchIntents.EXTRA_QUERY, "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProviderAspect {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f48265a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ProviderAspect f48266b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58514a() {
        f48266b = new ProviderAspect();
    }

    /* JADX INFO: renamed from: b */
    public static ProviderAspect m58515b() {
        ProviderAspect providerAspect = f48266b;
        if (providerAspect != null) {
            return providerAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.util.ProviderAspect", f48265a);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m58516c(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        Object target = point.getTarget();
        ContentProvider contentProvider = target instanceof ContentProvider ? (ContentProvider) target : null;
        if (Intrinsics.areEqual(contentProvider != null ? contentProvider.getCallingPackage() : null, C5264d.m6155a())) {
            return point.mo82133d(point.mo82131b());
        }
        return null;
    }

    static {
        try {
            m58514a();
        } catch (Throwable th2) {
            f48265a = th2;
        }
    }
}
