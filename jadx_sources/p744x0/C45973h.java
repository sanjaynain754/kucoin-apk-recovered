package p744x0;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.bitmap.BitmapPool;
import coil.memory.StrongMemoryCache;
import org.jetbrains.annotations.NotNull;
import p612s0.InterfaceC44260a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x0.h */
/* JADX INFO: compiled from: RealMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lx0/h;", "", "Lcoil/memory/StrongMemoryCache;", "strongMemoryCache", "Lx0/j;", "weakMemoryCache", "Ls0/a;", "referenceCounter", "Lcoil/bitmap/BitmapPool;", "bitmapPool", "<init>", "(Lcoil/memory/StrongMemoryCache;Lx0/j;Ls0/a;Lcoil/bitmap/BitmapPool;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/memory/StrongMemoryCache;", "c", "()Lcoil/memory/StrongMemoryCache;", "b", "Lx0/j;", "d", "()Lx0/j;", "Ls0/a;", "()Ls0/a;", "Lcoil/bitmap/BitmapPool;", "()Lcoil/bitmap/BitmapPool;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45973h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final StrongMemoryCache strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45975j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44260a referenceCounter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final BitmapPool bitmapPool;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BitmapPool getBitmapPool() {
        return this.bitmapPool;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC44260a getReferenceCounter() {
        return this.referenceCounter;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final StrongMemoryCache getStrongMemoryCache() {
        return this.strongMemoryCache;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC45975j getWeakMemoryCache() {
        return this.weakMemoryCache;
    }

    public C45973h(@NotNull StrongMemoryCache strongMemoryCache, @NotNull InterfaceC45975j weakMemoryCache, @NotNull InterfaceC44260a referenceCounter, @NotNull BitmapPool bitmapPool) {
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.strongMemoryCache = strongMemoryCache;
        this.weakMemoryCache = weakMemoryCache;
        this.referenceCounter = referenceCounter;
        this.bitmapPool = bitmapPool;
    }
}
