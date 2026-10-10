package com.kubi.sdk.web.util;

import android.system.ErrnoException;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.i */
/* JADX INFO: compiled from: WebExFilterUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/web/util/i;", "", "<init>", "()V", "", "e", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Z", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24336i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24336i f48570a = new C24336i();

    /* JADX INFO: renamed from: a */
    public final boolean m58890a(@NotNull Throwable e11) {
        String message;
        Intrinsics.checkNotNullParameter(e11, "e");
        if ((e11 instanceof SocketException) || (e11 instanceof UnknownHostException) || (e11 instanceof SocketTimeoutException) || (e11 instanceof SSLException) || (e11 instanceof ConnectionShutdownException) || (e11 instanceof HttpException) || (e11 instanceof CancellationException) || (e11 instanceof ErrnoException) || (e11 instanceof InterruptedIOException)) {
            return true;
        }
        if (!(e11 instanceof RuntimeException) || (message = e11.getMessage()) == null) {
            return false;
        }
        return StringsKt.startsWith$default(message, "android_getaddrinfo failed: EAI_NODATA (No address associated with hostname)", false, 2, (Object) null);
    }
}
