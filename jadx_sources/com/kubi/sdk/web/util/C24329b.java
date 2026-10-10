package com.kubi.sdk.web.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.util.C23989f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.b */
/* JADX INFO: compiled from: H5LogUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/web/util/b;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "tag", "msg", "", "throwable", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24329b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24329b f48558a = new C24329b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58861c(C24329b c24329b, String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        c24329b.m58863b(str, str2, th2);
    }

    /* JADX INFO: renamed from: a */
    public final void m58862a() {
        C23989f.f47493a.m57886b();
    }

    /* JADX INFO: renamed from: b */
    public final void m58863b(@NotNull String tag, @NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C23989f.f47493a.m57887c("KCH5::" + tag, msg, throwable);
    }

    /* JADX INFO: renamed from: d */
    public final void m58864d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C23989f.f47493a.m57888e("KCH5::" + tag, msg);
    }
}
