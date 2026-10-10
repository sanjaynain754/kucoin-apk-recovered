package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.HandlerC34758w;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.egl.C34880d;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.frame.C34890i;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C34907d;
import com.tencent.liteav.videobase.videobase.C34908e;
import com.tencent.liteav.videoproducer.encoder.C34965b;
import com.tencent.liteav.videoproducer.encoder.InterfaceC34968e;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class HardwareVideoEncoder2 {
    private EGLCore mEGLCore;
    private Surface mInputSurface;
    private long mNativeHandler;
    private final VideoEncodeParams mParams;
    private C34890i mPixelFrameRenderer;
    private HWEncoderServerConfig mServerConfig;
    private C34965b mSurfaceInputVideoEncoder;
    private String mTAG;
    private String mTraceId;
    private final Size mSurfaceSize = new Size(0, 0);
    private final AtomicBoolean mNeedRestart = new AtomicBoolean(false);
    private final Bundle mSessionStates = new Bundle();
    private final C34692b mThrottlers = new C34692b();
    private long mPreFrameTimeStamp = 0;
    private final InterfaceC34968e.a mVideoEncoderListener = new InterfaceC34968e.a() { // from class: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.1
        @Override // com.tencent.liteav.videoproducer.encoder.InterfaceC34968e.a
        /* JADX INFO: renamed from: a */
        public final void mo76771a() {
            HardwareVideoEncoder2.this.mNeedRestart.set(true);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.AbstractC34963b
        public final void onBitrateModeUpdated(VideoEncoderDef.BitrateMode bitrateMode) {
            HardwareVideoEncoder2 hardwareVideoEncoder2 = HardwareVideoEncoder2.this;
            hardwareVideoEncoder2.nativeOnBitrateModeUpdated(hardwareVideoEncoder2.mNativeHandler, bitrateMode.mValue);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.AbstractC34963b
        public final void onEncodedFail(C34908e.a aVar) {
            C34908e.a aVar2 = C34908e.a.ERR_CODE_NONE;
            HardwareVideoEncoder2.this.notifyEncodeFail();
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.AbstractC34963b
        public final synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z11) {
            if (HardwareVideoEncoder2.this.mNativeHandler == 0 || z11) {
                LiteavLog.m76080d(HardwareVideoEncoder2.this.mTAG, "onEncodedNAL mNativeHandler=%d,isEos=%b", Long.valueOf(HardwareVideoEncoder2.this.mNativeHandler), Boolean.valueOf(z11));
                return;
            }
            HardwareVideoEncoder2 hardwareVideoEncoder2 = HardwareVideoEncoder2.this;
            long j11 = hardwareVideoEncoder2.mNativeHandler;
            ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i11 = encodedVideoFrame.nalType.mValue;
            int i12 = encodedVideoFrame.profileType.mValue;
            int i13 = encodedVideoFrame.codecType.mValue;
            int i14 = encodedVideoFrame.rotation;
            long j12 = encodedVideoFrame.dts;
            long j13 = encodedVideoFrame.pts;
            long j14 = encodedVideoFrame.gopIndex;
            long j15 = encodedVideoFrame.gopFrameIndex;
            long j16 = encodedVideoFrame.frameIndex;
            long j17 = encodedVideoFrame.refFrameIndex;
            int i15 = encodedVideoFrame.width;
            int i16 = encodedVideoFrame.height;
            Integer num = encodedVideoFrame.svcInfo;
            hardwareVideoEncoder2.nativeOnEncodedNAL(j11, encodedVideoFrame, byteBuffer, i11, i12, i13, i14, j12, j13, j14, j15, j16, j17, i15, i16, num != null, num != null ? num.intValue() : 0);
        }
    };

    private boolean initOpenGLComponents(Object obj, Surface surface) {
        if (surface == null) {
            LiteavLog.m76092w(this.mThrottlers.m76042a("NoSurface"), this.mTAG, "init opengl: surface is null.", new Object[0]);
            return false;
        }
        LiteavLog.m76078d(this.mThrottlers.m76042a("initGL"), this.mTAG, "initOpenGLComponents", new Object[0]);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            Size size = this.mSurfaceSize;
            eGLCore.initialize(obj, surface, size.width, size.height);
            Size size2 = this.mSurfaceSize;
            this.mPixelFrameRenderer = new C34890i(size2.width, size2.height);
            return true;
        } catch (C34880d e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("initGLError"), this.mTAG, "create EGLCore failed. error = ".concat(String.valueOf("VideoEncode: create EGLCore failed, EGLCode:" + e11.mErrorCode + " message:" + e11.getMessage())), e11);
            notifyStartEncodedFail();
            this.mEGLCore = null;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnBitrateModeUpdated(long j11, int i11);

    private native void nativeOnEncodedFail(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnEncodedNAL(long j11, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, long j12, long j13, long j14, long j15, long j16, long j17, int i15, int i16, boolean z11, int i17);

    private native void nativeOnStartEncodedFail(long j11);

    public synchronized void notifyEncodeFail() {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnEncodedFail(j11);
        }
    }

    public synchronized void notifyStartEncodedFail() {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeOnStartEncodedFail(j11);
        }
    }

    public synchronized void release() {
        LiteavLog.m76079d(this.mTAG, "release");
        this.mNativeHandler = 0L;
        stop();
    }

    public static PixelFrame createPixelFrameByTexture(int i11, int i12, int i13, int i14, long j11, int i15, boolean z11, boolean z12, int i16, Object obj) {
        int i17 = GLConstants.EnumC34866a.TEXTURE_2D.mValue;
        GLConstants.PixelFormatType.RGBA.getValue();
        PixelFrame pixelFrame = new PixelFrame(i11, i12, 0, i13, i14);
        pixelFrame.setMirrorHorizontal(z11);
        pixelFrame.setMirrorVertical(z12);
        pixelFrame.setTextureId(i16);
        pixelFrame.setGLContext(obj);
        pixelFrame.setRotation(EnumC34747l.m76131a(i15));
        pixelFrame.setTimestamp(j11);
        return pixelFrame;
    }

    private void drawFrameToInputSurface(PixelFrame pixelFrame) {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
            PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
            if (pixelFrame2.getRotation() == EnumC34747l.ROTATION_90 || pixelFrame2.getRotation() == EnumC34747l.ROTATION_270) {
                pixelFrame2.setMirrorHorizontal(!pixelFrame2.isMirrorHorizontal());
            } else {
                pixelFrame2.setMirrorVertical(!pixelFrame2.isMirrorVertical());
            }
            Size size = this.mSurfaceSize;
            OpenGlUtils.glViewport(0, 0, size.width, size.height);
            C34890i c34890i = this.mPixelFrameRenderer;
            if (c34890i != null) {
                c34890i.m76551a(pixelFrame2, GLConstants.GLScaleType.CENTER_CROP, (AbstractC34885d) null);
            }
            C34965b c34965b = this.mSurfaceInputVideoEncoder;
            long timestamp = pixelFrame2.getTimestamp();
            if (c34965b.f74754i.isEmpty()) {
                c34965b.f74755j.set(SystemClock.elapsedRealtime());
            }
            c34965b.f74754i.addLast(Long.valueOf(timestamp));
            c34965b.f74748c.sendEmptyMessageDelayed(10, 10L);
            if (pixelFrame2.getTimestamp() < this.mPreFrameTimeStamp) {
                LiteavLog.m76083e(this.mTAG, "timestamp is not increase. pre: " + this.mPreFrameTimeStamp + ", cur: " + pixelFrame2.getTimestamp());
            }
            this.mPreFrameTimeStamp = pixelFrame2.getTimestamp();
            this.mEGLCore.setPresentationTime(TimeUnit.MILLISECONDS.toNanos(pixelFrame2.getTimestamp()));
            this.mEGLCore.swapBuffers();
        } catch (C34880d e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("EncodeFrameError"), this.mTAG, "makeCurrent failed. error = ".concat(String.valueOf("VideoEncode: swapBuffer error, EGLCode:" + e11.mErrorCode + " message:" + e11.getMessage())), e11);
            notifyEncodeFail();
        }
    }

    private ServerVideoProducerConfig getServerVideoProducerConfig(HWEncoderServerConfig hWEncoderServerConfig) {
        ServerVideoProducerConfig serverVideoProducerConfig = new ServerVideoProducerConfig();
        serverVideoProducerConfig.setHardwareEncodeType(hWEncoderServerConfig.getHardwareEncodeType());
        serverVideoProducerConfig.setHardwareEncoderHighProfileEnable(hWEncoderServerConfig.getHardwareEncoderHighProfileEnable());
        serverVideoProducerConfig.setHardwareEncoderHighProfileSupport(hWEncoderServerConfig.getHardwareEncoderHighProfileSupport());
        Boolean boolIsHardwareEncoderBitrateModeCBRSupported = hWEncoderServerConfig.isHardwareEncoderBitrateModeCBRSupported();
        if (boolIsHardwareEncoderBitrateModeCBRSupported != null) {
            serverVideoProducerConfig.setHardwareEncoderBitrateModeCBRSupported(boolIsHardwareEncoderBitrateModeCBRSupported.booleanValue());
        }
        return serverVideoProducerConfig;
    }

    private boolean restart() {
        LiteavLog.m76079d(this.mTAG, "reStart");
        stop();
        return start();
    }

    private boolean start() {
        if (this.mSurfaceInputVideoEncoder != null) {
            return this.mInputSurface != null;
        }
        LiteavLog.m76088i(this.mTAG, "Start hw video encoder. %s", this.mParams);
        C34965b c34965b = new C34965b(this.mSessionStates, new C34907d(), this.mTraceId);
        this.mSurfaceInputVideoEncoder = c34965b;
        c34965b.f74748c = new CustomHandler(Looper.myLooper()) { // from class: com.tencent.liteav.videoproducer.encoder.b.1
            public AnonymousClass1(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 10) {
                    C34965b.this.m76768c();
                }
            }
        };
        this.mSurfaceInputVideoEncoder.m76766a(getServerVideoProducerConfig(this.mServerConfig));
        C34965b c34965b2 = this.mSurfaceInputVideoEncoder;
        VideoEncodeParams videoEncodeParams = this.mParams;
        InterfaceC34968e.a aVar = this.mVideoEncoderListener;
        LiteavLog.m76079d(c34965b2.f74746a, "start");
        c34965b2.f74750e = aVar;
        Surface surfaceM76762a = c34965b2.m76762a(videoEncodeParams);
        LiteavLog.m76087i(c34965b2.f74746a, "startCodecInternal success");
        Size size = new Size(720, 1280);
        VideoEncodeParams videoEncodeParams2 = c34965b2.f74751f;
        if (videoEncodeParams2 != null) {
            size.set(videoEncodeParams2.width, videoEncodeParams2.height);
        }
        Pair pair = new Pair(surfaceM76762a, size);
        this.mInputSurface = (Surface) pair.first;
        this.mSurfaceSize.set((Size) pair.second);
        if (this.mInputSurface != null) {
            return true;
        }
        notifyStartEncodedFail();
        return false;
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (!this.mNeedRestart.getAndSet(false) || restart()) {
            if (this.mSurfaceInputVideoEncoder != null || start()) {
                pixelFrame.getGLContext();
                if (this.mEGLCore != null || initOpenGLComponents(pixelFrame.getGLContext(), this.mInputSurface)) {
                    this.mSurfaceInputVideoEncoder.m76768c();
                    drawFrameToInputSurface(pixelFrame);
                }
            }
        }
    }

    public void requestKeyFrame() {
        C34965b c34965b = this.mSurfaceInputVideoEncoder;
        if (c34965b != null) {
            c34965b.m76769d();
        }
    }

    public void setBitrate(int i11) {
        MediaCodec mediaCodec;
        LiteavLog.m76087i(this.mTAG, "SetBitrate ".concat(String.valueOf(i11)));
        this.mParams.bitrate = i11;
        C34965b c34965b = this.mSurfaceInputVideoEncoder;
        if (c34965b == null) {
            return;
        }
        VideoEncodeParams videoEncodeParams = c34965b.f74751f;
        if (videoEncodeParams == null) {
            LiteavLog.m76093w(c34965b.f74746a, "encoder not started yet. set bitrate to " + i11 + " kbps will not take effect.");
            return;
        }
        if (videoEncodeParams.bitrate != i11) {
            LiteavLog.m76087i(c34965b.f74746a, "set bitrate to " + i11 + " kbps");
            boolean z11 = false;
            if (i11 < c34965b.f74751f.bitrate) {
                if (c34965b.f74747b.getBoolean("need_restart_when_down_bitrate", false)) {
                    z11 = true;
                } else {
                    c34965b.m76764a(i11);
                }
            }
            c34965b.f74751f.bitrate = i11;
            if (LiteavSystemInfo.getSystemOSVersionInt() < 19 || (mediaCodec = c34965b.f74749d) == null) {
                return;
            }
            if (!z11) {
                c34965b.m76765a(mediaCodec, i11);
                return;
            }
            c34965b.f74748c.removeCallbacks(c34965b.f74756k);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c34965b.f74752g;
            if (jElapsedRealtime >= TimeUnit.SECONDS.toMillis(2L)) {
                c34965b.f74756k.run();
            } else {
                c34965b.f74748c.postDelayed(c34965b.f74756k, 2000 - jElapsedRealtime);
            }
        }
    }

    public void setHWEncoderServerConfig(HWEncoderServerConfig hWEncoderServerConfig) {
        this.mServerConfig = hWEncoderServerConfig;
        C34965b c34965b = this.mSurfaceInputVideoEncoder;
        if (c34965b != null) {
            c34965b.m76766a(getServerVideoProducerConfig(hWEncoderServerConfig));
        }
    }

    public void signalEndOfStream() {
        final C34965b c34965b = this.mSurfaceInputVideoEncoder;
        if (c34965b != null) {
            LiteavLog.m76087i(c34965b.f74746a, "signalEndOfStream");
            MediaCodec mediaCodec = c34965b.f74749d;
            if (mediaCodec != null) {
                try {
                    mediaCodec.signalEndOfInputStream();
                } catch (Throwable th2) {
                    LiteavLog.m76084e(c34965b.f74746a, "signalEndOfStream failed.", th2);
                }
            }
            if (c34965b.f74753h == null) {
                HandlerC34758w handlerC34758w = new HandlerC34758w(Looper.myLooper(), new HandlerC34758w.a(c34965b) { // from class: com.tencent.liteav.videoproducer.encoder.d

                    /* JADX INFO: renamed from: a */
                    private final C34965b f74774a;

                    @Override // com.tencent.liteav.base.util.HandlerC34758w.a
                    public final void onTimeout() {
                        this.f74774a.m76768c();
                    }

                    {
                        this.f74774a = c34965b;
                    }
                });
                c34965b.f74753h = handlerC34758w;
                handlerC34758w.m76148a(30);
            }
        }
    }

    public void uninitOpenGLComponents() {
        if (this.mEGLCore == null) {
            return;
        }
        LiteavLog.m76078d(this.mThrottlers.m76042a("uninitGL"), this.mTAG, "uninitOpenGLComponents", new Object[0]);
        try {
            this.mEGLCore.makeCurrent();
            C34890i c34890i = this.mPixelFrameRenderer;
            if (c34890i != null) {
                c34890i.m76549a();
                this.mPixelFrameRenderer = null;
            }
        } catch (C34880d e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("unintGLError"), this.mTAG, "makeCurrent failed.", e11);
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public HardwareVideoEncoder2(long j11, String str, VideoEncodeParams videoEncodeParams) {
        this.mTraceId = str;
        this.mTAG = str + "HardwareVideoEncoder2_" + hashCode();
        this.mNativeHandler = j11;
        this.mParams = videoEncodeParams;
    }

    public static Object getCurrentContext() {
        return OpenGlUtils.getCurrentContext();
    }

    public static boolean isInUIThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private void stop() {
        uninitOpenGLComponents();
        Surface surface = this.mInputSurface;
        if (surface != null) {
            surface.release();
            this.mInputSurface = null;
        }
        C34965b c34965b = this.mSurfaceInputVideoEncoder;
        if (c34965b != null) {
            LiteavLog.m76087i(c34965b.f74746a, InterfaceC33730j9.f70350a);
            c34965b.m76767b();
            c34965b.m76763a();
            this.mSurfaceInputVideoEncoder.m76763a();
            this.mSurfaceInputVideoEncoder = null;
        }
    }
}
