package com.tencent.liteav.audio2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
public class LiteavAudioTrack2 {
    private static final int DEFAULT_LATENCY_MS = 160;
    private static final int HARDWARE_LATENCY_MS = 20;
    private static final long LATENCY_THRESHOLD_MS = 1000;
    private static final long NANOS_PER_MS = 1000000;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final String TAG = "LiteavAudioTrack2";
    private AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;
    private int mSampleRate = 0;
    private int mBufferSize = 0;
    private int mSystemOSVersion = 0;
    private int mWriteFrameIndex = 0;
    private int mBytesPerFrame = 0;

    private AudioTrack createStartedAudioTrack(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        AudioTrack audioTrack;
        try {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
            try {
                audioTrack = new AudioTrack(i18, i15, i16, 2, i17, 1);
                try {
                    if (audioTrack.getState() != 1) {
                        throw new RuntimeException("AudioTrack is not initialized.");
                    }
                    this.mWriteFrameIndex = 0;
                    audioTrack.play();
                    Log.m76034i(TAG, "create AudioTrack success. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), streamTypeToString(i18));
                    return audioTrack;
                } catch (Throwable unused) {
                    Log.m76036w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), streamTypeToString(i18));
                    destroyAudioTrack(audioTrack);
                    return null;
                }
            } catch (Throwable unused2) {
                audioTrack = null;
                Log.m76036w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), streamTypeToString(i18));
                destroyAudioTrack(audioTrack);
                return null;
            }
        } catch (Throwable unused3) {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
    }

    private void destroyAudioTrack(AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (audioTrack.getPlayState() == 3) {
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        } catch (Throwable th2) {
            Log.m76033e(TAG, "stop AudioTrack failed.", th2);
        }
    }

    private int getLatencyByTimestamp() {
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (!this.mAudioTrack.getTimestamp(audioTimestamp)) {
            Log.m76036w(TAG, "fail to get AudioTrack timestamp", new Object[0]);
            return 160;
        }
        int iLengthBytesToNano = ((int) (((audioTimestamp.nanoTime + lengthBytesToNano(((long) this.mWriteFrameIndex) - audioTimestamp.framePosition)) - System.nanoTime()) / 1000000)) + 20;
        if (iLengthBytesToNano <= 0 || iLengthBytesToNano >= 1000) {
            return 160;
        }
        return iLengthBytesToNano;
    }

    private static String streamTypeToString(int i11) {
        if (i11 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i11 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i11 == 2) {
            return "STREAM_RING";
        }
        if (i11 == 3) {
            return "STREAM_MUSIC";
        }
        if (i11 != 4) {
            return i11 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public int getPlayoutLatencyMs() {
        if (this.mAudioTrack == null || this.mSystemOSVersion < 23) {
            return 160;
        }
        try {
            return getLatencyByTimestamp();
        } catch (Throwable th2) {
            Log.m76036w(TAG, "get latency exception " + th2.getMessage(), new Object[0]);
            return 160;
        }
    }

    public int getUnderrunCount() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null) {
            return 0;
        }
        try {
            if (this.mSystemOSVersion >= 24) {
                return audioTrack.getUnderrunCount();
            }
        } catch (Throwable th2) {
            Log.m76036w(TAG, "get under run count exception " + th2.getMessage(), new Object[0]);
        }
        return 0;
    }

    public int startPlayout(int i11, int i12, int i13, int i14) {
        this.mBytesPerFrame = i13 * 2;
        this.mSampleRate = i12;
        int i15 = i13 == 1 ? 4 : 12;
        int minBufferSize = AudioTrack.getMinBufferSize(i12, i15, 2);
        if (minBufferSize <= 0) {
            Log.m76033e(TAG, "AudioTrack.getMinBufferSize return error: ".concat(String.valueOf(minBufferSize)), new Object[0]);
            return -2;
        }
        int[] iArr = {i11, 0, 3, 1};
        for (int i16 = 0; i16 < 4 && this.mAudioTrack == null; i16++) {
            int i17 = iArr[i16];
            for (int i18 = 1; i18 <= 2 && this.mAudioTrack == null; i18++) {
                int i19 = minBufferSize * i18;
                this.mBufferSize = i19;
                if (i19 >= i14 * 4 || i18 >= 2) {
                    this.mAudioTrack = createStartedAudioTrack(i12, i15, i19, i17);
                }
            }
        }
        if (this.mAudioTrack == null) {
            return -1;
        }
        this.mSystemOSVersion = LiteavSystemInfo.getSystemOSVersionInt();
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopPlayout() {
        destroyAudioTrack(this.mAudioTrack);
        this.mAudioTrack = null;
    }

    public int write(ByteBuffer byteBuffer, int i11, int i12, boolean z11) {
        int iWrite;
        if (this.mAudioTrack == null) {
            return -1;
        }
        byteBuffer.position(i11);
        if (this.mSystemOSVersion >= 21) {
            iWrite = this.mAudioTrack.write(byteBuffer, i12, z11 ? 1 : 0);
        } else {
            byte[] bArr = this.mPlayBuffer;
            if (bArr == null || bArr.length < i12) {
                this.mPlayBuffer = new byte[i12];
            }
            byteBuffer.get(this.mPlayBuffer, 0, i12);
            iWrite = this.mAudioTrack.write(this.mPlayBuffer, 0, i12);
        }
        if (iWrite < 0) {
            Log.m76033e(TAG, "write audio data to AudioTrack failed. ".concat(String.valueOf(iWrite)), new Object[0]);
            return -1;
        }
        this.mWriteFrameIndex += iWrite / this.mBytesPerFrame;
        return iWrite;
    }

    private long lengthBytesToNano(long j11) {
        return (j11 * 1000000000) / ((long) this.mSampleRate);
    }
}
