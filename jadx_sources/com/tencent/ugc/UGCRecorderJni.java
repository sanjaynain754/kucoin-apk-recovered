package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCRecorderJni {
    private static final int DEFAULT_AUDIO_SAMPLE_RATE = 48000;
    private static final int DEFAULT_MAX_DURATION = 60000;
    private static final int DEFAULT_MIN_DURATION = 5000;
    private static final int DEFAULT_VIDEO_BITRATE = 1800;
    private static final int DEFAULT_VIDEO_FPS = 20;
    private static final int DEFAULT_VIDEO_GOP = 3;
    private static final int DEFAULT_VIDEO_HEIGHT = 960;
    private static final int DEFAULT_VIDEO_WIDTH = 540;
    private static final String OUTPUT_DIR_NAME = "TXUGC";
    private static final String OUTPUT_TEMP_DIR_NAME = "TXUGCParts";
    private static final String OUTPUT_VIDEO_COVER_NAME = "TXUGCCover.jpg";
    private static final String OUTPUT_VIDEO_NAME = "TXUGCRecord.mp4";
    private static final int SIMPLE_FUNCTION_MAX_DURATION = 30000;
    private static final String TAG = "UGCRecorderJni";
    private TXRecordCommon.ITXBGMNotify mBGMListener;
    private final TXBeautyManager mBeautyManager;
    private final Context mContext;
    private String mCoverPath;
    private TXUGCRecord.VideoCustomProcessListener mCustomProcessListener;
    private long mNativeUGCRecorderJni;
    private TXRecordCommon.ITXSnapshotListener mSnapshotListener;
    private final TXUGCPartsManager mTXUGCPartsManager;
    private String mVideoFilePath;
    private String mVideoPartFolder;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private boolean mIsUseUnauthorizedAdvancedFeatures = false;
    private final RecordParams mRecorderParams = new RecordParams();

    public static class RecordParams {

        /* JADX INFO: renamed from: a */
        public int f76702a = 540;

        /* JADX INFO: renamed from: b */
        public int f76703b = UGCRecorderJni.DEFAULT_VIDEO_HEIGHT;

        /* JADX INFO: renamed from: c */
        public int f76704c = 20;

        /* JADX INFO: renamed from: d */
        public int f76705d = UGCRecorderJni.DEFAULT_VIDEO_BITRATE;

        /* JADX INFO: renamed from: e */
        public int f76706e = 3;

        /* JADX INFO: renamed from: f */
        public boolean f76707f = true;

        /* JADX INFO: renamed from: g */
        public boolean f76708g = false;

        /* JADX INFO: renamed from: h */
        public int f76709h = 5000;

        /* JADX INFO: renamed from: i */
        public int f76710i = 60000;

        /* JADX INFO: renamed from: j */
        public int f76711j = 48000;

        /* JADX INFO: renamed from: k */
        public boolean f76712k = true;

        /* JADX INFO: renamed from: l */
        public EnumC34876d f76713l = EnumC34876d.HIGH;

        /* JADX INFO: renamed from: m */
        public boolean f76714m = true;

        /* JADX INFO: renamed from: n */
        public boolean f76715n = true;

        /* JADX INFO: renamed from: o */
        public boolean f76716o = true;

        public boolean enableAEC() {
            return this.f76714m;
        }

        public boolean enableAGC() {
            return this.f76715n;
        }

        public boolean enableANS() {
            return this.f76716o;
        }

        public int getAudioSampleRate() {
            return this.f76711j;
        }

        public int getMaxDuration() {
            return this.f76710i;
        }

        public int getMinDuration() {
            return this.f76709h;
        }

        public int getVideoBitrate() {
            return this.f76705d;
        }

        public int getVideoFps() {
            return this.f76704c;
        }

        public int getVideoGop() {
            return this.f76706e;
        }

        public int getVideoHeight() {
            return this.f76703b;
        }

        public int getVideoProfile() {
            return this.f76713l.mValue;
        }

        public int getVideoWidth() {
            return this.f76702a;
        }

        public boolean isFullIFrame() {
            return this.f76712k;
        }
    }

    private void initRecorderParams(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig) {
        if (tXUGCSimpleConfig == null) {
            LiteavLog.m76087i(TAG, "init Recorder Params. config is null");
            return;
        }
        int i11 = tXUGCSimpleConfig.videoQuality;
        if (i11 == 0) {
            RecordParams recordParams = this.mRecorderParams;
            recordParams.f76702a = TXVodDownloadDataSource.QUALITY_360P;
            recordParams.f76703b = C33556b3.f69051i;
            recordParams.f76705d = 2000;
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_BD);
        } else if (i11 == 1) {
            RecordParams recordParams2 = this.mRecorderParams;
            recordParams2.f76702a = TXVodDownloadDataSource.QUALITY_480P;
            recordParams2.f76703b = C33556b3.f69051i;
            recordParams2.f76705d = 3200;
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_HD);
        } else if (i11 != 3) {
            RecordParams recordParams3 = this.mRecorderParams;
            recordParams3.f76702a = 540;
            recordParams3.f76703b = DEFAULT_VIDEO_HEIGHT;
            recordParams3.f76705d = 5200;
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_HD);
        } else {
            RecordParams recordParams4 = this.mRecorderParams;
            recordParams4.f76702a = 720;
            recordParams4.f76703b = 1280;
            recordParams4.f76705d = 7200;
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_FHD);
        }
        UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_VIDEO_BITRATE, this.mRecorderParams.f76705d, "");
        RecordParams recordParams5 = this.mRecorderParams;
        recordParams5.f76704c = 30;
        recordParams5.f76712k = tXUGCSimpleConfig.needEdit;
        recordParams5.f76707f = tXUGCSimpleConfig.isFront;
        recordParams5.f76708g = tXUGCSimpleConfig.touchFocus;
        recordParams5.f76713l = recordProfileToVideoProfileType(tXUGCSimpleConfig.profile);
        RecordParams recordParams6 = this.mRecorderParams;
        recordParams6.f76709h = tXUGCSimpleConfig.minDuration;
        recordParams6.f76710i = tXUGCSimpleConfig.maxDuration;
        recordParams6.f76714m = true;
        recordParams6.f76715n = true;
        recordParams6.f76716o = true;
        if (tXUGCSimpleConfig.needEdit) {
            recordParams6.f76706e = 1;
            recordParams6.f76705d = getEditBitrateWithSize(recordParams6.f76702a, recordParams6.f76703b);
        }
        UGCDataReport.reportDAU(1049, this.mRecorderParams.f76704c, "");
    }

    private static native long nativeCreate(UGCRecorderJni uGCRecorderJni);

    private static native long nativeCreateBeautyManager(long j11);

    private static native long nativeCreatePartsManager(long j11);

    private static native void nativeDestroy(long j11);

    private static native void nativeEnableBGMNotify(long j11, boolean z11);

    private static native void nativeEnableCameraAutoFocus(long j11, boolean z11);

    private static native void nativeEnableVideoCustomPreprocess(long j11, boolean z11);

    private static native int nativeGetMusicDuration(long j11, String str);

    private static native int nativeGetZoomLevel(long j11);

    private static native boolean nativePauseBGM(long j11);

    private static native int nativePauseRecord(long j11);

    private static native boolean nativePlayBGM(long j11, int i11, int i12);

    private static native boolean nativeResumeBGM(long j11);

    private static native int nativeResumeRecord(long j11);

    private static native void nativeSetAspectRatio(long j11, int i11);

    private static native void nativeSetBGMLoop(long j11, boolean z11);

    private static native int nativeSetBGMPath(long j11, String str);

    private static native boolean nativeSetBGMVolume(long j11, int i11);

    private static native void nativeSetFilter(long j11, Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13);

    private static native void nativeSetFocusPosition(long j11, float f11, float f12);

    private static native void nativeSetHomeOrientation(long j11, int i11);

    private static native void nativeSetMicVolume(long j11, int i11);

    public static native void nativeSetMute(long j11, boolean z11);

    private static native void nativeSetRecordParams(long j11, RecordParams recordParams);

    private static native void nativeSetRecordSpeed(long j11, int i11);

    private static native void nativeSetRenderMirrorType(long j11, int i11);

    private static native void nativeSetRenderMode(long j11, int i11);

    private static native void nativeSetRenderRotation(long j11, int i11);

    private static native void nativeSetReverbType(long j11, int i11);

    private static native void nativeSetVideoEncoderMirror(long j11, boolean z11);

    private static native void nativeSetView(long j11, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j11, int i11);

    private static native void nativeSetWatermark(long j11, Bitmap bitmap, float f11, float f12, float f13);

    private static native boolean nativeSetZoomLevel(long j11, int i11);

    private static native void nativeSnapshot(long j11);

    private static native void nativeStartCamera(long j11, boolean z11);

    private static native int nativeStartRecord(long j11, String str, String str2, String str3);

    private static native boolean nativeStopBGM(long j11);

    private static native void nativeStopCamera(long j11);

    private static native int nativeStopRecord(long j11);

    private static native boolean nativeSwitchCamera(long j11, boolean z11);

    private static native boolean nativeTurnOnTorch(long j11, boolean z11);

    private EnumC34876d recordProfileToVideoProfileType(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? EnumC34876d.HIGH : EnumC34876d.MAIN;
        }
        return EnumC34876d.BASELINE;
    }

    public void release() {
        setVoiceChangerType(0);
        setReverb(0);
        setRecordSpeed(2);
        stopBGM();
        stopCameraPreview();
        stopRecord();
    }

    public void setFilter(Bitmap bitmap) {
        this.mBeautyManager.setFilter(bitmap);
    }

    public void setVideoProcessListener(TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener) {
        this.mIsUseUnauthorizedAdvancedFeatures = true;
        this.mCustomProcessListener = videoCustomProcessListener;
        nativeEnableVideoCustomPreprocess(this.mNativeUGCRecorderJni, videoCustomProcessListener != null);
    }

    public int startRecord() {
        UGCDataReport.reportDAU(1002);
        return nativeStartRecord(this.mNativeUGCRecorderJni, this.mVideoFilePath, this.mVideoPartFolder, this.mCoverPath);
    }

    private String getDefaultDir() {
        File fileM76108a = C34741f.m76108a(this.mContext, OUTPUT_DIR_NAME);
        if (fileM76108a == null) {
            fileM76108a = this.mContext.getFilesDir();
        }
        return fileM76108a != null ? fileM76108a.getPath() : "";
    }

    private int getEditBitrateWithSize(int i11, int i12) {
        if (i11 <= 640 && i12 <= 640) {
            return 2000;
        }
        if (i11 > DEFAULT_VIDEO_HEIGHT || i12 > DEFAULT_VIDEO_HEIGHT) {
            return (i11 > 1280 || i12 > 1280) ? 12000 : 7200;
        }
        return 5200;
    }

    private Size getVideoSize(int i11) {
        Size size = new Size();
        if (i11 == 0) {
            size.width = TXVodDownloadDataSource.QUALITY_360P;
            size.height = C33556b3.f69051i;
            return size;
        }
        if (i11 == 1) {
            size.width = TXVodDownloadDataSource.QUALITY_480P;
            size.height = C33556b3.f69051i;
            return size;
        }
        if (i11 == 3) {
            size.width = 720;
            size.height = 1280;
            return size;
        }
        if (i11 != 4) {
            size.width = 540;
            size.height = DEFAULT_VIDEO_HEIGHT;
            return size;
        }
        size.width = TXVodDownloadDataSource.QUALITY_1080P;
        size.height = 1920;
        return size;
    }

    public static /* synthetic */ void lambda$onRecordComplete$0(int i11, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
        tXRecordResult.retCode = i11;
        tXRecordResult.descMsg = str;
        tXRecordResult.videoPath = str2;
        tXRecordResult.coverPath = str3;
        iTXVideoRecordListener.onRecordComplete(tXRecordResult);
    }

    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    public int getMaxZoom() {
        return nativeGetZoomLevel(this.mNativeUGCRecorderJni);
    }

    public int getMusicDuration(String str) {
        long j11 = this.mNativeUGCRecorderJni;
        if (str == null) {
            str = "";
        }
        return nativeGetMusicDuration(j11, str);
    }

    public TXUGCPartsManager getPartsManager() {
        return this.mTXUGCPartsManager;
    }

    public boolean isUseAdvanceFunction() {
        TXBeautyManager tXBeautyManager = this.mBeautyManager;
        if (tXBeautyManager instanceof UGCBeautyManager) {
            this.mIsUseUnauthorizedAdvancedFeatures = ((UGCBeautyManager) tXBeautyManager).getIsUseBeautyFunction() | this.mIsUseUnauthorizedAdvancedFeatures;
        }
        return this.mIsUseUnauthorizedAdvancedFeatures;
    }

    public void onBGMComplete(int i11) {
        TXRecordCommon.ITXBGMNotify iTXBGMNotify = this.mBGMListener;
        if (iTXBGMNotify != null) {
            iTXBGMNotify.onBGMComplete(i11);
        }
    }

    public void onBGMProgress(long j11, long j12) {
        TXRecordCommon.ITXBGMNotify iTXBGMNotify = this.mBGMListener;
        if (iTXBGMNotify != null) {
            iTXBGMNotify.onBGMProgress(j11, j12);
        }
    }

    public void onBGMStart() {
        TXRecordCommon.ITXBGMNotify iTXBGMNotify = this.mBGMListener;
        if (iTXBGMNotify != null) {
            iTXBGMNotify.onBGMStart();
        }
    }

    public void onGLContextDestroy() {
        TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener = this.mCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestroyed();
        }
    }

    public int onPreprocessVideoFrame(int i11, int i12, int i13) {
        TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener = this.mCustomProcessListener;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.onTextureCustomProcess(i11, i12, i13);
        }
        return -1;
    }

    public void onRecordComplete(int i11, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            createThumbFile(str2, str3);
            ThreadUtils.getUiThreadHandler().post(RunnableC35676fg.m79170a(i11, str, str2, str3, iTXVideoRecordListener));
        }
    }

    public void onRecordEvent(int i11) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i11, new Bundle());
        }
    }

    public void onRecordProgress(long j11) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j11);
        }
    }

    public void onSnapshot(Bitmap bitmap) {
        TXRecordCommon.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    public boolean pauseBGM() {
        return nativePauseBGM(this.mNativeUGCRecorderJni);
    }

    public int pauseRecord() {
        return nativePauseRecord(this.mNativeUGCRecorderJni);
    }

    public boolean playBGMFromTime(int i11, int i12) {
        UGCDataReport.reportDAU(1008);
        return nativePlayBGM(this.mNativeUGCRecorderJni, i11, i12);
    }

    public boolean resumeBGM() {
        return nativeResumeBGM(this.mNativeUGCRecorderJni);
    }

    public int resumeRecord() {
        return nativeResumeRecord(this.mNativeUGCRecorderJni);
    }

    public boolean seekBGM(int i11, int i12) {
        return nativePlayBGM(this.mNativeUGCRecorderJni, i11, i12);
    }

    public void setAspectRatio(int i11) {
        nativeSetAspectRatio(this.mNativeUGCRecorderJni, i11);
        if (i11 == 0) {
            UGCDataReport.reportDAU(1055);
            return;
        }
        if (i11 == 1) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RATIO_3_4);
            return;
        }
        if (i11 == 2) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RATIO_1_1);
        } else if (i11 == 3) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RATIO_16_9);
        } else if (i11 == 4) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RATIO_4_3);
        }
    }

    public int setBGM(String str) {
        UGCDataReport.reportDAU(1052);
        long j11 = this.mNativeUGCRecorderJni;
        if (str == null) {
            str = "";
        }
        return nativeSetBGMPath(j11, str);
    }

    public void setBGMLoop(boolean z11) {
        nativeSetBGMLoop(this.mNativeUGCRecorderJni, z11);
    }

    public void setBGMNotify(TXRecordCommon.ITXBGMNotify iTXBGMNotify) {
        this.mBGMListener = iTXBGMNotify;
        nativeEnableBGMNotify(this.mNativeUGCRecorderJni, iTXBGMNotify != null);
    }

    public boolean setBGMVolume(float f11) {
        return nativeSetBGMVolume(this.mNativeUGCRecorderJni, (int) (f11 * 100.0f));
    }

    public void setBeautyDepth(int i11, int i12, int i13, int i14) {
        this.mBeautyManager.setBeautyStyle(i11);
        this.mBeautyManager.setBeautyLevel(i12);
        this.mBeautyManager.setWhitenessLevel(i13);
        this.mBeautyManager.setRuddyLevel(i14);
    }

    public void setBeautyStyle(int i11) {
        this.mBeautyManager.setBeautyStyle(i11);
    }

    public void setChinLevel(int i11) {
        this.mBeautyManager.setChinLevel(i11);
    }

    public void setEyeScaleLevel(float f11) {
        this.mBeautyManager.setEyeScaleLevel(f11);
    }

    public void setFaceScaleLevel(float f11) {
        this.mBeautyManager.setFaceSlimLevel(f11);
    }

    public void setFaceShortLevel(int i11) {
        this.mBeautyManager.setFaceShortLevel(i11);
    }

    public void setFaceVLevel(int i11) {
        this.mBeautyManager.setFaceVLevel(i11);
    }

    public void setFilter(Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13) {
        this.mIsUseUnauthorizedAdvancedFeatures = true;
        nativeSetFilter(this.mNativeUGCRecorderJni, bitmap, f11, bitmap2, f12, f13);
    }

    public void setFocusPosition(float f11, float f12) {
        if (this.mRecorderParams.f76708g) {
            nativeSetFocusPosition(this.mNativeUGCRecorderJni, f11, f12);
        }
    }

    public void setGreenScreenFile(String str, boolean z11) {
        TXBeautyManager tXBeautyManager = this.mBeautyManager;
        if (str == null) {
            str = "";
        }
        tXBeautyManager.setGreenScreenFile(str);
    }

    public void setHomeOrientation(int i11) {
        nativeSetHomeOrientation(this.mNativeUGCRecorderJni, i11);
    }

    public boolean setMicVolume(float f11) {
        nativeSetMicVolume(this.mNativeUGCRecorderJni, (int) (f11 * 100.0f));
        return true;
    }

    public void setMotionMute(boolean z11) {
        this.mBeautyManager.setMotionMute(z11);
    }

    public void setMotionTmpl(String str) {
        TXBeautyManager tXBeautyManager = this.mBeautyManager;
        if (str == null) {
            str = "";
        }
        tXBeautyManager.setMotionTmpl(str);
    }

    public void setMute(boolean z11) {
        nativeSetMute(this.mNativeUGCRecorderJni, z11);
    }

    public void setNoseSlimLevel(int i11) {
        this.mBeautyManager.setNoseSlimLevel(i11);
    }

    public void setRecordSpeed(int i11) {
        nativeSetRecordSpeed(this.mNativeUGCRecorderJni, i11);
        if (i11 == 0) {
            UGCDataReport.reportDAU(1051, i11, "SLOWEST");
            return;
        }
        if (i11 == 1) {
            UGCDataReport.reportDAU(1051, i11, "SLOW");
            return;
        }
        if (i11 == 2) {
            UGCDataReport.reportDAU(1051, i11, OtcAd.STATUS_NORMAL);
        } else if (i11 == 3) {
            UGCDataReport.reportDAU(1051, i11, "FAST");
        } else {
            if (i11 != 4) {
                return;
            }
            UGCDataReport.reportDAU(1051, i11, "FASTEST");
        }
    }

    public void setRenderRotation(int i11) {
        nativeSetRenderRotation(this.mNativeUGCRecorderJni, i11);
    }

    public void setReverb(int i11) {
        nativeSetReverbType(this.mNativeUGCRecorderJni, i11);
        UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_REVERB, i11, "");
        UGCDataReport.reportDAU(1007);
    }

    public void setSpecialRatio(float f11) {
        this.mBeautyManager.setFilterStrength(f11);
    }

    public void setVideoBitrate(int i11) {
        RecordParams recordParams = this.mRecorderParams;
        recordParams.f76705d = i11;
        nativeSetRecordParams(this.mNativeUGCRecorderJni, recordParams);
    }

    public void setVideoEncoderMirror(boolean z11) {
        nativeSetVideoEncoderMirror(this.mNativeUGCRecorderJni, z11);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    public void setVideoRenderMirrorType(int i11) {
        nativeSetRenderMirrorType(this.mNativeUGCRecorderJni, i11);
    }

    public void setVideoRenderMode(int i11) {
        nativeSetRenderMode(this.mNativeUGCRecorderJni, i11);
    }

    public void setVoiceChangerType(int i11) {
        nativeSetVoiceChangerType(this.mNativeUGCRecorderJni, i11);
        UGCDataReport.reportDAU(1053, i11, "");
    }

    public void setWatermark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        nativeSetWatermark(this.mNativeUGCRecorderJni, bitmap, tXRect.f76678x, tXRect.f76679y, tXRect.width);
    }

    public boolean setZoom(int i11) {
        return nativeSetZoomLevel(this.mNativeUGCRecorderJni, i11);
    }

    public void snapshot(TXRecordCommon.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeUGCRecorderJni);
    }

    public boolean stopBGM() {
        return nativeStopBGM(this.mNativeUGCRecorderJni);
    }

    public void stopCameraPreview() {
        nativeEnableVideoCustomPreprocess(this.mNativeUGCRecorderJni, false);
        nativeStopCamera(this.mNativeUGCRecorderJni);
    }

    public int stopRecord() {
        return nativeStopRecord(this.mNativeUGCRecorderJni);
    }

    public boolean switchCamera(boolean z11) {
        return nativeSwitchCamera(this.mNativeUGCRecorderJni, z11);
    }

    public boolean toggleTorch(boolean z11) {
        return nativeTurnOnTorch(this.mNativeUGCRecorderJni, z11);
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public UGCRecorderJni(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        UGCInitializer.initialize();
        long jNativeCreate = nativeCreate(this);
        this.mNativeUGCRecorderJni = jNativeCreate;
        this.mBeautyManager = new UGCBeautyManager(nativeCreateBeautyManager(jNativeCreate));
        this.mTXUGCPartsManager = new TXUGCPartsManagerImpl(nativeCreatePartsManager(this.mNativeUGCRecorderJni));
        initFileAndFolder();
    }

    private int checkRecordPath(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e(TAG, "startRecord: init videoRecord failed, videoFilePath is empty");
            return -2;
        }
        this.mVideoFilePath = str;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (!TextUtils.isEmpty(str3)) {
            this.mCoverPath = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mVideoPartFolder = str2;
        }
        File file2 = new File(this.mVideoPartFolder);
        if (!file2.exists()) {
            file2.mkdirs();
            return 0;
        }
        return 0;
    }

    private void createThumbFile(String str, String str2) {
        Bitmap sampleImage;
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (sampleImage = TXVideoInfoReader.getInstance(this.mContext).getSampleImage(0L, str)) != null) {
            try {
                File file = new File(str2);
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    sampleImage.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    C34741f.m76109a(fileOutputStream);
                } catch (Throwable unused) {
                    C34741f.m76109a(fileOutputStream);
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        }
    }

    private void initFileAndFolder() {
        String defaultDir = getDefaultDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(defaultDir);
        String str = File.separator;
        sb2.append(str);
        sb2.append(OUTPUT_VIDEO_NAME);
        this.mVideoFilePath = sb2.toString();
        this.mCoverPath = defaultDir + str + OUTPUT_VIDEO_COVER_NAME;
        this.mVideoPartFolder = defaultDir + str + OUTPUT_TEMP_DIR_NAME;
        File file = new File(this.mVideoPartFolder);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(this.mVideoFilePath);
        if (file2.exists()) {
            file2.delete();
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j11 = this.mNativeUGCRecorderJni;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeUGCRecorderJni = 0L;
        }
        UGCInitializer.uninitialize();
    }

    public void setVideoResolution(int i11) {
        Size videoSize = getVideoSize(i11);
        RecordParams recordParams = this.mRecorderParams;
        recordParams.f76702a = videoSize.width;
        recordParams.f76703b = videoSize.height;
        nativeSetRecordParams(this.mNativeUGCRecorderJni, recordParams);
    }

    public int startCameraCustomPreview(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig, TXCloudVideoView tXCloudVideoView) {
        Bitmap bitmap;
        initRecorderParams(tXUGCCustomConfig);
        nativeSetRecordParams(this.mNativeUGCRecorderJni, this.mRecorderParams);
        nativeSetView(this.mNativeUGCRecorderJni, new DisplayTarget(tXCloudVideoView));
        boolean z11 = true;
        nativeEnableCameraAutoFocus(this.mNativeUGCRecorderJni, !this.mRecorderParams.f76708g);
        nativeStartCamera(this.mNativeUGCRecorderJni, this.mRecorderParams.f76707f);
        long j11 = this.mNativeUGCRecorderJni;
        if (this.mCustomProcessListener == null) {
            z11 = false;
        }
        nativeEnableVideoCustomPreprocess(j11, z11);
        if (tXUGCCustomConfig != null && (bitmap = tXUGCCustomConfig.watermark) != null) {
            nativeSetWatermark(this.mNativeUGCRecorderJni, bitmap, tXUGCCustomConfig.watermarkX, tXUGCCustomConfig.watermarkY, bitmap.getWidth());
        }
        return 0;
    }

    public int startCameraSimplePreview(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig, TXCloudVideoView tXCloudVideoView) {
        Bitmap bitmap;
        initRecorderParams(tXUGCSimpleConfig);
        nativeSetRecordParams(this.mNativeUGCRecorderJni, this.mRecorderParams);
        nativeSetView(this.mNativeUGCRecorderJni, new DisplayTarget(tXCloudVideoView));
        boolean z11 = true;
        nativeEnableCameraAutoFocus(this.mNativeUGCRecorderJni, !this.mRecorderParams.f76708g);
        nativeStartCamera(this.mNativeUGCRecorderJni, this.mRecorderParams.f76707f);
        long j11 = this.mNativeUGCRecorderJni;
        if (this.mCustomProcessListener == null) {
            z11 = false;
        }
        nativeEnableVideoCustomPreprocess(j11, z11);
        if (tXUGCSimpleConfig != null && (bitmap = tXUGCSimpleConfig.watermark) != null) {
            nativeSetWatermark(this.mNativeUGCRecorderJni, bitmap, tXUGCSimpleConfig.watermarkX, tXUGCSimpleConfig.watermarkY, bitmap.getWidth());
        }
        return 0;
    }

    public int startRecord(String str, String str2) {
        int iCheckRecordPath = checkRecordPath(str, this.mVideoPartFolder, str2);
        return iCheckRecordPath != 0 ? iCheckRecordPath : nativeStartRecord(this.mNativeUGCRecorderJni, this.mVideoFilePath, this.mVideoPartFolder, this.mCoverPath);
    }

    public int startRecord(String str, String str2, String str3) {
        int iCheckRecordPath = checkRecordPath(str, str2, str3);
        return iCheckRecordPath != 0 ? iCheckRecordPath : nativeStartRecord(this.mNativeUGCRecorderJni, this.mVideoFilePath, this.mVideoPartFolder, this.mCoverPath);
    }

    private void initRecorderParams(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig) {
        if (tXUGCCustomConfig == null) {
            LiteavLog.m76087i(TAG, "init recorder params. config is null ");
            return;
        }
        Size videoSize = getVideoSize(tXUGCCustomConfig.videoResolution);
        if (tXUGCCustomConfig.enableHighResolutionCapture) {
            videoSize.width = TXVodDownloadDataSource.QUALITY_1080P;
            videoSize.height = 1920;
        }
        RecordParams recordParams = this.mRecorderParams;
        recordParams.f76702a = videoSize.width;
        recordParams.f76703b = videoSize.height;
        recordParams.f76705d = tXUGCCustomConfig.videoBitrate;
        recordParams.f76704c = tXUGCCustomConfig.videoFps;
        recordParams.f76706e = tXUGCCustomConfig.videoGop;
        recordParams.f76712k = tXUGCCustomConfig.needEdit;
        recordParams.f76707f = tXUGCCustomConfig.isFront;
        recordParams.f76708g = tXUGCCustomConfig.touchFocus;
        recordParams.f76713l = recordProfileToVideoProfileType(tXUGCCustomConfig.profile);
        RecordParams recordParams2 = this.mRecorderParams;
        recordParams2.f76709h = tXUGCCustomConfig.minDuration;
        recordParams2.f76710i = tXUGCCustomConfig.maxDuration;
        recordParams2.f76711j = tXUGCCustomConfig.audioSampleRate;
        recordParams2.f76714m = tXUGCCustomConfig.enableAEC;
        recordParams2.f76715n = tXUGCCustomConfig.enableAGC;
        recordParams2.f76716o = tXUGCCustomConfig.enableANS;
        if (tXUGCCustomConfig.needEdit) {
            recordParams2.f76706e = 1;
            recordParams2.f76705d = getEditBitrateWithSize(recordParams2.f76702a, recordParams2.f76703b);
        }
        int i11 = tXUGCCustomConfig.videoResolution;
        if (i11 == 0) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_BD, TXVodDownloadDataSource.QUALITY_360P, "360x640");
        } else if (i11 == 1) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_HD, TXVodDownloadDataSource.QUALITY_480P, "480x640");
        } else if (i11 == 3) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_FHD, 720, "720x1280");
        } else if (i11 != 4) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_HD, 540, "540x960");
        } else {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_RESOLUTION_1080P, TXVodDownloadDataSource.QUALITY_1080P, "1080x1920");
        }
        UGCDataReport.reportDAU(1049, tXUGCCustomConfig.videoFps, "");
        UGCDataReport.reportDAU(1050, tXUGCCustomConfig.videoGop, "");
    }
}
