package com.tencent.trtc.hardwareearmonitor;

import android.media.AudioTrack;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorSilentTrack {
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final String TAG = "HardwareEarMonitorSilentTrack";
    private PlaybackThread mPlaybackThread;
    private int mChannelConfig = 12;
    private int mAudioFormat = 2;
    private boolean mIsPlaying = false;

    public class PlaybackThread extends Thread {
        private boolean isStop = false;

        public synchronized void closeThread() {
            this.isStop = true;
        }

        public PlaybackThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int minBufferSize = AudioTrack.getMinBufferSize(48000, HardwareEarMonitorSilentTrack.this.mChannelConfig, HardwareEarMonitorSilentTrack.this.mAudioFormat);
            AudioTrack audioTrack = new AudioTrack(3, 48000, HardwareEarMonitorSilentTrack.this.mChannelConfig, HardwareEarMonitorSilentTrack.this.mAudioFormat, minBufferSize, 1);
            if (audioTrack.getState() == 1) {
                audioTrack.play();
                byte[] bArr = new byte[minBufferSize];
                for (int i11 = 0; i11 < minBufferSize; i11++) {
                    bArr[i11] = 0;
                }
                while (!this.isStop && !isInterrupted()) {
                    try {
                        audioTrack.write(bArr, 0, minBufferSize);
                    } catch (Throwable th2) {
                        LiteavLog.m76085e(HardwareEarMonitorSilentTrack.TAG, "audioTrack write,Throwable ex : %s", th2.getMessage());
                    }
                }
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        }
    }

    public static HardwareEarMonitorSilentTrack create() {
        return new HardwareEarMonitorSilentTrack();
    }

    public void StartAudioTrack() {
        if (this.mIsPlaying || this.mPlaybackThread != null) {
            return;
        }
        this.mIsPlaying = true;
        PlaybackThread playbackThread = new PlaybackThread();
        this.mPlaybackThread = playbackThread;
        playbackThread.start();
    }

    public void StopAudioTrack() {
        PlaybackThread playbackThread = this.mPlaybackThread;
        if (playbackThread != null) {
            this.mIsPlaying = false;
            playbackThread.closeThread();
            try {
                this.mPlaybackThread.join();
            } catch (Throwable th2) {
                LiteavLog.m76085e(TAG, "mPlaybackThread join,Throwable ex : %s", th2.getMessage());
            }
            this.mPlaybackThread = null;
        }
    }
}
