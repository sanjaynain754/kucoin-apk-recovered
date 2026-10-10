package a00;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a00.a */
/* JADX INFO: compiled from: ExceptionUtils.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"La00/a;", "", "<init>", "()V", "", "e", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Z", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C0008a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0008a f8a = new C0008a();

    /* JADX INFO: renamed from: a */
    public final boolean m9a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return (e11 instanceof SocketException) || (e11 instanceof UnknownHostException) || (e11 instanceof SocketTimeoutException) || (e11 instanceof SSLException) || (e11 instanceof ConnectionShutdownException);
    }
}
