package com.tencent.liteav.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.tencent.bugly.proguard.C33643f6;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34745j;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.InterfaceC35199b;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class TXLivePusherJni implements ITXLivePushListener, TXLivePusher.AudioCustomProcessListener, TXLivePusher.ITXAudioVolumeEvaluationListener, TXLivePusher.ITXSnapshotListener, TXLivePusher.OnBGMNotify, TXLivePusher.VideoCustomProcessListener, InterfaceC35199b, TXCloudVideoView.InterfaceC35208b {
    private TXLivePusher.AudioCustomProcessListener mAudioCustomProcessListener;
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManagerImpl mBeautyManager;
    private TXLivePushConfig mConfig;
    private TXLivePusher.ITXAudioVolumeEvaluationListener mITXAudioVolumeEvaluationListener;
    private ITXLivePushListener mITXLivePushListener;
    private TXLivePusher.ITXSnapshotListener mITXSnapshotListener;
    private TXRecordCommon.ITXVideoRecordListener mITXVideoRecordListener;
    private long mNativeTXLivePusherJni;
    private TXLivePusher.OnBGMNotify mOnBGMNotify;
    private TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private int mVideoQuality = -1;

    private static native void nativeCallExperimentalAPI(long j11, String str);

    private static native long nativeCreate(WeakReference<TXLivePusherJni> weakReference);

    private static native long nativeCreateAudioEffectManager(long j11);

    private static native long nativeCreateBeautyManager(long j11);

    private static native void nativeDestroy(long j11);

    private static native void nativeEnableAudioVolumeEvaluation(long j11, int i11);

    private static native int nativeGetMaxZoom(long j11);

    private static native int nativeGetMusicDuration(long j11, String str);

    private static native boolean nativeIsPushing(long j11);

    private static native void nativeOnLogRecord(long j11, String str);

    private static native boolean nativePauseBGM(long j11);

    private static native void nativePausePusher(long j11);

    private static native boolean nativePlayBGM(long j11, String str);

    private static native boolean nativeResumeBGM(long j11);

    private static native void nativeResumePusher(long j11);

    private static native void nativeSendCustomPCMData(long j11, byte[] bArr);

    private static native void nativeSendCustomVideoFrame(long j11, int i11, int i12, int i13, int i14, int i15, Object obj, byte[] bArr);

    private static native void nativeSendMessage(long j11, byte[] bArr);

    private static native boolean nativeSendMessageEx(long j11, byte[] bArr);

    private static native void nativeSetAudioConfig(long j11, int i11, int i12, int i13, boolean z11, boolean z12);

    private static native void nativeSetBGMPitch(long j11, float f11);

    private static native boolean nativeSetBGMPosition(long j11, int i11);

    private static native boolean nativeSetBGMVolume(long j11, float f11);

    private static native boolean nativeSetBeautyFilter(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeSetCaptureConfig(long j11, int i11, int i12, Bitmap bitmap, int i13, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i14);

    private static native void nativeSetEncoderConfig(long j11, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16, int i17, boolean z12, int i18, boolean z13);

    private static native void nativeSetExposureCompensation(long j11, float f11);

    private static native void nativeSetFilter(long j11, Bitmap bitmap);

    private static native void nativeSetFocusPosition(long j11, float f11, float f12);

    private static native boolean nativeSetMicVolume(long j11, float f11);

    private static native boolean nativeSetMirror(long j11, boolean z11);

    private static native void nativeSetMute(long j11, boolean z11);

    private static native void nativeSetNetworkConfig(long j11, int i11, boolean z11, int i12, int i13, int i14, HashMap map);

    private static native void nativeSetRenderRotation(long j11, int i11);

    private static native void nativeSetReverb(long j11, int i11);

    private static native void nativeSetSpecialRatio(long j11, float f11);

    private static native void nativeSetView(long j11, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j11, int i11);

    private static native void nativeSetWaterMark(long j11, Bitmap bitmap, float f11, float f12, float f13);

    private static native boolean nativeSetZoom(long j11, int i11);

    private static native void nativeShowDebugView(long j11, boolean z11);

    private static native void nativeSnapshot(long j11);

    private static native void nativeStartCamera(long j11);

    private static native int nativeStartPusher(long j11, String str);

    private static native int nativeStartRecord(long j11, String str);

    private static native void nativeStartScreenCapture(long j11);

    private static native boolean nativeStopBGM(long j11);

    private static native void nativeStopCameraPreview(long j11, boolean z11);

    private static native void nativeStopPusher(long j11);

    private static native void nativeStopRecord(long j11);

    private static native void nativeStopScreenCapture(long j11);

    private static native void nativeSwitchCamera(long j11);

    private static native boolean nativeTurnOnFlashLight(long j11, boolean z11);

    @Override // com.tencent.rtmp.InterfaceC35199b
    public int sendCustomVideoData(byte[] bArr, int i11, int i12, int i13) {
        GLConstants.PixelFormatType pixelFormatType;
        if (i11 == 3) {
            pixelFormatType = GLConstants.PixelFormatType.I420;
        } else {
            if (i11 != 5) {
                return -3;
            }
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, i12, i13, GLConstants.EnumC34866a.BYTE_ARRAY.mValue, pixelFormatType.getValue(), -1, null, bArr);
        return 0;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void enableAudioVolumeEvaluation(int i11) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePusherJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public TXLivePushConfig getConfig() {
        return this.mConfig;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public int getMaxZoom() {
        return nativeGetMaxZoom(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public int getMusicDuration(String str) {
        return nativeGetMusicDuration(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean isPushing() {
        return nativeIsPushing(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i11) {
        TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mITXAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i11);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMComplete(int i11) {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMComplete(i11);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMProgress(long j11, long j12) {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMProgress(j11, j12);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMStart() {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMStart();
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onDetectFacePoints(float[] fArr) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onDetectFacePoints(fArr);
        }
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void onLogRecord(String str) {
        nativeOnLogRecord(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onNetStatus(Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onNetStatus(bundle);
        }
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onPushEvent(int i11, Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onPushEvent(i11, bundle);
        }
    }

    public void onRecordComplete(int i11, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
            if (i11 == 0) {
                tXRecordResult.retCode = 0;
            } else {
                tXRecordResult.retCode = -1;
            }
            tXRecordResult.descMsg = str;
            tXRecordResult.videoPath = str2;
            tXRecordResult.coverPath = str3;
            iTXVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    public void onRecordEvent(int i11, Bundle bundle) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i11, bundle);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordPcmData(byte[] bArr, long j11, int i11, int i12, int i13) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordPcmData(bArr, j11, i11, i12, i13);
        }
    }

    public void onRecordProgress(long j11) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j11);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordRawPcmData(byte[] bArr, long j11, int i11, int i12, int i13, boolean z11) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordRawPcmData(bArr, j11, i11, i12, i13, z11);
        }
    }

    @Override // com.tencent.rtmp.p148ui.TXCloudVideoView.InterfaceC35208b
    public void onShowLog(boolean z11) {
        nativeShowDebugView(this.mNativeTXLivePusherJni, z11);
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
    public void onSnapshot(Bitmap bitmap) {
        TXLivePusher.ITXSnapshotListener iTXSnapshotListener = this.mITXSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public int onTextureCustomProcess(int i11, int i12, int i13) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.onTextureCustomProcess(i11, i12, i13);
        }
        return -1;
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onTextureDestoryed() {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestoryed();
        }
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean pauseBGM() {
        return nativePauseBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void pausePusher() {
        nativePausePusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean playBGM(String str) {
        return nativePlayBGM(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void release() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j11 = this.mNativeTXLivePusherJni;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeTXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean resumeBGM() {
        return nativeResumeBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void resumePusher() {
        nativeResumePusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void sendCustomPCMData(byte[] bArr) {
        nativeSendCustomPCMData(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void sendMessage(byte[] bArr) {
        nativeSendMessage(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean sendMessageEx(byte[] bArr) {
        return nativeSendMessageEx(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
        this.mAudioCustomProcessListener = audioCustomProcessListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setAudioVolumeEvaluationListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mITXAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.mOnBGMNotify = onBGMNotify;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setBGMPitch(float f11) {
        nativeSetBGMPitch(this.mNativeTXLivePusherJni, f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setBGMPosition(int i11) {
        return nativeSetBGMPosition(this.mNativeTXLivePusherJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setBGMVolume(float f11) {
        return nativeSetBGMVolume(this.mNativeTXLivePusherJni, f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setBeautyFilter(int i11, int i12, int i13, int i14) {
        return nativeSetBeautyFilter(this.mNativeTXLivePusherJni, i11, i12, i13, i14);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setChinLevel(int i11) {
        this.mBeautyManager.setChinLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setConfig(TXLivePushConfig tXLivePushConfig) {
        if (tXLivePushConfig == null) {
            return;
        }
        this.mConfig = tXLivePushConfig;
        nativeSetCaptureConfig(this.mNativeTXLivePusherJni, tXLivePushConfig.mCustomModeType, tXLivePushConfig.mLocalVideoMirrorType, tXLivePushConfig.mPauseImg, tXLivePushConfig.mPauseFps, tXLivePushConfig.mFrontCamera, tXLivePushConfig.mTouchFocus, tXLivePushConfig.mEnableZoom, tXLivePushConfig.mEnableScreenCaptureAutoRotate, tXLivePushConfig.mEnableHighResolutionCapture, tXLivePushConfig.mPauseFlag);
        long j11 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig2 = this.mConfig;
        int i11 = tXLivePushConfig2.mHomeOrientation;
        int iOrdinal = tXLivePushConfig2.mVideoResolution.ordinal();
        TXLivePushConfig tXLivePushConfig3 = this.mConfig;
        nativeSetEncoderConfig(j11, i11, iOrdinal, tXLivePushConfig3.mAutoAdjustBitrate, tXLivePushConfig3.mVideoBitrate, tXLivePushConfig3.mMaxVideoBitrate, tXLivePushConfig3.mMinVideoBitrate, tXLivePushConfig3.mVideoEncodeGop, tXLivePushConfig3.mVideoFPS, tXLivePushConfig3.mVideoEncoderXMirror, tXLivePushConfig3.mHardwareAccel, tXLivePushConfig3.mEnableVideoHardEncoderMainProfile);
        long j12 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig4 = this.mConfig;
        nativeSetWaterMark(j12, tXLivePushConfig4.mWatermark, tXLivePushConfig4.mWatermarkXF, tXLivePushConfig4.mWatermarkYF, tXLivePushConfig4.mWatermarkWidth);
        long j13 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig5 = this.mConfig;
        nativeSetAudioConfig(j13, tXLivePushConfig5.mAudioChannels, tXLivePushConfig5.mAudioSample, tXLivePushConfig5.mVolumeType, tXLivePushConfig5.mEnableAudioPreview, tXLivePushConfig5.mEnableAns);
        long j14 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig6 = this.mConfig;
        nativeSetNetworkConfig(j14, tXLivePushConfig6.mAutoAdjustStrategy, tXLivePushConfig6.mEnablePureAudioPush, tXLivePushConfig6.mConnectRetryCount, tXLivePushConfig6.mConnectRetryInterval, tXLivePushConfig6.mRtmpChannelType, tXLivePushConfig6.mMetaData);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setExposureCompensation(float f11) {
        nativeSetExposureCompensation(this.mNativeTXLivePusherJni, f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setEyeScaleLevel(int i11) {
        this.mBeautyManager.setEyeScaleLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setFaceShortLevel(int i11) {
        this.mBeautyManager.setFaceShortLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setFaceSlimLevel(int i11) {
        this.mBeautyManager.setFaceSlimLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setFaceVLevel(int i11) {
        this.mBeautyManager.setFaceVLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setFilter(Bitmap bitmap) {
        nativeSetFilter(this.mNativeTXLivePusherJni, bitmap);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setFocusPosition(float f11, float f12) {
        nativeSetFocusPosition(this.mNativeTXLivePusherJni, f11, f12);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setGreenScreenFile(String str) {
        return this.mBeautyManager.setGreenScreenFile(str) != 0;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setMicVolume(float f11) {
        return nativeSetMicVolume(this.mNativeTXLivePusherJni, f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setMirror(boolean z11) {
        return nativeSetMirror(this.mNativeTXLivePusherJni, z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setMotionMute(boolean z11) {
        this.mBeautyManager.setMotionMute(z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setMotionTmpl(String str) {
        this.mBeautyManager.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setMute(boolean z11) {
        nativeSetMute(this.mNativeTXLivePusherJni, z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setNoseSlimLevel(int i11) {
        this.mBeautyManager.setNoseSlimLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.mITXLivePushListener = iTXLivePushListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setRenderRotation(int i11) {
        nativeSetRenderRotation(this.mNativeTXLivePusherJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setReverb(int i11) {
        nativeSetReverb(this.mNativeTXLivePusherJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setSpecialRatio(float f11) {
        nativeSetSpecialRatio(this.mNativeTXLivePusherJni, f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setSurface(Surface surface) {
        nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(surface));
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        this.mVideoCustomProcessListener = videoCustomProcessListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setVideoQuality(int i11, boolean z11, boolean z12) {
        Object[] objArr = z11 && z12;
        this.mConfig.setHardwareAcceleration(1);
        this.mConfig.setAutoAdjustBitrate(z11);
        switch (i11) {
            case 1:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(z12 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(301);
                } else {
                    this.mConfig.setMinVideoBitrate(500);
                }
                this.mConfig.setVideoBitrate(800);
                this.mConfig.setMaxVideoBitrate(900);
                break;
            case 2:
                this.mConfig.setVideoResolution(1);
                this.mConfig.setAutoAdjustStrategy(z12 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(800);
                }
                this.mConfig.setVideoBitrate(1200);
                this.mConfig.setMaxVideoBitrate(1500);
                break;
            case 3:
                this.mConfig.setVideoResolution(2);
                this.mConfig.setAutoAdjustStrategy(z12 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(1000);
                }
                this.mConfig.setVideoBitrate(1800);
                this.mConfig.setMaxVideoBitrate(1800);
                break;
            case 4:
                int i12 = this.mVideoQuality;
                if (i12 == 1) {
                    this.mConfig.setVideoResolution(0);
                    this.mConfig.setMinVideoBitrate(500);
                    this.mConfig.setVideoBitrate(800);
                    this.mConfig.setMaxVideoBitrate(900);
                } else if (i12 == 3) {
                    this.mConfig.setVideoResolution(2);
                    this.mConfig.setMinVideoBitrate(1000);
                    this.mConfig.setVideoBitrate(1800);
                    this.mConfig.setMaxVideoBitrate(1800);
                } else if (i12 == 7) {
                    this.mConfig.setVideoResolution(30);
                    this.mConfig.setMinVideoBitrate(2000);
                    this.mConfig.setVideoBitrate(3000);
                    this.mConfig.setMaxVideoBitrate(3000);
                } else {
                    this.mConfig.setVideoResolution(1);
                    this.mConfig.setMinVideoBitrate(800);
                    this.mConfig.setVideoBitrate(1200);
                    this.mConfig.setMaxVideoBitrate(1500);
                }
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 5:
                this.mConfig.setVideoResolution(6);
                this.mConfig.setMinVideoBitrate(350);
                this.mConfig.setVideoBitrate(350);
                this.mConfig.setMaxVideoBitrate(350);
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 6:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(5);
                this.mConfig.setVideoEncodeGop(1);
                this.mConfig.setMinVideoBitrate(190);
                this.mConfig.setVideoBitrate(400);
                this.mConfig.setMaxVideoBitrate(C33643f6.f69864t);
                break;
            case 7:
                this.mConfig.setVideoResolution(30);
                this.mConfig.setAutoAdjustStrategy(z12 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
                }
                this.mConfig.setVideoBitrate(3000);
                this.mConfig.setMaxVideoBitrate(3000);
                break;
            default:
                return;
        }
        this.mVideoQuality = i11;
        setConfig(this.mConfig);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mITXVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setVoiceChangerType(int i11) {
        nativeSetVoiceChangerType(this.mNativeTXLivePusherJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean setZoom(int i11) {
        return nativeSetZoom(this.mNativeTXLivePusherJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void snapshot(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.mITXSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            C34762a.m76162a(tXCloudVideoView, new WeakReference(this));
            nativeShowDebugView(this.mNativeTXLivePusherJni, C34762a.m76163a(tXCloudVideoView));
        }
        nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(tXCloudVideoView));
        nativeStartCamera(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public int startPusher(String str) {
        return nativeStartPusher(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public int startRecord(String str) {
        return nativeStartRecord(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void startScreenCapture() {
        nativeStartScreenCapture(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean stopBGM() {
        return nativeStopBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void stopCameraPreview(boolean z11) {
        nativeStopCameraPreview(this.mNativeTXLivePusherJni, z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void stopPusher() {
        nativeStopPusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void stopRecord() {
        nativeStopRecord(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void stopScreenCapture() {
        nativeStopScreenCapture(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void switchCamera() {
        TXLivePushConfig tXLivePushConfig = this.mConfig;
        tXLivePushConfig.setFrontCamera(!tXLivePushConfig.mFrontCamera);
        nativeSwitchCamera(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public boolean turnOnFlashLight(boolean z11) {
        return nativeTurnOnFlashLight(this.mNativeTXLivePusherJni, z11);
    }

    public TXLivePusherJni(Context context) {
        this.mNativeTXLivePusherJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mConfig = new TXLivePushConfig();
        long jNativeCreate = nativeCreate(new WeakReference(this));
        this.mNativeTXLivePusherJni = jNativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(jNativeCreate));
        this.mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeTXLivePusherJni));
        if (context instanceof Activity) {
            C34745j.m76118a().m76124a((Activity) context);
        }
    }

    public static String[] getMapKeys(HashMap<String, String> map) {
        String[] strArr = new String[map.size()];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        return strArr;
    }

    public static String[] getMapValues(HashMap<String, String> map, String[] strArr) {
        String[] strArr2 = new String[map.size()];
        int length = strArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            strArr2[i12] = map.get(strArr[i11]);
            i11++;
            i12++;
        }
        return strArr2;
    }

    public static boolean isMapValid(HashMap<String, String> map) {
        for (String str : map.keySet()) {
            if (str == null || map.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static TXLivePusherJni weakToStrongReference(WeakReference<TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public void finalize() throws Throwable {
        super.finalize();
        release();
    }

    public int onCustomPreprocessFrame(int i11, int i12, int i13) {
        return onTextureCustomProcess(i11, i12, i13);
    }

    public byte[] onNativeRecordPcmData(byte[] bArr, long j11, int i11, int i12, int i13) {
        onRecordPcmData(bArr, j11, i11, i12, i13);
        return bArr;
    }

    public byte[] onNativeRecordRawPcmData(byte[] bArr, long j11, int i11, int i12, int i13, boolean z11) {
        onRecordRawPcmData(bArr, j11, i11, i12, i13, z11);
        return bArr;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public int sendCustomVideoTexture(int i11, int i12, int i13) {
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eGLContextEglGetCurrentContext == null) {
            return -1;
        }
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, i12, i13, GLConstants.EnumC34866a.TEXTURE_2D.mValue, GLConstants.PixelFormatType.RGBA.getValue(), i11, eGLContextEglGetCurrentContext, null);
        return 0;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public void setSurfaceSize(int i11, int i12) {
    }
}
