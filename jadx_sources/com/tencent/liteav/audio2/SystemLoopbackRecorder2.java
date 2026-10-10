package com.tencent.liteav.audio2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Process;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
public class SystemLoopbackRecorder2 {
    private static final String TAG = "SystemLoopbackRecorder2";

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f73342a = 0;
    private static final Object mLock = new Object();
    private static MediaProjection mMediaProjection;
    private static volatile long mNativeSystemLoopbackRecorder;

    public static class Recorder {

        /* JADX INFO: renamed from: a */
        private AudioRecord f73343a;

        /* JADX INFO: renamed from: b */
        private AudioManager f73344b;

        /* JADX INFO: renamed from: a */
        private static AudioRecord m75995a(MediaProjection mediaProjection, int i11, int i12, int i13) {
            AudioPlaybackCaptureConfiguration.Builder builderM76018a = C34680n.m76018a(mediaProjection);
            builderM76018a.addMatchingUsage(1);
            builderM76018a.addMatchingUsage(14);
            AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfigurationBuild = builderM76018a.build();
            if (audioPlaybackCaptureConfigurationBuild == null) {
                return null;
            }
            int i14 = i12 == 1 ? 16 : 12;
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setEncoding(2).setSampleRate(i11).setChannelMask(i14).build();
            int minBufferSize = AudioRecord.getMinBufferSize(i11, i14, 2);
            AudioRecord audioRecordBuild = null;
            for (int i15 = 1; i15 <= 2 && audioRecordBuild == null; i15++) {
                int i16 = minBufferSize * i15;
                if (i16 >= i13 * 4 || i15 >= 2) {
                    try {
                        audioRecordBuild = new AudioRecord.Builder().setAudioFormat(audioFormatBuild).setBufferSizeInBytes(i16).setAudioPlaybackCaptureConfig(audioPlaybackCaptureConfigurationBuild).build();
                        if (audioRecordBuild.getState() != 1) {
                            Log.m76033e(SystemLoopbackRecorder2.TAG, "Audio record state error", new Object[0]);
                            m75997a(audioRecordBuild);
                            audioRecordBuild = null;
                        } else {
                            audioRecordBuild.startRecording();
                            Log.m76034i(SystemLoopbackRecorder2.TAG, "Create audio record success", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        Log.m76036w(SystemLoopbackRecorder2.TAG, "Create record error " + th2.getMessage(), new Object[0]);
                        m75997a(audioRecordBuild);
                    }
                }
            }
            return audioRecordBuild;
        }

        public int startRecording(MediaProjection mediaProjection, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                try {
                    AudioManager audioManager = this.f73344b;
                    if (audioManager != null) {
                        audioManager.setAllowedCapturePolicy(3);
                    }
                } catch (Throwable th2) {
                    Log.m76033e(SystemLoopbackRecorder2.TAG, "ForbidCaptureAudioFromCurrentApp error " + th2.getMessage(), new Object[0]);
                }
            }
            AudioManager audioManager2 = this.f73344b;
            int mode = audioManager2 != null ? audioManager2.getMode() : 0;
            m75996a(0);
            this.f73343a = m75995a(mediaProjection, i11, i12, i13);
            m75996a(mode);
            if (this.f73343a == null) {
                return -1;
            }
            Process.setThreadPriority(-19);
            return 0;
        }

        public int read(ByteBuffer byteBuffer, int i11) {
            if (this.f73343a == null) {
                return -1;
            }
            byteBuffer.position(0);
            int i12 = this.f73343a.read(byteBuffer, i11);
            if (i12 > 0) {
                return i12;
            }
            Log.m76033e(SystemLoopbackRecorder2.TAG, "Read failed ".concat(String.valueOf(i12)), new Object[0]);
            return -1;
        }

        public void stopRecording() {
            m75997a(this.f73343a);
            this.f73343a = null;
        }

        public Recorder() {
            Context applicationContext = ContextUtils.getApplicationContext();
            ContextUtils.getApplicationContext();
            this.f73344b = (AudioManager) applicationContext.getSystemService("audio");
        }

        /* JADX INFO: renamed from: a */
        private static void m75997a(AudioRecord audioRecord) {
            if (audioRecord == null) {
                return;
            }
            try {
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
                audioRecord.release();
            } catch (Throwable th2) {
                Log.m76033e(SystemLoopbackRecorder2.TAG, "Destroy AudioRecord failed." + th2.getMessage(), new Object[0]);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m75996a(int i11) {
            try {
                AudioManager audioManager = this.f73344b;
                if (audioManager != null) {
                    audioManager.setMode(i11);
                }
            } catch (Throwable th2) {
                Log.m76033e(SystemLoopbackRecorder2.TAG, "Set audio mode exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    private static native void nativeSetMediaProjectionSession(long j11, MediaProjection mediaProjection);

    public static void notifyMediaProjectionState(MediaProjection mediaProjection) {
        StringBuilder sb2 = new StringBuilder("Received MediaProjection state ");
        sb2.append(mediaProjection != null);
        Log.m76034i(TAG, sb2.toString(), new Object[0]);
        synchronized (mLock) {
            mMediaProjection = mediaProjection;
            setMediaProjectionSession();
        }
    }

    public static void setMediaProjectionSession() {
        if (mMediaProjection == null) {
            Log.m76034i(TAG, "MediaProjection is null.", new Object[0]);
        } else if (mNativeSystemLoopbackRecorder != 0) {
            nativeSetMediaProjectionSession(mNativeSystemLoopbackRecorder, mMediaProjection);
        }
    }

    public MediaProjection getMediaProjection() {
        return mMediaProjection;
    }

    public void releaseNativeSystemLoopbackRecorder() {
        mNativeSystemLoopbackRecorder = 0L;
    }

    public SystemLoopbackRecorder2(long j11) {
        mNativeSystemLoopbackRecorder = j11;
    }
}
