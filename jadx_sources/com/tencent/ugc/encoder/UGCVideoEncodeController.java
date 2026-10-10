package com.tencent.ugc.encoder;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.BlockingFrameQueue;
import com.tencent.ugc.videobase.utils.PixelFrameQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class UGCVideoEncodeController {
    private static final PixelFrame EOS_FRAME = new PixelFrame();
    private static final int FRAME_QUEUE_SIZE = 1;
    private static final int MAX_ENCODE_COST_TIME_PER_FRAME = 5000;
    private static final int MAX_ENCODING_FRAME_NUMBER = 30;
    private static final int MAX_WAIT_TIME_MS = 2000;
    private static final int SCHEDULE_ENCODE_TASK_DELAY_TIME_MS = 3;
    private static final int THREAD_KEEP_ALIVE_TIME_IN_SECOND = 15;
    private VideoEncodeParams mEncodeParams;
    private final AtomicReference<UGCVideoEncoderJNI.VideoEncoderError> mEncoderErrorType;
    private EnumC35648a mEncoderStats;
    private final UGCVideoEncoderJNI.EncoderType mExceptEncodeType;
    private final Map<Long, Long> mFrameDeliverToEncoderTimeMap;
    private boolean mHasEncodeFailureNotified;
    private final PixelFrameQueue mPendingEncodeFrameQueue;
    private final C34748m mSequenceTaskRunner;
    private final String mTag;
    private final C34692b mThrottlers;
    private UGCVideoEncoderJNI.UGCVideoEncoderListener mUGCEncoderControllerListener;
    private UGCVideoEncoderJNI mVideoEncoder;
    private final UGCVideoEncoderJNI.UGCVideoEncoderListener mVideoEncoderListener;

    /* JADX INFO: renamed from: com.tencent.ugc.encoder.UGCVideoEncodeController$1 */
    public class C356471 implements UGCVideoEncoderJNI.UGCVideoEncoderListener {
        public C356471() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m79142a(C356471 c356471, EncodedVideoFrame encodedVideoFrame) {
            if (encodedVideoFrame.isEosFrame) {
                LiteavLog.m76087i(UGCVideoEncodeController.this.mTag, "got eos");
            }
            if (UGCVideoEncodeController.this.mUGCEncoderControllerListener != null) {
                UGCVideoEncodeController.this.mUGCEncoderControllerListener.onEncodedNAL(encodedVideoFrame);
            }
            UGCVideoEncodeController.this.removeEarlierFrameFromFrameDeliverToEncoderTimeMap(encodedVideoFrame.pts);
            if (!encodedVideoFrame.isEosFrame || UGCVideoEncodeController.this.mFrameDeliverToEncoderTimeMap.isEmpty()) {
                return;
            }
            LiteavLog.m76083e(UGCVideoEncodeController.this.mTag, "got eos frame with unencoded frames left, causing an error");
            UGCVideoEncodeController.this.mEncoderErrorType.set(UGCVideoEncoderJNI.VideoEncoderError.ENCODE_FAILED);
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedFail(UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
            LiteavLog.m76082e(UGCVideoEncodeController.this.mThrottlers.m76042a("onEncodedFail"), UGCVideoEncodeController.this.mTag, "on encoded fail. type is ".concat(String.valueOf(videoEncoderError)), new Object[0]);
            UGCVideoEncodeController.this.mEncoderErrorType.set(videoEncoderError);
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame) {
            if (encodedVideoFrame == null) {
                LiteavLog.m76078d(UGCVideoEncodeController.this.mThrottlers.m76042a("onEncodedNAL"), UGCVideoEncodeController.this.mTag, "on encoded frame is null.", new Object[0]);
            } else {
                UGCVideoEncodeController.this.mSequenceTaskRunner.mo76133a(RunnableC35656h.m79150a(this, encodedVideoFrame));
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.encoder.UGCVideoEncodeController$a */
    public enum EnumC35648a {
        STOPED,
        ENCODING,
        EOS_SENDED
    }

    private boolean createEncoder() {
        PixelFrame pixelFramePeek = this.mPendingEncodeFrameQueue.peek();
        if (pixelFramePeek == null) {
            return false;
        }
        this.mVideoEncoder = new UGCVideoEncoderJNI();
        this.mEncodeParams.colorRange = pixelFramePeek.getColorRange();
        this.mEncodeParams.colorSpace = pixelFramePeek.getColorSpace();
        this.mVideoEncoder.start(this.mExceptEncodeType, this.mEncodeParams, this.mVideoEncoderListener);
        return true;
    }

    private void destroyEncoder() {
        UGCVideoEncoderJNI uGCVideoEncoderJNI = this.mVideoEncoder;
        if (uGCVideoEncoderJNI != null) {
            uGCVideoEncoderJNI.stopSync(2000L);
            this.mVideoEncoder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encodeFrameInternal() {
        if (this.mEncoderStats == EnumC35648a.STOPED) {
            this.mPendingEncodeFrameQueue.evictAll();
            return;
        }
        if ((this.mVideoEncoder == null && !createEncoder()) || hasEncoderError()) {
            this.mPendingEncodeFrameQueue.evictAll();
            notifyEncodedFail(this.mEncoderErrorType.get());
            return;
        }
        EnumC35648a enumC35648a = this.mEncoderStats;
        EnumC35648a enumC35648a2 = EnumC35648a.EOS_SENDED;
        if (enumC35648a == enumC35648a2) {
            this.mPendingEncodeFrameQueue.evictAll();
            this.mSequenceTaskRunner.m76136b(RunnableC35653e.m79147a(this), 3L);
            return;
        }
        if (this.mVideoEncoder.isInputQueueFull()) {
            this.mSequenceTaskRunner.m76136b(RunnableC35654f.m79148a(this), 3L);
            return;
        }
        PixelFrame pixelFramePoll = this.mPendingEncodeFrameQueue.poll();
        if (pixelFramePoll == null) {
            return;
        }
        this.mFrameDeliverToEncoderTimeMap.put(Long.valueOf(pixelFramePoll.getTimestamp()), Long.valueOf(SystemClock.elapsedRealtime()));
        if (pixelFramePoll != EOS_FRAME) {
            this.mVideoEncoder.encodeFrame(pixelFramePoll);
            pixelFramePoll.release();
        } else {
            this.mVideoEncoder.signalEndOfStream();
            this.mEncoderStats = enumC35648a2;
            this.mSequenceTaskRunner.m76136b(RunnableC35655g.m79149a(this), 3L);
        }
    }

    private long getEarliestTimeFromFrameDeliverToEncoderTimeMap() {
        Iterator<Long> it = this.mFrameDeliverToEncoderTimeMap.values().iterator();
        long j11 = Long.MAX_VALUE;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue < j11) {
                j11 = jLongValue;
            }
        }
        return j11;
    }

    private boolean hasEncoderError() {
        if (this.mEncoderErrorType.get() != UGCVideoEncoderJNI.VideoEncoderError.SUCCESS) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("hasEncoderError"), this.mTag, "encoder error or encoder need restart", new Object[0]);
            return true;
        }
        long earliestTimeFromFrameDeliverToEncoderTimeMap = getEarliestTimeFromFrameDeliverToEncoderTimeMap();
        if (earliestTimeFromFrameDeliverToEncoderTimeMap != 0 && SystemClock.elapsedRealtime() - earliestTimeFromFrameDeliverToEncoderTimeMap > 5000) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("hasEncoderError"), this.mTag, "encoder output frame is outTime", new Object[0]);
            this.mEncoderErrorType.set(UGCVideoEncoderJNI.VideoEncoderError.ENCODER_THREAD_STUCK);
            return true;
        }
        if (this.mFrameDeliverToEncoderTimeMap.size() <= 30) {
            return false;
        }
        LiteavLog.m76082e(this.mThrottlers.m76042a("isEncoderError"), this.mTag, "encoding frame is too many", new Object[0]);
        this.mEncoderErrorType.set(UGCVideoEncoderJNI.VideoEncoderError.ENCODER_THREAD_STUCK);
        return true;
    }

    public static /* synthetic */ void lambda$start$0(UGCVideoEncodeController uGCVideoEncodeController, VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        if (uGCVideoEncodeController.mVideoEncoder != null) {
            LiteavLog.m76086i(uGCVideoEncodeController.mThrottlers.m76042a("start"), uGCVideoEncodeController.mTag, "VideoEncoder is started", new Object[0]);
            return;
        }
        uGCVideoEncodeController.mEncodeParams = new VideoEncodeParams(videoEncodeParams);
        uGCVideoEncodeController.mUGCEncoderControllerListener = uGCVideoEncoderListener;
        uGCVideoEncodeController.mEncoderStats = EnumC35648a.ENCODING;
    }

    public static /* synthetic */ void lambda$stop$1(UGCVideoEncodeController uGCVideoEncodeController) {
        uGCVideoEncodeController.mEncoderErrorType.set(UGCVideoEncoderJNI.VideoEncoderError.SUCCESS);
        uGCVideoEncodeController.mFrameDeliverToEncoderTimeMap.clear();
        uGCVideoEncodeController.mUGCEncoderControllerListener = null;
        uGCVideoEncodeController.mEncodeParams = null;
        uGCVideoEncodeController.mHasEncodeFailureNotified = false;
        uGCVideoEncodeController.mEncoderStats = EnumC35648a.STOPED;
        uGCVideoEncodeController.mPendingEncodeFrameQueue.evictAll();
        uGCVideoEncodeController.destroyEncoder();
    }

    private void notifyEncodedFail(UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
        if (this.mHasEncodeFailureNotified) {
            return;
        }
        UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener = this.mUGCEncoderControllerListener;
        if (uGCVideoEncoderListener != null) {
            uGCVideoEncoderListener.onEncodedFail(videoEncoderError);
        }
        this.mHasEncodeFailureNotified = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEarlierFrameFromFrameDeliverToEncoderTimeMap(long j11) {
        Iterator<Map.Entry<Long, Long>> it = this.mFrameDeliverToEncoderTimeMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() <= j11) {
                it.remove();
            }
        }
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (pixelFrame.getGLContext() != null) {
            GLES20.glFinish();
        }
        this.mPendingEncodeFrameQueue.push(pixelFrame);
        this.mSequenceTaskRunner.mo76133a(RunnableC35651c.m79145a(this));
    }

    public void signalEndOfStream() {
        LiteavLog.m76086i(this.mThrottlers.m76042a("signalEndOfStream"), this.mTag, "signalEndOfStream", new Object[0]);
        this.mPendingEncodeFrameQueue.push(EOS_FRAME);
        this.mSequenceTaskRunner.mo76133a(RunnableC35652d.m79146a(this));
    }

    public void start(VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        LiteavLog.m76086i(this.mThrottlers.m76042a("start"), this.mTag, "start", new Object[0]);
        this.mSequenceTaskRunner.mo76133a(RunnableC35649a.m79143a(this, videoEncodeParams, uGCVideoEncoderListener));
    }

    public void stop() {
        LiteavLog.m76086i(this.mThrottlers.m76042a(InterfaceC33730j9.f70350a), this.mTag, InterfaceC33730j9.f70350a, new Object[0]);
        this.mSequenceTaskRunner.mo76133a(RunnableC35650b.m79144a(this));
    }

    public UGCVideoEncodeController(UGCVideoEncoderJNI.EncoderType encoderType) {
        String str = "UGCVideoEncodeController_" + hashCode();
        this.mTag = str;
        this.mEncoderErrorType = new AtomicReference<>(UGCVideoEncoderJNI.VideoEncoderError.SUCCESS);
        this.mFrameDeliverToEncoderTimeMap = new HashMap();
        this.mHasEncodeFailureNotified = false;
        this.mEncoderStats = EnumC35648a.STOPED;
        this.mVideoEncoderListener = new C356471();
        LiteavLog.m76087i(str, "UGCVideoEncodeController construct encoderType = ".concat(String.valueOf(encoderType)));
        this.mThrottlers = new C34692b();
        this.mExceptEncodeType = encoderType;
        this.mSequenceTaskRunner = new C34748m(15, str);
        this.mPendingEncodeFrameQueue = new BlockingFrameQueue(1);
    }
}
