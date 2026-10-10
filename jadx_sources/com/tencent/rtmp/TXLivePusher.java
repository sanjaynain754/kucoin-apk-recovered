package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.live.TXLivePusherJni;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes56.dex */
public class TXLivePusher implements InterfaceC35199b {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    private static final String TAG = "TXLivePusher";
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private InterfaceC35199b mImpl;

    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j11, int i11, int i12, int i13);

        void onRecordRawPcmData(byte[] bArr, long j11, int i11, int i12, int i13, boolean z11);
    }

    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i11);
    }

    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    @Deprecated
    public interface OnBGMNotify {
        void onBGMComplete(int i11);

        void onBGMProgress(long j11, long j12);

        void onBGMStart();
    }

    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i11, int i12, int i13);

        void onTextureDestoryed();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void callExperimentalAPI(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.callExperimentalAPI(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void enableAudioVolumeEvaluation(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.enableAudioVolumeEvaluation(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized TXAudioEffectManager getAudioEffectManager() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return null;
        }
        return interfaceC35199b.getAudioEffectManager();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized TXBeautyManager getBeautyManager() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return null;
        }
        return interfaceC35199b.getBeautyManager();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized TXLivePushConfig getConfig() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return new TXLivePushConfig();
        }
        return interfaceC35199b.getConfig();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized int getMaxZoom() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return 0;
        }
        return interfaceC35199b.getMaxZoom();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized int getMusicDuration(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return 0;
        }
        return interfaceC35199b.getMusicDuration(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized boolean isPushing() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.isPushing();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void onLogRecord(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.onLogRecord(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean pauseBGM() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.pauseBGM();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void pausePusher() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.pausePusher();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean playBGM(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.playBGM(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void release() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.release();
        LiteavLog.m76087i(TAG, "Release instance:" + this.mImpl.toString());
        this.mImpl = null;
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean resumeBGM() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.resumeBGM();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void resumePusher() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.resumePusher();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void sendCustomPCMData(byte[] bArr) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.sendCustomPCMData(bArr);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized int sendCustomVideoData(byte[] bArr, int i11, int i12, int i13) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return -1;
        }
        return interfaceC35199b.sendCustomVideoData(bArr, i11, i12, i13);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized int sendCustomVideoTexture(int i11, int i12, int i13) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return -1;
        }
        return interfaceC35199b.sendCustomVideoTexture(i11, i12, i13);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void sendMessage(byte[] bArr) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.sendMessage(bArr);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized boolean sendMessageEx(byte[] bArr) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.sendMessageEx(bArr);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setAudioProcessListener(AudioCustomProcessListener audioCustomProcessListener) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setAudioProcessListener(audioCustomProcessListener);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setAudioVolumeEvaluationListener(iTXAudioVolumeEvaluationListener);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setBGMNofify(OnBGMNotify onBGMNotify) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setBGMNofify(onBGMNotify);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setBGMPitch(float f11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setBGMPitch(f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean setBGMPosition(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setBGMPosition(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean setBGMVolume(float f11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setBGMVolume(f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized boolean setBeautyFilter(int i11, int i12, int i13, int i14) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setBeautyFilter(i11, i12, i13, i14);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setChinLevel(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setChinLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setConfig(TXLivePushConfig tXLivePushConfig) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setConfig(tXLivePushConfig);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setExposureCompensation(float f11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setExposureCompensation(f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setEyeScaleLevel(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setEyeScaleLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setFaceShortLevel(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setFaceShortLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setFaceSlimLevel(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setFaceSlimLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setFaceVLevel(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setFaceVLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setFilter(Bitmap bitmap) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setFilter(bitmap);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setFocusPosition(float f11, float f12) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setFocusPosition(f11, f12);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean setGreenScreenFile(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setGreenScreenFile(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean setMicVolume(float f11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setMicVolume(f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized boolean setMirror(boolean z11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setMirror(z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setMotionMute(boolean z11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setMotionMute(z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setMotionTmpl(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setMute(boolean z11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setMute(z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setNoseSlimLevel(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setNoseSlimLevel(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setPushListener(ITXLivePushListener iTXLivePushListener) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setPushListener(iTXLivePushListener);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setRenderRotation(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setRenderRotation(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setReverb(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setReverb(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setSpecialRatio(float f11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setSpecialRatio(f11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setSurface(Surface surface) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setSurface(surface);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setSurfaceSize(int i11, int i12) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setSurfaceSize(i11, i12);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setVideoProcessListener(videoCustomProcessListener);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setVideoQuality(int i11, boolean z11, boolean z12) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setVideoQuality(i11, z11, z12);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setVideoRecordListener(iTXVideoRecordListener);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized void setVoiceChangerType(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.setVoiceChangerType(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized boolean setZoom(int i11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.setZoom(i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.snapshot(iTXSnapshotListener);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.startCameraPreview(tXCloudVideoView);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized int startPusher(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return -1;
        }
        return interfaceC35199b.startPusher(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized int startRecord(String str) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return -3;
        }
        return interfaceC35199b.startRecord(str);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void startScreenCapture() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.startScreenCapture();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    @Deprecated
    public synchronized boolean stopBGM() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.stopBGM();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void stopCameraPreview(boolean z11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.stopCameraPreview(z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void stopPusher() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.stopPusher();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void stopRecord() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.stopRecord();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void stopScreenCapture() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.stopScreenCapture();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized void switchCamera() {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return;
        }
        interfaceC35199b.switchCamera();
    }

    @Override // com.tencent.rtmp.InterfaceC35199b
    public synchronized boolean turnOnFlashLight(boolean z11) {
        InterfaceC35199b interfaceC35199b = this.mImpl;
        if (interfaceC35199b == null) {
            return false;
        }
        return interfaceC35199b.turnOnFlashLight(z11);
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public TXLivePusher(Context context) {
        this.mImpl = new TXLivePusherJni(context);
        LiteavLog.m76087i(TAG, "Create instance:" + this.mImpl.toString());
    }
}
