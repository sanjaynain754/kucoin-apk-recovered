package com.tencent.rtmp;

import android.view.Surface;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: renamed from: com.tencent.rtmp.a */
/* JADX INFO: loaded from: classes56.dex */
public interface InterfaceC35197a {
    void callExperimentalAPI(String str);

    void enableAudioVolumeEvaluation(int i11);

    boolean enableHardwareDecode(boolean z11);

    long getCurrentRenderPts();

    boolean isPlaying();

    void pause();

    void resume();

    void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener);

    void setAudioRoute(int i11);

    void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    void setConfig(TXLivePlayConfig tXLivePlayConfig);

    void setMute(boolean z11);

    void setPlayListener(ITXLivePlayListener iTXLivePlayListener);

    void setPlayerView(TXCloudVideoView tXCloudVideoView);

    void setRenderMode(int i11);

    void setRenderRotation(int i11);

    void setSurface(Surface surface);

    void setSurfaceSize(int i11, int i12);

    void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener);

    void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener);

    int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj);

    void setVolume(int i11);

    void showDebugView(boolean z11);

    void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener);

    int startLivePlay(String str, int i11);

    int startRecord(int i11);

    int stopPlay(boolean z11);

    int stopRecord();

    int switchStream(String str);
}
