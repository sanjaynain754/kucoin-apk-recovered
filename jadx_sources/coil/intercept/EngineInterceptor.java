package coil.intercept;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.C5039a;
import coil.bitmap.BitmapPool;
import coil.decode.DrawableDecoderService;
import coil.memory.RequestService;
import coil.memory.StrongMemoryCache;
import coil.util.SystemCallbacks;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612s0.InterfaceC44260a;
import p744x0.C45972g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m90084d2 = {"Lcoil/intercept/EngineInterceptor;", "", "Lcoil/a;", "registry", "Lcoil/bitmap/BitmapPool;", "bitmapPool", "Ls0/a;", "referenceCounter", "Lcoil/memory/StrongMemoryCache;", "strongMemoryCache", "Lx0/g;", "memoryCacheService", "Lcoil/memory/RequestService;", "requestService", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/decode/DrawableDecoderService;", "drawableDecoder", "Lb1/g;", "logger", "<init>", "(Lcoil/a;Lcoil/bitmap/BitmapPool;Ls0/a;Lcoil/memory/StrongMemoryCache;Lx0/g;Lcoil/memory/RequestService;Lcoil/util/SystemCallbacks;Lcoil/decode/DrawableDecoderService;Lb1/g;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/a;", "b", "Lcoil/bitmap/BitmapPool;", "c", "Ls0/a;", "d", "Lcoil/memory/StrongMemoryCache;", "e", "Lx0/g;", "f", "Lcoil/memory/RequestService;", "g", "Lcoil/util/SystemCallbacks;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcoil/decode/DrawableDecoderService;", "i", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class EngineInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C5039a registry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BitmapPool bitmapPool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44260a referenceCounter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final StrongMemoryCache strongMemoryCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C45972g memoryCacheService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final RequestService requestService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final SystemCallbacks systemCallbacks;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final DrawableDecoderService drawableDecoder;

    public EngineInterceptor(@NotNull C5039a registry, @NotNull BitmapPool bitmapPool, @NotNull InterfaceC44260a referenceCounter, @NotNull StrongMemoryCache strongMemoryCache, @NotNull C45972g memoryCacheService, @NotNull RequestService requestService, @NotNull SystemCallbacks systemCallbacks, @NotNull DrawableDecoderService drawableDecoder, @Nullable InterfaceC4450g interfaceC4450g) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(memoryCacheService, "memoryCacheService");
        Intrinsics.checkNotNullParameter(requestService, "requestService");
        Intrinsics.checkNotNullParameter(systemCallbacks, "systemCallbacks");
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.registry = registry;
        this.bitmapPool = bitmapPool;
        this.referenceCounter = referenceCounter;
        this.strongMemoryCache = strongMemoryCache;
        this.memoryCacheService = memoryCacheService;
        this.requestService = requestService;
        this.systemCallbacks = systemCallbacks;
        this.drawableDecoder = drawableDecoder;
    }
}
