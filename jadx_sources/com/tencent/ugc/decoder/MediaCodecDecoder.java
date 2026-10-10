package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.common.MediaCodecAbility;
import com.tencent.ugc.videobase.frame.HDRType;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaCodecDecoder {
    private final HardwareDecoderMediaFormatBuilder mDecoderMediaFormatBuilder;
    protected final boolean mForceSoftwareDecoder;
    protected HDRType mHDRType;
    protected MediaCodecDecoderListener mListener;
    protected final Size mResolution;
    private volatile CustomHandler mWorkHandler;
    protected String mTAG = "MediaCodecDecoder";
    private MediaCodec mMediaCodec = null;
    protected final MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = false;
    private final H264SPSModifier mSPSModifier = new H264SPSModifier();
    protected final C34692b mThrottlers = new C34692b();
    protected EnumC34747l mVideoRotation = EnumC34747l.NORMAL;

    public static class BuildResult {
        public boolean isSuccess = true;
        public String warningMessage = "";
    }

    public interface MediaCodecDecoderListener {
        void onDecodeFrame(PixelFrame pixelFrame, boolean z11);

        void onDecoderError();
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

    public abstract boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i11);

    public abstract boolean start(Object obj);

    public abstract void updateOutputSurface(MediaCodec mediaCodec);

    public BuildResult buildMediaCodec(boolean z11, MediaCodec mediaCodec) {
        String str;
        this.mDecoderMediaFormatBuilder.setIsLowLatencyDecodeEnabled(z11);
        MediaFormat mediaFormatBuild = this.mDecoderMediaFormatBuilder.build();
        BuildResult buildResult = new BuildResult();
        boolean zConfigureMediaCodec = true;
        String str2 = "";
        try {
            if (mediaCodec != null) {
                this.mMediaCodec = mediaCodec;
                updateOutputSurface(mediaCodec);
                LiteavLog.m76088i(this.mTAG, "preload MediaCodec update surface success (%s)", this.mMediaCodec.getName());
            } else {
                MediaCodec mediaCodecCreateMediaCodecInternal = createMediaCodecInternal(this.mForceSoftwareDecoder, mediaFormatBuild.getString("mime"));
                this.mMediaCodec = mediaCodecCreateMediaCodecInternal;
                mediaCodecCreateMediaCodecInternal.setVideoScalingMode(1);
                zConfigureMediaCodec = configureMediaCodec(this.mMediaCodec, mediaFormatBuild);
                if (zConfigureMediaCodec) {
                    LiteavLog.m76087i(this.mTAG, "configure MediaCodec with ".concat(String.valueOf(mediaFormatBuild)));
                    this.mMediaCodec.start();
                    LiteavLog.m76088i(this.mTAG, "start MediaCodec(%s) success.", this.mMediaCodec.getName());
                }
            }
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.mTAG, "start MediaCodec failed.", th2);
            if (th2 instanceof IllegalArgumentException) {
                str = "VideoDecode: illegal argument, Start decoder failed";
            } else {
                str = th2 instanceof IllegalStateException ? "VideoDecode: illegal state, Start decoder failed" : "VideoDecode: Start decoder failed";
            }
            str2 = "decoder config fail, message:" + str + " exception:" + th2.getMessage();
            zConfigureMediaCodec = false;
        }
        buildResult.isSuccess = zConfigureMediaCodec;
        if (!zConfigureMediaCodec) {
            destroyMediaCodec();
            buildResult.warningMessage = str2;
        }
        return buildResult;
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

    public void destroyMediaCodec() {
        if (this.mMediaCodec == null) {
            return;
        }
        try {
            LiteavLog.m76087i(this.mTAG, "mediaCodec stop");
            this.mMediaCodec.stop();
            try {
                LiteavLog.m76087i(this.mTAG, "mediaCodec release");
                this.mMediaCodec.release();
            } catch (Throwable th2) {
                LiteavLog.m76084e(this.mTAG, "release MediaCodec failed.", th2);
            }
            this.mMediaCodec = null;
        } catch (Throwable th3) {
            try {
                LiteavLog.m76083e(this.mTAG, "stop MediaCodec failed." + th3.getMessage());
            } finally {
                try {
                    LiteavLog.m76087i(this.mTAG, "mediaCodec release");
                    this.mMediaCodec.release();
                } catch (Throwable th4) {
                    LiteavLog.m76084e(this.mTAG, "release MediaCodec failed.", th4);
                }
                this.mMediaCodec = null;
            }
        }
    }

    public boolean drainDecodedFrame() {
        int iDequeueOutputBuffer;
        if (this.mMediaCodec == null) {
            return false;
        }
        for (int i11 = 0; i11 < 3 && (iDequeueOutputBuffer = MediaCodecWrapper.dequeueOutputBuffer(this.mMediaCodec, this.mBufferInfo, TimeUnit.MILLISECONDS.toMicros(1L))) != -1; i11++) {
            if (iDequeueOutputBuffer != -3) {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer < 0) {
                        LiteavLog.m76080d(this.mTAG, "dequeueOutputBuffer get invalid index: %d", Integer.valueOf(iDequeueOutputBuffer));
                        break;
                    }
                    return handleOutputBuffer(this.mMediaCodec, this.mBufferInfo, iDequeueOutputBuffer);
                }
                outputFormatChange(this.mMediaCodec.getOutputFormat());
            } else {
                LiteavLog.m76087i(this.mTAG, "on output buffers changed");
            }
        }
        return false;
    }

    public void enableLimitMaxDecFrameBuffer(boolean z11) {
        this.mEnableLimitMaxDecFrameBufferingInH264Sps = z11;
    }

    public boolean feedEncodedFrame(EncodedVideoFrame encodedVideoFrame) {
        ByteBuffer byteBuffer;
        if (this.mMediaCodec == null) {
            return false;
        }
        if (encodedVideoFrame == null || (!encodedVideoFrame.isEosFrame && ((byteBuffer = encodedVideoFrame.data) == null || byteBuffer.remaining() == 0))) {
            LiteavLog.m76093w(this.mTAG, "receive empty buffer.");
            return true;
        }
        this.mVideoRotation = encodedVideoFrame.isEosFrame ? this.mVideoRotation : EnumC34747l.m76131a(encodedVideoFrame.getRotation());
        this.mHDRType = encodedVideoFrame.isEosFrame ? this.mHDRType : encodedVideoFrame.hdrType;
        ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
        if (CollectionUtils.isEmpty(inputBuffers)) {
            LiteavLog.m76083e(this.mTAG, "get invalid input buffers.");
            return false;
        }
        MediaCodec mediaCodec = this.mMediaCodec;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int iDequeueInputBuffer = MediaCodecWrapper.dequeueInputBuffer(mediaCodec, timeUnit.toMicros(3L));
        if (iDequeueInputBuffer < 0) {
            return false;
        }
        if (encodedVideoFrame.isEosFrame) {
            LiteavLog.m76087i(this.mTAG, "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM");
            MediaCodecWrapper.queueInputBuffer(this.mMediaCodec, iDequeueInputBuffer, 0, 0, 0L, 4);
        } else {
            limitMaxDecFrameBufferingInH264Sps(encodedVideoFrame);
            int iRemaining = encodedVideoFrame.data.remaining();
            inputBuffers[iDequeueInputBuffer].put(encodedVideoFrame.data);
            MediaCodecWrapper.queueInputBuffer(this.mMediaCodec, iDequeueInputBuffer, 0, iRemaining, timeUnit.toMicros(encodedVideoFrame.pts), 0);
        }
        return true;
    }

    public void flush() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            try {
                mediaCodec.flush();
            } catch (Throwable th2) {
                LiteavLog.m76084e(this.mTAG, "mediacodec flush exception.", th2);
            }
        }
    }

    public GLConstants.ColorRange getColorRange() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return GLConstants.ColorRange.VIDEO_RANGE;
        }
        try {
            return getMediaFormatValue(mediaCodec.getOutputFormat(), "color-range", 2) == 1 ? GLConstants.ColorRange.FULL_RANGE : GLConstants.ColorRange.VIDEO_RANGE;
        } catch (Throwable th2) {
            LiteavLog.m76093w(this.mTAG, "get color Range exception. msg :".concat(String.valueOf(th2)));
            return GLConstants.ColorRange.VIDEO_RANGE;
        }
    }

    public GLConstants.ColorSpace getColorSpace() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return GLConstants.ColorSpace.BT601;
        }
        try {
            return getMediaFormatValue(mediaCodec.getOutputFormat(), "color-standard", 2) == 1 ? GLConstants.ColorSpace.BT709 : GLConstants.ColorSpace.BT601;
        } catch (Throwable th2) {
            LiteavLog.m76093w(this.mTAG, "get color space exception. msg :".concat(String.valueOf(th2)));
            return GLConstants.ColorSpace.BT601;
        }
    }

    public void outputFormatChange(MediaFormat mediaFormat) {
        LiteavLog.m76087i(this.mTAG, "decode output format changed: ".concat(String.valueOf(mediaFormat)));
        LiteavLog.m76088i(this.mTAG, "cropWidth: %d, cropHeight: %d, frameWidth: %d, frameHeight: %d", Integer.valueOf(Math.abs(mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1), Integer.valueOf(Math.abs(mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1), Integer.valueOf(mediaFormat.getInteger("width")), Integer.valueOf(mediaFormat.getInteger("height")));
    }

    public void runOnWorkThread(Runnable runnable) {
        if (this.mWorkHandler != null) {
            this.mWorkHandler.runOrPost(runnable);
        }
    }

    public MediaCodecDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z11, MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        this.mDecoderMediaFormatBuilder = hardwareDecoderMediaFormatBuilder;
        this.mResolution = size;
        this.mForceSoftwareDecoder = z11;
        this.mListener = mediaCodecDecoderListener;
        this.mWorkHandler = customHandler;
    }

    private static int getMediaFormatValue(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return i11;
    }

    private void limitMaxDecFrameBufferingInH264Sps(EncodedVideoFrame encodedVideoFrame) {
        byte[] bArrAllocateByteArray;
        byte[] bArrUpdateVUIforMaxBuffering;
        ByteBuffer byteBufferAllocateDirectBuffer;
        if (encodedVideoFrame.isIDRFrame() && encodedVideoFrame.codecType == CodecType.H264 && this.mEnableLimitMaxDecFrameBufferingInH264Sps && (bArrAllocateByteArray = MemoryAllocator.allocateByteArray(encodedVideoFrame.data.remaining())) != null) {
            encodedVideoFrame.data.get(bArrAllocateByteArray);
            encodedVideoFrame.data.rewind();
            int[] iArr = {-1};
            byte[] spsData = getSpsData(bArrAllocateByteArray, iArr);
            if (spsData != null && iArr[0] >= 0) {
                try {
                    bArrUpdateVUIforMaxBuffering = this.mSPSModifier.updateVUIforMaxBuffering(spsData);
                } catch (Throwable th2) {
                    LiteavLog.m76084e(this.mTAG, "modify dec buffer error ", th2);
                    bArrUpdateVUIforMaxBuffering = null;
                }
                if (bArrUpdateVUIforMaxBuffering != null && (byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer((bArrAllocateByteArray.length - spsData.length) + bArrUpdateVUIforMaxBuffering.length)) != null) {
                    encodedVideoFrame.data = byteBufferAllocateDirectBuffer;
                    int i11 = iArr[0];
                    if (i11 > 0) {
                        byteBufferAllocateDirectBuffer.put(bArrAllocateByteArray, 0, i11);
                    }
                    encodedVideoFrame.data.put(bArrUpdateVUIforMaxBuffering);
                    ByteBuffer byteBuffer = encodedVideoFrame.data;
                    int i12 = iArr[0];
                    byteBuffer.put(bArrAllocateByteArray, spsData.length + i12, (bArrAllocateByteArray.length - i12) - spsData.length);
                    encodedVideoFrame.data.rewind();
                }
            }
        }
    }

    public void stop() {
        destroyMediaCodec();
    }
}
