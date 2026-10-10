package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.listener.OkHttpTrackEventListener;
import com.kubi.sdk.pkg.config.PackConfigManager;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001a\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007\"\u001b\u0010\u001c\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u0007\"\u001b\u0010\u001e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u0007\"\u001b\u0010 \u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001f\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "Lokhttp3/OkHttpClient;", "g", "(Lcom/kubi/sdk/pkg/task/DownloadPriority;)Lokhttp3/OkHttpClient;", "b", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lokhttp3/OkHttpClient;", "", "jsonUrl", "j", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "etag", "lastModified", "Lcom/kubi/sdk/pkg/task/a;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "downloadUrl", "downloadFile", "", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "f", "packageBaseClient", "d", "foregroundClient", "c", "backgroundClient", "e", "i18nDownloadClient", "Package_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHttpHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/HttpHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n1855#2,2:306\n*S KotlinDebug\n*F\n+ 1 HttpHelper.kt\ncom/kubi/sdk/pkg/task/HttpHelperKt\n*L\n171#1:306,2\n*E\n"})
public final class HttpHelperKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Lazy f47417a = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.kubi.sdk.pkg.task.HttpHelperKt$packageBaseClient$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.eventListenerFactory(new OkHttpTrackEventListener.C19328a());
            builder.connectTimeout(30000L, TimeUnit.MILLISECONDS);
            builder.cookieJar(C23973b.f47445a);
            return builder.build();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f47418b = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.kubi.sdk.pkg.task.HttpHelperKt$foregroundClient$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builderNewBuilder = HttpHelperKt.m57780f().newBuilder();
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(3);
            dispatcher.setMaxRequests(64);
            builderNewBuilder.dispatcher(dispatcher);
            return builderNewBuilder.build();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f47419c = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.kubi.sdk.pkg.task.HttpHelperKt$backgroundClient$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builderNewBuilder = HttpHelperKt.m57780f().newBuilder();
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(2);
            dispatcher.setMaxRequests(64);
            builderNewBuilder.dispatcher(dispatcher);
            return builderNewBuilder.build();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f47420d = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.kubi.sdk.pkg.task.HttpHelperKt$i18nDownloadClient$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builderNewBuilder = HttpHelperKt.m57780f().newBuilder();
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(1);
            dispatcher.setMaxRequests(1);
            builderNewBuilder.dispatcher(dispatcher);
            return builderNewBuilder.build();
        }
    });

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.task.HttpHelperKt$a */
    /* JADX INFO: compiled from: HttpHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C23970a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadPriority.values().length];
            try {
                iArr[DownloadPriority.VERY_HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadPriority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final OkHttpClient m57776b(@NotNull DownloadPriority priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        OkHttpClient.Builder builderNewBuilder = m57781g(priority).newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builderNewBuilder.callTimeout(0L, timeUnit);
        builderNewBuilder.readTimeout(30000L, timeUnit);
        Iterator<T> it = PackageDownloadSetting.f47421a.m57786a().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addInterceptor((Interceptor) it.next());
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: c */
    public static final OkHttpClient m57777c() {
        return (OkHttpClient) f47419c.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final OkHttpClient m57778d() {
        return (OkHttpClient) f47418b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static final OkHttpClient m57779e() {
        return (OkHttpClient) f47420d.getValue();
    }

    /* JADX INFO: renamed from: f */
    public static final OkHttpClient m57780f() {
        return (OkHttpClient) f47417a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final OkHttpClient m57781g(@NotNull DownloadPriority priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (!PackConfigManager.f47378a.m57689c()) {
            return m57780f();
        }
        int i11 = C23970a.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            return m57778d();
        }
        if (i11 == 2) {
            return m57777c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final OkHttpClient m57782h() {
        return m57779e();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Object m57783i(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DownloadPriority downloadPriority, @NotNull Continuation<? super Boolean> continuation) throws CancellationException, TaskException {
        return C41686h.m91049g(C42911a.m94120b(), new HttpHelperKt$startDownload$2(str, downloadPriority, str3, str2, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final Object m57784j(@NotNull String str, @NotNull Continuation<? super String> continuation) throws TaskException {
        return C41686h.m91049g(C42911a.m94120b(), new HttpHelperKt$startPullJson$2(str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final Object m57785k(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Continuation<? super ConditionalJsonResponse> continuation) throws TaskException {
        return C41686h.m91049g(C42911a.m94120b(), new HttpHelperKt$startPullJsonConditionally$2(str, str2, str3, null), continuation);
    }
}
