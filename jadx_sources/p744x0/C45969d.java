package p744x0;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.memory.StrongMemoryCache;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x0.d */
/* JADX INFO: compiled from: StrongMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lx0/d;", "Lcoil/memory/StrongMemoryCache;", "Lx0/j;", "weakMemoryCache", "<init>", "(Lx0/j;)V", "", FirebaseAnalytics.Param.LEVEL, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "b", "Lx0/j;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45969d implements StrongMemoryCache {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45975j weakMemoryCache;

    public C45969d(@NotNull InterfaceC45975j weakMemoryCache) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        this.weakMemoryCache = weakMemoryCache;
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: a */
    public void mo5481a(int level) {
    }
}
