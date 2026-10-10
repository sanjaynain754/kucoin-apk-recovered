package com.tencent.ugc.videobase.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EnumC34875c;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.ugc.videobase.frame.HDRType;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class EncodedVideoFrame {
    public static final int MATRIX_COEFFICIENTS_BT601 = 6;
    public static final int MATRIX_COEFFICIENTS_BT709 = 1;
    public ByteBuffer data;
    public long dts;
    public int height;
    public long pts;
    public int rotation;
    public MediaFormat videoFormat;
    public int width;
    public EnumC34875c nalType = EnumC34875c.UNKNOWN;
    public EnumC34876d profileType = EnumC34876d.UNKNOWN;
    public CodecType codecType = CodecType.H264;
    public int matrixCoefficients = 6;
    public HDRType hdrType = HDRType.NONE;
    public boolean isEosFrame = false;

    public static EncodedVideoFrame create(int i11) {
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.data = ByteBuffer.allocateDirect(i11);
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

    public int getCodecType() {
        return this.codecType.mValue;
    }

    public long getDTS() {
        return this.dts;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public MediaFormat getMediaFormat() {
        return this.videoFormat;
    }

    public int getNalType() {
        return this.nalType.mValue;
    }

    public long getPTS() {
        return this.pts;
    }

    public int getProfileType() {
        return this.profileType.mValue;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isEosFrame() {
        return this.isEosFrame;
    }

    public boolean isH265() {
        return this.codecType == CodecType.H265;
    }

    public boolean isIDRFrame() {
        EnumC34875c enumC34875c = this.nalType;
        return enumC34875c != null && enumC34875c.m76495a();
    }

    public boolean isValidFrame() {
        ByteBuffer byteBuffer = this.data;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.nalType != null && this.codecType != null && this.width > 0 && this.height > 0;
    }

    public void setDTS(long j11) {
        this.dts = j11;
    }

    public void setEosFrame(boolean z11) {
        this.isEosFrame = z11;
    }

    public void setHeight(int i11) {
        this.height = i11;
    }

    public void setMatrixCoefficients(int i11) {
        this.matrixCoefficients = i11;
    }

    public void setPTS(long j11) {
        this.pts = j11;
    }

    public void setRotation(int i11) {
        this.rotation = i11;
    }

    public void setWidth(int i11) {
        this.width = i11;
    }

    public String toString() {
        return "nalType = " + this.nalType + ", profileType=" + this.profileType + ", rotation=" + this.rotation + ", codecType=" + this.codecType + ", dts=" + this.dts + ", pts=" + this.pts + ", matrixCoefficients = " + this.matrixCoefficients + " ,hdrType = " + this.hdrType;
    }

    public void setCodecType(int i11) {
        this.codecType = CodecType.m76491a(i11);
    }

    public void setHDRType(int i11) {
        this.hdrType = HDRType.valueOf(i11);
    }

    public void setNalType(int i11) {
        this.nalType = EnumC34875c.m76494a(i11);
    }

    public void setProfileType(int i11) {
        this.profileType = EnumC34876d.m76496a(i11);
    }
}
