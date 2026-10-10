package com.tencent.ugc;

import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCAudioProcessor {
    private static final String TAG = "UGCAudioProcessor";
    private UGCAVSyncer mAVSyncer;
    private long mNativeProcessor;
    private UGCMediaListSource mVideoSource;
    private AudioProgressListener mProgressListener = null;
    private AudioEncodedFrameListener mEncodeListener = null;
    private UGCMediaListSource mBGMSource = null;
    private final Object mBGMLock = new Object();

    public interface AudioEncodedFrameListener {
        void onAudioEncodingCompleted();

        void onAudioEncodingStarted();

        void onAudioFrameEncoded(AudioFrame audioFrame);
    }

    public interface AudioProgressListener {
        void onComplete(boolean z11);

        void onProgress(long j11);
    }

    private static native long nativeCreateProcessor(UGCAudioProcessor uGCAudioProcessor);

    private static native void nativeDestroyProcessor(long j11);

    private static native void nativeEnableBGM(long j11, boolean z11);

    private static native void nativeInitialize(long j11);

    private static native void nativeSetBGMAtVideoTime(long j11, long j12);

    private static native void nativeSetBGMLoop(long j11, boolean z11);

    private static native void nativeSetBGMStartTime(long j11, long j12, long j13);

    private static native void nativeSetBGMVolume(long j11, float f11);

    private static native void nativeSetEncodeParams(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeSetFadeInOutDuration(long j11, long j12, long j13);

    private static native void nativeSetSpeedList(long j11, int[] iArr, long[] jArr, long[] jArr2);

    private static native void nativeSetVideoVolume(long j11, float f11);

    private static native void nativeSetVideoVolumes(long j11, float[] fArr);

    private static native void nativeStart(long j11, boolean z11);

    private static native void nativeStop(long j11);

    private static native void nativeUnInitialize(long j11);

    public AudioFrame[] requestAudioDataFromNative() {
        return readNextAudioFrame(false);
    }

    public AudioFrame[] requestBGMDataFromNative() {
        return readNextAudioFrame(true);
    }

    private void destroyBGMSource() {
        synchronized (this.mBGMLock) {
            try {
                UGCMediaListSource uGCMediaListSource = this.mBGMSource;
                if (uGCMediaListSource != null) {
                    uGCMediaListSource.uninitialize();
                    this.mBGMSource = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private AudioFrame[] readNextAudioFrame(boolean z11) {
        synchronized (this.mBGMLock) {
            try {
                UGCMediaListSource uGCMediaListSource = z11 ? this.mBGMSource : this.mVideoSource;
                if (uGCMediaListSource == null) {
                    StringBuilder sb2 = new StringBuilder("readNextAudioFrame failed for ");
                    sb2.append(z11 ? "BGM" : "video");
                    Log.m76036w(TAG, sb2.toString(), new Object[0]);
                    return null;
                }
                List<AudioFrame> nextAudioFrame = uGCMediaListSource.readNextAudioFrame();
                if (nextAudioFrame != null && !nextAudioFrame.isEmpty()) {
                    return (AudioFrame[]) nextAudioFrame.toArray(new AudioFrame[0]);
                }
                StringBuilder sb3 = new StringBuilder("readNextAudioFrame eos for ");
                sb3.append(z11 ? "BGM" : "video");
                Log.m76034i(TAG, sb3.toString(), new Object[0]);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AudioFrame createAudioFrameFromNative(int i11, int i12, long j11, int i13, int i14) {
        AudioFrame audioFrame = new AudioFrame();
        audioFrame.setSampleRate(i11);
        audioFrame.setChannelCount(i12);
        audioFrame.setData(ByteBuffer.allocateDirect(i14));
        audioFrame.setTimestamp(j11);
        AudioFrame.AudioCodecFormat audioCodecFormat = AudioFrame.AudioCodecFormat.AAC;
        if (i13 != audioCodecFormat.getValue()) {
            audioCodecFormat = AudioFrame.AudioCodecFormat.PCM;
        }
        audioFrame.setCodecFormat(audioCodecFormat);
        return audioFrame;
    }

    public void destroy() {
        if (this.mNativeProcessor == 0) {
            return;
        }
        destroyBGMSource();
        nativeDestroyProcessor(this.mNativeProcessor);
        this.mNativeProcessor = 0L;
    }

    public void initialize() {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeInitialize(j11);
        }
    }

    public void notifyEncodedDataFromNative(AudioFrame audioFrame) {
        AudioEncodedFrameListener audioEncodedFrameListener = this.mEncodeListener;
        if (audioEncodedFrameListener != null) {
            audioEncodedFrameListener.onAudioFrameEncoded(audioFrame);
        }
    }

    public void notifyEncodingCompletedFromNative() {
        AudioEncodedFrameListener audioEncodedFrameListener = this.mEncodeListener;
        if (audioEncodedFrameListener != null) {
            audioEncodedFrameListener.onAudioEncodingCompleted();
        }
        UGCAVSyncer uGCAVSyncer = this.mAVSyncer;
        if (uGCAVSyncer != null) {
            uGCAVSyncer.setAudioEos();
        }
    }

    public void notifyEncodingStartedFromNative() {
        AudioEncodedFrameListener audioEncodedFrameListener = this.mEncodeListener;
        if (audioEncodedFrameListener != null) {
            audioEncodedFrameListener.onAudioEncodingStarted();
        }
    }

    public void notifyPlayoutCompletedFromNative(boolean z11) {
        AudioProgressListener audioProgressListener = this.mProgressListener;
        if (audioProgressListener != null) {
            audioProgressListener.onComplete(z11);
        }
        UGCAVSyncer uGCAVSyncer = this.mAVSyncer;
        if (uGCAVSyncer != null) {
            uGCAVSyncer.setAudioEos();
        }
    }

    public void notifyProgressFromNative(long j11) {
        AudioProgressListener audioProgressListener = this.mProgressListener;
        if (audioProgressListener != null) {
            audioProgressListener.onProgress(j11);
        }
    }

    public boolean requestBGMSeekFromNative(long j11) {
        synchronized (this.mBGMLock) {
            try {
                UGCMediaListSource uGCMediaListSource = this.mBGMSource;
                if (uGCMediaListSource != null && uGCMediaListSource.hasAudioData() && this.mBGMSource.getDuration() >= j11) {
                    this.mBGMSource.seekTo(j11);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setAudioEncodedFrameListener(AudioEncodedFrameListener audioEncodedFrameListener) {
        this.mEncodeListener = audioEncodedFrameListener;
    }

    public void setBGM(String str) {
        long duration;
        if (this.mNativeProcessor == 0) {
            return;
        }
        if (str == null) {
            destroyBGMSource();
            nativeEnableBGM(this.mNativeProcessor, false);
            return;
        }
        synchronized (this.mBGMLock) {
            destroyBGMSource();
            UGCMediaListSource uGCMediaListSource = new UGCMediaListSource(null);
            this.mBGMSource = uGCMediaListSource;
            uGCMediaListSource.initialize();
            this.mBGMSource.setVideoSources(Collections.singletonList(str));
            duration = this.mBGMSource.getDuration();
        }
        nativeEnableBGM(this.mNativeProcessor, true);
        if (duration > 0) {
            setBGMStartTime(0L, duration);
        }
    }

    public void setBGMAtVideoTime(long j11) {
        long j12 = this.mNativeProcessor;
        if (j12 != 0) {
            nativeSetBGMAtVideoTime(j12, j11);
        }
    }

    public void setBGMLoop(boolean z11) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeSetBGMLoop(j11, z11);
        }
    }

    public void setBGMStartTime(long j11, long j12) {
        long j13 = this.mNativeProcessor;
        if (j13 != 0) {
            nativeSetBGMStartTime(j13, j11, j12);
        }
    }

    public void setBGMVolume(float f11) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeSetBGMVolume(j11, f11);
        }
    }

    public void setEncodeParams(AudioEncodeParams audioEncodeParams) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeSetEncodeParams(j11, audioEncodeParams.getSampleRate(), audioEncodeParams.getChannels(), audioEncodeParams.getBitsPerChannel(), audioEncodeParams.getBitrate());
        }
    }

    public void setFadeInOutDuration(long j11, long j12) {
        long j13 = this.mNativeProcessor;
        if (j13 != 0) {
            nativeSetFadeInOutDuration(j13, j11, j12);
        }
    }

    public void setMediaListSource(UGCMediaListSource uGCMediaListSource) {
        this.mVideoSource = uGCMediaListSource;
    }

    public void setProgressListener(AudioProgressListener audioProgressListener) {
        this.mProgressListener = audioProgressListener;
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        if (this.mNativeProcessor == 0) {
            return;
        }
        if (list == null || list.isEmpty()) {
            iArr = null;
            jArr = null;
            jArr2 = null;
        } else {
            iArr = new int[list.size()];
            jArr = new long[list.size()];
            jArr2 = new long[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                TXVideoEditConstants.TXSpeed tXSpeed = list.get(i11);
                iArr[i11] = tXSpeed.speedLevel;
                jArr[i11] = tXSpeed.startTime;
                jArr2[i11] = tXSpeed.endTime;
            }
        }
        nativeSetSpeedList(this.mNativeProcessor, iArr, jArr, jArr2);
    }

    public void setVideoVolume(float f11) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeSetVideoVolume(j11, f11);
        }
    }

    public void setVideoVolumes(float[] fArr) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeSetVideoVolumes(j11, fArr);
        }
    }

    public void start(boolean z11) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeStart(j11, z11);
        }
    }

    public void stop() {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeStop(j11);
        }
    }

    public int syncAudioFromNative(long j11) {
        UGCAVSyncer uGCAVSyncer = this.mAVSyncer;
        return uGCAVSyncer != null ? uGCAVSyncer.syncAudio(j11).getNativeValue() : UGCAVSyncer.SkipMode.NOOP.getNativeValue();
    }

    public void unInitialize() {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeUnInitialize(j11);
        }
    }

    public UGCAudioProcessor(UGCAVSyncer uGCAVSyncer, UGCMediaListSource uGCMediaListSource) {
        this.mNativeProcessor = 0L;
        this.mVideoSource = uGCMediaListSource;
        this.mAVSyncer = uGCAVSyncer;
        this.mNativeProcessor = nativeCreateProcessor(this);
    }
}
