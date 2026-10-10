package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::manager")
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final String TAG = "TXAudioEffectManagerImpl";
    private List<Integer> mEffectIdList = new ArrayList();
    private final MusicPlayObserver mMusicPlayObserver;
    private final MusicPreloadObserver mMusicPreloadObserver;
    private long mNativeAudioEffectMgr;

    public static class AudioBgmParams {
        private TXAudioEffectManager.AudioMusicParam mParams;

        public long getEndTimeMS() {
            return this.mParams.endTimeMS;
        }

        public int getLoopCount() {
            return this.mParams.loopCount;
        }

        public String getPath() {
            return this.mParams.path;
        }

        public long getStartTimeMS() {
            return this.mParams.startTimeMS;
        }

        public boolean isPublish() {
            return this.mParams.publish;
        }

        public AudioBgmParams(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
            this.mParams = audioMusicParam;
        }
    }

    public static class MusicPlayObserver {
        private final HashMap<Long, TXAudioEffectManager.TXMusicPlayObserver> mObserverMap = new HashMap<>();

        public void onComplete(long j11, int i11) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(Long.valueOf(j11));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onComplete((int) j11, i11);
            }
        }

        public void onPlayProgress(long j11, long j12, long j13) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(Long.valueOf(j11));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onPlayProgress((int) j11, j12, j13);
            }
        }

        public void onStart(long j11, int i11) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(Long.valueOf(j11));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onStart((int) j11, i11);
            }
        }

        public void removeObserver(long j11) {
            synchronized (this) {
                this.mObserverMap.remove(Long.valueOf(j11));
            }
        }

        public void addObserver(long j11, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
            if (tXMusicPlayObserver == null) {
                return;
            }
            synchronized (this) {
                this.mObserverMap.put(Long.valueOf(j11), tXMusicPlayObserver);
            }
        }
    }

    public static class MusicPreloadObserver {
        private TXAudioEffectManager.TXMusicPreloadObserver mObserver;

        public void onLoadError(long j11, int i11) {
            TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver = this.mObserver;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.onLoadError((int) j11, i11);
            }
        }

        public void onLoadProgress(long j11, int i11) {
            TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver = this.mObserver;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.onLoadProgress((int) j11, i11);
            }
        }

        public void setObserver(TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver) {
            this.mObserver = tXMusicPreloadObserver;
        }
    }

    private static native void nativeDestroy(long j11);

    private static native void nativeEnableVoiceEarMonitor(long j11, boolean z11);

    private static native long nativeGetMusicCurrentPosInMS(long j11, long j12);

    private static native long nativeGetMusicDurationInMS(long j11, String str);

    private static native int nativeGetMusicTrackCount(long j11, long j12);

    private static native void nativePausePlayMusic(long j11, long j12);

    private static native void nativePreloadMusic(long j11, long j12, AudioBgmParams audioBgmParams);

    private static native void nativeResumePlayMusic(long j11, long j12);

    private static native void nativeSeekMusicToPosInMS(long j11, long j12, long j13);

    private static native void nativeSetAllMusicVolume(long j11, int i11);

    private static native void nativeSetMusicObserver(long j11, MusicPlayObserver musicPlayObserver);

    private static native void nativeSetMusicPitch(long j11, long j12, float f11);

    private static native void nativeSetMusicPlayoutVolume(long j11, long j12, int i11);

    private static native void nativeSetMusicPublishVolume(long j11, long j12, int i11);

    private static native void nativeSetMusicScratchSpeedRate(long j11, long j12, float f11);

    private static native void nativeSetMusicSpeedRate(long j11, long j12, float f11);

    private static native void nativeSetMusicTrack(long j11, long j12, int i11);

    private static native void nativeSetPreloadObserver(long j11, MusicPreloadObserver musicPreloadObserver);

    private static native void nativeSetVoiceCaptureVolume(long j11, int i11);

    private static native void nativeSetVoiceChangerType(long j11, int i11);

    private static native void nativeSetVoiceEarMonitorVolume(long j11, int i11);

    private static native void nativeSetVoicePitch(long j11, double d11);

    private static native void nativeSetVoiceReverbType(long j11, int i11);

    private static native void nativeStartPlayMusic(long j11, long j12, AudioBgmParams audioBgmParams);

    private static native void nativeStopPlayMusic(long j11, long j12);

    public static TXAudioEffectManager.TXVoiceChangerType voiceChangerTypeFromInt(int i11) {
        if (i11 == 0) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
        }
        if (i11 == 1) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1;
        }
        if (i11 == 2) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2;
        }
        if (i11 == 3) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3;
        }
        if (i11 == 4) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4;
        }
        if (i11 == 5) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5;
        }
        if (i11 == 6) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6;
        }
        if (i11 == 7) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7;
        }
        if (i11 == 8) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8;
        }
        if (i11 == 9) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9;
        }
        if (i11 == 10) {
            return TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10;
        }
        return i11 == 11 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11 : TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
    }

    public static TXAudioEffectManager.TXVoiceReverbType voiceReverbTypeFromInt(int i11) {
        if (i11 == 0) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
        }
        if (i11 == 1) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1;
        }
        if (i11 == 2) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2;
        }
        if (i11 == 3) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3;
        }
        if (i11 == 4) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4;
        }
        if (i11 == 5) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5;
        }
        if (i11 == 6) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6;
        }
        if (i11 == 7) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7;
        }
        if (i11 == 8) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_8;
        }
        if (i11 == 9) {
            return TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_9;
        }
        return i11 == 10 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_10 : TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeEnableVoiceEarMonitor(j11, z11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            return nativeGetMusicCurrentPosInMS(j11, i11);
        }
        return 0L;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public int getMusicTrackCount(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            return nativeGetMusicTrackCount(j11, i11);
        }
        return 0;
    }

    public void pauseAudioEffect(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativePausePlayMusic(j11, convertToEffectId(i11));
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativePausePlayMusic(j11, i11);
        }
    }

    public void playAudioEffect(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || TextUtils.isEmpty(audioMusicParam.path)) {
            LiteavLog.m76083e(TAG, "startPlayMusic invalid params");
            return;
        }
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeStartPlayMusic(j11, convertToEffectId(audioMusicParam.f73339id), new AudioBgmParams(audioMusicParam));
            synchronized (this) {
                this.mEffectIdList.add(Integer.valueOf(audioMusicParam.f73339id));
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean preloadMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            LiteavLog.m76083e(TAG, "preloadMusic invalid params");
            return false;
        }
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 == 0) {
            return true;
        }
        nativePreloadMusic(j11, audioMusicParam.f73339id, new AudioBgmParams(audioMusicParam));
        return true;
    }

    public void resumeAudioEffect(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeResumePlayMusic(j11, convertToEffectId(i11));
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeResumePlayMusic(j11, i11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i11, int i12) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSeekMusicToPosInMS(j11, i11, i12);
        }
    }

    public void setAllAudioEffectsVolume(int i11) {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                try {
                    Iterator<Integer> it = this.mEffectIdList.iterator();
                    while (it.hasNext()) {
                        setAudioEffectVolume(it.next().intValue(), i11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetAllMusicVolume(j11, i11);
        }
    }

    public void setAudioEffectVolume(int i11, int i12) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicPlayoutVolume(j11, convertToEffectId(i11), i12);
            nativeSetMusicPublishVolume(this.mNativeAudioEffectMgr, convertToEffectId(i11), i12);
        }
    }

    public void setEffectObserver(int i11, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            if (tXMusicPlayObserver != null) {
                this.mMusicPlayObserver.addObserver(convertToEffectId(i11), tXMusicPlayObserver);
            } else {
                this.mMusicPlayObserver.removeObserver(convertToEffectId(i11));
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(int i11, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            if (tXMusicPlayObserver != null) {
                this.mMusicPlayObserver.addObserver(i11, tXMusicPlayObserver);
            } else {
                this.mMusicPlayObserver.removeObserver(i11);
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i11, float f11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicPitch(j11, i11, f11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i11, int i12) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicPlayoutVolume(j11, i11, i12);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i11, int i12) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicPublishVolume(j11, i11, i12);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicScratchSpeedRate(int i11, float f11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicScratchSpeedRate(j11, i11, f11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i11, float f11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicSpeedRate(j11, i11, f11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicTrack(int i11, int i12) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetMusicTrack(j11, i11, i12);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setPreloadObserver(TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            this.mMusicPreloadObserver.setObserver(tXMusicPreloadObserver);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetVoiceCaptureVolume(j11, i11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 == 0 || tXVoiceChangerType == null) {
            return;
        }
        nativeSetVoiceChangerType(j11, tXVoiceChangerType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetVoiceEarMonitorVolume(j11, i11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoicePitch(double d11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeSetVoicePitch(j11, d11);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 == 0 || tXVoiceReverbType == null) {
            return;
        }
        nativeSetVoiceReverbType(j11, tXVoiceReverbType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            LiteavLog.m76083e(TAG, "startPlayMusic invalid params");
            return false;
        }
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 == 0) {
            return true;
        }
        nativeStartPlayMusic(j11, audioMusicParam.f73339id, new AudioBgmParams(audioMusicParam));
        return true;
    }

    public void stopAllAudioEffects() {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                try {
                    for (Integer num : this.mEffectIdList) {
                        this.mMusicPlayObserver.removeObserver(convertToEffectId(num.intValue()));
                        nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(num.intValue()));
                    }
                    this.mEffectIdList.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void stopAudioEffect(int i11) {
        if (this.mNativeAudioEffectMgr != 0) {
            this.mMusicPlayObserver.removeObserver(convertToEffectId(i11));
            nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(i11));
            synchronized (this) {
                try {
                    int iIndexOf = this.mEffectIdList.indexOf(Integer.valueOf(i11));
                    if (iIndexOf >= 0) {
                        this.mEffectIdList.remove(iIndexOf);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i11) {
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeStopPlayMusic(j11, i11);
        }
    }

    public TXAudioEffectManagerImpl(long j11) {
        this.mNativeAudioEffectMgr = 0L;
        MusicPlayObserver musicPlayObserver = new MusicPlayObserver();
        this.mMusicPlayObserver = musicPlayObserver;
        MusicPreloadObserver musicPreloadObserver = new MusicPreloadObserver();
        this.mMusicPreloadObserver = musicPreloadObserver;
        this.mNativeAudioEffectMgr = j11;
        if (j11 != 0) {
            nativeSetMusicObserver(j11, musicPlayObserver);
            nativeSetPreloadObserver(this.mNativeAudioEffectMgr, musicPreloadObserver);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeAudioEffectMgr = 0L;
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e(TAG, "getMusicDurationInMS invalid params");
            return 0L;
        }
        long j11 = this.mNativeAudioEffectMgr;
        if (j11 == 0) {
            return 0L;
        }
        return nativeGetMusicDurationInMS(j11, str);
    }

    private static long convertToEffectId(int i11) {
        return 8589934592L | ((long) i11);
    }
}
