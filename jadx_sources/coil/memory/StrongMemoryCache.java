package coil.memory;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612s0.InterfaceC44260a;
import p744x0.C45967b;
import p744x0.C45969d;
import p744x0.InterfaceC45975j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrongMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcoil/memory/StrongMemoryCache;", "", "", FirebaseAnalytics.Param.LEVEL, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface StrongMemoryCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5814a;

    /* JADX INFO: renamed from: a */
    void mo5481a(int level);

    /* JADX INFO: compiled from: StrongMemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcoil/memory/StrongMemoryCache$Companion;", "", "<init>", "()V", "Lx0/j;", "weakMemoryCache", "Ls0/a;", "referenceCounter", "", "maxSize", "Lb1/g;", "logger", "Lcoil/memory/StrongMemoryCache;", "invoke", "(Lx0/j;Ls0/a;ILb1/g;)Lcoil/memory/StrongMemoryCache;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5814a = new Companion();

        @NotNull
        public final StrongMemoryCache invoke(@NotNull InterfaceC45975j weakMemoryCache, @NotNull InterfaceC44260a referenceCounter, int maxSize, @Nullable InterfaceC4450g logger) {
            Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
            Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
            if (maxSize > 0) {
                return new RealStrongMemoryCache(weakMemoryCache, referenceCounter, maxSize, logger);
            }
            if (weakMemoryCache instanceof RealWeakMemoryCache) {
                return new C45969d(weakMemoryCache);
            }
            return C45967b.f103405b;
        }
    }
}
