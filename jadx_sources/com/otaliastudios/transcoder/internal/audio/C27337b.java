package com.otaliastudios.transcoder.internal.audio;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.audio.b */
/* JADX INFO: compiled from: conversions.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\b\u001a'\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, m90084d2 = {"", "bytes", "sampleRate", "channels", "", "b", "(III)J", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(II)I", "samples", "c", "shorts", "d", "lib_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27337b {
    /* JADX INFO: renamed from: a */
    public static final int m67939a(int i11, int i12) {
        return i12 * i11 * 16;
    }

    /* JADX INFO: renamed from: b */
    public static final long m67940b(int i11, int i12, int i13) {
        return (((long) i11) * 1000000) / ((long) ((i12 * 2) * i13));
    }

    /* JADX INFO: renamed from: c */
    public static final int m67941c(int i11, int i12) {
        return i11 * i12 * 2;
    }

    /* JADX INFO: renamed from: d */
    public static final long m67942d(int i11, int i12, int i13) {
        return m67940b(i11 * 2, i12, i13);
    }
}
