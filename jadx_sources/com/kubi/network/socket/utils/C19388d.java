package com.kubi.network.socket.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.d */
/* JADX INFO: compiled from: ForegroundUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/socket/utils/d;", "", "<init>", "()V", "Landroid/app/Application;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/app/Application;)V", "", "b", "()Z", "Z", "hasInit", "Lcom/kubi/network/socket/utils/a;", "c", "Lcom/kubi/network/socket/utils/a;", "backgroundLifecycle", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class C19388d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean hasInit;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19388d f36150a = new C19388d();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static C19385a backgroundLifecycle = new C19385a();

    /* JADX INFO: renamed from: a */
    public final void m43052a(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (hasInit) {
            return;
        }
        hasInit = true;
        context.registerActivityLifecycleCallbacks(backgroundLifecycle);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43053b() {
        return !backgroundLifecycle.getIsBackground();
    }
}
