package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareVideoDecoder implements MediaCodecDecoder.MediaCodecDecoderListener, VideoDecoderInterface {
    private static final int INTERVAL_DRAIN_ONE_FRAME_MORE = 30;
    private final HardwareDecoderMediaFormatBuilder mDecoderMediaFormatBuilder;
    private final HardwareVideoDecoderParams mParams;
    private MediaCodec mPreloadMediaCodec;
    private String mTAG = "HardwareVideoDecoder";
    private final C34692b mThrottlers = new C34692b();
    private Surface mOutputSurface = null;
    private MediaCodecDecoder mMediaCodecDecoder = null;
    private volatile CustomHandler mWorkHandler = null;
    private VideoDecoderListener mListener = null;
    private EncodedVideoFrame mPendingDecodeFrame = null;
    private boolean mAllowDrainDecodedFrames = true;
    private VideoDecoderDef.ConsumerScene mScene = VideoDecoderDef.ConsumerScene.UNKNOWN;
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = false;
    private boolean mIsNeedNotifyAbandonCompleted = false;
    private long mDecodedFrameCount = 0;

    private void releasePendingDecodeFrame() {
        this.mPendingDecodeFrame = null;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public boolean decode(EncodedVideoFrame encodedVideoFrame) {
        synchronized (this) {
            try {
                if (this.mPendingDecodeFrame == null && encodedVideoFrame != null) {
                    this.mPendingDecodeFrame = encodedVideoFrame;
                    runOnWorkThread(RunnableC35595d.m79092a(this));
                    return true;
                }
                runOnWorkThread(RunnableC35594c.m79091a(this));
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder.MediaCodecDecoderListener
    public void onDecodeFrame(PixelFrame pixelFrame, boolean z11) {
        if (z11) {
            notifyEndOfStream();
            this.mAllowDrainDecodedFrames = true;
            return;
        }
        if (pixelFrame == null) {
            return;
        }
        this.mDecodedFrameCount++;
        this.mAllowDrainDecodedFrames = true;
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeFrame(pixelFrame, pixelFrame.getTimestamp());
        }
        try {
            if (allowDrainOneFrameMore() && drainDecodedFrame()) {
                LiteavLog.m76079d(this.mTAG, "drain more frame success");
            }
        } catch (Throwable th2) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("drainDecodedFrame"), this.mTAG, "exception from drain decoded frame, message:" + th2.getMessage(), new Object[0]);
        }
        if (this.mIsNeedNotifyAbandonCompleted) {
            notifyOnAbandonDecodingFramesCompleted();
            this.mIsNeedNotifyAbandonCompleted = false;
        }
    }

    private boolean allowDrainOneFrameMore() {
        return this.mDecodedFrameCount % 30 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drainAndFeedFrame() {
        EncodedVideoFrame encodedVideoFrame;
        if (this.mMediaCodecDecoder == null) {
            LiteavLog.m76093w(this.mTAG, "MediaCodec is stopped.");
            releasePendingDecodeFrame();
            return;
        }
        try {
            if (this.mAllowDrainDecodedFrames) {
                drainDecodedFrame();
            }
            synchronized (this) {
                encodedVideoFrame = this.mPendingDecodeFrame;
            }
            if (encodedVideoFrame != null && this.mMediaCodecDecoder.feedEncodedFrame(encodedVideoFrame)) {
                synchronized (this) {
                    try {
                        if (this.mPendingDecodeFrame == encodedVideoFrame) {
                            this.mPendingDecodeFrame = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            LiteavLog.m76084e(this.mTAG, "decode failed.", th3);
            handleDecoderError();
        }
    }

    private boolean drainDecodedFrame() {
        if (this.mMediaCodecDecoder.drainDecodedFrame()) {
            this.mAllowDrainDecodedFrames = false;
        }
        return this.mAllowDrainDecodedFrames;
    }

    public static /* synthetic */ void lambda$setScene$1(HardwareVideoDecoder hardwareVideoDecoder, VideoDecoderDef.ConsumerScene consumerScene) {
        hardwareVideoDecoder.mScene = consumerScene;
        MediaCodecDecoder mediaCodecDecoder = hardwareVideoDecoder.mMediaCodecDecoder;
        if (mediaCodecDecoder != null) {
            mediaCodecDecoder.enableLimitMaxDecFrameBuffer(hardwareVideoDecoder.mEnableLimitMaxDecFrameBufferingInH264Sps && consumerScene == VideoDecoderDef.ConsumerScene.RTC);
        }
    }

    private void notifyEndOfStream() {
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeCompleted();
        }
    }

    private void notifyOnAbandonDecodingFramesCompleted() {
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onAbandonDecodingFramesCompleted();
        }
    }

    private void runOnWorkThread(Runnable runnable) {
        if (this.mWorkHandler != null) {
            this.mWorkHandler.runOrPost(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal(Object obj, VideoDecoderListener videoDecoderListener) {
        HardwareVideoDecoder hardwareVideoDecoder;
        LiteavLog.m76088i(this.mTAG, "Start decoder with eglContext:%s", obj);
        System.currentTimeMillis();
        if (this.mMediaCodecDecoder != null) {
            LiteavLog.m76093w(this.mTAG, "Decoder already started.");
            return;
        }
        HardwareVideoDecoderParams hardwareVideoDecoderParams = this.mParams;
        String string = hardwareVideoDecoderParams.useHevc ? "video/hevc" : "video/avc";
        MediaFormat mediaFormat = hardwareVideoDecoderParams.mediaFormat;
        if (mediaFormat != null) {
            string = mediaFormat.getString("mime");
        }
        int supportColorFormat = DecodeAbilityProvider.getInstance().getSupportColorFormat(string);
        if (this.mParams.useOutputBuffer && MediaCodecOutputBufferDecoder.isSupportColorFormat(supportColorFormat)) {
            HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder = this.mDecoderMediaFormatBuilder;
            HardwareVideoDecoderParams hardwareVideoDecoderParams2 = this.mParams;
            hardwareVideoDecoder = this;
            hardwareVideoDecoder.mMediaCodecDecoder = new MediaCodecOutputBufferDecoder(hardwareDecoderMediaFormatBuilder, hardwareVideoDecoderParams2.resolution, hardwareVideoDecoderParams2.useSoftDecoder, hardwareVideoDecoder, this.mWorkHandler);
        } else {
            hardwareVideoDecoder = this;
            HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder2 = hardwareVideoDecoder.mDecoderMediaFormatBuilder;
            HardwareVideoDecoderParams hardwareVideoDecoderParams3 = hardwareVideoDecoder.mParams;
            hardwareVideoDecoder.mMediaCodecDecoder = new MediaCodecOutputOESTextureDecoder(hardwareDecoderMediaFormatBuilder2, hardwareVideoDecoderParams3.resolution, hardwareVideoDecoderParams3.useSoftDecoder, hardwareVideoDecoder, hardwareVideoDecoder.mWorkHandler);
        }
        hardwareVideoDecoder.mMediaCodecDecoder.enableLimitMaxDecFrameBuffer(hardwareVideoDecoder.mEnableLimitMaxDecFrameBufferingInH264Sps && hardwareVideoDecoder.mScene == VideoDecoderDef.ConsumerScene.RTC);
        hardwareVideoDecoder.mMediaCodecDecoder.start(obj);
        hardwareVideoDecoder.mListener = videoDecoderListener;
        MediaCodecDecoder.BuildResult buildResultBuildMediaCodec = hardwareVideoDecoder.mMediaCodecDecoder.buildMediaCodec(hardwareVideoDecoder.mParams.isLowLatencyEnabled, hardwareVideoDecoder.mPreloadMediaCodec);
        boolean z11 = hardwareVideoDecoder.mParams.isLowLatencyEnabled && buildResultBuildMediaCodec.isSuccess;
        if (!buildResultBuildMediaCodec.isSuccess) {
            buildResultBuildMediaCodec = hardwareVideoDecoder.mMediaCodecDecoder.buildMediaCodec(false, null);
        }
        if (!buildResultBuildMediaCodec.isSuccess) {
            stopInternal();
            handleDecoderError();
        } else {
            VideoDecoderListener videoDecoderListener2 = hardwareVideoDecoder.mListener;
            if (videoDecoderListener2 != null) {
                videoDecoderListener2.onDecodeLatencyChanged(z11);
            }
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        LiteavLog.m76087i(this.mTAG, "Stop decoder");
        MediaCodecDecoder mediaCodecDecoder = this.mMediaCodecDecoder;
        if (mediaCodecDecoder != null) {
            mediaCodecDecoder.stop();
            this.mMediaCodecDecoder = null;
        }
        releasePendingDecodeFrame();
        this.mAllowDrainDecodedFrames = true;
        this.mDecodedFrameCount = 0L;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void abandonDecodingFrames() {
        LiteavLog.m76087i(this.mTAG, "flush");
        runOnWorkThread(RunnableC35597f.m79094a(this));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public VideoDecoderInterface.DecoderType getDecoderType() {
        HardwareVideoDecoderParams hardwareVideoDecoderParams = this.mParams;
        return (hardwareVideoDecoderParams == null || !hardwareVideoDecoderParams.useSoftDecoder) ? VideoDecoderInterface.DecoderType.HARDWARE : VideoDecoderInterface.DecoderType.SOFTWARE_DEVICE;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void initialize() {
        HandlerThread handlerThread = new HandlerThread("HardwareVideoDecoder_" + hashCode());
        handlerThread.start();
        this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void uninitialize() {
        if (this.mWorkHandler != null) {
            LiteavLog.m76087i(this.mTAG, "uninitialize quitLooper");
            this.mWorkHandler.quitLooper();
        }
    }

    public HardwareVideoDecoder(HardwareVideoDecoderParams hardwareVideoDecoderParams, MediaCodec mediaCodec) {
        String string;
        HardwareVideoDecoderParams hardwareVideoDecoderParams2 = new HardwareVideoDecoderParams(hardwareVideoDecoderParams);
        this.mParams = hardwareVideoDecoderParams2;
        this.mPreloadMediaCodec = mediaCodec;
        if (hardwareVideoDecoderParams2.useHevc) {
            string = "video/hevc";
        } else {
            string = "video/avc";
        }
        MediaFormat mediaFormat = hardwareVideoDecoderParams.mediaFormat;
        if (mediaFormat != null) {
            hardwareVideoDecoderParams2.resolution = new Size(mediaFormat.getInteger("width"), hardwareVideoDecoderParams.mediaFormat.getInteger("height"));
            string = hardwareVideoDecoderParams.mediaFormat.getString("mime");
        }
        this.mDecoderMediaFormatBuilder = new HardwareDecoderMediaFormatBuilder().setMediaFormat(hardwareVideoDecoderParams2.mediaFormat).setMediaCodecDeviceRelatedParams(hardwareVideoDecoderParams2.mediaCodecDeviceRelatedParams).setMimeType(string).setWidth(hardwareVideoDecoderParams2.resolution.getWidth()).setHeight(hardwareVideoDecoderParams2.resolution.getHeight());
        this.mTAG += "_" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void abandonDecodingFramesInternal() {
        releasePendingDecodeFrame();
        MediaCodecDecoder mediaCodecDecoder = this.mMediaCodecDecoder;
        if (mediaCodecDecoder != null) {
            mediaCodecDecoder.flush();
        }
        if (this.mAllowDrainDecodedFrames) {
            notifyOnAbandonDecodingFramesCompleted();
        } else {
            this.mIsNeedNotifyAbandonCompleted = true;
        }
    }

    private void handleDecoderError() {
        releasePendingDecodeFrame();
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeFailed();
        }
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder.MediaCodecDecoderListener
    public void onDecoderError() {
        handleDecoderError();
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
        runOnWorkThread(RunnableC35598g.m79095a(this, consumerScene));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void start(Object obj, VideoDecoderListener videoDecoderListener) {
        runOnWorkThread(RunnableC35593b.m79090a(this, obj, videoDecoderListener));
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void stop() {
        runOnWorkThread(RunnableC35596e.m79093a(this));
    }

    public static class HardwareVideoDecoderParams {
        public boolean isHDR;
        public boolean isLowLatencyEnabled;
        public JSONArray mediaCodecDeviceRelatedParams;
        public MediaFormat mediaFormat;
        public Size resolution;
        public boolean useHevc;
        public boolean useOutputBuffer;
        public boolean useSoftDecoder;

        public HardwareVideoDecoderParams(HardwareVideoDecoderParams hardwareVideoDecoderParams) {
            this.isHDR = false;
            this.useHevc = false;
            this.useOutputBuffer = false;
            this.isLowLatencyEnabled = false;
            this.resolution = null;
            this.mediaFormat = null;
            this.useSoftDecoder = false;
            this.mediaCodecDeviceRelatedParams = null;
            this.isHDR = hardwareVideoDecoderParams.isHDR;
            this.useHevc = hardwareVideoDecoderParams.useHevc;
            this.useOutputBuffer = hardwareVideoDecoderParams.useOutputBuffer;
            this.isLowLatencyEnabled = hardwareVideoDecoderParams.isLowLatencyEnabled;
            this.resolution = hardwareVideoDecoderParams.resolution;
            this.mediaFormat = hardwareVideoDecoderParams.mediaFormat;
            this.mediaCodecDeviceRelatedParams = hardwareVideoDecoderParams.mediaCodecDeviceRelatedParams;
            this.useSoftDecoder = hardwareVideoDecoderParams.useSoftDecoder;
        }

        public HardwareVideoDecoderParams() {
            this.isHDR = false;
            this.useHevc = false;
            this.useOutputBuffer = false;
            this.isLowLatencyEnabled = false;
            this.resolution = null;
            this.mediaFormat = null;
            this.useSoftDecoder = false;
            this.mediaCodecDeviceRelatedParams = null;
        }
    }
}
