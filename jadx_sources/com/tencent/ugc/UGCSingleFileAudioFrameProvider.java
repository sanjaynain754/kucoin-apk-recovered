package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCSingleFileAudioFrameProvider implements UGCAudioFrameProvider, UGCFrameQueue.UGCFrameQueueListener {
    private static final int DEFAULT_CHANNEL_COUNT = 2;
    private static final int DEFAULT_FRAME_DURATION = 20;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final int MAX_FRAME_SIZE = 5;
    public static final String MUTE_VIRTUAL_FILE_PATH = "mute_virtual_file_path";
    private final Clip mClip;
    private AudioFrame mLastFrame;
    private long mNativeHandle;
    private final CustomHandler mWorkHandler;
    private final String TAG = "UGCAudioFileProvider_" + hashCode();
    private long mCurrentMuteFramePts = 0;
    private long mEndPlayPts = Long.MAX_VALUE;
    private long mFirstFramePtsOfAllStream = 0;
    private Long mSeekFileTime = 0L;
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameQueue = new UGCFrameQueue<>();

    private static native void nativeClose(long j11);

    private static native long nativeCreate(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider);

    private static native void nativeDecode(long j11);

    private static native void nativeDestroy(long j11);

    private static native long nativeGetDuration(long j11);

    private static native int nativeOpen(long j11, String str);

    private static native int nativeSeekTo(long j11, long j12);

    private void putEndOfStreamFrameToQueue() {
        this.mLastFrame = null;
        this.mAudioFrameQueue.queue(UGCAudioFrameProvider.END_OF_STREAM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DecodeOrAppendMuteFrame() {
        UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider;
        if (this.mAudioFrameQueue.size() >= 5) {
            return;
        }
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeDecode(j11);
            uGCSingleFileAudioFrameProvider = this;
        } else {
            uGCSingleFileAudioFrameProvider = this;
            uGCSingleFileAudioFrameProvider.appendOneMuteFrame(this.mCurrentMuteFramePts, 20, 48000, 2);
            uGCSingleFileAudioFrameProvider.mCurrentMuteFramePts += 20;
        }
        uGCSingleFileAudioFrameProvider.mWorkHandler.removeCallbacks(RunnableC35688fs.m79182a(this));
        uGCSingleFileAudioFrameProvider.mWorkHandler.post(RunnableC35689ft.m79183a(this));
    }

    private void appendMultipleMuteFrame(long j11, int i11, int i12, int i13) {
        if (i11 <= 0 || i12 <= 0 || i13 <= 0) {
            return;
        }
        int i14 = i11 / 20;
        long j12 = j11;
        for (int i15 = 0; i15 < i14; i15++) {
            appendOneMuteFrame(j12, 20, i12, i13);
            j12 += 20;
        }
        int i16 = i11 - (i14 * 20);
        if (i16 != 0) {
            appendOneMuteFrame(j12, i16, i12, i13);
        }
    }

    private void appendMuteFrameWhenDecodeFinish() {
        AudioFrame audioFrame = this.mLastFrame;
        if (audioFrame == null) {
            return;
        }
        long jCalculateAudioFrameDuration = calculateAudioFrameDuration(audioFrame) + timelineToFileTimeNoSpeed(this.mLastFrame.getTimestamp());
        if (jCalculateAudioFrameDuration >= this.mClip.endInFileTime || jCalculateAudioFrameDuration <= 0) {
            return;
        }
        appendMultipleMuteFrame(fileTimeToTimelineNoSpeed(jCalculateAudioFrameDuration), (int) (this.mClip.endInFileTime - jCalculateAudioFrameDuration), this.mLastFrame.getSampleRate(), this.mLastFrame.getChannelCount());
    }

    private void appendOneMuteFrame(long j11, int i11, int i12, int i13) {
        if (i11 <= 0 || i12 <= 0 || i13 <= 0) {
            return;
        }
        Clip clip = this.mClip;
        if (j11 >= clip.startInClipsTimeline + (clip.endInFileTime - clip.startInFileTime)) {
            putEndOfStreamFrameToQueue();
            return;
        }
        AudioFrame audioFrame = new AudioFrame();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((((i13 * 2) * i12) * i11) / 1000);
        Arrays.fill(byteBufferAllocateDirect.array(), (byte) 0);
        audioFrame.setData(byteBufferAllocateDirect);
        audioFrame.setChannelCount(i13);
        audioFrame.setSampleRate(i12);
        audioFrame.setCodecFormat(AudioFrame.AudioCodecFormat.PCM);
        audioFrame.setTimestamp(j11);
        this.mLastFrame = audioFrame;
        this.mAudioFrameQueue.queue(Collections.singletonList(audioFrame));
    }

    private long calculateAudioFrameDuration(AudioFrame audioFrame) {
        if (audioFrame != null && audioFrame.isValidFrame() && audioFrame.getCodecFormat() == AudioFrame.AudioCodecFormat.PCM) {
            return (((long) audioFrame.getData().remaining()) * 1000) / ((((long) audioFrame.getChannelCount()) * 2) * ((long) audioFrame.getSampleRate()));
        }
        return 0L;
    }

    private long fileTimeToTimelineNoSpeed(long j11) {
        Clip clip = this.mClip;
        return clip.startTimelineNoSpeed + (j11 - clip.startInFileTime);
    }

    public static /* synthetic */ void lambda$initialize$0(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        if (uGCSingleFileAudioFrameProvider.mClip.path.equals(MUTE_VIRTUAL_FILE_PATH)) {
            uGCSingleFileAudioFrameProvider.mNativeHandle = 0L;
            return;
        }
        long jNativeCreate = nativeCreate(uGCSingleFileAudioFrameProvider);
        uGCSingleFileAudioFrameProvider.mNativeHandle = jNativeCreate;
        if (jNativeCreate == 0) {
            LiteavLog.m76083e(uGCSingleFileAudioFrameProvider.TAG, "create native instance failed.");
        }
    }

    public static /* synthetic */ void lambda$uninitialize$1(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        long j11 = uGCSingleFileAudioFrameProvider.mNativeHandle;
        if (j11 != 0) {
            nativeClose(j11);
            nativeDestroy(uGCSingleFileAudioFrameProvider.mNativeHandle);
            uGCSingleFileAudioFrameProvider.mNativeHandle = 0L;
        }
        uGCSingleFileAudioFrameProvider.mAudioFrameQueue.clear();
    }

    private AudioFrame obtainAudioFrame(int i11, int i12, long j11, int i13) {
        AudioFrame audioFrame = new AudioFrame();
        audioFrame.setSampleRate(i11);
        audioFrame.setChannelCount(i12);
        audioFrame.setTimestamp(j11);
        audioFrame.setCodecFormat(AudioFrame.AudioCodecFormat.PCM);
        audioFrame.setData(ByteBuffer.allocateDirect(i13));
        return audioFrame;
    }

    private void onDecodeEndOfFile() {
        LiteavLog.m76087i(this.TAG, "onDecodeEndOfFile");
        appendMuteFrameWhenDecodeFinish();
        putEndOfStreamFrameToQueue();
    }

    private void onDecodeError(String str) {
        LiteavLog.m76087i(this.TAG, "onDecodeError reason = ".concat(String.valueOf(str)));
        appendMuteFrameWhenDecodeFinish();
        putEndOfStreamFrameToQueue();
    }

    private void onDecodeFrame(AudioFrame audioFrame) {
        UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider;
        if (audioFrame == null) {
            return;
        }
        long jMin = Math.min(audioFrame.getTimestamp() - this.mFirstFramePtsOfAllStream, this.mClip.endInFileTime);
        if (jMin < this.mClip.startInFileTime) {
            return;
        }
        Long l11 = this.mSeekFileTime;
        if (l11 == null) {
            uGCSingleFileAudioFrameProvider = this;
        } else {
            if (jMin < l11.longValue()) {
                return;
            }
            uGCSingleFileAudioFrameProvider = this;
            uGCSingleFileAudioFrameProvider.appendMultipleMuteFrame(fileTimeToTimelineNoSpeed(this.mSeekFileTime.longValue()), (int) (jMin - this.mSeekFileTime.longValue()), audioFrame.getSampleRate(), audioFrame.getChannelCount());
        }
        uGCSingleFileAudioFrameProvider.mSeekFileTime = null;
        if (jMin >= uGCSingleFileAudioFrameProvider.mClip.endInFileTime || jMin >= uGCSingleFileAudioFrameProvider.mEndPlayPts) {
            LiteavLog.m76087i(uGCSingleFileAudioFrameProvider.TAG, "decode frame pts is bigger than end time");
            putEndOfStreamFrameToQueue();
        } else {
            uGCSingleFileAudioFrameProvider.mLastFrame = audioFrame;
            audioFrame.setTimestamp(fileTimeToTimelineNoSpeed(jMin));
            uGCSingleFileAudioFrameProvider.mAudioFrameQueue.queue(Collections.singletonList(audioFrame));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToInFileTime(long j11) {
        Clip clip = this.mClip;
        this.mSeekFileTime = Long.valueOf(C34743h.m76116a(j11, clip.startInFileTime, clip.endInFileTime));
        LiteavLog.m76087i(this.TAG, "seekTo fileTime " + this.mSeekFileTime);
        this.mCurrentMuteFramePts = fileTimeToTimelineNoSpeed(this.mSeekFileTime.longValue());
        long j12 = this.mNativeHandle;
        if (j12 != 0 && nativeSeekTo(j12, this.mSeekFileTime.longValue()) != 0) {
            LiteavLog.m76093w(this.TAG, "nativeSeekTo fail");
        }
        this.mAudioFrameQueue.clear();
        this.mWorkHandler.runOrPost(RunnableC35687fr.m79181a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        long j11 = this.mNativeHandle;
        if (j11 != 0 && nativeOpen(j11, this.mClip.path) != 0) {
            LiteavLog.m76083e(this.TAG, "native MusicResourceDecoderFFmpeg open failed.");
            nativeClose(this.mNativeHandle);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        VideoDemuxerFFmpeg videoDemuxerFFmpeg = new VideoDemuxerFFmpeg();
        if (videoDemuxerFFmpeg.open(this.mClip.path)) {
            this.mFirstFramePtsOfAllStream = videoDemuxerFFmpeg.getFirstFramePtsOfAllStream();
        }
        videoDemuxerFFmpeg.close();
        this.mCurrentMuteFramePts = this.mClip.startInClipsTimeline;
        this.mAudioFrameQueue.setUGCFrameQueueListener(this);
        this.mAudioFrameQueue.clear();
        this.mSeekFileTime = 0L;
        long j12 = this.mClip.startInFileTime;
        if (j12 != 0) {
            seekToInFileTime(j12);
        }
        DecodeOrAppendMuteFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeClose(j11);
        }
        this.mAudioFrameQueue.setUGCFrameQueueListener(null);
        this.mWorkHandler.removeCallbacks(RunnableC35685fp.m79179a(this));
        this.mAudioFrameQueue.clear();
        putEndOfStreamFrameToQueue();
    }

    private long timelineToFileTime(long j11) {
        List<TXVideoEditConstants.TXSpeed> list = this.mClip.speedList;
        if (list == null) {
            return timelineToFileTimeNoSpeed(j11);
        }
        long j12 = 0;
        for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
            float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
            long j13 = tXSpeed.endTime;
            long j14 = tXSpeed.startTime;
            long j15 = (long) ((j13 - j14) * timeMultipleInSpeed);
            j12 = j14 + ((long) (j11 / timeMultipleInSpeed));
            if (j11 < j15) {
                break;
            }
            j11 -= j15;
        }
        return j12;
    }

    private long timelineToFileTimeNoSpeed(long j11) {
        Clip clip = this.mClip;
        return (j11 + clip.startInFileTime) - clip.startTimelineNoSpeed;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public UGCFrameQueue<List<AudioFrame>> getFrameQueue() {
        return this.mAudioFrameQueue;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void initialize() {
        LiteavLog.m76087i(this.TAG, "initialize");
        this.mWorkHandler.runOrPost(RunnableC35680fk.m79174a(this));
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        this.mWorkHandler.runOrPost(RunnableC35681fl.m79175a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void seekTo(long j11) {
        this.mWorkHandler.runAndWaitDone(RunnableC35686fq.m79180a(this, j11), 1000L);
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void setPlayEndPts(long j11) {
        this.mEndPlayPts = j11;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(RunnableC35683fn.m79177a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void stop() {
        this.mWorkHandler.runOrPost(RunnableC35684fo.m79178a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void uninitialize() {
        this.mWorkHandler.runOrPost(RunnableC35682fm.m79176a(this));
    }

    public UGCSingleFileAudioFrameProvider(Clip clip, CustomHandler customHandler) {
        this.mClip = new Clip(clip);
        this.mWorkHandler = customHandler;
    }

    private ByteBuffer getByteBufferFromAudioFrame(AudioFrame audioFrame) {
        return audioFrame.getData();
    }

    private float getTimeMultipleInSpeed(int i11) {
        return UGCMediaListSource.getSpeed(i11);
    }
}
