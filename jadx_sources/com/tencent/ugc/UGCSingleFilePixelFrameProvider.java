package com.tencent.ugc;

import android.opengl.GLES20;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.decoder.DecodeAbilityProvider;
import com.tencent.ugc.decoder.UGCHDRToSDRPixelFrameConverterJni;
import com.tencent.ugc.decoder.UGCVideoDecodeController;
import com.tencent.ugc.decoder.UGCVideoDecodeControllerListener;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.HDRType;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UGCSingleFilePixelFrameProvider implements UGCPixelFrameProvider {
    private static final int DELAY_TIME_OF_TRY_DECODE = 10;
    private static final int REVERSE_STEP_TIME = 500;
    private final Clip mClip;
    private VideoDemuxer mDemuxer;
    private EGLCore mEGLCore;
    private UGCPixelFrameProvider.UGCFilePixelFrameProviderListener mListener;
    private long mReversePlayCurrentPts;
    private UGCHDRToSDRPixelFrameConverterJni mUgcHdrToSdrPixelFrameConverterJni;
    private UGCVideoDecodeController mVideoDecodeController;
    private final CustomHandler mWorkHandler;
    private final String mTag = "UGCSingleFilePixelFrameProvider_" + hashCode();
    private final C34692b mThrottlers = new C34692b();
    private boolean mIsAbandoningDecodingFrame = false;
    private long mSeekingTimeMs = -1;
    private boolean mIsInPreciseSeeking = true;
    private boolean mHasReadEOF = false;
    private boolean mIsDecodeCompleted = false;
    private boolean mIsFrameSendingDecoder = false;
    private int mMaxFrameCount = 3;
    private boolean mIsReverse = false;
    private int mFrameCacheCapacityForReverse = 0;
    private long mPlayEndPts = Long.MAX_VALUE;
    private final UGCVideoDecodeControllerListener mUGCDecodeControllerListener = new C354821();
    private final UGCFrameQueue.UGCFrameQueueListener mUGCFrameQueueListener = new C354832();
    private final UGCFrameQueue<List<PixelFrame>> mPixFrameQueue = new UGCFrameQueue<>();
    private final Deque<PixelFrame> mPixFrameCacheForReverse = new LinkedList();

    /* JADX INFO: renamed from: com.tencent.ugc.UGCSingleFilePixelFrameProvider$1 */
    public class C354821 implements UGCVideoDecodeControllerListener {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78981a(C354821 c354821, PixelFrame pixelFrame) {
            UGCSingleFilePixelFrameProvider.this.onDecodeFrameInternal(pixelFrame);
            pixelFrame.release();
        }

        public C354821() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m78982b(C354821 c354821) {
            if (UGCSingleFilePixelFrameProvider.this.mVideoDecodeController == null) {
                return;
            }
            UGCSingleFilePixelFrameProvider.this.mIsAbandoningDecodingFrame = false;
            UGCSingleFilePixelFrameProvider.this.decodeInternal();
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onAbandonDecodingFramesCompleted() {
            LiteavLog.m76087i(UGCSingleFilePixelFrameProvider.this.mTag, "onAbandonDecodingFramesCompleted");
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35705gi.m79199a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onDecodeCompleted() {
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35704gh.m79198a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onDecodeFailed() {
            LiteavLog.m76087i(UGCSingleFilePixelFrameProvider.this.mTag, "on decode fail");
            if (UGCSingleFilePixelFrameProvider.this.mListener != null) {
                UGCSingleFilePixelFrameProvider.this.mListener.onDecodeFailed();
                UGCSingleFilePixelFrameProvider.this.mListener = null;
            }
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35707gk.m79201a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onFrameDecoded(PixelFrame pixelFrame) {
            if (pixelFrame == null) {
                return;
            }
            pixelFrame.retain();
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35702gf.m79196a(this, pixelFrame));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onFrameEnqueuedToDecoder() {
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35703gg.m79197a(this));
        }

        @Override // com.tencent.ugc.decoder.UGCVideoDecodeControllerListener
        public final void onRequestSeekToLastKeyFrame(long j11) {
            LiteavLog.m76087i(UGCSingleFilePixelFrameProvider.this.mTag, "onRequestSeekToLastKeyFrame pts = ".concat(String.valueOf(j11)));
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35706gj.m79200a(this, j11));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78979a(C354821 c354821) {
            if (UGCSingleFilePixelFrameProvider.this.mVideoDecodeController == null) {
                return;
            }
            UGCSingleFilePixelFrameProvider.this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.UGCSingleFilePixelFrameProvider$2 */
    public class C354832 implements UGCFrameQueue.UGCFrameQueueListener {
        public C354832() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78985a(C354832 c354832) {
            if (UGCSingleFilePixelFrameProvider.this.mIsFrameSendingDecoder) {
                return;
            }
            UGCSingleFilePixelFrameProvider.this.decodeInternal();
        }

        @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
        public final void onFrameDequeued() {
            UGCSingleFilePixelFrameProvider.this.mWorkHandler.runOrPost(RunnableC35708gl.m79202a(this));
        }
    }

    private void addFrameToQueue(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        if (pixelFrame.getTimestamp() < this.mClip.startInFileTime) {
            pixelFrame.release();
            return;
        }
        if (pixelFrame.getTimestamp() <= this.mClip.endInFileTime && pixelFrame.getTimestamp() <= this.mPlayEndPts) {
            pixelFrame.setTimestamp(fileTimeToTimeline(pixelFrame.getTimestamp()));
            LinkedList linkedList = new LinkedList();
            linkedList.add(pixelFrame);
            this.mPixFrameQueue.queue(linkedList);
            return;
        }
        LiteavLog.m76087i(this.mTag, "addFrameToQueue Timestamp = " + pixelFrame.getTimestamp() + " endInnerFileTime = " + this.mClip.endInFileTime);
        this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        pixelFrame.release();
    }

    private void addFrameToQueueForReverse(PixelFrame pixelFrame) {
        if (pixelFrame != null && pixelFrame.getTimestamp() <= this.mReversePlayCurrentPts) {
            this.mPixFrameCacheForReverse.addLast(pixelFrame);
            return;
        }
        if (pixelFrame != null) {
            pixelFrame.release();
        }
        if (this.mPixFrameCacheForReverse.isEmpty()) {
            LiteavLog.m76087i(this.mTag, "mGopVideoFrameList isEmpty so put END_OF_STREAM");
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        this.mFrameCacheCapacityForReverse = this.mPixFrameCacheForReverse.size();
        while (!this.mPixFrameCacheForReverse.isEmpty()) {
            PixelFrame pixelFramePollLast = this.mPixFrameCacheForReverse.pollLast();
            if (pixelFramePollLast != null) {
                long timestamp = pixelFramePollLast.getTimestamp();
                this.mReversePlayCurrentPts = timestamp;
                Clip clip = this.mClip;
                if (timestamp > clip.endInFileTime || timestamp < clip.startInFileTime) {
                    pixelFramePollLast.release();
                } else {
                    pixelFramePollLast.setTimestamp(fileTimeToTimelineForReverse(timestamp));
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(pixelFramePollLast);
                    this.mPixFrameQueue.queue(linkedList);
                }
            }
        }
        long j11 = this.mReversePlayCurrentPts;
        if (j11 <= this.mClip.startInFileTime) {
            LiteavLog.m76087i(this.mTag, "mLastGopFinishPts is smaller start time so put END_OF_STREAM");
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        } else {
            this.mReversePlayCurrentPts = j11 - 1;
            seekToInFileTime(j11 - 501, false);
        }
    }

    private void clearPixelFrameQueue() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore != null) {
            try {
                eGLCore.makeCurrent();
            } catch (EGLException e11) {
                LiteavLog.m76084e(this.mTag, "make current exception when clear pixel frame queue. exception msg is ", e11);
                return;
            }
        }
        Iterator<List<PixelFrame>> it = this.mPixFrameQueue.dequeueAll().iterator();
        while (it.hasNext()) {
            PixelFrame.releasePixelFrames(it.next());
        }
    }

    private boolean createDemuxerAndOpenFile() {
        String str = this.mClip.videoMimeType;
        if (str == null || "video/hevc".equals(str) || "video/avc".equals(this.mClip.videoMimeType)) {
            VideoDemuxerFFmpeg videoDemuxerFFmpeg = new VideoDemuxerFFmpeg();
            this.mDemuxer = videoDemuxerFFmpeg;
            if (videoDemuxerFFmpeg.open(this.mClip.path)) {
                return true;
            }
            this.mDemuxer.close();
        }
        LiteavLog.m76087i(this.mTag, "create system video demuxer.");
        VideoDemuxerSystem videoDemuxerSystem = new VideoDemuxerSystem();
        this.mDemuxer = videoDemuxerSystem;
        if (videoDemuxerSystem.open(this.mClip.path)) {
            return true;
        }
        this.mDemuxer.close();
        this.mDemuxer = null;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decodeInternal() {
        if (this.mVideoDecodeController == null || !isNeedDecode()) {
            this.mIsFrameSendingDecoder = false;
            return;
        }
        if (this.mVideoDecodeController.isInputQueueFull()) {
            this.mWorkHandler.postDelayed(RunnableC35698gb.m79192a(this), 10L);
            return;
        }
        EncodedVideoFrame nextEncodeVideoFrame = this.mDemuxer.getNextEncodeVideoFrame();
        if (nextEncodeVideoFrame == null) {
            return;
        }
        if (nextEncodeVideoFrame == VideoDemuxer.END_OF_STREAM) {
            LiteavLog.m76087i(this.mTag, "demuxer read completed");
            this.mHasReadEOF = true;
            this.mVideoDecodeController.signalEndOfStream();
            this.mWorkHandler.removeCallbacks(RunnableC35699gc.m79193a(this));
            this.mWorkHandler.runOrPost(RunnableC35700gd.m79194a(this), 1000);
        } else {
            this.mIsFrameSendingDecoder = true;
            this.mIsDecodeCompleted = false;
            this.mVideoDecodeController.decode(nextEncodeVideoFrame);
        }
        long j11 = this.mSeekingTimeMs;
        if (j11 < 0) {
            this.mWorkHandler.post(RunnableC35701ge.m79195a(this));
        } else if (nextEncodeVideoFrame.pts > j11) {
            this.mWorkHandler.postDelayed(RunnableC35691fv.m79185a(this), 10L);
        } else {
            this.mWorkHandler.post(RunnableC35692fw.m79186a(this));
        }
    }

    private long fileTimeToTimeline(long j11) {
        long j12;
        Clip clip = this.mClip;
        long j13 = clip.startInClipsTimeline;
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list != null) {
            for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
                float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
                long j14 = tXSpeed.endTime;
                if (j11 < j14) {
                    j12 = (long) ((j11 - tXSpeed.startTime) * timeMultipleInSpeed);
                } else {
                    j13 += (long) ((j14 - tXSpeed.startTime) * timeMultipleInSpeed);
                }
            }
            return j13;
        }
        j12 = j11 - clip.startInFileTime;
        return j13 + j12;
    }

    private long fileTimeToTimelineForReverse(long j11) {
        Clip clip = this.mClip;
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return clip.endInFileTime - j11;
        }
        long j12 = clip.startInClipsTimeline;
        for (int size = list.size() - 1; size >= 0; size--) {
            TXVideoEditConstants.TXSpeed tXSpeed = this.mClip.speedList.get(size);
            float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
            long j13 = tXSpeed.startTime;
            if (j11 > j13) {
                return j12 + ((long) ((tXSpeed.endTime - j11) * timeMultipleInSpeed));
            }
            j12 += (long) ((tXSpeed.endTime - j13) * timeMultipleInSpeed);
        }
        return j12;
    }

    private void initializeDecodeController() {
        if (this.mVideoDecodeController != null) {
            LiteavLog.m76093w(this.mTag, "UGCVideoFileProvider is initialized");
            return;
        }
        LiteavLog.m76087i(this.mTag, "initializeDecodeController");
        UGCVideoDecodeController uGCVideoDecodeController = new UGCVideoDecodeController();
        this.mVideoDecodeController = uGCVideoDecodeController;
        uGCVideoDecodeController.start(this.mUGCDecodeControllerListener);
    }

    private void initializeGLComponents() {
        if (this.mEGLCore != null) {
            return;
        }
        LiteavLog.m76086i(this.mThrottlers.m76042a("initGL"), this.mTag, "initializeGLComponents", new Object[0]);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(GlobalContextManager.getInstance().getGLContext(), null, 128, 128);
            this.mEGLCore.makeCurrent();
        } catch (EGLException e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("initGLError"), this.mTag, "initializeGLComponents failed.", e11);
            this.mEGLCore = null;
        }
    }

    private boolean isNeedDecode() {
        return (this.mVideoDecodeController != null && this.mDemuxer != null && !this.mIsAbandoningDecodingFrame && !this.mHasReadEOF) && !(!this.mIsReverse ? this.mPixFrameQueue.size() >= this.mMaxFrameCount : !(this.mPixFrameQueue.size() < this.mMaxFrameCount || this.mPixFrameQueue.size() + this.mPixFrameCacheForReverse.size() < this.mFrameCacheCapacityForReverse + this.mMaxFrameCount));
    }

    public static /* synthetic */ void lambda$seekTo$0(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j11, boolean z11) {
        if (uGCSingleFilePixelFrameProvider.mVideoDecodeController == null || uGCSingleFilePixelFrameProvider.mDemuxer == null) {
            return;
        }
        uGCSingleFilePixelFrameProvider.clearPixelFrameQueue();
        long jTimelineToFileTime = uGCSingleFilePixelFrameProvider.timelineToFileTime(j11);
        uGCSingleFilePixelFrameProvider.mReversePlayCurrentPts = jTimelineToFileTime;
        uGCSingleFilePixelFrameProvider.seekToInFileTime(jTimelineToFileTime, z11);
    }

    private boolean makeCurrent() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (EGLException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDecodeCompletedInternal() {
        LiteavLog.m76087i(this.mTag, "onDecodeCompletedInteral");
        if (this.mVideoDecodeController == null || this.mIsAbandoningDecodingFrame || this.mIsDecodeCompleted || !this.mHasReadEOF) {
            return;
        }
        if (this.mIsReverse) {
            addFrameToQueueForReverse(null);
        } else {
            addFrameToQueue(null);
        }
        this.mIsDecodeCompleted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r5 != (-1)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDecodeFrameInternal(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (this.mVideoDecodeController == null) {
            pixelFrame.release();
            return;
        }
        long timestamp = pixelFrame.getTimestamp();
        if (!this.mIsAbandoningDecodingFrame) {
            if (!this.mIsReverse && this.mIsInPreciseSeeking) {
                long j11 = this.mSeekingTimeMs;
                if (timestamp < j11) {
                }
            }
            this.mSeekingTimeMs = -1L;
            if (DecodeAbilityProvider.getInstance().getEnableHDRSupport() && (pixelFrame.getHdrType() == HDRType.HDR10 || pixelFrame.getHdrType() == HDRType.HLG)) {
                pixelFrame = hdrFrameConvertToSdrFrame(pixelFrame);
                GLES20.glFinish();
            }
            if (this.mIsReverse) {
                addFrameToQueueForReverse(pixelFrame);
                return;
            } else {
                addFrameToQueue(pixelFrame);
                return;
            }
        }
        pixelFrame.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToInFileTime(long j11, boolean z11) {
        if (this.mDemuxer == null) {
            return;
        }
        Clip clip = this.mClip;
        long jM76116a = C34743h.m76116a(j11, clip.startInFileTime, clip.endInFileTime);
        LiteavLog.m76087i(this.mTag, "seekToInFileTime file time = ".concat(String.valueOf(jM76116a)));
        this.mSeekingTimeMs = jM76116a;
        this.mIsInPreciseSeeking = z11;
        this.mDemuxer.seek(jM76116a);
        if (!this.mIsAbandoningDecodingFrame) {
            this.mIsAbandoningDecodingFrame = true;
            this.mVideoDecodeController.abandonDecodingFrames();
        }
        this.mHasReadEOF = false;
        PixelFrame.releasePixelFrames(this.mPixFrameCacheForReverse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseInternal(boolean z11) {
        if (this.mIsReverse == z11) {
            return;
        }
        this.mIsReverse = z11;
        if (z11) {
            long j11 = this.mClip.endInFileTime;
            this.mReversePlayCurrentPts = j11;
            seekToInFileTime(j11 - 500, false);
        } else {
            seekToInFileTime(this.mClip.startInFileTime, true);
        }
        clearPixelFrameQueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        this.mPixFrameQueue.setUGCFrameQueueListener(null);
        VideoDemuxer videoDemuxer = this.mDemuxer;
        if (videoDemuxer != null) {
            videoDemuxer.close();
            this.mDemuxer = null;
        }
        UGCVideoDecodeController uGCVideoDecodeController = this.mVideoDecodeController;
        if (uGCVideoDecodeController != null) {
            uGCVideoDecodeController.stop();
            this.mVideoDecodeController = null;
        }
        clearPixelFrameQueue();
        PixelFrame.releasePixelFrames(this.mPixFrameCacheForReverse);
        this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        this.mIsAbandoningDecodingFrame = false;
        this.mIsInPreciseSeeking = true;
        this.mIsReverse = false;
        this.mIsFrameSendingDecoder = false;
        this.mSeekingTimeMs = -1L;
        this.mReversePlayCurrentPts = this.mClip.startInFileTime;
    }

    private long timelineToFileTime(long j11) {
        Clip clip = this.mClip;
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return j11 + clip.startInFileTime;
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

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
        return this.mPixFrameQueue;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
        LiteavLog.m76087i(this.mTag, "initialize");
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j11, boolean z11) {
        LiteavLog.m76087i(this.mTag, "seekTo lineTime = " + j11 + " isPreciseSeek = " + z11);
        this.mWorkHandler.runAndWaitDone(RunnableC35695fz.m79189a(this, j11, z11), 1000L);
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setMaxBufferFrameCount(int i11) {
        this.mMaxFrameCount = i11;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setPlayEndPts(long j11) {
        this.mPlayEndPts = j11;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z11) {
        LiteavLog.m76087i(this.mTag, "isReverse = ".concat(String.valueOf(z11)));
        this.mWorkHandler.runOrPost(RunnableC35697ga.m79191a(this, z11));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(RunnableC35693fx.m79187a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
        LiteavLog.m76087i(this.mTag, InterfaceC33730j9.f70350a);
        this.mWorkHandler.runOrPost(RunnableC35694fy.m79188a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
        LiteavLog.m76087i(this.mTag, "unInitialize");
        this.mWorkHandler.runOrPost(RunnableC35690fu.m79184a(this));
    }

    public UGCSingleFilePixelFrameProvider(Clip clip, CustomHandler customHandler, UGCPixelFrameProvider.UGCFilePixelFrameProviderListener uGCFilePixelFrameProviderListener) {
        this.mClip = new Clip(clip);
        this.mWorkHandler = customHandler;
        this.mListener = uGCFilePixelFrameProviderListener;
    }

    private float getTimeMultipleInSpeed(int i11) {
        return UGCMediaListSource.getSpeed(i11);
    }

    private PixelFrame hdrFrameConvertToSdrFrame(PixelFrame pixelFrame) {
        if (!makeCurrent()) {
            return pixelFrame;
        }
        if (this.mUgcHdrToSdrPixelFrameConverterJni == null) {
            this.mUgcHdrToSdrPixelFrameConverterJni = new UGCHDRToSDRPixelFrameConverterJni();
        }
        return this.mUgcHdrToSdrPixelFrameConverterJni.convert(pixelFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        if (!createDemuxerAndOpenFile()) {
            LiteavLog.m76083e(this.mTag, this.mClip.path + " open fail or there is not video stream");
            this.mPixFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        LiteavLog.m76087i(this.mTag, this.mClip.path + " open success");
        this.mPixFrameQueue.setUGCFrameQueueListener(this.mUGCFrameQueueListener);
        this.mPixFrameQueue.clear();
        if (this.mIsReverse) {
            long j11 = this.mClip.endInFileTime;
            this.mReversePlayCurrentPts = j11;
            this.mDemuxer.seek(j11 - 500);
        } else {
            long j12 = this.mClip.startInFileTime;
            if (j12 != 0) {
                this.mDemuxer.seek(j12);
            }
        }
        initializeDecodeController();
        initializeGLComponents();
        decodeInternal();
    }

    private void unInitializeGLComponents() {
        makeCurrent();
        UGCHDRToSDRPixelFrameConverterJni uGCHDRToSDRPixelFrameConverterJni = this.mUgcHdrToSdrPixelFrameConverterJni;
        if (uGCHDRToSDRPixelFrameConverterJni != null) {
            uGCHDRToSDRPixelFrameConverterJni.release();
            this.mUgcHdrToSdrPixelFrameConverterJni = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uninitializeInternal() {
        unInitializeGLComponents();
        UGCVideoDecodeController uGCVideoDecodeController = this.mVideoDecodeController;
        if (uGCVideoDecodeController != null) {
            uGCVideoDecodeController.stop();
            this.mVideoDecodeController = null;
        }
        clearPixelFrameQueue();
        PixelFrame.releasePixelFrames(this.mPixFrameCacheForReverse);
    }
}
