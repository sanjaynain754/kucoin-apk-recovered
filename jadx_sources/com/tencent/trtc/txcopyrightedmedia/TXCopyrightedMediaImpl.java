package com.tencent.trtc.txcopyrightedmedia;

import android.content.Context;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class TXCopyrightedMediaImpl extends TXCopyrightedMedia {
    private long mNativeTXCopyrightedMediaImpl = 0;

    public class TXSongScoreImpl implements TXCopyrightedMedia.ITXSongScore {
        private long mNativeTXCopyrightedSongScore;

        public TXSongScoreImpl(String str, int i11, int i12, String str2, String str3, String str4) {
            this.mNativeTXCopyrightedSongScore = 0L;
            this.mNativeTXCopyrightedSongScore = TXCopyrightedMediaImpl.nativeCreateSongScore(TXCopyrightedMediaImpl.this.mNativeTXCopyrightedMediaImpl, this, str, i11, i12, str2, str3, str4);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public int calculateTotalScore() {
            return TXCopyrightedMediaImpl.nativeCalculateTotalScore(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void destroy() {
            TXCopyrightedMediaImpl.nativeDestroySongScore(this.mNativeTXCopyrightedSongScore);
            this.mNativeTXCopyrightedSongScore = 0L;
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void finish() {
            TXCopyrightedMediaImpl.nativeFinish(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public TXCopyrightedMedia.TXSongScoreNoteItem[] getAllGrove() {
            return TXCopyrightedMediaImpl.nativeGetAllGrove(this.mNativeTXCopyrightedSongScore);
        }

        public void onMIDIGroveAndHint(String str, boolean z11, float f11, float f12, int i11, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIGroveAndHint(str, z11, f11, f12, i11);
        }

        public void onMIDISCoreUpdate(String str, int i11, int i12, int i13, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDISCoreUpdate(str, i11, i12, i13);
        }

        public void onMIDIScoreError(String str, int i11, String str2, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreError(str, i11, str2);
        }

        public void onMIDIScoreFinish(String str, int[] iArr, int i11, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreFinish(str, iArr, i11);
        }

        public void onMIDIScorePrepared(String str, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScorePrepared(str);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void prepare() {
            TXCopyrightedMediaImpl.nativePrepare(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void process(byte[] bArr, int i11, float f11) {
            TXCopyrightedMediaImpl.nativeProcess(this.mNativeTXCopyrightedSongScore, bArr, i11, f11);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setKeyShift(int i11) {
            TXCopyrightedMediaImpl.nativeSetKeyShift(this.mNativeTXCopyrightedSongScore, i11);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setSongScoreCallback(TXCopyrightedMedia.ITXSongScoreCallback iTXSongScoreCallback) {
            TXCopyrightedMediaImpl.nativeSetSongScoreCallback(this.mNativeTXCopyrightedSongScore, iTXSongScoreCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nativeCalculateTotalScore(long j11);

    private static native void nativeCancelPreloadMusic(long j11, String str, String str2);

    private static native void nativeClearMusicCache(long j11);

    private static native void nativeClearMusicCacheByMusicId(long j11, String str, String str2);

    private static native long nativeCreateCopyRightedMedia(TXCopyrightedMediaImpl tXCopyrightedMediaImpl);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateSongScore(long j11, TXSongScoreImpl tXSongScoreImpl, String str, int i11, int i12, String str2, String str3, String str4);

    private static native void nativeDestroyCopyRightedMedia(TXCopyrightedMediaImpl tXCopyrightedMediaImpl, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeDestroySongScore(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFinish(long j11);

    private static native String nativeGenMusicURI(long j11, String str, int i11, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native TXCopyrightedMedia.TXSongScoreNoteItem[] nativeGetAllGrove(long j11);

    private static native TXCopyrightedMedia.TXClimaxTimeRange nativeGetClimaxSegmentTimeRange(long j11, String str, int i11, String str2);

    private static native boolean nativeIsMusicPreloaded(long j11, String str, String str2);

    private static native void nativePreloadClimaxSegment(long j11, String str, String str2, String str3);

    private static native void nativePreloadMusic(long j11, String str, String str2, String str3);

    private static native void nativePreloadPitchAndLyricFile(long j11, String str, String str2, String str3);

    private static native void nativePreloadYSDMusic(long j11, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativePrepare(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProcess(long j11, byte[] bArr, int i11, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetKeyShift(long j11, int i11);

    private static native void nativeSetLicense(long j11, Context context, String str, String str2);

    private static native void nativeSetMusicCacheMaxCount(long j11, int i11);

    private static native void nativeSetMusicPreloadCallback(long j11, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSongScoreCallback(long j11, Object obj);

    private static native void nativeSetYSDAuthParams(long j11, String str, String str2, String str3, String str4, String str5, boolean z11);

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void clearMusicCache() {
        nativeClearMusicCache(this.mNativeTXCopyrightedMediaImpl);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadMusic(String str, String str2) {
        nativePreloadYSDMusic(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    public static Object createClimaxTimeRange(int i11, int i12) {
        TXCopyrightedMedia.TXClimaxTimeRange tXClimaxTimeRange = new TXCopyrightedMedia.TXClimaxTimeRange();
        tXClimaxTimeRange.startTime = i11;
        tXClimaxTimeRange.endTime = i12;
        return tXClimaxTimeRange;
    }

    public static Object createSongScoreNoteItem(int i11, int i12, int i13, int i14) {
        TXCopyrightedMedia.TXSongScoreNoteItem tXSongScoreNoteItem = new TXCopyrightedMedia.TXSongScoreNoteItem();
        tXSongScoreNoteItem.startTime = i11;
        tXSongScoreNoteItem.duration = i12;
        tXSongScoreNoteItem.noteHeight = i13;
        tXSongScoreNoteItem.endTime = i14;
        return tXSongScoreNoteItem;
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void cancelPreloadMusic(String str, String str2) {
        nativeCancelPreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void clearMusicCache(String str, String str2) {
        nativeClearMusicCacheByMusicId(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public TXCopyrightedMedia.ITXSongScore createSongScore(String str, int i11, int i12, String str2, String str3, String str4) {
        return new TXSongScoreImpl(str, i11, i12, str2, str3, str4);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void destroy() {
        long j11 = this.mNativeTXCopyrightedMediaImpl;
        if (j11 != 0) {
            nativeDestroyCopyRightedMedia(this, j11);
            this.mNativeTXCopyrightedMediaImpl = 0L;
        }
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public String genMusicURI(String str, int i11, String str2) {
        return nativeGenMusicURI(this.mNativeTXCopyrightedMediaImpl, str, i11, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public TXCopyrightedMedia.TXClimaxTimeRange getClimaxSegmentTimeRange(String str, int i11, String str2) {
        return nativeGetClimaxSegmentTimeRange(this.mNativeTXCopyrightedMediaImpl, str, i11, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void init() {
        if (this.mNativeTXCopyrightedMediaImpl == 0) {
            this.mNativeTXCopyrightedMediaImpl = nativeCreateCopyRightedMedia(this);
        }
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public boolean isMusicPreloaded(String str, String str2) {
        return nativeIsMusicPreloaded(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    public void onPreloadComplete(String str, String str2, int i11, String str3, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadComplete(str, str2, i11, str3);
    }

    public void onPreloadProgress(String str, String str2, float f11, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadProgress(str, str2, f11);
    }

    public void onPreloadStart(String str, String str2, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadStart(str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadClimaxSegment(String str, String str2, String str3) {
        nativePreloadClimaxSegment(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadMusic(String str, String str2, String str3) {
        nativePreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadPitchAndLyricFile(String str, String str2, String str3) {
        nativePreloadPitchAndLyricFile(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setLicense(Context context, String str, String str2) {
        nativeSetLicense(this.mNativeTXCopyrightedMediaImpl, context, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicCacheMaxCount(int i11) {
        nativeSetMusicCacheMaxCount(this.mNativeTXCopyrightedMediaImpl, i11);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicPreloadCallback(TXCopyrightedMedia.ITXMusicPreloadCallback iTXMusicPreloadCallback) {
        nativeSetMusicPreloadCallback(this.mNativeTXCopyrightedMediaImpl, iTXMusicPreloadCallback);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setYSDAuthParams(TXCopyrightedMedia.TXCopyrightedMediaYSDAuthParams tXCopyrightedMediaYSDAuthParams) {
        nativeSetYSDAuthParams(this.mNativeTXCopyrightedMediaImpl, tXCopyrightedMediaYSDAuthParams.appId, tXCopyrightedMediaYSDAuthParams.appKey, tXCopyrightedMediaYSDAuthParams.deviceId, tXCopyrightedMediaYSDAuthParams.userId, tXCopyrightedMediaYSDAuthParams.userToken, tXCopyrightedMediaYSDAuthParams.isChargedOnce);
    }
}
