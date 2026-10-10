package pr;

import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: pr.b */
/* JADX INFO: compiled from: RequestInfoInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000e"}, m90084d2 = {"Lpr/b;", "", "<init>", "()V", "Ljava/lang/ThreadLocal;", "Lokhttp3/Request;", "b", "Ljava/lang/ThreadLocal;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/ThreadLocal;", "request", "Lokhttp3/Response;", "c", "response", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43529b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43529b f96063a = new C43529b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ThreadLocal<Request> request = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ThreadLocal<Response> response = new ThreadLocal<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ThreadLocal<Request> m95792a() {
        return request;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ThreadLocal<Response> m95793b() {
        return response;
    }
}
