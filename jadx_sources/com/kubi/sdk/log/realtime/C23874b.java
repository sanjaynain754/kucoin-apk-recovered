package com.kubi.sdk.log.realtime;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.ApiException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.kubi.sdk.log.realtime.b */
/* JADX INFO: compiled from: RealTimeIssue.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Z", "Logger-realtime_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23874b {
    /* JADX INFO: renamed from: a */
    public static final boolean m57209a(@NotNull Throwable th2) {
        String message;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if ((th2 instanceof SocketException) || (th2 instanceof UnknownHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof ConnectionShutdownException) || (th2 instanceof HttpException)) {
            return true;
        }
        if (th2 instanceof SecurityException) {
            String message2 = th2.getMessage();
            if (message2 != null) {
                return StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
            }
            return false;
        }
        if (!(th2 instanceof ApiException)) {
            if (th2 instanceof InterruptedIOException) {
                return true;
            }
            return (th2 instanceof IOException) && (message = th2.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"));
        }
        String message3 = th2.getMessage();
        if (message3 != null) {
            return StringsKt.startsWith$default(message3, "Sorry! Your IP is from restricted area", false, 2, (Object) null);
        }
        return false;
    }
}
