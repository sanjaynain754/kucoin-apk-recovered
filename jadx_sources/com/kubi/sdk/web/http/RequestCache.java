package com.kubi.sdk.web.http;

import android.util.LruCache;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41729r0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: RequestCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001:\u0003\u0015(\u0017B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJC\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00028\u00002\u001e\u0010\u000e\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u00002\u001e\u0010\u000e\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J=\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u001e\u0010\u000e\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R(\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/web/http/RequestCache;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "size", "", "cacheTimeout", "updateTimeout", "<init>", "(IJJ)V", "key", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lcom/kubi/sdk/web/http/RequestCache$a;", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "i", CmcdData.Factory.STREAMING_FORMAT_HLS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "J", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/r0;", "d", "Ljava/util/concurrent/ConcurrentHashMap;", "singleCache", "Landroid/util/LruCache;", "Lcom/kubi/sdk/web/http/RequestCache$b;", "e", "Landroid/util/LruCache;", "resultCache", "Lrg0/a;", "f", "Lrg0/a;", "singleLock", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RequestCache<K, V> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long cacheTimeout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long updateTimeout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<K, InterfaceC41729r0<V>> singleCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final LruCache<K, C24311b<V>> resultCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44082a singleLock;

    /* JADX INFO: compiled from: RequestCache.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/sdk/web/http/RequestCache$Companion;", "", "<init>", "()V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRequestCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$Companion\n*L\n1#1,123:1\n26#1:124\n*S KotlinDebug\n*F\n+ 1 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$Companion\n*L\n27#1:124\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.web.http.RequestCache$a */
    /* JADX INFO: compiled from: RequestCache.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/web/http/RequestCache$a;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "data", "", "isCached", "needUpdate", "<init>", "(Ljava/lang/Object;ZZ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Z", "c", "()Z", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C24310a<V> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final V data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isCached;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean needUpdate;

        /* JADX INFO: renamed from: a */
        public final V m58720a() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getNeedUpdate() {
            return this.needUpdate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsCached() {
            return this.isCached;
        }

        public C24310a(V v11, boolean z11, boolean z12) {
            this.data = v11;
            this.isCached = z11;
            this.needUpdate = z12;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.web.http.RequestCache$b */
    /* JADX INFO: compiled from: RequestCache.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/web/http/RequestCache$b;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "<init>", "(Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "J", "()J", "timestamp", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @VisibleForTesting(otherwise = 2)
    @SourceDebugExtension({"SMAP\nRequestCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$Item\n+ 2 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$Companion\n*L\n1#1,123:1\n26#2:124\n*S KotlinDebug\n*F\n+ 1 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$Item\n*L\n42#1:124\n*E\n"})
    public static final class C24311b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final T value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long timestamp;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: b */
        public final T m58724b() {
            return this.value;
        }

        public C24311b(T t11) {
            this.value = t11;
            Companion companion = RequestCache.INSTANCE;
            this.timestamp = System.currentTimeMillis();
        }
    }

    public RequestCache() {
        this(0, 0L, 0L, 7, null);
    }

    public RequestCache(int i11, long j11, long j12) {
        this.size = i11;
        this.cacheTimeout = j11;
        this.updateTimeout = j12;
        this.singleCache = new ConcurrentHashMap<>();
        this.resultCache = new LruCache<>(i11);
        this.singleLock = C44087f.m97144b(false, 1, null);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m58717g(@NotNull K k11, @NotNull Function1<? super Continuation<? super V>, ? extends Object> function1, @NotNull Continuation<? super C24310a<V>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new RequestCache$cache$2(this, k11, function1, null), continuation);
    }

    /* JADX INFO: renamed from: h */
    public final Object m58718h(K k11, Function1<? super Continuation<? super V>, ? extends Object> function1, Continuation<? super V> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new RequestCache$single$2(this, k11, function1, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m58719i(@NotNull K k11, @NotNull Function1<? super Continuation<? super V>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new RequestCache$update$2(this, k11, function1, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RequestCache(int i11, long j11, long j12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 16 : i11, (i12 & 2) != 0 ? -1L : j11, (i12 & 4) != 0 ? 60000L : j12);
    }
}
