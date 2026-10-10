package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.k */
/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/serialization/json/internal/k;", "Lkotlinx/serialization/json/internal/l;", "<init>", "()V", "", "d", "()[C", "array", "", "c", "([C)V", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41933k extends C41935l {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C41933k f92123c = new C41933k();

    /* JADX INFO: renamed from: c */
    public final void m91952c(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        m91955a(array);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final char[] m91953d() {
        return super.m91956b(128);
    }
}
