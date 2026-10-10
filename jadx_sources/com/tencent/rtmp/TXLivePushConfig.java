package com.tencent.rtmp;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
public class TXLivePushConfig implements Serializable {
    public static final int DEFAULT_MAX_VIDEO_BITRATE = 1200;
    public static final int DEFAULT_MIN_VIDEO_BITRATE = 800;
    public int mAudioBitrate;
    public String mAudioPreProcessFuncName;
    public String mAudioPreProcessLibrary;
    public HashMap<String, String> mMetaData;
    public String mVideoPreProcessFuncName;
    public String mVideoPreProcessLibrary;
    public Bitmap mWatermark;
    public int mCustomModeType = 0;
    public int mAudioSample = 48000;
    public int mAudioChannels = 1;
    public int mVideoFPS = 20;
    public TXVideoResolution mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_540_960;
    public int mVideoBitrate = 1200;
    public int mMaxVideoBitrate = 1500;
    public int mMinVideoBitrate = 800;
    public int mBeautyLevel = 0;
    public int mWhiteningLevel = 0;
    public int mRuddyLevel = 0;
    public int mEyeScaleLevel = 0;
    public int mFaceSlimLevel = 0;
    public int mConnectRetryCount = 3;
    public int mConnectRetryInterval = 3;
    public int mWatermarkX = 0;
    public int mWatermarkY = 0;
    public float mWatermarkXF = 0.0f;
    public float mWatermarkYF = 0.0f;
    public float mWatermarkWidth = -1.0f;
    public int mVideoEncodeGop = 3;
    public boolean mVideoEncoderXMirror = false;
    public boolean mEnableHighResolutionCapture = false;
    public boolean mEnableVideoHardEncoderMainProfile = true;
    public boolean mFrontCamera = true;
    public boolean mAutoAdjustBitrate = false;
    public int mAutoAdjustStrategy = 0;
    public int mHardwareAccel = 2;
    public boolean mTouchFocus = true;
    public boolean mEnableZoom = false;
    public int mHomeOrientation = 1;
    public Bitmap mPauseImg = null;
    public int mPauseTime = 300;
    public int mPauseFps = 5;
    public int mPauseFlag = 1;
    public boolean mEnableAec = false;
    public boolean mEnableAgc = false;
    public boolean mEnableAns = false;
    public boolean mEnableAudioPreview = false;
    public boolean mEnableScreenCaptureAutoRotate = false;
    public boolean mEnablePureAudioPush = false;
    public boolean mEnableNearestIP = true;
    public int mVolumeType = 0;
    public int mLocalVideoMirrorType = 0;
    public int mRtmpChannelType = 0;

    public void setHardwareAcceleration(int i11) {
        if (i11 < 0) {
            i11 = 2;
        }
        this.mHardwareAccel = i11 <= 2 ? i11 : 2;
    }

    public void setPauseImg(Bitmap bitmap) {
        this.mPauseImg = bitmap;
    }

    public void setWatermark(Bitmap bitmap, int i11, int i12) {
        this.mWatermark = bitmap;
        this.mWatermarkX = i11;
        this.mWatermarkY = i12;
    }

    @Deprecated
    public void enableAEC(boolean z11) {
        this.mEnableAec = z11;
    }

    @Deprecated
    public void enableAGC(boolean z11) {
        this.mEnableAgc = z11;
    }

    public void enableANS(boolean z11) {
        this.mEnableAns = z11;
    }

    public void enableAudioEarMonitoring(boolean z11) {
        this.mEnableAudioPreview = z11;
    }

    @Deprecated
    public void enableHighResolutionCaptureMode(boolean z11) {
        this.mEnableHighResolutionCapture = z11;
    }

    @Deprecated
    public void enableNearestIP(boolean z11) {
        this.mEnableNearestIP = z11;
    }

    public void enablePureAudioPush(boolean z11) {
        this.mEnablePureAudioPush = z11;
    }

    public void enableScreenCaptureAutoRotate(boolean z11) {
        this.mEnableScreenCaptureAutoRotate = z11;
    }

    public void enableVideoHardEncoderMainProfile(boolean z11) {
        this.mEnableVideoHardEncoderMainProfile = z11;
    }

    public void setAudioChannels(int i11) {
        this.mAudioChannels = i11;
    }

    public void setAudioSampleRate(int i11) {
        this.mAudioSample = i11;
    }

    public void setAutoAdjustBitrate(boolean z11) {
        this.mAutoAdjustBitrate = z11;
    }

    public void setAutoAdjustStrategy(int i11) {
        this.mAutoAdjustStrategy = i11;
    }

