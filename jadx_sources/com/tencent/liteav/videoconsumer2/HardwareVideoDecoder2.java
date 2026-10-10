package com.tencent.liteav.videoconsumer2;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.common.MediaCodecAbility;
import com.tencent.liteav.videobase.utils.C34896b;
import com.tencent.liteav.videobase.utils.C34898d;
import com.tencent.liteav.videoconsumer.p138a.C34910a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class HardwareVideoDecoder2 implements SurfaceTexture.OnFrameAvailableListener {
    private static final int DRAIN_ERROR = -1;
    private static final int DRAIN_SUCCESS = 0;
    private static final int DRAIN_SUCCESS_MEET_END_OF_STREAM = 1;
    private static final int INVALID_COLOR_FORMAT = 0;
    private int mCodedHeight;
    private int mCodedWidth;
    private Surface mExternalSurface;
    private boolean mIsHevc;
    private boolean mIsRealTime;
    private boolean mIsStarted;
    private long mNativeVideoDecoderImplAndroid;
    private Surface mOutputSurface;
    private SurfaceTexture mSurfaceTexture;
    private final String mTAG;
    private boolean mUseAsyncMode;
    private boolean mUseByteBuffer;
    private boolean mUseSoftwareDecoder;
    private final C34692b mThrottlers = new C34692b();
    private MediaCodec mMediaCodec = null;
    private final Queue<Integer> mInputBufferQueue = new LinkedList();
    private final Queue<Pair<Integer, MediaCodec.BufferInfo>> mOutputBufferQueue = new LinkedList();
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = false;
    private final C34910a mSPSModifier = new C34910a();
    private long mLastPresentationTimeUs = 0;

    private boolean configureDecoder(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface) {
        try {
            mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            mediaCodec.setVideoScalingMode(1);
            mediaCodec.start();
            LiteavLog.m76088i(this.mTAG, "Start MediaCodec(%s) success.", mediaCodec.getName());
            return true;
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.mTAG, "Configure MediaCodec failed: ", th2);
            return false;
        }
    }

    private int drainDecodedFrameSyncMode() {
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBuffer;
        for (int i11 = 0; i11 < 3 && (iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer((bufferInfo = new MediaCodec.BufferInfo()), TimeUnit.MILLISECONDS.toMicros(10L))) != -1; i11++) {
            if (iDequeueOutputBuffer != -3) {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer < 0) {
                        LiteavLog.m76080d(this.mTAG, "dequeueOutputBuffer get invalid index: %d", Integer.valueOf(iDequeueOutputBuffer));
                        break;
                    }
                    this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
                    if ((bufferInfo.flags & 4) != 0) {
                        LiteavLog.m76087i(this.mTAG, "meet end of stream.");
                        this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                        return 1;
                    }
                    int iHandleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(iDequeueOutputBuffer, bufferInfo) : 0;
                    this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                    if (this.mExternalSurface != null) {
                        long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                        long j11 = this.mNativeVideoDecoderImplAndroid;
                        if (j11 != 0) {
                            nativeOnDecodedFrameWithSurface(j11, millis);
                        }
                    }
                    return iHandleOutputBuffer;
                }
                outputFormatChange();
            } else {
                LiteavLog.m76087i(this.mTAG, "on output buffers changed");
            }
        }
        return -1;
    }

    private byte[] getSpsData(byte[] bArr, int[] iArr) {
        int nextNALHeaderPos = 0;
        while (nextNALHeaderPos + 4 < bArr.length && (nextNALHeaderPos = EncodedVideoFrame.getNextNALHeaderPos(nextNALHeaderPos, ByteBuffer.wrap(bArr))) >= 0) {
            if ((bArr[nextNALHeaderPos] & 31) == 7) {
                iArr[0] = nextNALHeaderPos;
                break;
            }
        }
        int i11 = iArr[0];
        if (i11 < 0) {
            return null;
        }
        int length = bArr.length - i11;
        while (true) {
            int i12 = i11 + 3;
            if (i12 < bArr.length) {
                byte b11 = bArr[i11];
                if ((b11 == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 1) || (b11 == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 0 && bArr[i12] == 1)) {
                    length = i11 - iArr[0];
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, iArr[0], bArr2, 0, length);
        return bArr2;
    }

    private int handleOutputBuffer(int i11, MediaCodec.BufferInfo bufferInfo) throws Throwable {
        Throwable th2;
        int value;
        synchronized (this) {
            try {
                try {
                    ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(i11);
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    outputBuffer.rewind();
                    MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
                    int integer = outputFormat.getInteger("color-format");
                    if (integer == 19) {
                        try {
                            value = GLConstants.PixelFormatType.I420.getValue();
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        if (integer != 21) {
                            LiteavLog.m76083e(this.mTAG, "Unsupported color format:".concat(String.valueOf(integer)));
                            handleDecoderError(6);
                            return -1;
                        }
                        value = GLConstants.PixelFormatType.NV12.getValue();
                    }
                    int i12 = value;
                    int integer2 = outputFormat.getInteger("width");
                    int integer3 = outputFormat.getInteger("height");
                    int iAbs = (outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-left")) ? Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1 : integer2;
                    int iAbs2 = (outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) ? Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1 : integer3;
                    if (outputFormat.containsKey("stride")) {
                        integer2 = outputFormat.getInteger("stride");
                    }
                    int i13 = integer2;
                    if (outputFormat.containsKey("slice-height")) {
                        integer3 = outputFormat.getInteger("slice-height");
                    }
                    int i14 = integer3;
                    long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                    long j11 = this.mNativeVideoDecoderImplAndroid;
                    if (j11 != 0) {
                        nativeOnByteBuffer(j11, i12, outputBuffer, bufferInfo.size, iAbs, iAbs2, i13, i14, millis);
                    }
                    return 0;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    private boolean initializeSurface(int i11) {
        synchronized (this) {
            try {
                this.mSurfaceTexture = new SurfaceTexture(i11);
                this.mOutputSurface = new Surface(this.mSurfaceTexture);
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
            } catch (Surface.OutOfResourcesException e11) {
                LiteavLog.m76084e(this.mTAG, "Initialize surface failed: ", e11);
                return false;
            }
        }
        LiteavLog.m76087i(this.mTAG, "Initialize surface ok.");
        return true;
    }

    private native void nativeOnByteBuffer(long j11, int i11, ByteBuffer byteBuffer, int i12, int i13, int i14, int i15, int i16, long j12);

    private native void nativeOnDecodedFrameFailed(long j11, int i11);

    private native void nativeOnDecodedFrameWithSurface(long j11, long j12);

    private native void nativeOnFrameAvailable(long j11, long j12);

    private native void nativeOnInputBufferAvailable(long j11);

    private native void nativeOnOutputBufferAvailable(long j11);

    private int startInternal() {
        Surface surface;
        int i11;
        try {
            String str = this.mIsHevc ? "video/hevc" : "video/avc";
            MediaCodec mediaCodecCreateMediaCodecInternal = createMediaCodecInternal(this.mUseSoftwareDecoder, str);
            this.mMediaCodec = mediaCodecCreateMediaCodecInternal;
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecCreateMediaCodecInternal.getCodecInfo().getCapabilitiesForType(str);
            int i12 = this.mCodedWidth;
            if (i12 > 0 && (i11 = this.mCodedHeight) > 0 && !isResolutionSupported(capabilitiesForType, i12, i11)) {
                return 18;
            }
            C34896b c34896b = new C34896b();
            c34896b.f74292c = str;
            c34896b.f74290a = this.mCodedWidth;
            c34896b.f74291b = this.mCodedHeight;
            c34896b.f74294e = capabilitiesForType;
            c34896b.f74293d = this.mIsRealTime;
            MediaFormat mediaFormatM76556a = c34896b.m76556a();
            if (this.mUseByteBuffer) {
                int supportedByteBufferColorFormat = getSupportedByteBufferColorFormat(capabilitiesForType);
                if (supportedByteBufferColorFormat == 0) {
                    return 6;
                }
                mediaFormatM76556a.setInteger("color-format", supportedByteBufferColorFormat);
            }
            if (this.mUseAsyncMode) {
                setCallback(this.mMediaCodec);
            }
            LiteavLog.m76087i(this.mTAG, "Start with media format: ".concat(String.valueOf(mediaFormatM76556a)));
            if (this.mUseByteBuffer) {
                surface = null;
            } else {
                surface = this.mExternalSurface;
                if (surface == null) {
                    surface = this.mOutputSurface;
                }
            }
            if (!configureDecoder(this.mMediaCodec, mediaFormatM76556a, surface)) {
                return 1;
            }
            this.mIsStarted = true;
            return 0;
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.mTAG, "Start MediaCodec failed: ", th2);
            return 1;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            if (surfaceTexture2 != null && surfaceTexture2 == surfaceTexture) {
                long millis = TimeUnit.MICROSECONDS.toMillis(this.mLastPresentationTimeUs);
                long j11 = this.mNativeVideoDecoderImplAndroid;
                if (j11 != 0) {
                    nativeOnFrameAvailable(j11, millis);
                }
            }
        }
    }

    public int start(int i11) {
        if (this.mIsStarted) {
            return 0;
        }
        LiteavLog.m76088i(this.mTAG, "Start: texture_id = %d", Integer.valueOf(i11));
        if (!this.mUseByteBuffer && !initializeSurface(i11)) {
            return 16;
        }
        int iStart = start();
        if (iStart != 0) {
            uninitializeSurface();
        }
        return iStart;
    }

    private int drainDecodedFrameAsyncMode() {
        if (this.mOutputBufferQueue.isEmpty()) {
            return -1;
        }
        Pair<Integer, MediaCodec.BufferInfo> pairPoll = this.mOutputBufferQueue.poll();
        int iIntValue = ((Integer) pairPoll.first).intValue();
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) pairPoll.second;
        this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
        if ((bufferInfo.flags & 4) != 0) {
            LiteavLog.m76087i(this.mTAG, "meet end of stream.");
            this.mMediaCodec.releaseOutputBuffer(iIntValue, true);
            return 1;
        }
        int iHandleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(iIntValue, bufferInfo) : 0;
        this.mMediaCodec.releaseOutputBuffer(iIntValue, true);
        if (this.mExternalSurface != null) {
            long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            long j11 = this.mNativeVideoDecoderImplAndroid;
            if (j11 != 0) {
                nativeOnDecodedFrameWithSurface(j11, millis);
            }
        }
        return iHandleOutputBuffer;
    }

    private boolean feedDataToMediaCodec(EncodedVideoFrame encodedVideoFrame) {
        ByteBuffer inputBuffer;
        int i11;
        ByteBuffer byteBuffer;
        if (this.mMediaCodec == null) {
            LiteavLog.m76093w(this.mTAG, "MediaCodec is stopped.");
            return false;
        }
        if (encodedVideoFrame == null || (!encodedVideoFrame.isEosFrame && ((byteBuffer = encodedVideoFrame.data) == null || byteBuffer.remaining() == 0))) {
            LiteavLog.m76093w(this.mTAG, "receive empty buffer.");
            return true;
        }
        if (!this.mUseAsyncMode) {
            ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
            if (inputBuffers == null || inputBuffers.length == 0) {
                LiteavLog.m76083e(this.mTAG, "get invalid input buffers.");
                return false;
            }
            int iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            inputBuffer = inputBuffers[iDequeueInputBuffer];
            i11 = iDequeueInputBuffer;
        } else {
            if (this.mInputBufferQueue.isEmpty()) {
                return false;
            }
            int iIntValue = this.mInputBufferQueue.poll().intValue();
            inputBuffer = this.mMediaCodec.getInputBuffer(iIntValue);
            i11 = iIntValue;
        }
        if (encodedVideoFrame.isEosFrame) {
            LiteavLog.m76087i(this.mTAG, "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM");
            this.mMediaCodec.queueInputBuffer(i11, 0, 0, 0L, 4);
        } else {
            limitMaxDecFrameBufferingInH264Sps(encodedVideoFrame);
            int iRemaining = encodedVideoFrame.data.remaining();
            inputBuffer.put(encodedVideoFrame.data);
            this.mMediaCodec.queueInputBuffer(i11, 0, iRemaining, TimeUnit.MILLISECONDS.toMicros(encodedVideoFrame.pts), 0);
        }
        return true;
    }

    private int getSupportedByteBufferColorFormat(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 : codecCapabilities.colorFormats) {
            if (i11 == 19) {
                z11 = true;
            } else if (i11 == 21) {
                z12 = true;
            }
        }
        if (z11) {
            return 19;
        }
        if (z12) {
            return 21;
        }
        LiteavLog.m76083e(this.mTAG, "I420/NV12 not found, formats: " + Arrays.toString(codecCapabilities.colorFormats));
        return 0;
    }

    private void handleDecoderError(int i11) {
        long j11 = this.mNativeVideoDecoderImplAndroid;
        if (j11 != 0) {
            nativeOnDecodedFrameFailed(j11, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.m76093w(this.mTAG, "onMediaCodecOutputBufferAvailable: MediaCodec changed.");
            return;
        }
        LiteavLog.m76083e(this.mTAG, "onMediaCodecError: " + codecException.toString());
        handleDecoderError(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.m76093w(this.mTAG, "onMediaCodecInputBufferAvailable: MediaCodec changed.");
            return;
        }
        this.mInputBufferQueue.offer(Integer.valueOf(i11));
        long j11 = this.mNativeVideoDecoderImplAndroid;
        if (j11 != 0) {
            nativeOnInputBufferAvailable(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.m76093w(this.mTAG, "onMediaCodecOutputBufferAvailable: MediaCodec changed.");
            return;
        }
        this.mOutputBufferQueue.offer(new Pair<>(Integer.valueOf(i11), bufferInfo));
        long j11 = this.mNativeVideoDecoderImplAndroid;
        if (j11 != 0) {
            nativeOnOutputBufferAvailable(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.m76093w(this.mTAG, "onMediaCodecOutputFormatChanged: MediaCodec changed.");
        } else {
            LiteavLog.m76087i(this.mTAG, "onMediaCodecOutputFormatChanged: ".concat(String.valueOf(mediaFormat)));
        }
    }

    private void outputFormatChange() {
        LiteavLog.m76087i(this.mTAG, "decode output format changed: ".concat(String.valueOf(this.mMediaCodec.getOutputFormat())));
    }

    private void setCallback(MediaCodec mediaCodec) {
        MediaCodec.Callback callback = new MediaCodec.Callback() { // from class: com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.1
            @Override // android.media.MediaCodec.Callback
            public final void onError(MediaCodec mediaCodec2, MediaCodec.CodecException codecException) {
                HardwareVideoDecoder2.this.onMediaCodecError(mediaCodec2, codecException);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onInputBufferAvailable(MediaCodec mediaCodec2, int i11) {
                HardwareVideoDecoder2.this.onMediaCodecInputBufferAvailable(mediaCodec2, i11);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputBufferAvailable(MediaCodec mediaCodec2, int i11, MediaCodec.BufferInfo bufferInfo) {
                HardwareVideoDecoder2.this.onMediaCodecOutputBufferAvailable(mediaCodec2, i11, bufferInfo);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputFormatChanged(MediaCodec mediaCodec2, MediaFormat mediaFormat) {
                HardwareVideoDecoder2.this.onMediaCodecOutputFormatChanged(mediaCodec2, mediaFormat);
            }
        };
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            mediaCodec.setCallback(callback);
        } else {
            mediaCodec.setCallback(callback, new Handler(Looper.myLooper()));
        }
    }

    private void uninitializeSurface() {
        LiteavLog.m76087i(this.mTAG, "Uninitialize surface");
        synchronized (this) {
            try {
                Surface surface = this.mOutputSurface;
                if (surface != null) {
                    surface.release();
                    this.mOutputSurface = null;
                }
                SurfaceTexture surfaceTexture = this.mSurfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.mSurfaceTexture = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public MediaCodec createMediaCodecInternal(boolean z11, String str) throws IOException {
        if (!z11) {
            return MediaCodec.createDecoderByType(str);
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!mediaCodecInfo.isEncoder()) {
                for (String str2 : supportedTypes) {
                    if (str2.contains(str) && MediaCodecAbility.isSoftOnlyDecoder(mediaCodecInfo)) {
                        LiteavLog.m76088i(this.mTAG, "Use soft only decoder:%s", mediaCodecInfo.getName());
                        return MediaCodec.createByCodecName(mediaCodecInfo.getName());
                    }
                }
            }
        }
        return MediaCodec.createDecoderByType(str);
    }

    public boolean decodeFrame(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame == null) {
            return true;
        }
        try {
            if (this.mMediaCodec == null) {
                LiteavLog.m76093w(this.mTAG, "MediaCodec is stopped.");
                encodedVideoFrame.release();
                return false;
            }
            boolean zFeedDataToMediaCodec = feedDataToMediaCodec(encodedVideoFrame);
            encodedVideoFrame.release();
            return zFeedDataToMediaCodec;
        } catch (Throwable th2) {
            try {
                LiteavLog.m76084e(this.mTAG, "Feed data failed: ", th2);
                handleDecoderError(4);
                return false;
            } finally {
                encodedVideoFrame.release();
            }
        }
    }

    public int drainDecodedFrame() {
        try {
            return this.mUseAsyncMode ? drainDecodedFrameAsyncMode() : drainDecodedFrameSyncMode();
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.mTAG, "Drain frame failed: ", th2);
            handleDecoderError(4);
            return -1;
        }
    }

    public void enableVuiModify(boolean z11) {
        if (this.mEnableLimitMaxDecFrameBufferingInH264Sps != z11) {
            LiteavLog.m76087i(this.mTAG, "Enable VUI modify: ".concat(String.valueOf(z11)));
            this.mEnableLimitMaxDecFrameBufferingInH264Sps = z11;
        }
    }

    public int getValidInputBufferCount() {
        return this.mInputBufferQueue.size();
    }

    public int getValidOutputBufferCount() {
        return this.mOutputBufferQueue.size();
    }

    public void resetNativeHandle() {
        this.mNativeVideoDecoderImplAndroid = 0L;
    }

    public void stop() {
        LiteavLog.m76087i(this.mTAG, InterfaceC33730j9.f70350a);
        if (this.mIsStarted) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            uninitializeSurface();
            this.mIsStarted = false;
            this.mExternalSurface = null;
        }
    }

    public float[] updateTexImage() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            return null;
        }
        try {
            float[] fArr = new float[16];
            surfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(fArr);
            return fArr;
        } catch (Throwable th2) {
            LiteavLog.m76092w(this.mThrottlers.m76042a("updateImage"), this.mTAG, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
            return null;
        }
    }

    public HardwareVideoDecoder2(String str, boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, long j11) {
        this.mUseSoftwareDecoder = false;
        this.mUseByteBuffer = false;
        this.mUseAsyncMode = false;
        this.mCodedWidth = 0;
        this.mCodedHeight = 0;
        this.mIsHevc = false;
        this.mTAG = str + "HardwareVideoDecoder2";
        this.mIsRealTime = z11;
        this.mUseSoftwareDecoder = z13;
        this.mUseByteBuffer = z14;
        this.mUseAsyncMode = z15;
        this.mNativeVideoDecoderImplAndroid = j11;
        this.mCodedWidth = i11;
        this.mCodedHeight = i12;
        this.mIsHevc = z12;
    }

    private void destroyMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                try {
                    LiteavLog.m76087i(this.mTAG, "mediaCodec stop");
                    mediaCodec.stop();
                    LiteavLog.m76087i(this.mTAG, "mediaCodec release");
                    mediaCodec.release();
                } catch (Throwable th2) {
                    try {
                        LiteavLog.m76083e(this.mTAG, "Stop MediaCodec failed." + th2.getMessage());
                        LiteavLog.m76087i(this.mTAG, "mediaCodec release");
                        mediaCodec.release();
                    } catch (Throwable th3) {
                        try {
                            LiteavLog.m76087i(this.mTAG, "mediaCodec release");
                            mediaCodec.release();
                        } catch (Throwable th4) {
                            LiteavLog.m76084e(this.mTAG, "release MediaCodec failed.", th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                LiteavLog.m76084e(this.mTAG, "release MediaCodec failed.", th5);
            }
        }
    }

    private boolean isResolutionSupported(MediaCodecInfo.CodecCapabilities codecCapabilities, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21 || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return true;
        }
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return true;
        }
        if (i11 >= ((Integer) supportedWidths.getLower()).intValue() && i12 >= ((Integer) supportedHeights.getLower()).intValue()) {
            if (i11 > ((Integer) supportedWidths.getUpper()).intValue() || i12 > ((Integer) supportedHeights.getUpper()).intValue()) {
                LiteavLog.m76094w(this.mTAG, "Resolution %dx%d above range: %sx%s", Integer.valueOf(i11), Integer.valueOf(i12), supportedWidths.toString(), supportedHeights.toString());
            }
            return true;
        }
        LiteavLog.m76085e(this.mTAG, "Resolution %dx%d below range: %sx%s", Integer.valueOf(i11), Integer.valueOf(i12), supportedWidths.toString(), supportedHeights.toString());
        return false;
    }

    private void limitMaxDecFrameBufferingInH264Sps(EncodedVideoFrame encodedVideoFrame) {
        byte[] bArrM76560a;
        ByteBuffer byteBufferM76561b;
        byte[] bArr;
        boolean z11;
        byte b11;
        if (encodedVideoFrame.isIDRFrame() && encodedVideoFrame.codecType == CodecType.H264 && this.mEnableLimitMaxDecFrameBufferingInH264Sps && (bArrM76560a = C34898d.m76560a(encodedVideoFrame.data.remaining())) != null) {
            encodedVideoFrame.data.get(bArrM76560a);
            encodedVideoFrame.data.rewind();
            int[] iArr = {-1};
            byte[] spsData = getSpsData(bArrM76560a, iArr);
            if (spsData != null && iArr[0] >= 0) {
                byte[] bArrM76569a = null;
                try {
                    C34910a c34910a = this.mSPSModifier;
                    byte[] bArr2 = new byte[spsData.length];
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < spsData.length) {
                        if (i11 < spsData.length - 3 && (b11 = spsData[i11]) == 0) {
                            int i13 = i11 + 1;
                            if (spsData[i13] == 0 && spsData[i11 + 2] == 3) {
                                int i14 = i11 + 3;
                                if (spsData[i14] <= 3) {
                                    int i15 = i12 + 1;
                                    bArr2[i12] = b11;
                                    i12 += 2;
                                    bArr2[i15] = spsData[i13];
                                    i11 = i14;
                                }
                            }
                        }
                        bArr2[i12] = spsData[i11];
                        i11++;
                        i12++;
                    }
                    if (i12 != spsData.length) {
                        bArr = new byte[i12];
                        System.arraycopy(bArr2, 0, bArr, 0, i12);
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        z11 = true;
                    } else {
                        bArr = spsData;
                        z11 = false;
                    }
                    byte[] bArrM76570a = c34910a.m76570a(new ByteArrayInputStream(bArr));
                    if (bArrM76570a != null && z11) {
                        bArrM76569a = C34910a.m76569a(bArrM76570a);
                    } else {
                        bArrM76569a = bArrM76570a;
                    }
                } catch (Throwable th2) {
                    LiteavLog.m76084e(this.mTAG, "modify dec buffer error ", th2);
                }
                if (bArrM76569a != null && (byteBufferM76561b = C34898d.m76561b((bArrM76560a.length - spsData.length) + bArrM76569a.length)) != null) {
                    encodedVideoFrame.data = byteBufferM76561b;
                    int i16 = iArr[0];
                    if (i16 > 0) {
                        byteBufferM76561b.put(bArrM76560a, 0, i16);
                    }
                    encodedVideoFrame.data.put(bArrM76569a);
                    ByteBuffer byteBuffer = encodedVideoFrame.data;
                    int i17 = iArr[0];
                    byteBuffer.put(bArrM76560a, spsData.length + i17, (bArrM76560a.length - i17) - spsData.length);
                    encodedVideoFrame.data.rewind();
                }
            }
        }
    }

    public int start(Surface surface) {
        if (this.mIsStarted) {
            return 0;
        }
        LiteavLog.m76087i(this.mTAG, "Start with surface ".concat(String.valueOf(surface)));
        if (surface == null) {
            return 17;
        }
        this.mExternalSurface = surface;
        return start();
    }

    private int start() {
        int iStartInternal = startInternal();
        if (iStartInternal != 0 && this.mIsRealTime) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            this.mIsRealTime = false;
            iStartInternal = startInternal();
        }
        if (iStartInternal != 0) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
        }
        return iStartInternal;
    }
}
