package ar;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ar.a, reason: from toString */
/* JADX INFO: compiled from: MetricsRemoteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lar/a;", "", "", JPushConstants.Geofence.KEY_INTERVAL, "", "isCpuOpen", "isMemOpen", "<init>", "(IZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "Z", "()Z", "c", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class MetricsRemoteConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(JPushConstants.Geofence.KEY_INTERVAL)
    public final int interval;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("is_cpu_open")
    public final boolean isCpuOpen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("is_mem_open")
    public final boolean isMemOpen;

    public MetricsRemoteConfig() {
        this(0, false, false, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsRemoteConfig)) {
            return false;
        }
        MetricsRemoteConfig metricsRemoteConfig = (MetricsRemoteConfig) other;
        return this.interval == metricsRemoteConfig.interval && this.isCpuOpen == metricsRemoteConfig.isCpuOpen && this.isMemOpen == metricsRemoteConfig.isMemOpen;
    }

    public MetricsRemoteConfig(int i11, boolean z11, boolean z12) {
        this.interval = i11;
        this.isCpuOpen = z11;
        this.isMemOpen = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsCpuOpen() {
        return this.isCpuOpen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsMemOpen() {
        return this.isMemOpen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.interval) * 31;
        boolean z11 = this.isCpuOpen;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.isMemOpen;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "MetricsRemoteConfig(interval=" + this.interval + ", isCpuOpen=" + this.isCpuOpen + ", isMemOpen=" + this.isMemOpen + ')';
    }

    public /* synthetic */ MetricsRemoteConfig(int i11, boolean z11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 2 : i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? true : z12);
    }
}
