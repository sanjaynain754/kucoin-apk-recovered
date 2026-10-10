package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.producers.InterfaceC5719p0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.network.OkHttpCompat;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReactOkHttpNetworkFetcher.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher;", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "", "", "getHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;", "fetchState", "Lcom/facebook/imagepipeline/producers/p0$a;", TUIConstants.TUIChat.CALL_BACK, "", RemoteConfigComponent.FETCH_FILE_NAME, "(Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher$a;Lcom/facebook/imagepipeline/producers/p0$a;)V", "Lokhttp3/OkHttpClient;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactOkHttpNetworkFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactOkHttpNetworkFetcher.kt\ncom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class ReactOkHttpNetworkFetcher extends OkHttpNetworkFetcher {

    @NotNull
    private final OkHttpClient okHttpClient;

    /* JADX INFO: compiled from: ReactOkHttpNetworkFetcher.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCacheControl.FORCE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCacheControl.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactOkHttpNetworkFetcher(@NotNull OkHttpClient okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
    }

    private final Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String string = readableMap.getString(strNextKey);
            if (string != null) {
                map.put(strNextKey, string);
            }
        }
        return map;
    }

    @Override // com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher, com.facebook.imagepipeline.producers.InterfaceC5719p0
    public void fetch(@NotNull OkHttpNetworkFetcher.C5638a fetchState, @NotNull InterfaceC5719p0.a callback) {
        Map<String, String> headers;
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.submitTime = SystemClock.elapsedRealtime();
        Uri uriM9605g = fetchState.m9605g();
        Intrinsics.checkNotNullExpressionValue(uriM9605g, "getUri(...)");
        CacheControl.Builder builder = new CacheControl.Builder();
        if (fetchState.m9600b().mo9666h() instanceof ReactNetworkImageRequest) {
            ImageRequest imageRequestMo9666h = fetchState.m9600b().mo9666h();
            Intrinsics.checkNotNull(imageRequestMo9666h, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            ReactNetworkImageRequest reactNetworkImageRequest = (ReactNetworkImageRequest) imageRequestMo9666h;
            headers = getHeaders(reactNetworkImageRequest.getHeaders());
            int i11 = WhenMappings.$EnumSwitchMapping$0[reactNetworkImageRequest.getCacheControl().ordinal()];
            if (i11 == 1) {
                builder.noStore().noCache();
            } else if (i11 == 2) {
                builder.maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else if (i11 == 3) {
                builder.onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                builder.noStore();
            }
        } else {
            builder.noStore();
            headers = null;
        }
        Headers headersFromMap = OkHttpCompat.getHeadersFromMap(headers);
        Request.Builder builderCacheControl = new Request.Builder().cacheControl(builder.build());
        String string = uriM9605g.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Request.Builder builderUrl = builderCacheControl.url(string);
        Intrinsics.checkNotNull(headersFromMap);
        fetchWithRequest(fetchState, callback, builderUrl.headers(headersFromMap).get().build());
    }
}
