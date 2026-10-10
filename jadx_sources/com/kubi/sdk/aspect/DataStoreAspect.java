package com.kubi.sdk.aspect;

import androidx.datastore.preferences.core.PreferencesFactory;
import com.kubi.sdk.adapter.DiffAdapterIssue;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PreferencesSerializerAspect.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/aspect/DataStoreAspect;", "", "<init>", "()V", "safeReadFrom", "joinPoint", "Lorg/aspectj/lang/ProceedingJoinPoint;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPreferencesSerializerAspect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesSerializerAspect.kt\ncom/kubi/sdk/aspect/DataStoreAspect\n+ 2 DiffAdapterIssue.kt\ncom/kubi/sdk/adapter/DiffAdapterIssueKt\n*L\n1#1,26:1\n46#2,2:27\n*S KotlinDebug\n*F\n+ 1 PreferencesSerializerAspect.kt\ncom/kubi/sdk/aspect/DataStoreAspect\n*L\n19#1:27,2\n*E\n"})
public final class DataStoreAspect {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f46470a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DataStoreAspect f46471b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56528a() {
        f46471b = new DataStoreAspect();
    }

    /* JADX INFO: renamed from: b */
    public static DataStoreAspect m56529b() {
        DataStoreAspect dataStoreAspect = f46471b;
        if (dataStoreAspect != null) {
            return dataStoreAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.DataStoreAspect", f46470a);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m56530c(@NotNull InterfaceC43176b joinPoint) throws Throwable {
        Intrinsics.checkNotNullParameter(joinPoint, "joinPoint");
        try {
            return joinPoint.mo82130a();
        } catch (Throwable th2) {
            C43846g.m96568c(new DiffAdapterIssue(th2, "DataStoreAspect", false, null, 8, null), null, 2, null);
            return PreferencesFactory.createEmpty();
        }
    }

    static {
        try {
            m56528a();
        } catch (Throwable th2) {
            f46470a = th2;
        }
    }
}
