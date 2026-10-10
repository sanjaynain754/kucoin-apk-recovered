package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.bitmap.BitmapPool;
import coil.decode.BitmapFactoryDecoder;
import coil.decode.DrawableDecoderService;
import coil.fetch.AssetUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.memory.RequestService;
import coil.request.DefaultRequestOptions;
import coil.util.SystemCallbacks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ImageLoaderOptions;
import kotlin.InterfaceC4450g;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Call;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p679v0.C45339a;
import p679v0.C45340b;
import p679v0.C45341c;
import p679v0.C45343e;
import p679v0.C45344f;
import p679v0.C45345g;
import p709w0.C45672a;
import p709w0.C45674c;
import p709w0.C45675d;
import p709w0.C45676e;
import p744x0.C45966a;
import p744x0.C45972g;
import p744x0.C45973h;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001^BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u00101R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\u001f\u0010\\¨\u0006_"}, m90084d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "Landroid/content/Context;", "context", "Lcoil/request/DefaultRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/bitmap/BitmapPool;", "bitmapPool", "Lx0/h;", "memoryCache", "Lokhttp3/Call$Factory;", "callFactory", "Lcoil/EventListener$Factory;", "eventListenerFactory", "Lcoil/a;", "componentRegistry", "Lb1/f;", "options", "Lb1/g;", "logger", "<init>", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lcoil/bitmap/BitmapPool;Lx0/h;Lokhttp3/Call$Factory;Lcoil/EventListener$Factory;Lcoil/a;Lb1/f;Lb1/g;)V", "", FirebaseAnalytics.Param.LEVEL, "", "d", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "c", "Lcoil/bitmap/BitmapPool;", "()Lcoil/bitmap/BitmapPool;", "Lx0/h;", "()Lx0/h;", "e", "Lokhttp3/Call$Factory;", "getCallFactory", "()Lokhttp3/Call$Factory;", "f", "Lcoil/EventListener$Factory;", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "g", "Lcoil/a;", "getComponentRegistry", "()Lcoil/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lb1/f;", "getOptions", "()Lb1/f;", "Lkotlinx/coroutines/m0;", "i", "Lkotlinx/coroutines/m0;", "scope", "Lx0/a;", "j", "Lx0/a;", "delegateService", "Lx0/g;", "k", "Lx0/g;", "memoryCacheService", "Lcoil/memory/RequestService;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcoil/memory/RequestService;", "requestService", "Lcoil/decode/DrawableDecoderService;", "m", "Lcoil/decode/DrawableDecoderService;", "drawableDecoder", "Lcoil/util/SystemCallbacks;", "n", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "o", "registry", "", "", "p", "Ljava/util/List;", "interceptors", "Ljava/util/concurrent/atomic/AtomicBoolean;", "q", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShutdown", "Lb1/g;", "()Lb1/g;", "r", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealImageLoader implements ImageLoader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final DefaultRequestOptions defaults;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final BitmapPool bitmapPool;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C45973h memoryCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Call.Factory callFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final EventListener.Factory eventListenerFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C5039a componentRegistry;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ImageLoaderOptions options;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 scope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C45966a delegateService;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C45972g memoryCacheService;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final RequestService requestService;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final DrawableDecoderService drawableDecoder;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final SystemCallbacks systemCallbacks;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C5039a registry;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final List<Object> interceptors;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isShutdown;

    /* JADX INFO: renamed from: coil.RealImageLoader$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"coil/RealImageLoader$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C5038a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RealImageLoader f5735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5038a(CoroutineExceptionHandler.Companion companion, RealImageLoader realImageLoader) {
            super(companion);
            this.f5735b = realImageLoader;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            this.f5735b.m5447b();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final InterfaceC4450g m5447b() {
        return null;
    }

    public RealImageLoader(@NotNull Context context, @NotNull DefaultRequestOptions defaults, @NotNull BitmapPool bitmapPool, @NotNull C45973h memoryCache, @NotNull Call.Factory callFactory, @NotNull EventListener.Factory eventListenerFactory, @NotNull C5039a componentRegistry, @NotNull ImageLoaderOptions options, @Nullable InterfaceC4450g interfaceC4450g) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        Intrinsics.checkNotNullParameter(componentRegistry, "componentRegistry");
        Intrinsics.checkNotNullParameter(options, "options");
        this.context = context;
        this.defaults = defaults;
        this.bitmapPool = bitmapPool;
        this.memoryCache = memoryCache;
        this.callFactory = callFactory;
        this.eventListenerFactory = eventListenerFactory;
        this.componentRegistry = componentRegistry;
        this.options = options;
        this.scope = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C41782z0.m91393c().getImmediate()).plus(new C5038a(CoroutineExceptionHandler.INSTANCE, this)));
        this.delegateService = new C45966a(this, getMemoryCache().getReferenceCounter(), null);
        C45972g c45972g = new C45972g(getMemoryCache().getReferenceCounter(), getMemoryCache().getStrongMemoryCache(), getMemoryCache().getWeakMemoryCache());
        this.memoryCacheService = c45972g;
        RequestService requestService = new RequestService(null);
        this.requestService = requestService;
        DrawableDecoderService drawableDecoderService = new DrawableDecoderService(getBitmapPool());
        this.drawableDecoder = drawableDecoderService;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, options.getNetworkObserverEnabled());
        this.systemCallbacks = systemCallbacks;
        C5039a c5039aM5458d = componentRegistry.m5454e().m5457c(new C45676e(), String.class).m5457c(new C45672a(), Uri.class).m5457c(new C45675d(context), Uri.class).m5457c(new C45674c(context), Integer.class).m5456b(new C45344f(callFactory), Uri.class).m5456b(new C45345g(callFactory), HttpUrl.class).m5456b(new C45343e(options.getAddLastModifiedToFileCacheKey()), File.class).m5456b(new AssetUriFetcher(context), Uri.class).m5456b(new C45340b(context), Uri.class).m5456b(new ResourceUriFetcher(context, drawableDecoderService), Uri.class).m5456b(new C45341c(drawableDecoderService), Drawable.class).m5456b(new C45339a(), Bitmap.class).m5455a(new BitmapFactoryDecoder(context)).m5458d();
        this.registry = c5039aM5458d;
        this.interceptors = CollectionsKt.plus((Collection<? extends EngineInterceptor>) c5039aM5458d.m5452c(), new EngineInterceptor(c5039aM5458d, getBitmapPool(), getMemoryCache().getReferenceCounter(), getMemoryCache().getStrongMemoryCache(), c45972g, requestService, systemCallbacks, drawableDecoderService, null));
        this.isShutdown = new AtomicBoolean(false);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public BitmapPool getBitmapPool() {
        return this.bitmapPool;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public C45973h getMemoryCache() {
        return this.memoryCache;
    }

    /* JADX INFO: renamed from: d */
    public final void m5449d(int level) {
        getMemoryCache().getStrongMemoryCache().mo5481a(level);
        getMemoryCache().getWeakMemoryCache().mo5491a(level);
        getBitmapPool().mo5459a(level);
    }
}
