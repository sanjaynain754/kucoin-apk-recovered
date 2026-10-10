package hk;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: hk.c */
/* JADX INFO: compiled from: IRequestTrack.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"", "end", "start", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJ)J", "httpdns_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIRequestTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IRequestTrack.kt\ncom/kubi/httpdns/track/IRequestTrackKt\n*L\n1#1,50:1\n48#1:51\n*S KotlinDebug\n*F\n+ 1 IRequestTrack.kt\ncom/kubi/httpdns/track/IRequestTrackKt\n*L\n43#1:51\n*E\n"})
public final class C38224c {
    /* JADX INFO: renamed from: a */
    public static final long m86289a(long j11, long j12) {
        if (j12 == 0 || j11 == 0) {
            return 0L;
        }
        return Math.max(0L, Math.min(180000L, j11 - j12));
    }
}
