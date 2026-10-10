package com.tencent.liteav.videobase.common;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import java.nio.ByteBuffer;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class EncodedVideoFrame {
    private static final String TAG = "EncodedVideoFrame";
    public ByteBuffer data;
    public long dts;
    public int height;
    public long pts;
    public int rotation;
    public MediaFormat videoFormat;
    public int width;
    public final ProducerChainTimestamp producerChainTimestamp = new ProducerChainTimestamp();
    public final ConsumerChainTimestamp consumerChainTimestamp = new ConsumerChainTimestamp();
    public long nativePtr = 0;
    public EnumC34875c nalType = EnumC34875c.UNKNOWN;
    public EnumC34876d profileType = EnumC34876d.UNKNOWN;
    public CodecType codecType = CodecType.H264;
    public long gopIndex = 0;
    public long gopFrameIndex = 0;
    public long frameIndex = 0;
    public long refFrameIndex = 0;
    public Integer svcInfo = null;
    public boolean isEosFrame = false;
    public EnumC34874b hdrType = EnumC34874b.UNKNOWN;
    public MediaCodec.BufferInfo info = null;

    private native void nativeRelease(long j11);

    public static EncodedVideoFrame createEncodedVideoFrame(ByteBuffer byteBuffer, int i11, int i12, int i13, long j11, long j12, long j13, long j14, long j15, long j16, int i14, long j17, int i15, int i16, boolean z11, int i17, int i18) {
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.data = byteBuffer;
        encodedVideoFrame.nativePtr = j17;
        encodedVideoFrame.nalType = EnumC34875c.m76494a(i11);
        encodedVideoFrame.profileType = EnumC34876d.m76496a(i12);
        encodedVideoFrame.codecType = CodecType.m76491a(i14);
        encodedVideoFrame.rotation = i13;
        encodedVideoFrame.dts = j11;
        encodedVideoFrame.pts = j12;
        encodedVideoFrame.gopIndex = j13;
        encodedVideoFrame.gopFrameIndex = j14;
        encodedVideoFrame.frameIndex = j15;
        encodedVideoFrame.refFrameIndex = j16;
        encodedVideoFrame.info = null;
        encodedVideoFrame.width = i15;
        encodedVideoFrame.height = i16;
        if (z11) {
            encodedVideoFrame.svcInfo = Integer.valueOf(i17);
        } else {
            encodedVideoFrame.svcInfo = null;
        }
        encodedVideoFrame.hdrType = EnumC34874b.m76493a(i18);
        return encodedVideoFrame;
    }

    public static int getNextNALHeaderPos(int i11, ByteBuffer byteBuffer) {
        while (true) {
            int i12 = i11 + 3;
            if (i12 >= byteBuffer.remaining()) {
                return -1;
            }
            if (byteBuffer.get(i11) == 0 && byteBuffer.get(i11 + 1) == 0 && byteBuffer.get(i11 + 2) == 0 && byteBuffer.get(i12) == 1) {
                return i11 + 4;
            }
            if (byteBuffer.get(i11) == 0 && byteBuffer.get(i11 + 1) == 0 && byteBuffer.get(i11 + 2) == 1) {
                return i12;
            }
            i11++;
        }
    }

    public static long resetEncodedVideoFrame(EncodedVideoFrame encodedVideoFrame) {
        long j11 = encodedVideoFrame.nativePtr;
        if (j11 == 0 || encodedVideoFrame.data == null) {
            return 0L;
        }
        encodedVideoFrame.data = null;
        encodedVideoFrame.nativePtr = 0L;
        return j11;
    }

    public boolean isH265() {
        return this.codecType == CodecType.H265;
    }

    public boolean isHDRFrame() {
        EnumC34874b enumC34874b = this.hdrType;
        return (enumC34874b == null || enumC34874b == EnumC34874b.UNKNOWN) ? false : true;
    }

    public boolean isIDRFrame() {
        EnumC34875c enumC34875c = this.nalType;
        return enumC34875c != null && enumC34875c.m76495a();
    }

    public boolean isRPSEnable() {
        EnumC34876d enumC34876d = this.profileType;
        return enumC34876d == EnumC34876d.BASELINE_RPS || enumC34876d == EnumC34876d.MAIN_RPS || enumC34876d == EnumC34876d.HIGH_RPS;
    }

    public boolean isSVCEnable() {
        return this.svcInfo != null;
    }

    public boolean isValidFrame() {
        ByteBuffer byteBuffer = this.data;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.nalType != null && this.codecType != null && this.width > 0 && this.height > 0;
    }

    public void release() {
        long j11 = this.nativePtr;
        if (j11 != 0) {
            nativeRelease(j11);
            this.nativePtr = 0L;
        }
    }

    public String toString() {
        return "nalType = " + this.nalType + ", profiletype=" + this.profileType + ", rotation=" + this.rotation + ", codecType=" + this.codecType + ", dts=" + this.dts + ", pts=" + this.pts + ", gopIndex=" + this.gopIndex + ", gopFrameIndex=" + this.gopFrameIndex + ", frameIndex=" + this.frameIndex;
    }

    public void updateNALTypeAccordingNALHeader() {
        if (this.data == null) {
            return;
        }
        EnumC34875c enumC34875c = this.nalType;
        if (enumC34875c != null && enumC34875c != EnumC34875c.UNKNOWN) {
            return;
        }
        int nextNALHeaderPos = 0;
        while (true) {
            nextNALHeaderPos = getNextNALHeaderPos(nextNALHeaderPos, this.data);
            if (nextNALHeaderPos == -1 || nextNALHeaderPos >= this.data.remaining()) {
                return;
            }
            EnumC34875c enumC34875c2 = EnumC34875c.UNKNOWN;
            EnumC34875c nalTypeFromH265NALHeader = isH265() ? getNalTypeFromH265NALHeader(this.data, nextNALHeaderPos) : getNalTypeFromH264NALHeader(this.data, nextNALHeaderPos);
            EnumC34875c enumC34875c3 = this.nalType;
            if (enumC34875c3 == null || enumC34875c3 == EnumC34875c.UNKNOWN || nalTypeFromH265NALHeader == EnumC34875c.IDR) {
                this.nalType = nalTypeFromH265NALHeader;
            }
            EnumC34875c enumC34875c4 = this.nalType;
            if (enumC34875c4 != EnumC34875c.SPS && enumC34875c4 != EnumC34875c.PPS && enumC34875c4 != EnumC34875c.VPS && enumC34875c4 != EnumC34875c.SEI) {
                return;
            }
        }
    }

    private EnumC34875c getNalTypeFromH264NALHeader(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.get(i11) & 31;
        if (i12 != 5) {
            if (i12 != 6) {
                if (i12 != 7) {
                    if (i12 != 8) {
                        return EnumC34875c.UNKNOWN;
                    }
                    return EnumC34875c.PPS;
                }
                return EnumC34875c.SPS;
            }
            return EnumC34875c.SEI;
        }
        return EnumC34875c.IDR;
    }

    private EnumC34875c getNalTypeFromH265NALHeader(ByteBuffer byteBuffer, int i11) {
        int i12 = (byteBuffer.get(i11) & BuiltinOptions.RightShiftOptions) >> 1;
        if (i12 != 39) {
            switch (i12) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    return EnumC34875c.IDR;
                default:
                    switch (i12) {
                        case 32:
                            return EnumC34875c.VPS;
                        case 33:
                            return EnumC34875c.SPS;
                        case 34:
                            return EnumC34875c.PPS;
                        default:
                            return EnumC34875c.UNKNOWN;
                    }
            }
        }
        return EnumC34875c.SEI;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.nativePtr != 0) {
            LiteavLog.m76093w(TAG, "nativePtr != 0, must call release before finalize ");
            release();
        }
    }
}
