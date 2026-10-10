package com.facebook.imagepipeline.backends.okhttp3;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.AbstractC5685d;
import com.facebook.imagepipeline.producers.C5677a0;
import com.facebook.imagepipeline.producers.C5691f;
import com.facebook.imagepipeline.producers.InterfaceC5712m;
import com.facebook.imagepipeline.producers.InterfaceC5719p0;
import com.facebook.imagepipeline.producers.InterfaceC5733w0;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: OkHttpNetworkFetcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000298B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010,2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0016\u00106\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, m90084d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher;", "Lcom/facebook/imagepipeline/producers/d;", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;", "Lokhttp3/Call$Factory;", "callFactory", "Ljava/util/concurrent/Executor;", "cancellationExecutor", "", "disableOkHttpCache", "<init>", "(Lokhttp3/Call$Factory;Ljava/util/concurrent/Executor;Z)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "", "message", "Lokhttp3/Response;", "response", "Ljava/io/IOException;", "makeExceptionFromResponse", "(Ljava/lang/String;Lokhttp3/Response;)Ljava/io/IOException;", "Lokhttp3/Call;", "call", "Ljava/lang/Exception;", "e", "Lcom/facebook/imagepipeline/producers/p0$a;", TUIConstants.TUIChat.CALL_BACK, "", "handleException", "(Lokhttp3/Call;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/p0$a;)V", "Lcom/facebook/imagepipeline/producers/m;", "Lx5/i;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "context", "createFetchState", "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;", "fetchState", RemoteConfigComponent.FETCH_FILE_NAME, "(Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;Lcom/facebook/imagepipeline/producers/p0$a;)V", "", "byteSize", "onFetchCompletion", "(Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;I)V", "", "getExtraMap", "(Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;I)Ljava/util/Map;", "Lokhttp3/Request;", "request", "fetchWithRequest", "(Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;Lcom/facebook/imagepipeline/producers/p0$a;Lokhttp3/Request;)V", "Lokhttp3/Call$Factory;", "Ljava/util/concurrent/Executor;", "Lokhttp3/CacheControl;", "cacheControl", "Lokhttp3/CacheControl;", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpNetworkFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpNetworkFetcher.kt\ncom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public class OkHttpNetworkFetcher extends AbstractC5685d<C5638a> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String FETCH_TIME = "fetch_time";

    @NotNull
    private static final String IMAGE_SIZE = "image_size";

    @NotNull
    private static final String QUEUE_TIME = "queue_time";

    @NotNull
    private static final String TOTAL_TIME = "total_time";

    @Nullable
    private final CacheControl cacheControl;

    @NotNull
    private final Call.Factory callFactory;

    @NotNull
    private final Executor cancellationExecutor;

    /* JADX INFO: compiled from: OkHttpNetworkFetcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$Companion;", "", "<init>", "()V", "QUEUE_TIME", "", "FETCH_TIME", "TOTAL_TIME", "IMAGE_SIZE", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$a */
    /* JADX INFO: compiled from: OkHttpNetworkFetcher.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;", "Lcom/facebook/imagepipeline/producers/a0;", "Lcom/facebook/imagepipeline/producers/m;", "Lx5/i;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "<init>", "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V", "", "f", "J", "submitTime", "g", "responseTime", CmcdData.Factory.STREAMING_FORMAT_HLS, "fetchCompleteTime", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5638a extends C5677a0 {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        public long submitTime;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        public long responseTime;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public long fetchCompleteTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5638a(@NotNull InterfaceC5712m<C46075i> consumer, @NotNull InterfaceC5733w0 producerContext) {
            super(consumer, producerContext);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$b */
    /* JADX INFO: compiled from: OkHttpNetworkFetcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$b", "Lcom/facebook/imagepipeline/producers/f;", "", "b", "()V", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5639b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Call f8844a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OkHttpNetworkFetcher f8845b;

        public C5639b(Call call, OkHttpNetworkFetcher okHttpNetworkFetcher) {
            this.f8844a = call;
            this.f8845b = okHttpNetworkFetcher;
        }

        /* JADX INFO: renamed from: f */
        public static final void m9115f(Call call) {
            call.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                Executor executor = this.f8845b.cancellationExecutor;
                final Call call = this.f8844a;
                executor.execute(new Runnable() { // from class: com.facebook.imagepipeline.backends.okhttp3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        OkHttpNetworkFetcher.C5639b.m9115f(call);
                    }
                });
                return;
            }
            this.f8844a.cancel();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$c */
    /* JADX INFO: compiled from: OkHttpNetworkFetcher.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"com/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$c", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5640c implements Callback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5638a f8846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ OkHttpNetworkFetcher f8847c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5719p0.a f8848d;

        public C5640c(C5638a c5638a, OkHttpNetworkFetcher okHttpNetworkFetcher, InterfaceC5719p0.a aVar) {
            this.f8846b = c5638a;
            this.f8847c = okHttpNetworkFetcher;
            this.f8848d = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            this.f8847c.handleException(call, e11, this.f8848d);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f8846b.responseTime = SystemClock.elapsedRealtime();
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                OkHttpNetworkFetcher okHttpNetworkFetcher = this.f8847c;
                okHttpNetworkFetcher.handleException(call, okHttpNetworkFetcher.makeExceptionFromResponse("Response body null: " + response, response), this.f8848d);
                return;
            }
            OkHttpNetworkFetcher okHttpNetworkFetcher2 = this.f8847c;
            InterfaceC5719p0.a aVar = this.f8848d;
            C5638a c5638a = this.f8846b;
            try {
                try {
                    if (response.isSuccessful()) {
                        BytesRange bytesRangeFromContentRangeHeader = BytesRange.INSTANCE.fromContentRangeHeader(response.header(HttpHeaders.CONTENT_RANGE));
                        if (bytesRangeFromContentRangeHeader != null && (bytesRangeFromContentRangeHeader.from != 0 || bytesRangeFromContentRangeHeader.androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO java.lang.String != Integer.MAX_VALUE)) {
                            c5638a.m9608j(bytesRangeFromContentRangeHeader);
                            c5638a.m9607i(8);
                        }
                        aVar.mo9784b(responseBodyBody.byteStream(), responseBodyBody.getContentLength() < 0 ? 0 : (int) responseBodyBody.getContentLength());
                    } else {
                        okHttpNetworkFetcher2.handleException(call, okHttpNetworkFetcher2.makeExceptionFromResponse("Unexpected HTTP code " + response, response), aVar);
                    }
                } catch (Exception e11) {
                    okHttpNetworkFetcher2.handleException(call, e11, aVar);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseBodyBody, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(responseBodyBody, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OkHttpNetworkFetcher(@NotNull Call.Factory callFactory, @NotNull Executor cancellationExecutor) {
        this(callFactory, cancellationExecutor, false, 4, null);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    public /* bridge */ /* synthetic */ C5677a0 createFetchState(InterfaceC5712m interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        return createFetchState((InterfaceC5712m<C46075i>) interfaceC5712m, interfaceC5733w0);
    }

    public /* synthetic */ OkHttpNetworkFetcher(Call.Factory factory, Executor executor, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, executor, (i11 & 4) != 0 ? true : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOException makeExceptionFromResponse(String message, Response response) {
        return new IOException(message, OkHttpNetworkFetcherException.INSTANCE.fromResponse(response));
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    @NotNull
    public C5638a createFetchState(@NotNull InterfaceC5712m<C46075i> consumer, @NotNull InterfaceC5733w0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C5638a(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    public void fetch(@NotNull C5638a fetchState, @NotNull InterfaceC5719p0.a callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.submitTime = SystemClock.elapsedRealtime();
        Uri uriM9605g = fetchState.m9605g();
        Intrinsics.checkNotNullExpressionValue(uriM9605g, "getUri(...)");
        try {
            Request.Builder builder = new Request.Builder().url(uriM9605g.toString()).get();
            CacheControl cacheControl = this.cacheControl;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            BytesRange bytesRange = fetchState.m9600b().mo9666h().getBytesRange();
            if (bytesRange != null) {
                builder.addHeader("Range", bytesRange.m9183f());
            }
            Request requestBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(requestBuild, "build(...)");
            fetchWithRequest(fetchState, callback, requestBuild);
        } catch (Exception e11) {
            callback.onFailure(e11);
        }
    }

    public void fetchWithRequest(@NotNull C5638a fetchState, @NotNull InterfaceC5719p0.a callback, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        Call callNewCall = this.callFactory.newCall(request);
        fetchState.m9600b().mo9667i(new C5639b(callNewCall, this));
        FirebasePerfOkHttpClient.enqueue(callNewCall, new C5640c(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5685d, com.facebook.imagepipeline.producers.InterfaceC5719p0
    @Nullable
    public Map<String, String> getExtraMap(@NotNull C5638a fetchState, int byteSize) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return MapsKt.mapOf(TuplesKt.m90091to(QUEUE_TIME, String.valueOf(fetchState.responseTime - fetchState.submitTime)), TuplesKt.m90091to(FETCH_TIME, String.valueOf(fetchState.fetchCompleteTime - fetchState.responseTime)), TuplesKt.m90091to(TOTAL_TIME, String.valueOf(fetchState.fetchCompleteTime - fetchState.submitTime)), TuplesKt.m90091to(IMAGE_SIZE, String.valueOf(byteSize)));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5685d, com.facebook.imagepipeline.producers.InterfaceC5719p0
    public void onFetchCompletion(@NotNull C5638a fetchState, int byteSize) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.fetchCompleteTime = SystemClock.elapsedRealtime();
    }

    @JvmOverloads
    public OkHttpNetworkFetcher(@NotNull Call.Factory callFactory, @NotNull Executor cancellationExecutor, boolean z11) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = z11 ? new CacheControl.Builder().noStore().build() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleException(Call call, Exception e11, InterfaceC5719p0.a callback) {
        if (call.getCanceled()) {
            callback.mo9783a();
        } else {
            callback.onFailure(e11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OkHttpNetworkFetcher(@NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ExecutorService executorService = okHttpClient.dispatcher().executorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "executorService(...)");
        this(okHttpClient, executorService, false, 4, null);
    }
}
