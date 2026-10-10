package com.tencent.liteav.audio2;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
class LiteavAudioRecord3 {
    private static final int DEFAULT_LATENCY_MS = 30;
    private static final int HARDWARE_LATENCY_MS = 20;
    private static final long LATENCY_THRESHOLD_MS = 1000;
    private static final long NANOS_PER_MS = 1000000;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final String TAG = "LiteavAudioRecord3";
    private AudioRecord mAudioRecord;
    private int mSampleRate = 0;
    private int mBufferSize = 0;
    private int mReadFrameIndex = 0;
    private int mBytesPerFrame = 0;
    private int mSystemOSVersion = 0;

    private AudioRecord createStartedAudioRecord(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        AudioRecord audioRecord;
        try {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
            try {
                audioRecord = new AudioRecord(i15, i16, i17, 2, i18);
                try {
                    if (audioRecord.getState() != 1) {
                        throw new RuntimeException("AudioRecord is not initialized.");
                    }
                    this.mReadFrameIndex = 0;
                    audioRecord.startRecording();
                    Log.m76034i(TAG, "create AudioRecord success. sampleRate: %d, channelConfig: %d, bufferSize: %d, audio source: %s", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), audioSourceToString(i15));
                    return audioRecord;
                } catch (Throwable unused) {
                    Log.m76036w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", audioSourceToString(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
                    destroyAudioRecord(audioRecord);
                    return null;
                }
            } catch (Throwable unused2) {
                audioRecord = null;
                Log.m76036w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", audioSourceToString(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
                destroyAudioRecord(audioRecord);
                return null;
            }
        } catch (Throwable unused3) {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
    }

    private static void destroyAudioRecord(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        try {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        } catch (Throwable th2) {
            Log.m76033e(TAG, "stop AudioRecord failed.", th2);
        }
    }

    private int getLatencyByTimestamp() {
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (this.mAudioRecord.getTimestamp(audioTimestamp, 0) != 0) {
            Log.m76036w(TAG, "fail to get audio record timestamp", new Object[0]);
            return 30;
        }
        int iNanoTime = (int) ((System.nanoTime() - (audioTimestamp.nanoTime + lengthBytesToNano(((long) this.mReadFrameIndex) - audioTimestamp.framePosition))) / 1000000);
        int i11 = iNanoTime + 20;
        if (iNanoTime <= 0 || iNanoTime > 1000) {
            return 30;
        }
        return i11;
    }

    public int getRecordLatencyMs() {
        if (this.mAudioRecord == null || this.mSystemOSVersion < 24) {
            return 30;
        }
        try {
            return getLatencyByTimestamp();
        } catch (Throwable th2) {
            Log.m76036w(TAG, "get latency exception " + th2.getMessage(), new Object[0]);
            return 30;
        }
    }

    public int getSessionId() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    public int read(ByteBuffer byteBuffer, int i11) {
        if (this.mAudioRecord == null) {
            return -1;
        }
        byteBuffer.position(0);
        int i12 = this.mAudioRecord.read(byteBuffer, i11);
        if (i12 < 0) {
            Log.m76033e(TAG, "read failed, %d", Integer.valueOf(i12));
            return -1;
        }
        this.mReadFrameIndex += i12 / this.mBytesPerFrame;
        return i12;
    }

    public int startRecording(int i11, int i12, int i13, int i14) {
        this.mBytesPerFrame = i13 * 2;
        this.mSampleRate = i12;
        int i15 = i13 == 1 ? 16 : 12;
        int minBufferSize = AudioRecord.getMinBufferSize(i12, i15, 2);
        if (minBufferSize <= 0) {
            Log.m76033e(TAG, "AudioRecord.getMinBufferSize return error: ".concat(String.valueOf(minBufferSize)), new Object[0]);
        }
        int i16 = i13 * i12;
        if (minBufferSize < i16) {
            minBufferSize = i16;
        }
        int[] iArr = {i11, 1, 5, 0};
        for (int i17 = 0; i17 < 4 && this.mAudioRecord == null; i17++) {
            int i18 = iArr[i17];
            for (int i19 = 1; i19 <= 2 && this.mAudioRecord == null; i19++) {
                int i21 = minBufferSize * i19;
                this.mBufferSize = i21;
                if (i21 >= i14 * 4 || i19 >= 2) {
                    this.mAudioRecord = createStartedAudioRecord(i18, i12, i15, i21);
                }
            }
        }
        if (this.mAudioRecord == null) {
            return -1;
        }
        this.mSystemOSVersion = LiteavSystemInfo.getSystemOSVersionInt();
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopRecording() {
        destroyAudioRecord(this.mAudioRecord);
        this.mAudioRecord = null;
    }

    private static String audioSourceToString(int i11) {
        switch (i11) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    private long lengthBytesToNano(long j11) {
        return (j11 * 1000000000) / ((long) this.mSampleRate);
    }
}
