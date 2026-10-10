package cr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.utils.DeviceLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cr.c, reason: from toString */
/* JADX INFO: compiled from: DeviceLevelHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0015\u0010\"\"\u0004\b%\u0010$R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b&\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcr/c;", "", "", "levelScore", "Lcom/kubi/monitor/utils/DeviceLevel;", "relativeLevel", "", "totalMem", "avgCpuFreq", "cpuCrossNum", "<init>", "(ILcom/kubi/monitor/utils/DeviceLevel;JJI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)V", "b", "Lcom/kubi/monitor/utils/DeviceLevel;", "d", "()Lcom/kubi/monitor/utils/DeviceLevel;", "i", "(Lcom/kubi/monitor/utils/DeviceLevel;)V", "J", "e", "()J", "j", "(J)V", "f", "g", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class DeviceLevelInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int levelScore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public DeviceLevel relativeLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public long totalMem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long avgCpuFreq;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public int cpuCrossNum;

    public DeviceLevelInfo() {
        this(0, null, 0L, 0L, 0, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceLevelInfo)) {
            return false;
        }
        DeviceLevelInfo deviceLevelInfo = (DeviceLevelInfo) other;
        return this.levelScore == deviceLevelInfo.levelScore && this.relativeLevel == deviceLevelInfo.relativeLevel && this.totalMem == deviceLevelInfo.totalMem && this.avgCpuFreq == deviceLevelInfo.avgCpuFreq && this.cpuCrossNum == deviceLevelInfo.cpuCrossNum;
    }

    public DeviceLevelInfo(int i11, @NotNull DeviceLevel relativeLevel, long j11, long j12, int i12) {
        Intrinsics.checkNotNullParameter(relativeLevel, "relativeLevel");
        this.levelScore = i11;
        this.relativeLevel = relativeLevel;
        this.totalMem = j11;
        this.avgCpuFreq = j12;
        this.cpuCrossNum = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAvgCpuFreq() {
        return this.avgCpuFreq;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCpuCrossNum() {
        return this.cpuCrossNum;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLevelScore() {
        return this.levelScore;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final DeviceLevel getRelativeLevel() {
        return this.relativeLevel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTotalMem() {
        return this.totalMem;
    }

    /* JADX INFO: renamed from: f */
    public final void m81789f(long j11) {
        this.avgCpuFreq = j11;
    }

    /* JADX INFO: renamed from: g */
    public final void m81790g(int i11) {
        this.cpuCrossNum = i11;
    }

    /* JADX INFO: renamed from: h */
    public final void m81791h(int i11) {
        this.levelScore = i11;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.levelScore) * 31) + this.relativeLevel.hashCode()) * 31) + Long.hashCode(this.totalMem)) * 31) + Long.hashCode(this.avgCpuFreq)) * 31) + Integer.hashCode(this.cpuCrossNum);
    }

    /* JADX INFO: renamed from: i */
    public final void m81792i(@NotNull DeviceLevel deviceLevel) {
        Intrinsics.checkNotNullParameter(deviceLevel, "<set-?>");
        this.relativeLevel = deviceLevel;
    }

    /* JADX INFO: renamed from: j */
    public final void m81793j(long j11) {
        this.totalMem = j11;
    }

    @NotNull
    public String toString() {
        return "DeviceLevelInfo(levelScore=" + this.levelScore + ", relativeLevel=" + this.relativeLevel + ", totalMem=" + this.totalMem + ", avgCpuFreq=" + this.avgCpuFreq + ", cpuCrossNum=" + this.cpuCrossNum + ')';
    }

    public /* synthetic */ DeviceLevelInfo(int i11, DeviceLevel deviceLevel, long j11, long j12, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? DeviceLevel.UN_KNOW : deviceLevel, (i13 & 4) != 0 ? -1L : j11, (i13 & 8) != 0 ? -1L : j12, (i13 & 16) != 0 ? -1 : i12);
    }
}
