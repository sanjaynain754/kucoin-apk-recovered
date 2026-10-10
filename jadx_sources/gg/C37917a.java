package gg;

import com.kubi.flutter.network.exception.NetFlutterIssueException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: gg.a */
/* JADX INFO: compiled from: NetFlutterIssue.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"", "", "b", "(Ljava/lang/Throwable;)Z", "e", "", "source", "", "c", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "component_network_release"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C37917a {
    /* JADX INFO: renamed from: b */
    public static final boolean m85739b(@NotNull Throwable th2) {
        String message;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if ((th2 instanceof CancellationException) || (th2 instanceof UnknownHostException) || (th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof ConnectionShutdownException)) {
            return true;
        }
        if (!(th2 instanceof SecurityException)) {
            return (th2 instanceof IOException) && (message = th2.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"));
        }
        String message2 = th2.getMessage();
        if (message2 != null) {
            return StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m85740c(Throwable th2, String str) {
        C43846g.m96568c(new NetFlutterIssueException(th2, str, false, null, 8, null), null, 2, null);
    }
}
