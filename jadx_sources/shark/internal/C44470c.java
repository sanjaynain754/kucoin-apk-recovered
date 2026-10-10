package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.internal.c */
/* JADX INFO: compiled from: ByteSubArray.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"", "", "index", "", "c", "([BI)S", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([BI)I", "", "b", "([BI)J", "shark-graph"}, m90085k = 2, m90086mv = {1, 4, 1})
public final class C44470c {
    /* JADX INFO: renamed from: a */
    public static final int m98327a(@NotNull byte[] bArr, int i11) {
        int i12 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24);
        return (bArr[i11 + 3] & 255) | i12 | ((bArr[i11 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static final long m98328b(@NotNull byte[] bArr, int i11) {
        long j11 = ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16);
        return (((long) bArr[i11 + 7]) & 255) | j11 | ((((long) bArr[i11 + 6]) & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static final short m98329c(@NotNull byte[] bArr, int i11) {
        int i12 = i11 + 1;
        return (short) ((bArr[i12] & 255) | ((bArr[i11] & 255) << 8));
    }
}
