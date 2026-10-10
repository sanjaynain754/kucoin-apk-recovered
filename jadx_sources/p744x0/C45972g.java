package p744x0;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.memory.StrongMemoryCache;
import org.jetbrains.annotations.NotNull;
import p612s0.InterfaceC44260a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x0.g */
/* JADX INFO: compiled from: MemoryCacheService.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lx0/g;", "", "Ls0/a;", "referenceCounter", "Lcoil/memory/StrongMemoryCache;", "strongMemoryCache", "Lx0/j;", "weakMemoryCache", "<init>", "(Ls0/a;Lcoil/memory/StrongMemoryCache;Lx0/j;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ls0/a;", "b", "Lcoil/memory/StrongMemoryCache;", "c", "Lx0/j;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45972g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44260a referenceCounter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final StrongMemoryCache strongMemoryCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45975j weakMemoryCache;

    public C45972g(@NotNull InterfaceC44260a referenceCounter, @NotNull StrongMemoryCache strongMemoryCache, @NotNull InterfaceC45975j weakMemoryCache) {
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        this.referenceCounter = referenceCounter;
        this.strongMemoryCache = strongMemoryCache;
        this.weakMemoryCache = weakMemoryCache;
    }
}
