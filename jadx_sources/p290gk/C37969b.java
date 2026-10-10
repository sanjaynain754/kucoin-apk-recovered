package p290gk;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: gk.b */
/* JADX INFO: compiled from: ProbeResult.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lgk/b;", "", "", "", "ips", "", "speeds", "<init>", "([Ljava/lang/String;[Ljava/lang/Integer;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Ljava/lang/String;", "()[Ljava/lang/String;", "setIps", "([Ljava/lang/String;)V", "b", "[Ljava/lang/Integer;", "()[Ljava/lang/Integer;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProbeResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProbeResult.kt\ncom/kubi/httpdns/probe/ProbeResult\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,11:1\n26#2:12\n26#2:13\n*S KotlinDebug\n*F\n+ 1 ProbeResult.kt\ncom/kubi/httpdns/probe/ProbeResult\n*L\n9#1:12\n10#1:13\n*E\n"})
public final class C37969b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String[] ips;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Integer[] speeds;

    public C37969b(@NotNull String[] ips, @NotNull Integer[] speeds) {
        Intrinsics.checkNotNullParameter(ips, "ips");
        Intrinsics.checkNotNullParameter(speeds, "speeds");
        this.ips = ips;
        this.speeds = speeds;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String[] getIps() {
        return this.ips;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer[] getSpeeds() {
        return this.speeds;
    }

    public /* synthetic */ C37969b(String[] strArr, Integer[] numArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new String[0] : strArr, (i11 & 2) != 0 ? new Integer[0] : numArr);
    }
}
