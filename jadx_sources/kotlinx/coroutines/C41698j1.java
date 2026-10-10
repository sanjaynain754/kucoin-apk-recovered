package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.j1 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006*\u001e\b\u0002\u0010\f\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0012\u0004\u0012\u00028\u00000\u000b¨\u0006\r"}, m90084d2 = {"", "timeMillis", "c", "(J)J", "Log0/a0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Log0/a0;", "DISPOSED_TASK", "b", "CLOSED_EMPTY", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41698j1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43045a0 f91750a = new C43045a0("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C43045a0 f91751b = new C43045a0("CLOSED_EMPTY");

    /* JADX INFO: renamed from: c */
    public static final long m91110c(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        if (j11 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j11 * 1000000;
    }
}
