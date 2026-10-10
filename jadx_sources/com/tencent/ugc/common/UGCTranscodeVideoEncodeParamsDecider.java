package com.tencent.ugc.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import com.tencent.ugc.encoder.VideoEncodeParams;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCTranscodeVideoEncodeParamsDecider {
    private static final String TAG = "UGCTranscodeVideoEncodeParamsDecider";
    private int[] mSourceFpsArray;
    private List<MediaFormat> mVideoMediaFormatList;
    private boolean mFullIFrame = false;
    private EnumC34876d mEncodeProfile = EnumC34876d.HIGH;
    private final long mNativeHandler = nativeCreate();

    private static native long nativeCreate();

    private static native void nativeDestroy(long j11);

    private static native int nativeGetSelectedBitrate(long j11);

    private static native int nativeGetSelectedFramerate(long j11);

    private static native Size nativeGetSelectedResolution(long j11);

    private static native void nativeSetCanvasSize(long j11, int i11, int i12);

    private static native void nativeSetEncodeBitrate(long j11, int i11);

    private static native void nativeSetEncodeFramerate(long j11, int i11);

    private static native void nativeSetEncodeResolution(long j11, int i11);

    private static native void nativeSetEncodeRotation(long j11, int i11);

    private static native void nativeSetSourceVideoInfo(long j11, int[] iArr, int[] iArr2, int[] iArr3);

    private static Size createVideoSize(int i11, int i12) {
        return new Size(i11, i12);
    }

    private int getDecidedGOP() {
        List<MediaFormat> list = this.mVideoMediaFormatList;
        if (list == null || list.size() == 0) {
            return 3;
        }
        return getNumberFromMediaFormat(this.mVideoMediaFormatList.get(0), "i-frame-interval", 3);
    }

    private int getDecidedVideoBitrate(Size size) {
        if (this.mFullIFrame) {
            return (size.width >= 1280 || size.height >= 1280) ? 24000 : 15000;
        }
        return nativeGetSelectedBitrate(this.mNativeHandler);
    }

    private int getNumberFromMediaFormat(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat == null || !mediaFormat.containsKey(str)) {
            return i11;
        }
        try {
            return mediaFormat.getInteger(str);
        } catch (ClassCastException e11) {
            LiteavLog.m76093w(TAG, "getNumberFromMediaFormat integer ClassCastException: ".concat(String.valueOf(e11)));
            try {
                return (int) mediaFormat.getFloat(str);
            } catch (ClassCastException e12) {
                LiteavLog.m76093w(TAG, "getNumberFromMediaFormat float ClassCastException: ".concat(String.valueOf(e12)));
                return i11;
            }
        }
    }

    private Size getSizeFromMediaFormat(MediaFormat mediaFormat) {
        int numberFromMediaFormat;
        Size size = new Size();
        size.width = getNumberFromMediaFormat(mediaFormat, "width", 720);
        size.height = getNumberFromMediaFormat(mediaFormat, "height", 1280);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && ((numberFromMediaFormat = getNumberFromMediaFormat(mediaFormat, MediaUtils.KEY_ROTATION, 0)) == 90 || numberFromMediaFormat == 270)) {
            size.swap();
        }
        return size;
    }

    public void finalize() throws Throwable {
        nativeDestroy(this.mNativeHandler);
    }

    public VideoEncodeParams getDecidedEncodeParams() {
        VideoEncodeParams videoEncodeParams = new VideoEncodeParams();
        videoEncodeParams.annexb = true;
        videoEncodeParams.bitrateMode = VideoEncoderDef.BitrateMode.VBR;
        videoEncodeParams.fullIFrame = false;
        videoEncodeParams.encoderProfile = this.mEncodeProfile;
        videoEncodeParams.setFullIFrame(this.mFullIFrame);
        videoEncodeParams.gop = getDecidedGOP();
        Size sizeNativeGetSelectedResolution = nativeGetSelectedResolution(this.mNativeHandler);
        videoEncodeParams.width = sizeNativeGetSelectedResolution.width;
        videoEncodeParams.height = sizeNativeGetSelectedResolution.height;
        videoEncodeParams.fps = nativeGetSelectedFramerate(this.mNativeHandler);
        videoEncodeParams.bitrate = getDecidedVideoBitrate(sizeNativeGetSelectedResolution);
        LiteavLog.m76087i(TAG, "getVideoEncodeParams: ".concat(String.valueOf(videoEncodeParams)));
        return videoEncodeParams;
    }

    public boolean isNeedFilterFrame() {
        int[] iArr = this.mSourceFpsArray;
        if (iArr != null && iArr.length != 0) {
            int iNativeGetSelectedFramerate = nativeGetSelectedFramerate(this.mNativeHandler);
            for (int i11 : this.mSourceFpsArray) {
                if (i11 > iNativeGetSelectedFramerate + 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setEncodeBitrate(int i11) {
        nativeSetEncodeBitrate(this.mNativeHandler, i11);
    }

    public void setEncodeFramerate(TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        nativeSetEncodeFramerate(this.mNativeHandler, videoFrameRateLevel.asInt());
    }

    public void setEncodeProfile(int i11) {
        LiteavLog.m76087i(TAG, "setEncodeProfile ".concat(String.valueOf(i11)));
        if (i11 == 2) {
            this.mEncodeProfile = EnumC34876d.MAIN;
        } else if (i11 == 1) {
            this.mEncodeProfile = EnumC34876d.BASELINE;
        } else {
            this.mEncodeProfile = EnumC34876d.HIGH;
        }
    }

    public void setEncodeRotation(EnumC34747l enumC34747l) {
        nativeSetEncodeRotation(this.mNativeHandler, enumC34747l.mValue);
    }

    public void setFullIFrame(boolean z11) {
        if (z11 == this.mFullIFrame) {
            return;
        }
        LiteavLog.m76087i(TAG, "setFullIFrame ".concat(String.valueOf(z11)));
        this.mFullIFrame = z11;
    }

    public void setInputCanvasSize(Size size) {
        if (size == null) {
            return;
        }
        LiteavLog.m76087i(TAG, "set input canvas size :".concat(String.valueOf(size)));
        nativeSetCanvasSize(this.mNativeHandler, size.width, size.height);
    }

    public void setInputVideoMediaFormat(List<MediaFormat> list) {
        this.mVideoMediaFormatList = list;
        if (list == null) {
            return;
        }
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        this.mSourceFpsArray = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            MediaFormat mediaFormat = this.mVideoMediaFormatList.get(i11);
            Size sizeFromMediaFormat = getSizeFromMediaFormat(mediaFormat);
            iArr[i11] = sizeFromMediaFormat.width;
            iArr2[i11] = sizeFromMediaFormat.height;
            this.mSourceFpsArray[i11] = getNumberFromMediaFormat(mediaFormat, "frame-rate", 30);
            LiteavLog.m76087i(TAG, "source video fps = " + this.mSourceFpsArray[i11] + " resolution = " + sizeFromMediaFormat);
        }
        nativeSetSourceVideoInfo(this.mNativeHandler, iArr, iArr2, this.mSourceFpsArray);
    }

    public void setOutputResolution(int i11) {
        nativeSetEncodeResolution(this.mNativeHandler, i11);
    }
}
