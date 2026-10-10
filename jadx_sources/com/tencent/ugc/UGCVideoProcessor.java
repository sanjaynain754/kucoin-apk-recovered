package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.encoder.UGCVideoEncodeController;
import com.tencent.ugc.encoder.UGCVideoEncoderJNI;
import com.tencent.ugc.encoder.VideoEncodeParams;
import com.tencent.ugc.renderer.VideoRenderListener;
import com.tencent.ugc.renderer.VideoRenderer;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.FrameMetaData;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videoprocessor.SpeedProcessor;
import com.tencent.ugc.videoprocessor.VideoEffectProcessor;
import com.tencent.ugc.videoprocessor.VideoProcessManager;
import com.tencent.ugc.videoprocessor.VideoTransitionProcessor;
import com.tencent.ugc.videoprocessor.WatermarkProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UGCVideoProcessor {
    private static final int MSG_FORCE_PROCESS = 105;
    private static final int MSG_PAUSE = 102;
    private static final int MSG_PROCESS_FROM_SOURCE = 101;
    private static final int MSG_REFRESH = 104;
    private static final int MSG_START = 100;
    private static final int MSG_STOP = 103;
    private DisplayTarget mDisplayTarget;
    private EGLCore mEGLCore;
    private UGCFrameRateFilter mFrameRateFilter;
    private GLTexturePool mGLTexturePool;
    private PixelFrame mLastFrameOfReadFromSource;
    private PixelFrameRenderer mPreScaleRenderer;
    private List<TXVideoEditConstants.TXAbsoluteRect> mRectList;
    private HandlerThread mRenderThread;
    private VideoRenderer mRenderer;
    private SpeedProcessor mSpeedProcessor;
    private EnumC35485a mStatus;
    private TXVideoEditer.TXVideoCustomProcessListener mTXVideoCustomProcessListener;
    private final UGCAVSyncer mUGCAVSyncer;
    private UGCCombineProcessor mUGCCombineProcessor;
    private UGCMediaListSource mUGCMediaListSource;
    private UGCTransitionProcessor mUGCTransitionProcessor;
    private UGCVideoEncoderJNI.UGCVideoEncoderListener mUGCVideoEncoderListener;
    private UGCVideoEncodeController mVideoEncodeController;
    private VideoEncodeParams mVideoEncodeParams;
    private VideoEncodedFrameListener mVideoEncodedFrameListener;
    private CustomHandler mVideoProcessHandler;
    private VideoProcessListener mVideoProcessListener;
    private final VideoProcessManager mVideoProcessManager;
    private final String mTag = "UGCVideoProcessor_" + hashCode();
    private final C34692b mThrottlers = new C34692b();
    private boolean mIsInit = false;
    private int mTransitionType = -1;
    private long mFinalPts = -1;
    private GLConstants.GLScaleType mScaleType = GLConstants.GLScaleType.FIT_CENTER;
    private EnumC34747l mRotation = EnumC34747l.NORMAL;
    private boolean mIsRecord = false;
    private Object mCurEGLContext = null;
    private int mCurEGLWidth = -1;
    private int mCurEGLHeight = -1;
    private int mOutputWidth = -1;
    private int mOutputHeight = -1;
    private long mLastProcessFramePts = -1;
    private boolean mReverse = false;
    private boolean mHasFirstFrameProcessed = false;
    private int mSkipFrameCount = 0;
    private final int MAX_SKIP_FRAME_COUNT = 3;
    private UGCVideoEncoderJNI.EncoderType mUsingEncoderType = UGCVideoEncoderJNI.EncoderType.HARDWARE;
    private final VideoRenderListener mVideoRenderListener = new C354841();
    private Runnable onCompleteBroadcastRunnable = RunnableC35716gt.m79210a(this);

    /* JADX INFO: renamed from: com.tencent.ugc.UGCVideoProcessor$1 */
    public class C354841 extends VideoRenderListener {
        public C354841() {
        }

        @Override // com.tencent.ugc.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i11, int i12) {
            LiteavLog.m76087i(UGCVideoProcessor.this.mTag, "onRenderSizeChange " + i11 + "," + i12);
            UGCVideoProcessor.this.runOnVideoProcessHandler(RunnableC35736hm.m79230a(this, i11, i12));
        }
    }

    public interface VideoEncodedFrameListener {
        void onEncodedFail(UGCVideoEncoderJNI.EncoderType encoderType, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError);

        void onVideoEncodeStarted();

        void onVideoEncodingCompleted();

        void onVideoFrameEncoded(EncodedVideoFrame encodedVideoFrame);
    }

    public interface VideoProcessListener {
        void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProgress(long j11);
    }

    /* JADX INFO: renamed from: com.tencent.ugc.UGCVideoProcessor$a */
    public enum EnumC35485a {
        STOPPED,
        STARTED,
        PAUSED
    }

    /* JADX INFO: renamed from: com.tencent.ugc.UGCVideoProcessor$b */
    public class C35486b implements UGCVideoEncoderJNI.UGCVideoEncoderListener {
        private C35486b() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78988a(C35486b c35486b, EncodedVideoFrame encodedVideoFrame) {
            if (c35486b != UGCVideoProcessor.this.mUGCVideoEncoderListener || UGCVideoProcessor.this.mVideoEncodedFrameListener == null) {
                return;
            }
            if (encodedVideoFrame == null) {
                UGCVideoProcessor.this.mVideoEncodedFrameListener.onVideoEncodingCompleted();
                UGCVideoProcessor.this.stopEncoder();
                return;
            }
            if (!encodedVideoFrame.isEosFrame) {
                UGCVideoProcessor.this.mVideoEncodedFrameListener.onVideoFrameEncoded(encodedVideoFrame);
            }
            if ((encodedVideoFrame.pts < UGCVideoProcessor.this.mFinalPts || UGCVideoProcessor.this.mFinalPts == -1) && !encodedVideoFrame.isEosFrame) {
                return;
            }
            UGCVideoProcessor.this.mVideoEncodedFrameListener.onVideoEncodingCompleted();
            UGCVideoProcessor.this.stopEncoder();
        }

        public /* synthetic */ C35486b(UGCVideoProcessor uGCVideoProcessor, byte b11) {
            this();
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedFail(UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
            LiteavLog.m76083e(UGCVideoProcessor.this.mTag, "encoded fail.encode error type is ".concat(String.valueOf(videoEncoderError)));
            UGCVideoProcessor.this.runOnVideoProcessHandler(RunnableC35738ho.m79232a(this, videoEncoderError));
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame) {
            UGCVideoProcessor.this.runOnVideoProcessHandler(RunnableC35737hn.m79231a(this, encodedVideoFrame));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78987a(C35486b c35486b, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
            if (c35486b != UGCVideoProcessor.this.mUGCVideoEncoderListener || UGCVideoProcessor.this.mVideoEncodedFrameListener == null) {
                return;
            }
            UGCVideoProcessor.this.mVideoEncodedFrameListener.onEncodedFail(UGCVideoProcessor.this.mUsingEncoderType, videoEncoderError);
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.UGCVideoProcessor$c */
    public class C35487c implements VideoProcessManager.IVideoProcessManagerListener {
        private C35487c() {
        }

        public /* synthetic */ C35487c(UGCVideoProcessor uGCVideoProcessor, byte b11) {
            this();
        }

        @Override // com.tencent.ugc.videoprocessor.VideoProcessManager.IVideoProcessManagerListener
        public final int customProcessFrame(PixelFrame pixelFrame) {
            if (UGCVideoProcessor.this.mTXVideoCustomProcessListener == null || pixelFrame == null) {
                return -1;
            }
            if (pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D || pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_OES) {
                GLES20.glFinish();
            }
            return UGCVideoProcessor.this.mTXVideoCustomProcessListener.onTextureCustomProcess(pixelFrame.getTextureId(), pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getTimestamp());
        }

        @Override // com.tencent.ugc.videoprocessor.VideoProcessManager.IVideoProcessManagerListener
        public final void didProcessFrame(PixelFrame pixelFrame) {
            UGCVideoProcessor.this.handleProcessFrame(pixelFrame);
        }
    }

    private boolean createProcessChainIfNeed(List<PixelFrame> list) {
        int i11;
        PixelFrame pixelFrame = list.get(0);
        int width = pixelFrame.getWidth();
        int height = pixelFrame.getHeight();
        int i12 = this.mOutputWidth;
        if (i12 > 0 && (i11 = this.mOutputHeight) > 0) {
            width = i12;
            height = i11;
        }
        if (isNeedReCreateEGL(pixelFrame.getGLContext(), width, height)) {
            unInitVideoProcessor();
            uninitializedEGL();
        }
        if (this.mEGLCore == null) {
            initializeEGL(pixelFrame.getGLContext(), width, height);
            initProcessChain(width, height);
        }
        return this.mEGLCore != null;
    }

    private void initializeEGL(Object obj, int i11, int i12) {
        try {
            EGLCore eGLCore = new EGLCore();
            this.mEGLCore = eGLCore;
            eGLCore.initialize(obj, null, i11, i12);
            this.mEGLCore.makeCurrent();
            this.mCurEGLContext = obj;
            this.mCurEGLWidth = i11;
            this.mCurEGLHeight = i12;
            this.mGLTexturePool = new GLTexturePool();
        } catch (EGLException e11) {
            this.mEGLCore = null;
            LiteavLog.m76082e(this.mThrottlers.m76042a("initGL"), this.mTag, e11.getMessage(), new Object[0]);
        }
    }

    private boolean isNeedReCreateEGL(Object obj, int i11, int i12) {
        Object obj2;
        if (obj == null || (obj2 = this.mCurEGLContext) == null || i11 < 0 || i12 < 0) {
            return false;
        }
        if (obj.equals(obj2) && this.mCurEGLWidth == i11 && this.mCurEGLHeight == i12) {
            return false;
        }
        LiteavLog.m76086i(this.mThrottlers.m76042a("recreateGL"), this.mTag, "isNeedReCreateEGL: true", new Object[0]);
        return true;
    }

    private void removeMsgFromVideoProcessHandler(int i11) {
        synchronized (this) {
            try {
                CustomHandler customHandler = this.mVideoProcessHandler;
                if (customHandler != null) {
                    customHandler.removeMessages(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean runOnVideoProcessHandler(Runnable runnable) {
        synchronized (this) {
            CustomHandler customHandler = this.mVideoProcessHandler;
            if (customHandler != null && customHandler.getLooper() != null && this.mVideoProcessHandler.getLooper().getThread() != null && this.mVideoProcessHandler.getLooper().getThread().isAlive()) {
                CustomHandler customHandler2 = this.mVideoProcessHandler;
                if (customHandler2 == null) {
                    return false;
                }
                if (Looper.myLooper() == customHandler2.getLooper()) {
                    runnable.run();
                    return true;
                }
                boolean zPost = customHandler2.post(runnable);
                if (!zPost) {
                    LiteavLog.m76083e(this.mTag, "handler post fail ret = ".concat(String.valueOf(zPost)));
                }
                return zPost;
            }
            LiteavLog.m76083e(this.mTag, "handler post fail thread is not alive ");
            return false;
        }
    }

    private void sendMsgToVideoProcessHandler(int i11) {
        synchronized (this) {
            try {
                CustomHandler customHandler = this.mVideoProcessHandler;
                if (customHandler != null) {
                    customHandler.sendEmptyMessage(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean handleMessage(Message message) {
        PixelFrame pixelFrame;
        switch (message.what) {
            case 100:
                this.mStatus = EnumC35485a.STARTED;
                if (!this.mIsRecord) {
                    initRenderer();
                } else {
                    initEncoder();
                }
                break;
            case 101:
                if (this.mStatus != EnumC35485a.STARTED) {
                    LiteavLog.m76083e(this.mTag, "MSG_PROCESS_FROM_SOURCE FAILD AS mStatus == " + this.mStatus);
                }
                processFrame();
                break;
            case 102:
                this.mStatus = EnumC35485a.PAUSED;
                break;
            case 103:
                PixelFrame pixelFrame2 = this.mLastFrameOfReadFromSource;
                if (pixelFrame2 != null) {
                    pixelFrame2.release();
                    this.mLastFrameOfReadFromSource = null;
                }
                this.mStatus = EnumC35485a.STOPPED;
                break;
            case 104:
                if (this.mStatus != EnumC35485a.STARTED && (pixelFrame = this.mLastFrameOfReadFromSource) != null) {
                    this.mVideoProcessManager.processFrame(pixelFrame);
                }
                break;
            case 105:
                LiteavLog.m76087i(this.mTag, "handleMessage: MSG_FORCE_PROCESS");
                removeMsgFromVideoProcessHandler(105);
                processFrame();
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessFrame(PixelFrame pixelFrame) {
        UGCVideoEncodeController uGCVideoEncodeController;
        VideoRenderer videoRenderer;
        VideoProcessListener videoProcessListener = this.mVideoProcessListener;
        if (videoProcessListener != null) {
            videoProcessListener.onProgress(pixelFrame.getTimestamp());
        }
        this.mLastProcessFramePts = pixelFrame.getTimestamp();
        FrameMetaData frameMetaData = new FrameMetaData();
        frameMetaData.setEncodeRotation(this.mRotation);
        frameMetaData.setRenderRotation(this.mRotation);
        pixelFrame.setMetaData(frameMetaData);
        if (!this.mIsRecord && (videoRenderer = this.mRenderer) != null) {
            videoRenderer.renderFrame(pixelFrame);
        }
        if (!this.mIsRecord || (uGCVideoEncodeController = this.mVideoEncodeController) == null) {
            long j11 = this.mFinalPts;
            if (j11 > 0 && this.mLastProcessFramePts >= j11) {
                notifyPreviewComplete();
            }
        } else {
            uGCVideoEncodeController.encodeFrame(pixelFrame);
            long j12 = this.mFinalPts;
            if (j12 > 0 && this.mLastProcessFramePts >= j12) {
                LiteavLog.m76087i(this.mTag, "processFrameFromSource: signalEndOfStream");
                this.mVideoEncodeController.signalEndOfStream();
                return;
            }
        }
        if (this.mStatus == EnumC35485a.STARTED) {
            sendMsgToVideoProcessHandler(101);
        }
    }

    private void initEncoder() {
        LiteavLog.m76087i(this.mTag, "init encoder");
        if (this.mVideoEncodeParams == null) {
            LiteavLog.m76083e(this.mTag, "video encode params is null");
            return;
        }
        UGCVideoEncodeController uGCVideoEncodeController = this.mVideoEncodeController;
        if (uGCVideoEncodeController != null) {
            uGCVideoEncodeController.stop();
        }
        this.mVideoEncodeController = new UGCVideoEncodeController(this.mUsingEncoderType);
        C35486b c35486b = new C35486b(this, (byte) 0);
        this.mUGCVideoEncoderListener = c35486b;
        this.mVideoEncodeController.start(this.mVideoEncodeParams, c35486b);
        VideoEncodedFrameListener videoEncodedFrameListener = this.mVideoEncodedFrameListener;
        if (videoEncodedFrameListener != null) {
            videoEncodedFrameListener.onVideoEncodeStarted();
        }
        this.mFinalPts = -1L;
    }

    private void initProcessChain(int i11, int i12) {
        LiteavLog.m76087i(this.mTag, "init process chain:  width:" + i11 + " height:" + i12);
        if (this.mEGLCore == null) {
            return;
        }
        this.mVideoProcessManager.initFilter(this.mGLTexturePool, i11, i12);
        this.mUGCTransitionProcessor = new UGCTransitionProcessor(i11, i12, this.mGLTexturePool);
        this.mUGCCombineProcessor = new UGCCombineProcessor(i11, i12, this.mGLTexturePool);
    }

    private void initRenderer() {
        if (this.mRenderer != null) {
            return;
        }
        if (this.mRenderThread == null) {
            HandlerThread handlerThread = new HandlerThread("VideoProcessRender" + hashCode());
            this.mRenderThread = handlerThread;
            handlerThread.start();
        }
        VideoRenderer videoRenderer = new VideoRenderer(this.mRenderThread.getLooper());
        this.mRenderer = videoRenderer;
        DisplayTarget displayTarget = this.mDisplayTarget;
        if (displayTarget != null) {
            videoRenderer.setDisplayView(displayTarget, true);
            this.mRenderer.setScaleType(this.mScaleType);
        }
        this.mRenderer.start(this.mVideoRenderListener);
    }

    private boolean isFilterFrameDueToChangeFrameRate(List<PixelFrame> list) {
        if (this.mFrameRateFilter == null || !this.mIsRecord || list.size() > 1) {
            return false;
        }
        return this.mFrameRateFilter.isFilterOutFrame(list.get(0));
    }

    private boolean isFilterFrameDueToSync(List<PixelFrame> list) {
        UGCAVSyncer.SkipMode skipModeSyncVideo = UGCAVSyncer.SkipMode.NOOP;
        if (this.mHasFirstFrameProcessed || this.mIsRecord) {
            skipModeSyncVideo = this.mUGCAVSyncer.syncVideo(list.get(0).getTimestamp());
        }
        this.mHasFirstFrameProcessed = true;
        if (skipModeSyncVideo != UGCAVSyncer.SkipMode.SKIP_CURRENT_FRAME) {
            this.mSkipFrameCount = 0;
            return false;
        }
        int i11 = this.mSkipFrameCount + 1;
        this.mSkipFrameCount = i11;
        return i11 < 3;
    }

    public static /* synthetic */ void lambda$setDisplayView$5(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        uGCVideoProcessor.mDisplayTarget = displayTarget;
        if (gLScaleType != null) {
            uGCVideoProcessor.mScaleType = gLScaleType;
        }
        VideoRenderer videoRenderer = uGCVideoProcessor.mRenderer;
        if (videoRenderer != null) {
            videoRenderer.setDisplayView(displayTarget, true);
            uGCVideoProcessor.mRenderer.setScaleType(uGCVideoProcessor.mScaleType);
        }
        uGCVideoProcessor.mVideoProcessManager.setScaleType(uGCVideoProcessor.mScaleType);
    }

    public static /* synthetic */ void lambda$setOutputSize$4(UGCVideoProcessor uGCVideoProcessor, int i11, int i12, GLConstants.GLScaleType gLScaleType) {
        uGCVideoProcessor.mOutputWidth = i11;
        uGCVideoProcessor.mOutputHeight = i12;
        if (i11 > 0) {
            uGCVideoProcessor.mScaleType = gLScaleType;
        }
    }

    public static /* synthetic */ void lambda$setSpeedList$10(UGCVideoProcessor uGCVideoProcessor, List list) {
        if (uGCVideoProcessor.mSpeedProcessor == null) {
            uGCVideoProcessor.mSpeedProcessor = new SpeedProcessor();
        }
        LiteavLog.m76087i(uGCVideoProcessor.mTag, "==== setSpeedList ==== ");
        if (list == null) {
            uGCVideoProcessor.mSpeedProcessor.setSpeedList(null);
            return;
        }
        UGCDataReport.reportDAU(1019);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            TXVideoEditConstants.TXSpeed tXSpeed = (TXVideoEditConstants.TXSpeed) list.get(i11);
            TXVideoEditConstants.TXSpeed tXSpeed2 = new TXVideoEditConstants.TXSpeed();
            tXSpeed2.speedLevel = tXSpeed.speedLevel;
            tXSpeed2.startTime = tXSpeed.startTime;
            tXSpeed2.endTime = tXSpeed.endTime;
            arrayList.add(tXSpeed2);
        }
        uGCVideoProcessor.mSpeedProcessor.setSpeedList(arrayList);
    }

    public static /* synthetic */ void lambda$setSplitScreenList$3(UGCVideoProcessor uGCVideoProcessor, List list, int i11, int i12) {
        uGCVideoProcessor.mRectList = list;
        uGCVideoProcessor.setOutputSize(i11, i12, GLConstants.GLScaleType.FIT_CENTER);
    }

    public static /* synthetic */ void lambda$start$1(UGCVideoProcessor uGCVideoProcessor, boolean z11, UGCVideoEncoderJNI.EncoderType encoderType) {
        uGCVideoProcessor.mIsRecord = z11;
        uGCVideoProcessor.mUsingEncoderType = encoderType;
        uGCVideoProcessor.mFinalPts = -1L;
        uGCVideoProcessor.mSkipFrameCount = 0;
        uGCVideoProcessor.mHasFirstFrameProcessed = false;
        uGCVideoProcessor.mVideoProcessManager.setListener(new C35487c(uGCVideoProcessor, (byte) 0));
    }

    public static /* synthetic */ void lambda$unInitialize$0(UGCVideoProcessor uGCVideoProcessor) {
        uGCVideoProcessor.mFinalPts = -1L;
        PixelFrame pixelFrame = uGCVideoProcessor.mLastFrameOfReadFromSource;
        if (pixelFrame != null) {
            pixelFrame.release();
            uGCVideoProcessor.mLastFrameOfReadFromSource = null;
        }
        VideoRenderer videoRenderer = uGCVideoProcessor.mRenderer;
        if (videoRenderer != null) {
            videoRenderer.stop(false);
            uGCVideoProcessor.mRenderer = null;
        }
        uGCVideoProcessor.stopEncoder();
        PixelFrameRenderer pixelFrameRenderer = uGCVideoProcessor.mPreScaleRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            uGCVideoProcessor.mPreScaleRenderer = null;
        }
        uGCVideoProcessor.unInitVideoProcessor();
        uGCVideoProcessor.mVideoProcessManager.unInitialize();
        if (uGCVideoProcessor.mRenderThread != null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                uGCVideoProcessor.mRenderThread.quitSafely();
            } else {
                uGCVideoProcessor.mRenderThread.quit();
            }
            uGCVideoProcessor.mRenderThread = null;
        }
        uGCVideoProcessor.uninitializedEGL();
        synchronized (uGCVideoProcessor) {
            try {
                CustomHandler customHandler = uGCVideoProcessor.mVideoProcessHandler;
                if (customHandler != null) {
                    customHandler.quitLooper();
                    uGCVideoProcessor.mVideoProcessHandler = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void notifyPreviewComplete() {
        CustomHandler customHandler = this.mVideoProcessHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(this.onCompleteBroadcastRunnable);
            customHandler.post(this.onCompleteBroadcastRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompleteBroadcast() {
        if (this.mVideoProcessListener != null) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = 0;
            tXGenerateResult.descMsg = "";
            this.mVideoProcessListener.onComplete(tXGenerateResult);
        }
    }

    private PixelFrame preScale(PixelFrame pixelFrame) {
        int i11 = this.mOutputWidth;
        int i12 = this.mOutputHeight;
        EnumC34747l enumC34747l = this.mRotation;
        if (enumC34747l == EnumC34747l.ROTATION_90 || enumC34747l == EnumC34747l.ROTATION_270) {
            i12 = i11;
            i11 = i12;
        }
        if (this.mEGLCore == null || i11 <= 0 || i12 <= 0 || (pixelFrame.getWidth() == i11 && pixelFrame.getHeight() == i12)) {
            pixelFrame.retain();
            return pixelFrame;
        }
        if (this.mPreScaleRenderer == null) {
            this.mPreScaleRenderer = new PixelFrameRenderer(i11, i12);
        }
        this.mPreScaleRenderer.setOutputSize(i11, i12);
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(i11, i12);
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mPreScaleRenderer.renderFrame(pixelFrame, this.mScaleType, gLTextureObtain);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }

    private void processEndOfFrameRead() {
        UGCVideoEncodeController uGCVideoEncodeController;
        PixelFrame pixelFrame = this.mLastFrameOfReadFromSource;
        if (pixelFrame != null) {
            this.mFinalPts = pixelFrame.getTimestamp();
        }
        LiteavLog.m76087i(this.mTag, "final frame pts is " + this.mFinalPts + "  last progressed frame pts is " + this.mLastProcessFramePts);
        if (this.mLastProcessFramePts < this.mFinalPts) {
            return;
        }
        if (this.mIsRecord && (uGCVideoEncodeController = this.mVideoEncodeController) != null) {
            uGCVideoEncodeController.signalEndOfStream();
        }
        if (this.mIsRecord) {
            return;
        }
        notifyPreviewComplete();
    }

    private void processFrame() {
        if (this.mIsInit) {
            List<PixelFrame> nextVideoFrame = this.mUGCMediaListSource.readNextVideoFrame();
            if (nextVideoFrame == null || nextVideoFrame.isEmpty()) {
                processEndOfFrameRead();
                return;
            }
            if (!createProcessChainIfNeed(nextVideoFrame)) {
                PixelFrame.releasePixelFrames(nextVideoFrame);
                return;
            }
            if (isFilterFrameDueToSync(nextVideoFrame) || isFilterFrameDueToChangeFrameRate(nextVideoFrame)) {
                PixelFrame.releasePixelFrames(nextVideoFrame);
                if (this.mStatus == EnumC35485a.STARTED) {
                    sendMsgToVideoProcessHandler(101);
                    return;
                }
                return;
            }
            PixelFrame pixelFrameMergeFramesIfNeeded = mergeFramesIfNeeded(nextVideoFrame);
            if (pixelFrameMergeFramesIfNeeded == null) {
                PixelFrame.releasePixelFrames(nextVideoFrame);
                return;
            }
            PixelFrame pixelFrame = this.mLastFrameOfReadFromSource;
            if (pixelFrame != null) {
                pixelFrame.release();
            }
            PixelFrame pixelFramePreScale = preScale(pixelFrameMergeFramesIfNeeded);
            this.mLastFrameOfReadFromSource = pixelFramePreScale;
            this.mVideoProcessManager.processFrame(pixelFramePreScale);
            pixelFrameMergeFramesIfNeeded.release();
            PixelFrame.releasePixelFrames(nextVideoFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopEncoder() {
        UGCVideoEncodeController uGCVideoEncodeController = this.mVideoEncodeController;
        if (uGCVideoEncodeController == null) {
            return;
        }
        this.mFinalPts = -1L;
        uGCVideoEncodeController.signalEndOfStream();
        this.mVideoEncodeController.stop();
        this.mVideoEncodeController = null;
        if (this.mFrameRateFilter != null) {
            this.mFrameRateFilter = null;
        }
    }

    private void unInitVideoProcessor() {
        LiteavLog.m76087i(this.mTag, "uninitVideoProcessor: ");
        this.mVideoProcessManager.unInitFilter();
        UGCTransitionProcessor uGCTransitionProcessor = this.mUGCTransitionProcessor;
        if (uGCTransitionProcessor != null) {
            uGCTransitionProcessor.release();
            this.mUGCTransitionProcessor = null;
        }
        UGCCombineProcessor uGCCombineProcessor = this.mUGCCombineProcessor;
        if (uGCCombineProcessor != null) {
            uGCCombineProcessor.release();
            this.mUGCCombineProcessor = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPreScaleRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPreScaleRenderer = null;
        }
    }

    private void uninitializedEGL() {
        GLTexturePool gLTexturePool;
        LiteavLog.m76086i(this.mThrottlers.m76042a("uninitGL"), this.mTag, "uninitializedEGL", new Object[0]);
        if (EGLCore.makeCurrent(this.mEGLCore) && (gLTexturePool = this.mGLTexturePool) != null) {
            gLTexturePool.destroy();
        }
        TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener = this.mTXVideoCustomProcessListener;
        if (tXVideoCustomProcessListener != null) {
            tXVideoCustomProcessListener.onTextureDestroyed();
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public VideoEffectProcessor getEffectProcessor() {
        return this.mVideoProcessManager.getEffectProcessor();
    }

    public VideoTransitionProcessor getTransitionProcessor() {
        return this.mVideoProcessManager.getTransitionProcessor();
    }

    public WatermarkProcessor getWatermarkProcessor() {
        return this.mVideoProcessManager.getWatermarkProcessor();
    }

    public void initialize() {
        if (this.mIsInit) {
            return;
        }
        this.mIsInit = true;
        LiteavLog.m76087i(this.mTag, "initialize: ");
        HandlerThread handlerThread = new HandlerThread("VideoProcess_" + hashCode());
        handlerThread.start();
        synchronized (this) {
            this.mVideoProcessHandler = new CustomHandler(handlerThread.getLooper(), C35728he.m79222a(this));
        }
    }

    public void refreshOneFrame() {
        sendMsgToVideoProcessHandler(104);
    }

    public void seekTo(long j11) {
        removeMsgFromVideoProcessHandler(105);
        sendMsgToVideoProcessHandler(105);
    }

    public void setDisplayView(DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        LiteavLog.m76087i(this.mTag, "setDisplayView: displayTarget:" + displayTarget + "scaleType:" + gLScaleType);
        runOnVideoProcessHandler(RunnableC35735hl.m79229a(this, displayTarget, gLScaleType));
    }

    public void setEncodeParams(VideoEncodeParams videoEncodeParams) {
        LiteavLog.m76087i(this.mTag, "setEncodeParams: ".concat(String.valueOf(videoEncodeParams)));
        runOnVideoProcessHandler(RunnableC35718gv.m79212a(this, videoEncodeParams));
    }

    public void setRenderRotation(EnumC34747l enumC34747l) {
        LiteavLog.m76087i(this.mTag, "setRenderRotation: ".concat(String.valueOf(enumC34747l)));
        if (enumC34747l == null) {
            return;
        }
        runOnVideoProcessHandler(RunnableC35717gu.m79211a(this, enumC34747l));
        sendMsgToVideoProcessHandler(104);
    }

    public void setReverse(boolean z11) {
        this.mReverse = z11;
    }

    public void start(boolean z11, UGCVideoEncoderJNI.EncoderType encoderType) {
        LiteavLog.m76087i(this.mTag, "start: ".concat(String.valueOf(z11)));
        runOnVideoProcessHandler(RunnableC35730hg.m79224a(this, z11, encoderType));
        sendMsgToVideoProcessHandler(100);
        sendMsgToVideoProcessHandler(101);
    }

    public void stop() {
        LiteavLog.m76087i(this.mTag, "stop: ");
        removeMsgFromVideoProcessHandler(101);
        sendMsgToVideoProcessHandler(103);
        runOnVideoProcessHandler(RunnableC35731hh.m79225a(this));
    }

    public void unInitialize() {
        if (this.mIsInit) {
            this.mIsInit = false;
            LiteavLog.m76087i(this.mTag, "uninitialize");
            runOnVideoProcessHandler(RunnableC35729hf.m79223a(this));
        }
    }

    public UGCVideoProcessor(Context context, UGCMediaListSource uGCMediaListSource, UGCAVSyncer uGCAVSyncer, boolean z11) {
        this.mUGCMediaListSource = uGCMediaListSource;
        this.mUGCAVSyncer = uGCAVSyncer;
        this.mVideoProcessManager = new VideoProcessManager(context, z11);
    }

    private PixelFrame mergeFramesIfNeeded(List<PixelFrame> list) {
        if (list.size() > 1) {
            List<TXVideoEditConstants.TXAbsoluteRect> list2 = this.mRectList;
            if (list2 != null) {
                UGCCombineProcessor uGCCombineProcessor = this.mUGCCombineProcessor;
                if (uGCCombineProcessor == null) {
                    return null;
                }
                return uGCCombineProcessor.processFrame(list, list2);
            }
            UGCTransitionProcessor uGCTransitionProcessor = this.mUGCTransitionProcessor;
            if (uGCTransitionProcessor == null) {
                return null;
            }
            return uGCTransitionProcessor.processFrame(list, this.mTransitionType);
        }
        list.get(0).retain();
        return list.get(0);
    }

    public void setBeautyFilter(int i11, int i12) {
        runOnVideoProcessHandler(RunnableC35722gz.m79216a(this, i11, i12));
    }

    public void setCustomVideoProcessListener(TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        runOnVideoProcessHandler(RunnableC35726hc.m79220a(this, tXVideoCustomProcessListener));
    }

    public void setFilter(Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13) {
        runOnVideoProcessHandler(RunnableC35725hb.m79219a(this, bitmap, f11, bitmap2, f12, f13));
        sendMsgToVideoProcessHandler(104);
    }

    public void setFilteredFrameRate(int i11) {
        runOnVideoProcessHandler(RunnableC35732hi.m79226a(this, i11));
    }

    public void setOutputSize(int i11, int i12, GLConstants.GLScaleType gLScaleType) {
        runOnVideoProcessHandler(RunnableC35734hk.m79228a(this, i11, i12, gLScaleType));
    }

    public void setPictureTransition(int i11) {
        runOnVideoProcessHandler(RunnableC35720gx.m79214a(this, i11));
    }

    public void setProgressListener(VideoProcessListener videoProcessListener) {
        runOnVideoProcessHandler(RunnableC35727hd.m79221a(this, videoProcessListener));
    }

    public void setSpecialRatio(float f11) {
        runOnVideoProcessHandler(RunnableC35724ha.m79218a(this, f11));
        sendMsgToVideoProcessHandler(104);
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        runOnVideoProcessHandler(RunnableC35721gy.m79215a(this, list));
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i11, int i12) {
        runOnVideoProcessHandler(RunnableC35733hj.m79227a(this, list, i11, i12));
    }

    public void setVideoEncodedFrameListener(VideoEncodedFrameListener videoEncodedFrameListener) {
        runOnVideoProcessHandler(RunnableC35719gw.m79213a(this, videoEncodedFrameListener));
    }
}
