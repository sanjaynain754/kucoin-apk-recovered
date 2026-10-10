package com.kubi.sdk.pkg.bundle.pkgplatform;

import com.kubi.network.retrofit.listener.OkHttpTrackEventListener;
import com.kubi.sdk.pkg.task.TaskException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PkgPlatformClient.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformClient;", "", "<init>", "()V", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleRequest;", "request", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "b", "(Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Lkotlin/Lazy;", "c", "()Lokhttp3/OkHttpClient;", "httpClient", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PkgPlatformClient {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PkgPlatformClient f47350a = new PkgPlatformClient();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy httpClient = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformClient$httpClient$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.eventListenerFactory(new OkHttpTrackEventListener.C19328a());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.connectTimeout(30000L, timeUnit);
            builder.readTimeout(30000L, timeUnit);
            return builder.build();
        }
    });

    /* JADX INFO: renamed from: c */
    public final OkHttpClient m57607c() {
        return (OkHttpClient) httpClient.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m57606b(@NotNull CalcBundleRequest calcBundleRequest, @NotNull Continuation<? super CalcBundleResponse> continuation) throws TaskException {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformClient$calcBundle$2(calcBundleRequest, null), continuation);
    }
}
