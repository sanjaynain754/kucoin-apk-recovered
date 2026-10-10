package com.tencent.trtc;

import com.tencent.liteav.trtc.TXChorusMusicPlayerImpl;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TXChorusMusicPlayer {

    public interface ITXChorusPlayerListener {
        void onChorusError(TXChorusError tXChorusError, String str);

        void onChorusMusicLoadProgress(String str, float f11);

        void onChorusMusicLoadSucceed(String str, List<TXLyricLine> list, List<TXReferencePitch> list2);

        void onChorusPaused();

        void onChorusRequireLoadMusic(String str);

        void onChorusResumed();

        void onChorusStarted();

        void onChorusStopped();

        void onMusicProgressUpdated(long j11, long j12);

        void onNetworkQualityUpdated(int i11, int i12, int i13);

        void onVoicePitchUpdated(int i11, boolean z11, long j11);

        void onVoiceScoreUpdated(int i11, int i12, int i13);

        void shouldDecryptAudioData(ByteBuffer byteBuffer);
    }

    public static class TXChorusCopyrightedMusicParams {
        public String musicId = null;
        public String playToken = null;
        public String copyrightedLicenseKey = null;
        public String copyrightedLicenseUrl = null;
    }

    public enum TXChorusError {
        TXChorusErrorInvalidParameters,
        TXChorusErrorTrtcCloudNotFound,
        TXChorusErrorRestrictedToLeadSinger,
        TXChorusErrorMusicPreloadRequired,
        TXChorusErrorMusicLoadFailed,
        TXChorusErrorMusicDecodeFailed,
        TXChorusErrorEnterRoomFailed,
        TXChorusErrorRoomDisconnected,
        TXChorusErrorTrtcError
    }

    public static class TXChorusExternalMusicParams {
        public String musicId = null;
        public String musicUrl = null;
        public String accompanyUrl = null;
        public boolean isEncrypted = false;
        public int encryptBlockLength = 0;
    }

    public static class TXChorusLyricCharacter {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public String utf8Character = null;
    }

    public enum TXChorusMusicTrack {
        TXChorusAccompaniment,
        TXChorusOriginalSong
    }

    public enum TXChorusRole {
        TXChorusRoleLeadSinger,
        TXChorusRoleBackSinger,
        TXChorusRoleAnchor,
        TXChorusRoleAudience
    }

    public static class TXChorusYsdMusicParams {
        public String musicId = null;
        public String userId = null;
        public String userToken = null;
        public String deviceId = null;
        public String appId = null;
        public String appKey = null;
        public boolean isChargedOnce = false;
    }

    public static class TXLyricLine {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public List<TXChorusLyricCharacter> characterArray = null;
    }

    public static class TXReferencePitch {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public int referencePitch = 0;
    }

    public abstract void callExperimentalAPI(String str);

    public abstract void destroy();

    public abstract void loadExternalMusic(TXChorusExternalMusicParams tXChorusExternalMusicParams);

    public abstract void loadMusic(TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams);

    public abstract void loadYsdMusic(TXChorusYsdMusicParams tXChorusYsdMusicParams);

    public abstract void pause();

    public abstract void resume();

    public abstract void seek(long j11);

    public abstract void setChorusRole(TXChorusRole tXChorusRole, TRTCCloudDef.TRTCParams tRTCParams);

    public abstract void setListener(ITXChorusPlayerListener iTXChorusPlayerListener);

    public abstract void setMusicPitch(float f11);

    public abstract void setPlayoutVolume(int i11);

    public abstract void setPublishVolume(int i11);

    public abstract void start();

    public abstract void stop();

    public abstract void switchMusicTrack(TXChorusMusicTrack tXChorusMusicTrack);

    public static TXChorusMusicPlayer create(TRTCCloud tRTCCloud, String str, ITXChorusPlayerListener iTXChorusPlayerListener) {
        return TXChorusMusicPlayerImpl.create(tRTCCloud, str, iTXChorusPlayerListener);
    }
}
