package p672ur;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ur.f */
/* JADX INFO: compiled from: IConnectTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"", "end", "start", "max", "c", "(JJJ)J", "Ljava/lang/StringBuffer;", "callStart", "", "callName", "", "isEnd", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/StringBuffer;JLjava/lang/String;Z)V", "network-core-socket_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIConnectTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IConnectTrack.kt\ncom/kubi/network/socket/track/IConnectTrackKt\n*L\n1#1,95:1\n93#1:96\n84#1:97\n*S KotlinDebug\n*F\n+ 1 IConnectTrack.kt\ncom/kubi/network/socket/track/IConnectTrackKt\n*L\n81#1:96\n87#1:97\n*E\n"})
public final class C45296f {
    /* JADX INFO: renamed from: a */
    public static final void m100133a(@NotNull StringBuffer stringBuffer, long j11, @NotNull String callName, boolean z11) {
        Intrinsics.checkNotNullParameter(stringBuffer, "<this>");
        Intrinsics.checkNotNullParameter(callName, "callName");
        stringBuffer.append(callName + '[' + (System.currentTimeMillis() - j11) + ']');
        if (z11) {
            return;
        }
        stringBuffer.append("->");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m100134b(StringBuffer stringBuffer, long j11, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        m100133a(stringBuffer, j11, str, z11);
    }

    /* JADX INFO: renamed from: c */
    public static final long m100135c(long j11, long j12, long j13) {
        if (j12 == 0 || j11 == 0) {
            return 0L;
        }
        return Math.max(0L, Math.min(j13, j11 - j12));
    }
}
