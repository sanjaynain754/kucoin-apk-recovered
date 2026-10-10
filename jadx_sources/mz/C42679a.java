package mz;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.lib.kunlun.sdk.utils.KunlunException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;

/* JADX INFO: renamed from: mz.a */
/* JADX INFO: compiled from: KunlunLogger.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"", "throwable", "", "msg", "source", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "", "b", "(Ljava/lang/Throwable;)Z", "kunlun-sdk_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C42679a {
    /* JADX INFO: renamed from: a */
    public static final void m93503a(@NotNull Throwable throwable, @NotNull String msg, @NotNull String source) {
        Throwable cause;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        if (m93504b(throwable)) {
            return;
        }
        Throwable cause2 = throwable.getCause();
        if (cause2 == null || !m93504b(cause2)) {
            Throwable cause3 = throwable.getCause();
            if (cause3 == null || (cause = cause3.getCause()) == null || !m93504b(cause)) {
                C43846g.m96568c(new KunlunException(throwable, source, false, msg), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m93504b(@NotNull Throwable th2) {
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
