package com.tencent.liteav.trtc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.C34745j;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.transcriber.AITranscriberManager;
import com.tencent.liteav.transcriber.AITranscriberManagerImpl;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes59.dex */
public class TRTCCloudImpl extends TRTCCloud implements TXAudioEffectManager.TXMusicPlayObserver {

    /* JADX INFO: renamed from: a */
    private static boolean f73671a;

    /* JADX INFO: renamed from: b */
    private static TRTCCloudImpl f73672b;

    /* JADX INFO: renamed from: c */
    private Context f73673c;

    /* JADX INFO: renamed from: d */
    private TRTCCloudListener f73674d;

    /* JADX INFO: renamed from: e */
    private TrtcCloudJni f73675e;

    /* JADX INFO: renamed from: f */
    private TRTCCloud.BGMNotify f73676f;

    /* JADX INFO: renamed from: g */
    private TXAudioEffectManagerImpl f73677g;

    /* JADX INFO: renamed from: h */
    private TXDeviceManagerImpl f73678h;

    /* JADX INFO: renamed from: i */
    private TXBeautyManagerImpl f73679i;

    /* JADX INFO: renamed from: j */
    private AITranscriberManagerImpl f73680j;

    /* JADX INFO: renamed from: k */
    private int f73681k;

    /* JADX INFO: renamed from: l */
    private ArrayList<TRTCCloudImpl> f73682l = new ArrayList<>();

    private TRTCCloudImpl(Context context, boolean z11) {
        m76195b(context);
        this.f73673c = context;
        m76189a(context, 0L, z11);
    }

