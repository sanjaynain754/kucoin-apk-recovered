package o00;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o00.h */
/* JADX INFO: compiled from: KThreadPoolEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"", "delay", "Ljava/lang/Runnable;", "f", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JLjava/lang/Runnable;)V", "Ljava/util/concurrent/TimeUnit;", "unit", "b", "(JLjava/util/concurrent/TimeUnit;Ljava/lang/Runnable;)V", "ThreadPool_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C42918h {
    /* JADX INFO: renamed from: a */
    public static final void m94141a(long j11, @NotNull Runnable f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        C42917g.m94136b().schedule(f11, j11, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public static final void m94142b(long j11, @NotNull TimeUnit unit, @NotNull Runnable f11) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(f11, "f");
        C42917g.m94136b().schedule(f11, j11, unit);
    }
}