    @Deprecated
    public void setBeautyFilter(int i11, int i12, int i13) {
        this.mBeautyLevel = i11;
        this.mWhiteningLevel = i12;
        this.mRuddyLevel = i13;
    }

    public void setConnectRetryCount(int i11) {
        this.mConnectRetryCount = i11;
    }

    public void setConnectRetryInterval(int i11) {
        this.mConnectRetryInterval = i11;
    }

    public void setCustomModeType(int i11) {
        this.mCustomModeType = i11;
    }

    public void setEnableZoom(boolean z11) {
        this.mEnableZoom = z11;
    }

    @Deprecated
    public void setEyeScaleLevel(int i11) {
        this.mEyeScaleLevel = i11;
    }

    @Deprecated
    public void setFaceSlimLevel(int i11) {
        this.mFaceSlimLevel = i11;
    }

    @Deprecated
    public void setFrontCamera(boolean z11) {
        this.mFrontCamera = z11;
    }

    public void setHomeOrientation(int i11) {
        this.mHomeOrientation = i11;
    }

    public void setLocalVideoMirrorType(int i11) {
        this.mLocalVideoMirrorType = i11;
    }

    public void setMaxVideoBitrate(int i11) {
        this.mMaxVideoBitrate = i11;
    }

    public void setMetaData(HashMap<String, String> map) {
        this.mMetaData = map;
    }

    public void setMinVideoBitrate(int i11) {
        this.mMinVideoBitrate = i11;
    }

    public void setPauseFlag(int i11) {
        this.mPauseFlag = i11;
    }

    @Deprecated
    public void setPauseImg(int i11, int i12) {
        this.mPauseTime = i11;
        this.mPauseFps = i12;
    }

    @Deprecated
    public void setRtmpChannelType(int i11) {
        this.mRtmpChannelType = i11;
    }

    public void setTouchFocus(boolean z11) {
        this.mTouchFocus = z11;
    }

    public void setVideoBitrate(int i11) {
        this.mVideoBitrate = i11;
    }

    public void setVideoEncodeGop(int i11) {
        this.mVideoEncodeGop = i11;
    }

    public void setVideoEncoderXMirror(boolean z11) {
        this.mVideoEncoderXMirror = z11;
    }

    public void setVideoFPS(int i11) {
        this.mVideoFPS = i11;
    }

    public void setVideoResolution(int i11) {
        if (i11 == 30) {
            this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1080_1920;
            return;
        }
        if (i11 == 31) {
            this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1920_1080;
            return;
        }
        switch (i11) {
            case 0:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_360_640;
                break;
            case 1:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_540_960;
                break;
            case 2:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_720_1280;
                break;
            case 3:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_640_360;
                break;
            case 4:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_960_540;
                break;
            case 5:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1280_720;
                break;
            case 6:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_480;
                break;
            case 7:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_180_320;
                break;
            case 8:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_270_480;
                break;
            case 9:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_180;
                break;
            case 10:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_270;
                break;
            case 11:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_240_320;
                break;
            case 12:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_360_480;
                break;
            case 13:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_640;
                break;
            case 14:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_240;
                break;
            case 15:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_360;
                break;
            case 16:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_640_480;
                break;
            case 17:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_480;
                break;
            case 18:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_270_270;
                break;
            case 19:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_160_160;
                break;
        }
    }

    public void setVolumeType(int i11) {
        this.mVolumeType = i11;
    }

    public String toString() {
        return "[resolution:" + this.mVideoResolution + "][fps:" + this.mVideoFPS + "][gop:" + this.mVideoEncodeGop + "][bitrate:" + this.mVideoBitrate + "][maxBitrate:" + this.mMaxVideoBitrate + "][minBitrate:" + this.mMinVideoBitrate + "][highCapture:" + this.mEnableHighResolutionCapture + "][hwAcc:" + this.mHardwareAccel + "][homeOrientation:" + this.mHomeOrientation + "][volumeType:" + this.mVolumeType + "][earMonitor:" + this.mEnableAudioPreview + "][agc:" + this.mEnableAgc + "][ans:" + this.mEnableAns + "][aec:" + this.mEnableAec + "][sample:" + this.mAudioSample + "][pureAudioPush:" + this.mEnablePureAudioPush + "]";
    }

    public void setWatermark(Bitmap bitmap, float f11, float f12, float f13) {
        this.mWatermark = bitmap;
        this.mWatermarkXF = f11;
        this.mWatermarkYF = f12;
        this.mWatermarkWidth = f13;
    }
}
