package com.tencent.ugc.decoder;

import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.HandlerC34758w;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.ugc.GlobalContextManager;
import com.tencent.ugc.UGCFrameQueue;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.HDRType;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class UGCVideoDecodeController {
    private static final int INTERVAL_DRAIN_DECODED_FRAME = 5;
    private static final int MAX_CACHE_FRAME_COUNT = 2;
    private static final int MAX_DECODE_FRAME_FAIL_COUNT = 100;
    private static final int MAX_DECODING_FRAME_COUNT = 30;
    private static final int MAX_DECODING_FRAME_TIME = 2500;
    private static final int MAX_OUTPUT_SIDE_LENGTH = 1920;
    private static final int MAX_THRESHOLD_FACTOR = 3;
    private HandlerC34758w mDecodeTimer;
    private VideoDecoderInterface mDecoder;
    private C35591a mDecoderListener;
    private final AtomicBoolean mHasDecodeError;
    private UGCVideoDecodeControllerListener mListener;
    private final UGCFrameQueue<EncodedVideoFrame> mPendingFrameQueue;
    private Size mResolution;
    private final String mTAG;
    private final C34692b mThrottlers;
    private final UGCFrameQueue.UGCFrameQueueListener mUGCFrameQueueListener;
    private CustomHandler mWorkHandler;
    private boolean mIsUsingHardwareDecoder = true;
    private boolean mIsRedecodingFromBeginOfThisGop = false;
    private Long mLastOutputFramePts = null;
    private int mDecodingFrameCount = 0;
    private int mSendFrameFailCount = 0;
    private long mInputFramePts = 0;
    private long mOutputFramePts = 0;
    private CodecType mCodecType = CodecType.H264;

    /* JADX INFO: renamed from: com.tencent.ugc.decoder.UGCVideoDecodeController$1 */
    public class C355901 implements UGCFrameQueue.UGCFrameQueueListener {
        public C355901() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m79085a(C355901 c355901) {
            if (UGCVideoDecodeController.this.mListener != null) {
                UGCVideoDecodeController.this.mListener.onFrameEnqueuedToDecoder();
            }
        }

        @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
        public final void onFrameDequeued() {
            UGCVideoDecodeController.this.runOnWorkThread(RunnableC35606o.m79102a(this));
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.decoder.UGCVideoDecodeController$a */
    public class C35591a extends VideoDecoderListener {
        private C35591a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m79086a(C35591a c35591a, PixelFrame pixelFrame) {
            UGCVideoDecodeController.this.onDecodeFrameInternal(pixelFrame);
            pixelFrame.release();
        }

        public /* synthetic */ C35591a(UGCVideoDecodeController uGCVideoDecodeController, byte b11) {
            this();
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onAbandonDecodingFramesCompleted() {
            if (this != UGCVideoDecodeController.this.mDecoderListener) {
                return;
            }
            UGCVideoDecodeController uGCVideoDecodeController = UGCVideoDecodeController.this;
            uGCVideoDecodeController.runOnWorkThread(RunnableC35608q.m79104a(uGCVideoDecodeController));
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onDecodeCompleted() {
            if (this != UGCVideoDecodeController.this.mDecoderListener) {
                return;
            }
            UGCVideoDecodeController uGCVideoDecodeController = UGCVideoDecodeController.this;
            uGCVideoDecodeController.runOnWorkThread(RunnableC35609r.m79105a(uGCVideoDecodeController));
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onDecodeFailed() {
            if (this != UGCVideoDecodeController.this.mDecoderListener) {
                return;
            }
            LiteavLog.m76086i(UGCVideoDecodeController.this.mThrottlers.m76042a("onDecodeFailed"), UGCVideoDecodeController.this.mTAG, "onDecodeFailed", new Object[0]);
            UGCVideoDecodeController.this.mHasDecodeError.set(true);
        }

        @Override // com.tencent.ugc.decoder.VideoDecoderListener
        public final void onDecodeFrame(PixelFrame pixelFrame, long j11) {
            if (this != UGCVideoDecodeController.this.mDecoderListener || pixelFrame == null) {
                return;
            }
            pixelFrame.retain();
            CustomHandler customHandler = UGCVideoDecodeController.this.mWorkHandler;
            if (customHandler != null) {
                customHandler.post(RunnableC35607p.m79103a(this, pixelFrame));
            }
        }
    }

    private void clearFrameQueue() {
        this.mPendingFrameQueue.clear();
    }

    private boolean createDecoder(boolean z11) {
        C34691a c34691aM76042a = this.mThrottlers.m76042a("create decoder");
        String str = this.mTAG;
        StringBuilder sb2 = new StringBuilder("create ");
        sb2.append(z11 ? "hardware" : " soft");
        sb2.append(" decoder");
        byte b11 = 0;
        LiteavLog.m76086i(c34691aM76042a, str, sb2.toString(), new Object[0]);
        EncodedVideoFrame iDRFrameFromQueue = getIDRFrameFromQueue();
        if (iDRFrameFromQueue == null) {
            return false;
        }
        if (z11) {
            this.mDecoder = createHardwareDecoder(iDRFrameFromQueue);
        } else {
            this.mDecoder = new SoftwareVideoDecoder(iDRFrameFromQueue.isH265());
        }
        this.mDecoder.initialize();
        this.mDecoderListener = new C35591a(this, b11);
        this.mDecoder.start(GlobalContextManager.getInstance().getGLContext(), this.mDecoderListener);
        this.mDecoder.decode(iDRFrameFromQueue);
        return true;
    }

    private VideoDecoderInterface createHardwareDecoder(EncodedVideoFrame encodedVideoFrame) {
        GLConstants.ColorSpace colorSpace = encodedVideoFrame.matrixCoefficients == 1 ? GLConstants.ColorSpace.BT709 : GLConstants.ColorSpace.BT601;
        HDRType hDRType = encodedVideoFrame.hdrType;
        boolean z11 = hDRType == HDRType.HDR10 || hDRType == HDRType.HLG;
        LiteavLog.m76087i(this.mTAG, "create hardware decoder. color space:" + colorSpace + ", is hdr: " + z11);
        HardwareVideoDecoder.HardwareVideoDecoderParams hardwareVideoDecoderParams = new HardwareVideoDecoder.HardwareVideoDecoderParams();
        hardwareVideoDecoderParams.useOutputBuffer = colorSpace == GLConstants.ColorSpace.BT709 && !z11 && DecodeAbilityProvider.getInstance().getEnableBT709Support();
        MediaFormat mediaFormat = encodedVideoFrame.videoFormat;
        if (mediaFormat != null) {
            hardwareVideoDecoderParams.mediaFormat = mediaFormat;
            this.mResolution = new Size(getMediaFormatValue(mediaFormat, "width", TXVodDownloadDataSource.QUALITY_1080P), getMediaFormatValue(hardwareVideoDecoderParams.mediaFormat, "height", MAX_OUTPUT_SIDE_LENGTH));
        } else {
            hardwareVideoDecoderParams.useHevc = encodedVideoFrame.isH265();
            Size size = new Size(encodedVideoFrame.width, encodedVideoFrame.height);
            hardwareVideoDecoderParams.resolution = size;
            this.mResolution = size;
        }
        return new HardwareVideoDecoder(hardwareVideoDecoderParams, null);
    }

    private void destroyDecoder() {
        VideoDecoderInterface videoDecoderInterface = this.mDecoder;
        if (videoDecoderInterface != null) {
            videoDecoderInterface.stop();
            this.mDecoder.uninitialize();
            this.mDecoder = null;
            this.mDecoderListener = null;
        }
    }

    private EncodedVideoFrame getIDRFrameFromQueue() {
        while (this.mPendingFrameQueue.size() != 0) {
            EncodedVideoFrame encodedVideoFrameDequeue = this.mPendingFrameQueue.dequeue();
            if (encodedVideoFrameDequeue != null && encodedVideoFrameDequeue.isIDRFrame()) {
                return encodedVideoFrameDequeue;
            }
        }
        return null;
    }

    private boolean isDecoderError() {
        int i11;
        int i12;
        int i13;
        if (this.mHasDecodeError.get()) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("isDecoderError"), this.mTAG, "mIsDecodeError is true", new Object[0]);
            return true;
        }
        if (this.mCodecType == CodecType.H265) {
            return false;
        }
        Size size = this.mResolution;
        if (size == null || Math.max(size.width, size.height) <= MAX_OUTPUT_SIDE_LENGTH) {
            i11 = 100;
            i12 = 30;
            i13 = 2500;
        } else {
            i11 = 300;
            i12 = 90;
            i13 = 7500;
        }
        if (this.mSendFrameFailCount <= i11) {
            if (this.mDecodingFrameCount <= i12 || this.mInputFramePts - this.mOutputFramePts <= i13) {
                return false;
            }
            LiteavLog.m76082e(this.mThrottlers.m76042a("isDecoderError"), this.mTAG, "internal decoder cache too big", new Object[0]);
            return true;
        }
        LiteavLog.m76082e(this.mThrottlers.m76042a("isDecoderError"), this.mTAG, "send frame fail count = " + this.mSendFrameFailCount, new Object[0]);
        return true;
    }

    public static /* synthetic */ void lambda$decode$1(UGCVideoDecodeController uGCVideoDecodeController, EncodedVideoFrame encodedVideoFrame) {
        if (uGCVideoDecodeController.mLastOutputFramePts == null) {
            uGCVideoDecodeController.mLastOutputFramePts = Long.valueOf(encodedVideoFrame.pts - 1);
        }
        uGCVideoDecodeController.mSendFrameFailCount = 0;
    }

    public static /* synthetic */ void lambda$signalEndOfStream$3(UGCVideoDecodeController uGCVideoDecodeController) {
        if (uGCVideoDecodeController.mDecoder == null) {
            uGCVideoDecodeController.notifyDecodeCompleted();
            return;
        }
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.isEosFrame = true;
        uGCVideoDecodeController.mPendingFrameQueue.queue(encodedVideoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAbandonDecodingFramesCompleted() {
        LiteavLog.m76086i(this.mThrottlers.m76042a("onAbandonCompleted"), this.mTAG, "onAbandonDecodingFramesCompleted", new Object[0]);
        UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
        if (uGCVideoDecodeControllerListener != null) {
            uGCVideoDecodeControllerListener.onAbandonDecodingFramesCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDecodeCompleted() {
        LiteavLog.m76086i(this.mThrottlers.m76042a("onDecodeCompleted"), this.mTAG, "onDecodeCompleted", new Object[0]);
        UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
        if (uGCVideoDecodeControllerListener != null) {
            uGCVideoDecodeControllerListener.onDecodeCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDecodeFrameInternal(PixelFrame pixelFrame) {
        this.mDecodingFrameCount--;
        this.mOutputFramePts = pixelFrame.getTimestamp();
        Long l11 = this.mLastOutputFramePts;
        long jLongValue = l11 == null ? 0L : l11.longValue();
        if (!this.mIsRedecodingFromBeginOfThisGop || pixelFrame.getTimestamp() > jLongValue) {
            UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
            if (uGCVideoDecodeControllerListener != null) {
                uGCVideoDecodeControllerListener.onFrameDecoded(pixelFrame);
            }
            this.mLastOutputFramePts = Long.valueOf(pixelFrame.getTimestamp());
            this.mIsRedecodingFromBeginOfThisGop = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean runOnWorkThread(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        return customHandler != null && customHandler.runOrPost(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        LiteavLog.m76086i(this.mThrottlers.m76042a("stopInternal"), this.mTAG, "stopInternal", new Object[0]);
        this.mIsUsingHardwareDecoder = true;
        this.mIsRedecodingFromBeginOfThisGop = false;
        this.mListener = null;
        this.mLastOutputFramePts = null;
        this.mHasDecodeError.set(false);
        this.mDecodingFrameCount = 0;
        this.mSendFrameFailCount = 0;
        this.mInputFramePts = 0L;
        this.mOutputFramePts = 0L;
        destroyDecoder();
        clearFrameQueue();
        HandlerC34758w handlerC34758w = this.mDecodeTimer;
        if (handlerC34758w != null) {
            handlerC34758w.m76147a();
            this.mDecodeTimer = null;
        }
    }

    public void abandonDecodingFrames() {
        LiteavLog.m76086i(this.mThrottlers.m76042a("abandonFrames"), this.mTAG, "abandonDecodingFrames", new Object[0]);
        runOnWorkThread(RunnableC35604m.m79100a(this));
    }

    public void decode(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame == null) {
            return;
        }
        this.mCodecType = encodedVideoFrame.codecType;
        this.mPendingFrameQueue.queue(encodedVideoFrame);
        runOnWorkThread(RunnableC35603l.m79099a(this, encodedVideoFrame));
    }

    public boolean isInputQueueFull() {
        return this.mPendingFrameQueue.size() >= 2;
    }

    public void signalEndOfStream() {
        LiteavLog.m76086i(this.mThrottlers.m76042a("signalEndOfStream"), this.mTAG, "signalEndOfStream", new Object[0]);
        runOnWorkThread(RunnableC35605n.m79101a(this));
    }

    public void start(UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener) {
        LiteavLog.m76086i(this.mThrottlers.m76042a("start"), this.mTAG, "start", new Object[0]);
        synchronized (this) {
            try {
                if (this.mWorkHandler != null) {
                    LiteavLog.m76092w(this.mThrottlers.m76042a("startWorkHandler"), this.mTAG, "UGCDecodeController is start", new Object[0]);
                    return;
                }
                HandlerThread handlerThread = new HandlerThread("ugc-decoder-controller");
                handlerThread.start();
                this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
                HandlerC34758w handlerC34758w = new HandlerC34758w(this.mWorkHandler.getLooper(), new HandlerC34758w.a(this) { // from class: com.tencent.ugc.decoder.i

                    /* JADX INFO: renamed from: a */
                    private final UGCVideoDecodeController f76956a;

                    @Override // com.tencent.liteav.base.util.HandlerC34758w.a
                    public final void onTimeout() {
                        this.f76956a.decodeInternal();
                    }

                    {
                        this.f76956a = this;
                    }
                });
                this.mDecodeTimer = handlerC34758w;
                handlerC34758w.m76148a(5);
                runOnWorkThread(RunnableC35601j.m79097a(this, uGCVideoDecodeControllerListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void stop() {
        LiteavLog.m76086i(this.mThrottlers.m76042a(InterfaceC33730j9.f70350a), this.mTAG, InterfaceC33730j9.f70350a, new Object[0]);
        runOnWorkThread(RunnableC35602k.m79098a(this));
        synchronized (this) {
            try {
                CustomHandler customHandler = this.mWorkHandler;
                if (customHandler != null) {
                    customHandler.quitLooperAndWaitDone();
                    this.mWorkHandler = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public UGCVideoDecodeController() {
        C355901 c355901 = new C355901();
        this.mUGCFrameQueueListener = c355901;
        this.mTAG = "UGCVideoDecodeController_" + hashCode();
        this.mThrottlers = new C34692b();
        this.mHasDecodeError = new AtomicBoolean(false);
        UGCFrameQueue<EncodedVideoFrame> uGCFrameQueue = new UGCFrameQueue<>();
        this.mPendingFrameQueue = uGCFrameQueue;
        uGCFrameQueue.setUGCFrameQueueListener(c355901);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decodeInternal() {
        handleDecoderError();
        if (this.mDecoder == null && !createDecoder(this.mIsUsingHardwareDecoder)) {
            return;
        }
        EncodedVideoFrame encodedVideoFramePeek = this.mPendingFrameQueue.peek();
        if (encodedVideoFramePeek == null) {
            this.mDecoder.decode(null);
            return;
        }
        if (this.mDecoder.decode(encodedVideoFramePeek)) {
            this.mDecodingFrameCount++;
            this.mInputFramePts = encodedVideoFramePeek.pts;
            this.mSendFrameFailCount = 0;
            this.mPendingFrameQueue.dequeue();
            return;
        }
        this.mSendFrameFailCount++;
    }

    private static int getMediaFormatValue(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return i11;
    }

    private void handleDecoderError() {
        long jLongValue;
        if (!isDecoderError()) {
            return;
        }
        if (this.mIsUsingHardwareDecoder && this.mCodecType != CodecType.H265) {
            LiteavLog.m76086i(this.mThrottlers.m76042a("handleDecoderError"), this.mTAG, "handle Hardware Decoder Error", new Object[0]);
            this.mIsUsingHardwareDecoder = false;
            this.mIsRedecodingFromBeginOfThisGop = true;
            destroyDecoder();
            clearFrameQueue();
            UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener = this.mListener;
            if (uGCVideoDecodeControllerListener != null) {
                Long l11 = this.mLastOutputFramePts;
                if (l11 == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = l11.longValue();
                }
                uGCVideoDecodeControllerListener.onRequestSeekToLastKeyFrame(jLongValue);
            }
        } else {
            LiteavLog.m76086i(this.mThrottlers.m76042a("handleDecoderError"), this.mTAG, "notify DecodeFailed", new Object[0]);
            UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener2 = this.mListener;
            if (uGCVideoDecodeControllerListener2 != null) {
                uGCVideoDecodeControllerListener2.onDecodeFailed();
            }
        }
        this.mHasDecodeError.set(false);
        this.mSendFrameFailCount = 0;
        this.mDecodingFrameCount = 0;
        this.mInputFramePts = 0L;
        this.mOutputFramePts = 0L;
    }

    public static /* synthetic */ void lambda$abandonDecodingFrames$2(UGCVideoDecodeController uGCVideoDecodeController) {
        uGCVideoDecodeController.clearFrameQueue();
        uGCVideoDecodeController.mIsRedecodingFromBeginOfThisGop = false;
        uGCVideoDecodeController.mDecodingFrameCount = 0;
        uGCVideoDecodeController.mInputFramePts = 0L;
        uGCVideoDecodeController.mOutputFramePts = 0L;
        VideoDecoderInterface videoDecoderInterface = uGCVideoDecodeController.mDecoder;
        if (videoDecoderInterface != null) {
            videoDecoderInterface.abandonDecodingFrames();
        } else {
            uGCVideoDecodeController.notifyAbandonDecodingFramesCompleted();
        }
    }
}
