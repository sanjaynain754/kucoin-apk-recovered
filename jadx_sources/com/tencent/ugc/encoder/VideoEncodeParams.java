package com.tencent.ugc.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public final class VideoEncodeParams {
    public boolean annexb;
    public int bitrate;
    public VideoEncoderDef.BitrateMode bitrateMode;
    public CodecType codecType;
    public GLConstants.ColorRange colorRange;
    public GLConstants.ColorSpace colorSpace;
    public boolean enableBFrame;
    public EnumC34876d encoderProfile;
    public int fps;
    public boolean fullIFrame;
    public int gop;
    public int height;
    public int width;

    public VideoEncodeParams() {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = VideoEncoderDef.BitrateMode.CBR;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.codecType = CodecType.H264;
        this.colorRange = GLConstants.ColorRange.UNKNOWN;
        this.colorSpace = GLConstants.ColorSpace.UNKNOWN;
    }

    private int checkFieldDiffCounts(Object obj, Object obj2) {
        int i11 = 0;
        for (Field field : VideoEncodeParams.class.getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                if (!CommonUtil.equals(field.get(obj), field.get(obj2))) {
                    i11++;
                }
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            }
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof VideoEncodeParams) && checkFieldDiffCounts(this, obj) == 0;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateMode() {
        return this.bitrateMode.mValue;
    }

    public final int getColorRange() {
        GLConstants.ColorRange colorRange = this.colorRange;
        return colorRange != null ? colorRange.getValue() : GLConstants.ColorSpace.UNKNOWN.getValue();
    }

    public final int getColorSpace() {
        GLConstants.ColorSpace colorSpace = this.colorSpace;
        return colorSpace != null ? colorSpace.getValue() : GLConstants.ColorRange.UNKNOWN.getValue();
    }

    public final int getEncoderProfile() {
        return this.encoderProfile.mValue;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAnnexb() {
        return this.annexb;
    }

    public final boolean isEnablesBframe() {
        return this.enableBFrame;
    }

    public final boolean isFullIFrame() {
        return this.fullIFrame;
    }

    public final void setAnnexb(boolean z11) {
        this.annexb = z11;
    }

    public final void setBitrate(int i11) {
        this.bitrate = i11;
    }

    public final void setEnableBFrame(boolean z11) {
        this.enableBFrame = z11;
    }

    public final void setFps(int i11) {
        this.fps = i11;
    }

    public final void setFullIFrame(boolean z11) {
        this.fullIFrame = z11;
    }

    public final void setGop(int i11) {
        this.gop = i11;
    }

    public final void setHeight(int i11) {
        this.height = i11;
    }

    public final void setWidth(int i11) {
        this.width = i11;
    }

    public final String toString() {
        return "width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.bitrate + ", annexb=" + this.annexb + ", encoderProfile=" + this.encoderProfile + ", bitrateMode=" + this.bitrateMode + ", fullIFrame=" + this.fullIFrame + ", enableBFrame=" + this.enableBFrame + ", codecType=" + this.codecType + ", colorRange=" + this.colorRange + ", colorSpace=" + this.colorSpace;
    }

    public final void setBitrateMode(int i11) {
        this.bitrateMode = VideoEncoderDef.BitrateMode.m76740a(i11);
    }

    public final void setCodecType(int i11) {
        this.codecType = CodecType.m76491a(i11);
    }

    public final void setColorRange(int i11) {
        this.colorRange = GLConstants.ColorRange.m76481a(i11);
    }

    public final void setColorSpace(int i11) {
        this.colorSpace = GLConstants.ColorSpace.m76482a(i11);
    }

    public final void setEncoderProfile(int i11) {
        this.encoderProfile = EnumC34876d.m76496a(i11);
    }

    public VideoEncodeParams(VideoEncodeParams videoEncodeParams) {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = VideoEncoderDef.BitrateMode.CBR;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.codecType = CodecType.H264;
        this.colorRange = GLConstants.ColorRange.UNKNOWN;
        this.colorSpace = GLConstants.ColorSpace.UNKNOWN;
        if (videoEncodeParams == null) {
            return;
        }
        this.width = videoEncodeParams.width;
        this.height = videoEncodeParams.height;
        this.fps = videoEncodeParams.fps;
        this.gop = videoEncodeParams.gop;
        this.bitrate = videoEncodeParams.bitrate;
        this.annexb = videoEncodeParams.annexb;
        this.encoderProfile = videoEncodeParams.encoderProfile;
        this.bitrateMode = videoEncodeParams.bitrateMode;
        this.fullIFrame = videoEncodeParams.fullIFrame;
        this.enableBFrame = videoEncodeParams.enableBFrame;
        this.codecType = videoEncodeParams.codecType;
        this.colorSpace = videoEncodeParams.colorSpace;
        this.colorRange = videoEncodeParams.colorRange;
    }
}
