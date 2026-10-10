package com.kubi.sdk.pkg.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.util.b */
/* JADX INFO: compiled from: RnTrackLogUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/b;", "", "<init>", "()V", "", "b", "", "tag", "msg", "", "throwable", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "(Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "eventId", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23985b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23985b f47489a = new C23985b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static String eventId = "";

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m57873d(C23985b c23985b, String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        c23985b.m57876c(str, str2, th2);
    }

    /* JADX INFO: renamed from: a */
    public final String m57874a(String msg) {
        return "eventId:" + eventId + ", msg:" + msg;
    }

    /* JADX INFO: renamed from: c */
    public final void m57876c(@NotNull String tag, @NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C23987d.f47492a.m57881a("KCRN::" + tag, m57874a(msg), throwable);
    }

    /* JADX INFO: renamed from: e */
    public final void m57877e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C23987d.f47492a.m57882b("KCRN::" + tag, m57874a(msg));
    }

    /* JADX INFO: renamed from: b */
    public final void m57875b() {
        eventId = String.valueOf(System.currentTimeMillis());
    }
}
