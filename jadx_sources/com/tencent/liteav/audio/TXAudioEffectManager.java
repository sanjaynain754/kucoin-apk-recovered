package com.tencent.liteav.audio;

/* JADX INFO: loaded from: classes59.dex */
public interface TXAudioEffectManager {

    public static class AudioMusicParam {

        /* JADX INFO: renamed from: id */
        public int f73339id;
        public String path;
        public int loopCount = 0;
        public boolean publish = false;
        public boolean isShortFile = false;
        public long startTimeMS = 0;
        public long endTimeMS = -1;

        public String toString() {
            return "path=" + this.path + ", id=" + this.f73339id + ", loopCount=" + this.loopCount + ", publish=" + this.publish + ", isShortFile=" + this.isShortFile + ", startTimeMS=" + this.startTimeMS + ", endTimeMS=" + this.endTimeMS;
        }

        public AudioMusicParam(int i11, String str) {
            this.path = str;
            this.f73339id = i11;
        }
    }

    public interface TXMusicPlayObserver {
        void onComplete(int i11, int i12);

        void onPlayProgress(int i11, long j11, long j12);

        void onStart(int i11, int i12);
    }

    public interface TXMusicPreloadObserver {
        void onLoadError(int i11, int i12);

        void onLoadProgress(int i11, int i12);
    }

    public enum TXVoiceChangerType {
        TXLiveVoiceChangerType_0(0),
        TXLiveVoiceChangerType_1(1),
        TXLiveVoiceChangerType_2(2),
        TXLiveVoiceChangerType_3(3),
        TXLiveVoiceChangerType_4(4),
        TXLiveVoiceChangerType_5(5),
        TXLiveVoiceChangerType_6(6),
        TXLiveVoiceChangerType_7(7),
        TXLiveVoiceChangerType_8(8),
        TXLiveVoiceChangerType_9(9),
        TXLiveVoiceChangerType_10(10),
        TXLiveVoiceChangerType_11(11),
        TXLiveVoiceChangerType_12(12),
        TXLiveVoiceChangerType_13(13);

        private int nativeValue;

        public final int getNativeValue() {
            return this.nativeValue;
        }

        TXVoiceChangerType(int i11) {
            this.nativeValue = i11;
        }
    }

    public enum TXVoiceReverbType {
        TXLiveVoiceReverbType_0(0),
        TXLiveVoiceReverbType_1(1),
        TXLiveVoiceReverbType_2(2),
        TXLiveVoiceReverbType_3(3),
        TXLiveVoiceReverbType_4(4),
        TXLiveVoiceReverbType_5(5),
        TXLiveVoiceReverbType_6(6),
        TXLiveVoiceReverbType_7(7),
        TXLiveVoiceReverbType_8(8),
        TXLiveVoiceReverbType_9(9),
        TXLiveVoiceReverbType_10(10),
        TXLiveVoiceReverbType_11(11);

        private int nativeValue;

        public final int getNativeValue() {
            return this.nativeValue;
        }

        TXVoiceReverbType(int i11) {
            this.nativeValue = i11;
        }
    }

    void enableVoiceEarMonitor(boolean z11);

    long getMusicCurrentPosInMS(int i11);

    long getMusicDurationInMS(String str);

    int getMusicTrackCount(int i11);

    void pausePlayMusic(int i11);

    boolean preloadMusic(AudioMusicParam audioMusicParam);

    void resumePlayMusic(int i11);

    void seekMusicToPosInMS(int i11, int i12);

    void setAllMusicVolume(int i11);

    void setMusicObserver(int i11, TXMusicPlayObserver tXMusicPlayObserver);

    void setMusicPitch(int i11, float f11);

    void setMusicPlayoutVolume(int i11, int i12);

    void setMusicPublishVolume(int i11, int i12);

    void setMusicScratchSpeedRate(int i11, float f11);

    void setMusicSpeedRate(int i11, float f11);

    void setMusicTrack(int i11, int i12);

    void setPreloadObserver(TXMusicPreloadObserver tXMusicPreloadObserver);

    void setVoiceCaptureVolume(int i11);

    void setVoiceChangerType(TXVoiceChangerType tXVoiceChangerType);

    void setVoiceEarMonitorVolume(int i11);

    void setVoicePitch(double d11);

    void setVoiceReverbType(TXVoiceReverbType tXVoiceReverbType);

    boolean startPlayMusic(AudioMusicParam audioMusicParam);

    void stopPlayMusic(int i11);
}
