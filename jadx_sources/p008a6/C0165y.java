package p008a6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p712w3.C45708h;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: a6.y */
/* JADX INFO: compiled from: MemoryChunkUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"La6/y;", "", "<init>", "()V", "", TypedValues.CycleType.S_WAVE_OFFSET, "count", "memorySize", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(III)I", "otherLength", "otherOffset", "", "b", "(IIIII)V", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0165y {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0165y f553a = new C0165y();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m728a(int offset, int count, int memorySize) {
        return Math.min(Math.max(0, memorySize - offset), count);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m729b(int offset, int otherLength, int otherOffset, int count, int memorySize) {
        C45708h.m100893d(count >= 0, "count (%d) ! >= 0", Integer.valueOf(count));
        C45708h.m100893d(offset >= 0, "offset (%d) ! >= 0", Integer.valueOf(offset));
        C45708h.m100893d(otherOffset >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(otherOffset));
        C45708h.m100893d(offset + count <= memorySize, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(offset), Integer.valueOf(count), Integer.valueOf(memorySize));
        C45708h.m100893d(otherOffset + count <= otherLength, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(otherOffset), Integer.valueOf(count), Integer.valueOf(otherLength));
    }
}
