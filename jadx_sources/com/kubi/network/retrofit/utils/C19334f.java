package com.kubi.network.retrofit.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.network.retrofit.utils.f */
/* JADX INFO: compiled from: RetrofitFlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/retrofit/utils/f;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "", "throwable", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "d", "(Ljava/lang/Throwable;)V", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19334f<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public T data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Throwable throwable;

    /* JADX WARN: Multi-variable type inference failed */
    public C19334f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C19334f(@Nullable T t11, @Nullable Throwable th2) {
        this.data = t11;
        this.throwable = th2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m42846a() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX INFO: renamed from: c */
    public final void m42848c(@Nullable T t11) {
        this.data = t11;
    }

    /* JADX INFO: renamed from: d */
    public final void m42849d(@Nullable Throwable th2) {
        this.throwable = th2;
    }

    public /* synthetic */ C19334f(Object obj, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? null : th2);
    }
}
