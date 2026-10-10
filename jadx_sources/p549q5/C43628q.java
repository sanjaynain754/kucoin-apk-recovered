package p549q5;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;

/* JADX INFO: renamed from: q5.q */
/* JADX INFO: compiled from: MemoryCacheParams.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lq5/q;", "", "", "maxCacheSize", "maxCacheEntries", "maxEvictionQueueSize", "maxEvictionQueueEntries", "maxCacheEntrySize", "", "paramsCheckIntervalMs", "<init>", "(IIIIIJ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "c", "d", "e", "f", "J", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43628q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int maxCacheSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int maxCacheEntries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final int maxEvictionQueueSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public final int maxEvictionQueueEntries;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    public final int maxCacheEntrySize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    public final long paramsCheckIntervalMs;

    @JvmOverloads
    public C43628q(int i11, int i12, int i13, int i14, int i15, long j11) {
        this.maxCacheSize = i11;
        this.maxCacheEntries = i12;
        this.maxEvictionQueueSize = i13;
        this.maxEvictionQueueEntries = i14;
        this.maxCacheEntrySize = i15;
        this.paramsCheckIntervalMs = j11;
    }
}