    /* JADX INFO: renamed from: b */
    private static void m76195b(Context context) {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (!f73671a) {
                    ContextUtils.initApplicationContext(context.getApplicationContext());
                    ContextUtils.setDataDirectorySuffix("liteav");
                    TrtcCloudJni.init(0);
                    f73671a = true;
                }
                if (context instanceof Activity) {
                    C34745j.m76118a().m76124a((Activity) context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int checkAudioCapabilitySupport(int i11) {
        return (i11 == 2 && this.f73678h.isLowLatencyEarMonitorSupported()) ? 1 : 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(boolean z11, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.f73675e.enableAudioVolumeEvaluation(z11, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(int i11, boolean z11) {
        this.f73675e.enableCustomVideoCapture(i11, z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(int i11, boolean z11) {
        this.f73675e.muteLocalVideo(i11, z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, int i11, boolean z11) {
        this.f73675e.muteRemoteVideoStream(str, i11, z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(int i11, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            LiteavLog.m76093w("TRTCCloudImpl", "sendCustomVideoData frame is null");
            return;
        }
        if (tRTCVideoFrame.bufferType == 3) {
            GLES20.glFinish();
        }
        this.f73675e.sendCustomVideoData(i11, tRTCVideoFrame);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setGreenScreenFile(String str) {
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i11, int i12, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f73675e.snapshotVideo(str, i11, i12, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio(int i11) {
        this.f73675e.startLocalAudio(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
        startRemoteView(str, 2, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, int i11, TXCloudVideoView tXCloudVideoView) {
        this.f73675e.startRemoteView(str, i11, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(int i11, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f73681k = i11;
        this.f73675e.startScreenCapture(i11, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f73675e.startSpeedTest(tRTCSpeedTestParams);
        return 0;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteSubStreamView(String str) {
        stopRemoteView(str, 2);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str, int i11) {
        this.f73675e.stopRemoteView(str, i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i11) {
        this.f73675e.switchRole(i11);
    }

    /* JADX INFO: renamed from: a */
    public static TRTCCloud m76185a(Context context) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            try {
                if (f73672b == null) {
                    f73672b = new TRTCCloudImpl(context, true);
                }
                tRTCCloudImpl = f73672b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tRTCCloudImpl;
    }

    /* JADX INFO: renamed from: c */
    private String m76197c() {
        return this.f73673c.getCacheDir() + File.separator + "liteav_effect";
    }

    public static TRTCCloud createInstance(Context context) {
        return new TRTCCloudImpl(context, false);
    }

    public static void destroyInstance(TRTCCloud tRTCCloud) {
        if (tRTCCloud instanceof TRTCCloudImpl) {
            ((TRTCCloudImpl) tRTCCloud).m76194b();
        } else {
            LiteavLog.m76093w("TRTCCloudImpl", "destroyInstance trtcCloud=".concat(String.valueOf(tRTCCloud)));
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(String str) {
        this.f73675e.connectOtherRoom(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        this.f73675e.disconnectOtherRoom();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void addListener(TRTCCloudListener tRTCCloudListener) {
        this.f73675e.addListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public String callExperimentalAPI(String str) {
        return this.f73675e.callExperimentalAPI(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            tRTCCloudImpl = new TRTCCloudImpl(ContextUtils.getApplicationContext(), this.f73675e.getTrtcCloudJni());
            this.f73682l.add(tRTCCloudImpl);
        }
        return tRTCCloudImpl;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(TRTCCloud tRTCCloud) {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (tRTCCloud instanceof TRTCCloudImpl) {
                    LiteavLog.m76087i("TRTCCloudImpl", "destructor destroySubCloud");
                    ((TRTCCloudImpl) tRTCCloud).m76194b();
                    this.f73682l.remove(tRTCCloud);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enable3DSpatialAudioEffect(boolean z11) {
        this.f73675e.enable3DSpatialAudioEffect(z11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioEarMonitoring(boolean z11) {
        this.f73677g.enableVoiceEarMonitor(z11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i11, boolean z11) {
        TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams = new TRTCCloudDef.TRTCAudioVolumeEvaluateParams();
        tRTCAudioVolumeEvaluateParams.interval = i11;
        tRTCAudioVolumeEvaluateParams.enableVadDetection = z11;
        tRTCAudioVolumeEvaluateParams.enablePitchCalculation = false;
        tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation = false;
        enableAudioVolumeEvaluation(true, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z11) {
        this.f73675e.enableCustomAudioCapture(z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioRendering(boolean z11) {
        this.f73675e.enableCustomAudioRendering(z11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableCustomVideoCapture(boolean z11) {
        enableCustomVideoCapture(0, z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z11, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return this.f73675e.enableEncSmallVideoStream(z11, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableMixExternalAudioFrame(boolean z11, boolean z12) {
        this.f73675e.enableMixExternalAudioFrame(z11, z12);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enablePayloadPrivateEncryption(boolean z11, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        return this.f73675e.enablePayloadPrivateEncryption(z11, tRTCPayloadPrivateEncryptionConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean enableTorch(boolean z11) {
        return this.f73678h.enableCameraTorch(z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i11) {
        this.f73675e.enterRoom(tRTCParams, i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        this.f73675e.exitRoom();
        try {
            File file = new File(m76197c());
            if (file.exists() && file.isDirectory() && C34741f.m76107a(file, 5) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e11) {
            LiteavLog.m76093w("TRTCCloudImpl", "clearCache error " + e11.toString());
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public AITranscriberManager getAITranscriberManager() {
        return this.f73680j;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return this.f73675e.getAudioCaptureVolume();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXAudioEffectManager getAudioEffectManager() {
        return this.f73677g;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return this.f73675e.getAudioPlayoutVolume();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int getBGMDuration(String str) {
        return (int) this.f73677g.getMusicDurationInMS(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        return this.f73679i;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f73675e.getCustomAudioRenderingFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXDeviceManager getDeviceManager() {
        return this.f73678h;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.f73678h.isCameraAutoFocusFaceModeSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.f73678h.isCameraFocusPositionInPreviewSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraTorchSupported() {
        return this.f73678h.isCameraTorchSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraZoomSupported() {
        return this.f73678h.isCameraZoomSupported();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return -1;
        }
        return this.f73675e.mixExternalAudioFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(boolean z11) {
        this.f73675e.muteAllRemoteAudio(z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z11) {
        this.f73675e.muteAllRemoteVideoStreams(z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(boolean z11) {
        this.f73675e.muteLocalAudio(z11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteLocalVideo(boolean z11) {
        this.f73675e.muteLocalVideo(0, z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(String str, boolean z11) {
        this.f73675e.muteRemoteAudio(str, z11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteRemoteVideoStream(String str, boolean z11) {
        muteRemoteVideoStream(str, 0, z11);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i11, int i12) {
        TRTCCloud.BGMNotify bGMNotify = this.f73676f;
        if (bGMNotify != null) {
            bGMNotify.onBGMComplete(i12);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i11, long j11, long j12) {
        TRTCCloud.BGMNotify bGMNotify = this.f73676f;
        if (bGMNotify != null) {
            bGMNotify.onBGMProgress(j11, j12);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i11, int i12) {
        TRTCCloud.BGMNotify bGMNotify = this.f73676f;
        if (bGMNotify != null) {
            bGMNotify.onBGMStart(i12);
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseAudioEffect(int i11) {
        this.f73677g.pauseAudioEffect(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseBGM() {
        this.f73677g.pausePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
        this.f73675e.pauseScreenCapture(this.f73681k);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        if (tRTCAudioEffectParam == null) {
            return;
        }
        final int i11 = tRTCAudioEffectParam.effectId;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i11, m76193b(tRTCAudioEffectParam.path));
        audioMusicParam.publish = tRTCAudioEffectParam.publish;
        audioMusicParam.loopCount = tRTCAudioEffectParam.loopCount;
        audioMusicParam.isShortFile = true;
        this.f73677g.playAudioEffect(audioMusicParam);
        this.f73677g.setEffectObserver(i11, new TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.liteav.trtc.TRTCCloudImpl.1
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onComplete(int i12, int i13) {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.f73674d;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onAudioEffectFinished(i11, i13);
                }
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onStart(int i12, int i13) {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.f73674d;
                if (tRTCCloudListener == null || i13 >= 0) {
                    return;
                }
                tRTCCloudListener.onAudioEffectFinished(i11, i13);
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onPlayProgress(int i12, long j11, long j12) {
            }
        });
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
        this.f73676f = bGMNotify;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(Integer.MAX_VALUE, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        this.f73677g.setMusicObserver(Integer.MAX_VALUE, this);
        this.f73677g.startPlayMusic(audioMusicParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void removeListener(TRTCCloudListener tRTCCloudListener) {
        this.f73675e.removeListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeAudioEffect(int i11) {
        this.f73677g.resumeAudioEffect(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeBGM() {
        this.f73677g.resumePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
        this.f73675e.resumeScreenCapture(this.f73681k);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void selectMotionTmpl(String str) {
        this.f73679i.setMotionTmpl(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f73675e.sendCustomAudioData(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i11, byte[] bArr, boolean z11, boolean z12) {
        if (bArr != null) {
            return this.f73675e.sendCustomCmdMsg(i11, bArr, z11, z12);
        }
        LiteavLog.m76093w("TRTCCloudImpl", "custom msg data is null.");
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i11) {
        if (bArr != null && i11 != 0) {
            return this.f73675e.sendSEIMsg(bArr, i11);
        }
        LiteavLog.m76093w("TRTCCloudImpl", "sei msg data is null or repeatCount is zero.");
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void set3DSpatialReceivingRange(String str, int i11) {
        this.f73675e.set3DSpatialReceivingRange(str, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAllAudioEffectsVolume(int i11) {
        this.f73677g.setAllAudioEffectsVolume(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i11) {
        this.f73675e.setAudioCaptureVolume(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioEffectVolume(int i11, int i12) {
        this.f73677g.setAudioEffectVolume(i11, i12);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f73675e.setAudioFrameListener(tRTCAudioFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i11) {
        this.f73675e.setAudioPlayoutVolume(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioQuality(int i11) {
        this.f73675e.setAudioQuality(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i11) {
        this.f73678h.setAudioRoute(TXDeviceManagerImpl.audioRouteFromInt(i11));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPlayoutVolume(int i11) {
        this.f73677g.setMusicPlayoutVolume(Integer.MAX_VALUE, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setBGMPosition(int i11) {
        this.f73677g.seekMusicToPosInMS(Integer.MAX_VALUE, i11);
        return 0;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPublishVolume(int i11) {
        this.f73677g.setMusicPublishVolume(Integer.MAX_VALUE, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMVolume(int i11) {
        this.f73677g.setMusicPlayoutVolume(Integer.MAX_VALUE, i11);
        this.f73677g.setMusicPublishVolume(Integer.MAX_VALUE, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBeautyStyle(int i11, int i12, int i13, int i14) {
        this.f73679i.setBeautyStyle(i11);
        this.f73679i.setBeautyLevel(i12);
        this.f73679i.setWhitenessLevel(i13);
        this.f73679i.setRuddyLevel(i14);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setCapturedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f73675e.setCapturedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setChinLevel(int i11) {
        this.f73679i.setChinLevel(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z11, boolean z12) {
        this.f73675e.setDefaultStreamRecvMode(z11, z12);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setEyeScaleLevel(int i11) {
        this.f73679i.setEyeScaleLevel(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceShortLevel(int i11) {
        this.f73679i.setFaceShortLevel(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceSlimLevel(int i11) {
        this.f73679i.setFaceSlimLevel(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceVLevel(int i11) {
        this.f73679i.setFaceVLevel(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilter(Bitmap bitmap) {
        this.f73679i.setFilter(bitmap);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilterConcentration(float f11) {
        this.f73679i.setFilterStrength(f11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFocusPosition(int i11, int i12) {
        this.f73678h.setCameraFocusPosition(i11, i12);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setGSensorMode(int i11) {
        this.f73675e.setGSensorMode(0, i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGravitySensorAdaptiveMode(int i11) {
        this.f73675e.setGravitySensorAdaptiveMode(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        this.f73675e.setListenerHandler(handler);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f73675e.setLocalProcessedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        setLocalViewFillMode(tRTCRenderParams.fillMode);
        setLocalViewRotation(tRTCRenderParams.rotation);
        setLocalViewMirror(tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoProcessListener(int i11, int i12, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        return this.f73675e.setLocalVideoProcessListener(i11, i12, tRTCVideoFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i11, int i12, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f73675e.setLocalVideoRenderListener(i11, i12, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewFillMode(int i11) {
        this.f73675e.setLocalViewFillMode(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewMirror(int i11) {
        this.f73675e.setLocalViewMirror(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewRotation(int i11) {
        this.f73675e.setLocalViewRotation(m76192b(i11));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMicVolumeOnMixing(int i11) {
        this.f73677g.setVoiceCaptureVolume(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixExternalAudioVolume(int i11, int i12) {
        this.f73675e.setMixExternalAudioVolume(i11, i12);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f73675e.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f73675e.setMixedPlayAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMotionMute(boolean z11) {
        this.f73679i.setMotionMute(z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f73675e.setNetworkQosParam(tRTCNetworkQosParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setNoseSlimLevel(int i11) {
        this.f73679i.setNoseSlimLevel(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2) {
        this.f73675e.setPerspectiveCorrectionPoints(str, pointFArr, pointFArr2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setPriorRemoteVideoStreamType(int i11) {
        return this.f73675e.setPriorRemoteVideoStreamType(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f73675e.setRemoteAudioParallelParams(tRTCAudioParallelParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(String str, int i11) {
        this.f73675e.setRemoteAudioVolume(str, i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteRenderParams(String str, int i11, TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        this.f73675e.setRemoteViewFillMode(str, i11, tRTCRenderParams.fillMode);
        this.f73675e.setRemoteViewRotation(str, i11, m76192b(tRTCRenderParams.rotation));
        this.f73675e.setRemoteViewMirror(str, i11, tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewFillMode(String str, int i11) {
        this.f73675e.setRemoteViewFillMode(str, 2, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewRotation(String str, int i11) {
        this.f73675e.setRemoteViewRotation(str, 2, m76192b(i11));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(String str, int i11, int i12, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f73675e.setRemoteVideoRenderListener(str, i11, i12, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(String str, int i11) {
        return this.f73675e.setRemoteVideoStreamType(str, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewFillMode(String str, int i11) {
        this.f73675e.setRemoteViewFillMode(str, 0, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewRotation(String str, int i11) {
        this.f73675e.setRemoteViewRotation(str, 0, m76192b(i11));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setReverbType(int i11) {
        this.f73677g.setVoiceReverbType(TXAudioEffectManagerImpl.voiceReverbTypeFromInt(i11));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f73675e.setVideoEncoderParams(2, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setSystemVolumeType(int i11) {
        this.f73678h.setSystemVolumeType(TXDeviceManagerImpl.systemVolumeTypefromInt(i11));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderMirror(boolean z11) {
        this.f73675e.setVideoEncoderMirror(z11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam == null) {
            return;
        }
        this.f73675e.setVideoEncoderParams(0, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderRotation(int i11) {
        this.f73675e.setVideoEncoderRotation(m76192b(i11));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(Bitmap bitmap, int i11) {
        this.f73675e.setVideoMuteImage(bitmap, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setVoiceChangerType(int i11) {
        this.f73677g.setVoiceChangerType(TXAudioEffectManagerImpl.voiceChangerTypeFromInt(i11));
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(Bitmap bitmap, int i11, float f11, float f12, float f13) {
        this.f73675e.setWatermark(bitmap, i11, f11, f12, f13);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setZoom(int i11) {
        this.f73678h.setCameraZoomRatio(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i11) {
        this.f73675e.showDashboardManager(i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void snapshotVideo(String str, int i11, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f73675e.snapshotVideo(str, i11, 1, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return this.f73675e.startAudioRecording(tRTCAudioRecordingParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startLocalAudio() {
        this.f73675e.startLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z11, TXCloudVideoView tXCloudVideoView) {
        this.f73675e.startLocalPreview(z11, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f73675e.startLocalRecording(tRTCLocalRecordingParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f73675e.startPublishCDNStream(tRTCPublishCDNParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f73675e.startPublishMediaStream(tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishing(String str, int i11) {
        this.f73675e.startPublishing(str, i11);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.f73675e.startRemoteView(str, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startSpeedTest(int i11, String str, String str2) {
        this.f73675e.startSpeedTest(i11, str, str2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAllAudioEffects() {
        this.f73677g.stopAllAudioEffects();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        this.f73675e.stopAllRemoteView();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAudioEffect(int i11) {
        this.f73677g.stopAudioEffect(i11);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
        this.f73675e.stopAudioRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopBGM() {
        this.f73677g.stopPlayMusic(Integer.MAX_VALUE);
        this.f73677g.setMusicObserver(Integer.MAX_VALUE, null);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
        this.f73675e.stopLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
        this.f73675e.stopLocalPreview();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalRecording() {
        this.f73675e.stopLocalRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishCDNStream() {
        this.f73675e.stopPublishCDNStream();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishMediaStream(String str) {
        this.f73675e.stopPublishMediaStream(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishing() {
        this.f73675e.stopPublishing();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteView(String str) {
        this.f73675e.stopRemoteView(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
        this.f73675e.stopScreenCapture(this.f73681k);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
        this.f73675e.stopSpeedTest();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSystemAudioLoopback() {
        this.f73675e.stopSystemAudioLoopback();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void switchCamera() {
        this.f73678h.switchCamera(!this.f73678h.isFrontCamera());
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i11, String str) {
        this.f73675e.switchRole(i11, str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f73675e.switchRoom(tRTCSwitchRoomConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.f73675e.updateLocalView(tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateOtherRoomForwardMode(String str) {
        this.f73675e.updateOtherRoomForwardMode(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f73675e.updatePublishMediaStream(str, tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemote3DSpatialPosition(String str, int[] iArr) {
        this.f73675e.updateRemote3DSpatialPosition(str, iArr);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemoteView(String str, int i11, TXCloudVideoView tXCloudVideoView) {
        this.f73675e.updateRemoteView(str, i11, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f73675e.updateSelf3DSpatialPosition(iArr, fArr, fArr2, fArr3);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setListener(TRTCCloudListener tRTCCloudListener) {
        Log.m76032d("TRTCCloudImpl", "setListener ".concat(String.valueOf(tRTCCloudListener)), new Object[0]);
        this.f73674d = tRTCCloudListener;
        this.f73675e.setListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f73681k = 0;
        startScreenCapture(0, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSystemAudioLoopback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            LiteavLog.m76083e("TRTCCloudImpl", "current system don't support system audio loopback");
        } else {
            this.f73675e.startSystemAudioLoopback();
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        sendCustomVideoData(0, tRTCVideoFrame);
    }

    private TRTCCloudImpl(Context context, long j11) {
        m76195b(context);
        this.f73673c = context;
        m76189a(context, j11, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m76187a() {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (f73672b != null) {
                    LiteavLog.m76087i("TRTCCloudImpl", "destructor destroySharedInstance");
                    Iterator<TRTCCloudImpl> it = f73672b.f73682l.iterator();
                    while (it.hasNext()) {
                        it.next().m76194b();
                    }
                    f73672b.m76194b();
                    f73672b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i11) {
        enableAudioVolumeEvaluation(i11, false);
    }

    /* JADX INFO: renamed from: b */
    private void m76194b() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.f73679i;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        this.f73675e.destroy();
    }

    /* JADX INFO: renamed from: b */
    public static void m76196b(boolean z11) {
        TrtcCloudJni.setLogCompressEnabled(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: b */
    private String m76193b(String str) throws Throwable {
        long length;
        FileOutputStream fileOutputStream;
        IOException e11;
        FileOutputStream fileOutputStream2;
        ?? r11;
        if (TextUtils.isEmpty(str) || !str.startsWith("/assets/")) {
            return str;
        }
        ?? Substring = str.substring(8);
        try {
            try {
                length = this.f73673c.getAssets().openFd(Substring).getLength();
            } catch (Exception e12) {
                LiteavLog.m76083e("TRTCCloudImpl", "playAudioEffect openFd error " + e12.toString());
                length = 0;
            }
            String strM76197c = m76197c();
            File file = new File(strM76197c);
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                file.delete();
                file.mkdirs();
            }
            int iLastIndexOf = Substring.lastIndexOf(File.separatorChar);
            if (iLastIndexOf != -1) {
                str = strM76197c + File.separator + length + "_" + Substring.substring(iLastIndexOf + 1);
            } else {
                str = strM76197c + File.separator + length + "_" + Substring;
            }
            if (!C34741f.m76111a(str)) {
                ?? assets = this.f73673c.getAssets();
                try {
                    try {
                        try {
                            Substring = assets.open(Substring);
                            try {
                                fileOutputStream = new FileOutputStream(str);
                                try {
                                    C34741f.m76110a((InputStream) Substring, fileOutputStream);
                                    C34741f.m76109a((Closeable) Substring);
                                    fileOutputStream.flush();
                                    r11 = Substring;
                                    fileOutputStream2 = fileOutputStream;
                                } catch (IOException e13) {
                                    e11 = e13;
                                    LiteavLog.m76084e("FileUtil", "copy asset file failed.", e11);
                                    C34741f.m76109a((Closeable) Substring);
                                    Substring = Substring;
                                    assets = fileOutputStream;
                                    if (fileOutputStream != null) {
                                        fileOutputStream.flush();
                                        r11 = Substring;
                                        fileOutputStream2 = fileOutputStream;
                                    }
                                    return str;
                                }
                            } catch (IOException e14) {
                                e11 = e14;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                assets = 0;
                                C34741f.m76109a((Closeable) Substring);
                                if (assets != 0) {
                                    try {
                                        assets.flush();
                                        assets.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (IOException e15) {
                        fileOutputStream = null;
                        e11 = e15;
                        Substring = 0;
                    } catch (Throwable th3) {
                        assets = 0;
                        th = th3;
                        Substring = 0;
                    }
                    fileOutputStream2.close();
                    Substring = r11;
                    assets = fileOutputStream2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Exception e16) {
            LiteavLog.m76083e("TRTCCloudImpl", "playAudioEffect error " + e16.toString());
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private void m76189a(Context context, long j11, boolean z11) {
        this.f73673c = context.getApplicationContext();
        if (j11 == 0) {
            this.f73675e = new TrtcCloudJni(z11);
        } else {
            this.f73675e = new TrtcCloudJni(j11, z11);
        }
        this.f73678h = new TXDeviceManagerImpl(this.f73675e.createDeviceManager());
        this.f73677g = new TXAudioEffectManagerImpl(this.f73675e.createAudioEffectManager());
        this.f73679i = new TXBeautyManagerImpl(this.f73675e.createBeautyManager());
        this.f73680j = new AITranscriberManagerImpl(this.f73675e.createAITranscriberManager());
    }

    /* JADX INFO: renamed from: a */
    public static void m76188a(int i11) {
        TrtcCloudJni.setLogLevel(i11);
    }

    /* JADX INFO: renamed from: a */
    public static void m76191a(boolean z11) {
        TrtcCloudJni.setConsoleEnabled(z11);
    }

    /* JADX INFO: renamed from: a */
    public static void m76190a(String str) {
        TrtcCloudJni.setLogDirPath(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
    }

    /* JADX INFO: renamed from: b */
    private static int m76192b(int i11) {
        if (i11 < 0) {
            return 0;
        }
        return i11 > 3 ? (i11 / 90) % 4 : i11;
    }
}
