package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.InterfaceC35197a;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class TXLivePlayerJni implements InterfaceC35197a, TXCloudVideoView.InterfaceC35208b {
    private static final String TAG = "TXLivePlayerJni";
    private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeEvaluationListener;
    private Object mGLContext = null;
    private ITXLivePlayListener mListener;
    protected long mNativeTXLivePlayerJni;
    private TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private TXLivePlayer.ITXLivePlayVideoRenderListener mVideoRenderListener;

    public TXLivePlayerJni(Context context) {
        this.mNativeTXLivePlayerJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeTXLivePlayerJni = nativeCreate(new WeakReference(this));
    }

    private static String genFilePath(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(strValueOf + "000").longValue()));
            String diskFileDir = getDiskFileDir(context);
            if (TextUtils.isEmpty(diskFileDir)) {
                return null;
            }
            return new File(diskFileDir, String.format("TXUGC_%s".concat(String.valueOf(str)), str2)).getAbsolutePath();
        } catch (Exception e11) {
            LiteavLog.m76084e(TAG, "create file path failed.", e11);
            return null;
        }
    }

    private static String getDiskFileDir(Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return null;
    }

    private static native void nativeCallExperimentalAPI(long j11, String str);

    private static native long nativeCreate(WeakReference<TXLivePlayerJni> weakReference);

    private static native long nativeCreateByIdentifier(WeakReference<TXLivePlayerJni> weakReference, String str);

    private static native void nativeDestroy(long j11);

    private static native void nativeEnableAudioVolumeEvaluation(long j11, int i11);

    private static native void nativeEnableCustomAudioProcess(long j11, boolean z11);

    private static native void nativeEnableCustomRenderI420(long j11, boolean z11);

    private static native void nativeEnableCustomRenderTexture(long j11, boolean z11, Object obj);

    private static native void nativeEnableHardwareDecode(long j11, boolean z11);

    private static native long nativeGetCurrentRenderPts(long j11);

    private static native boolean nativeIsPlaying(long j11);

    private static native void nativePause(long j11);

    private static native void nativeResume(long j11);

    private static native void nativeSetAudioRoute(long j11, int i11);

    private static native void nativeSetConfig(long j11, float f11, float f12, float f13, int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, String str, Map map);

    private static native void nativeSetMute(long j11, boolean z11);

    private static native void nativeSetPlayerView(long j11, DisplayTarget displayTarget);

    private static native void nativeSetRenderMode(long j11, int i11);

    private static native void nativeSetRenderRotation(long j11, int i11);

    private static native void nativeSetVolume(long j11, int i11);

    private static native void nativeShowDebugView(long j11, boolean z11);

    private static native void nativeSnapshot(long j11);

    private static native int nativeStartPlay(long j11, String str, int i11);

    private static native void nativeStartRecord(long j11, int i11, String str);

    private static native void nativeStopPlay(long j11, boolean z11);

    private static native void nativeStopRecord(long j11);

    private static native int nativeSwitchStream(long j11, String str);

    public boolean addVideoRawData(byte[] bArr) {
        return false;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        synchronized (this) {
            try {
                if (this.mVideoRenderListener != null) {
                    this.mVideoRenderListener = null;
                    this.mGLContext = null;
                    nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, null);
                }
                this.mVideoRawDataListener = iTXVideoRawDataListener;
                nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, iTXVideoRawDataListener != null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        synchronized (this) {
            try {
                if (this.mVideoRawDataListener != null) {
                    this.mVideoRawDataListener = null;
                    nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
                }
                this.mVideoRenderListener = iTXLivePlayVideoRenderListener;
                if (iTXLivePlayVideoRenderListener == null) {
                    obj = null;
                }
                this.mGLContext = obj;
                nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, iTXLivePlayVideoRenderListener != null, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return 0;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePlayerJni, str);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void enableAudioVolumeEvaluation(int i11) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePlayerJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public boolean enableHardwareDecode(boolean z11) {
        nativeEnableHardwareDecode(this.mNativeTXLivePlayerJni, z11);
        return true;
    }

    public void finalize() {
        nativeDestroy(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public long getCurrentRenderPts() {
        return nativeGetCurrentRenderPts(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public boolean isPlaying() {
        return nativeIsPlaying(this.mNativeTXLivePlayerJni);
    }

    public void onAudioInfoChanged(int i11, int i12, int i13) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i11, i12, i13);
        }
    }

    public void onAudioVolumeEvaluationNotify(int i11) {
        TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i11);
        }
    }

    public void onNetStatus(Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    public void onPcmDataAvailable(byte[] bArr, long j11) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onPcmDataAvailable(bArr, j11);
        }
    }

    public void onPlayEvent(int i11, Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(i11, bundle);
        }
    }

    public void onRecordComplete(int i11, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
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
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i11, bundle);
        }
    }

    public void onRecordProgress(long j11) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j11);
        }
    }

    public void onRenderVideoFrame(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, long j11, byte[] bArr, ByteBuffer byteBuffer) {
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.mVideoRenderListener;
        if (iTXLivePlayVideoRenderListener != null) {
            TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
            tXLiteAVTexture.textureId = i13;
            tXLiteAVTexture.width = i14;
            tXLiteAVTexture.height = i15;
            tXLiteAVTexture.eglContext = obj;
            iTXLivePlayVideoRenderListener.onRenderVideoFrame(tXLiteAVTexture);
        }
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.mVideoRawDataListener;
        if (iTXVideoRawDataListener != null) {
            iTXVideoRawDataListener.onVideoRawDataAvailable(bArr, i14, i15, j11);
        }
    }

    public void onSnapshot(Bitmap bitmap) {
        TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void pause() {
        nativePause(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void resume() {
        nativeResume(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mAudioRawDataListener = iTXAudioRawDataListener;
        nativeEnableCustomAudioProcess(this.mNativeTXLivePlayerJni, iTXAudioRawDataListener != null);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setAudioRoute(int i11) {
        nativeSetAudioRoute(this.mNativeTXLivePlayerJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        if (tXLivePlayConfig == null) {
            return;
        }
        nativeSetConfig(this.mNativeTXLivePlayerJni, tXLivePlayConfig.getCacheTime(), tXLivePlayConfig.getMaxAutoAdjustCacheTime(), tXLivePlayConfig.getMinAutoAdjustCacheTime(), tXLivePlayConfig.getVideoBlockThreshold(), tXLivePlayConfig.getConnectRetryCount(), tXLivePlayConfig.getConnectRetryInterval(), tXLivePlayConfig.isAutoAdjustCacheTime(), tXLivePlayConfig.isEnableMessage(), tXLivePlayConfig.isEnableMetaData(), tXLivePlayConfig.getFlvSessionKey(), tXLivePlayConfig.getHeaders());
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setMute(boolean z11) {
        nativeSetMute(this.mNativeTXLivePlayerJni, z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            C34762a.m76162a(tXCloudVideoView, new WeakReference(this));
            showDebugView(C34762a.m76163a(tXCloudVideoView));
        }
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, tXCloudVideoView != null ? new DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setRenderMode(int i11) {
        nativeSetRenderMode(this.mNativeTXLivePlayerJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setRenderRotation(int i11) {
        nativeSetRenderRotation(this.mNativeTXLivePlayerJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setSurface(Surface surface) {
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, surface != null ? new DisplayTarget(surface) : null);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setVolume(int i11) {
        nativeSetVolume(this.mNativeTXLivePlayerJni, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void showDebugView(boolean z11) {
        nativeShowDebugView(this.mNativeTXLivePlayerJni, z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public int startLivePlay(String str, int i11) {
        return nativeStartPlay(this.mNativeTXLivePlayerJni, str, i11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public int stopPlay(boolean z11) {
        nativeStopPlay(this.mNativeTXLivePlayerJni, z11);
        return 0;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public int stopRecord() {
        nativeStopRecord(this.mNativeTXLivePlayerJni);
        return 0;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        String[] strArr = new String[map.size()];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        return strArr;
    }

    public static String[] getMapValues(Map<String, String> map, String[] strArr) {
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

    public static TXLivePlayerJni weakToStrongReference(WeakReference<TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.rtmp.p148ui.TXCloudVideoView.InterfaceC35208b
    public void onShowLog(boolean z11) {
        showDebugView(z11);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public int startRecord(int i11) {
        String strGenFilePath = genFilePath(ContextUtils.getApplicationContext(), ".mp4");
        if (TextUtils.isEmpty(strGenFilePath)) {
            return -1;
        }
        nativeStartRecord(this.mNativeTXLivePlayerJni, i11, strGenFilePath);
        return 0;
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public int switchStream(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e(TAG, "Invalid params.");
            return -1;
        }
        return nativeSwitchStream(this.mNativeTXLivePlayerJni, str);
    }

    public TXLivePlayerJni(Context context, String str) {
        this.mNativeTXLivePlayerJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeTXLivePlayerJni = nativeCreateByIdentifier(new WeakReference(this), str);
    }

    @Override // com.tencent.rtmp.InterfaceC35197a
    public void setSurfaceSize(int i11, int i12) {
    }
}
