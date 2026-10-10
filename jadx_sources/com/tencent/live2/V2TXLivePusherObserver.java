package com.tencent.live2;

import android.graphics.Bitmap;
import android.os.Bundle;

/* JADX INFO: loaded from: classes45.dex */
public abstract class V2TXLivePusherObserver {
    public int onProcessVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        return 0;
    }

    public void onCaptureFirstAudioFrame() {
    }

    public void onCaptureFirstVideoFrame() {
    }

    public void onGLContextCreated() {
    }

    public void onGLContextDestroyed() {
    }

    public void onScreenCaptureStarted() {
    }

    public void onMicrophoneVolumeUpdate(int i11) {
    }

    public void onProcessAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
    }

    public void onScreenCaptureStopped(int i11) {
    }

    public void onSnapshotComplete(Bitmap bitmap) {
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics) {
    }

    public void onVoiceActivityDetectionUpdate(boolean z11) {
    }

    public void onLocalRecordBegin(int i11, String str) {
    }

    public void onLocalRecordComplete(int i11, String str) {
    }

    public void onLocalRecording(long j11, String str) {
    }

    public void onSetMixTranscodingConfig(int i11, String str) {
    }

    public void onError(int i11, String str, Bundle bundle) {
    }

    public void onPushStatusUpdate(V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus, String str, Bundle bundle) {
    }

    public void onWarning(int i11, String str, Bundle bundle) {
    }
}
