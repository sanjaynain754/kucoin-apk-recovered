package com.tencent.ugc.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.AudioEncodeParams;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCTranscodeAudioEncodeParamsDecider {
    private static final int DEFAULT_BITRATE = 51200;
    private static final int DEFAULT_CHANNEL_COUNT = 1;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final String TAG = "UGCTranscodeAudioEncodeParamsDecider";
    private final long mNativeHandler = nativeCreate();

    private static native long nativeCreate();

    private static native void nativeDestroy(long j11);

    private static native int nativeGetSelectedBitPerChannels(long j11);

    private static native int nativeGetSelectedBitrate(long j11);

    private static native int nativeGetSelectedChannels(long j11);

    private static native int nativeGetSelectedSampleRate(long j11);

    private static native void nativeSetBGMAudioInfo(long j11, int i11, int i12, int i13);

    private static native void nativeSetEncodeBitrate(long j11, int i11);

    private static native void nativeSetSourceAudioInfoList(long j11, int[] iArr, int[] iArr2, int[] iArr3);

    private int getNumberFromMediaFormat(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat == null || !mediaFormat.containsKey(str)) {
            return i11;
        }
        try {
            return mediaFormat.getInteger(str);
        } catch (Throwable th2) {
            LiteavLog.m76093w(TAG, "getNumberFromMediaFormat integer ClassCastException: ".concat(String.valueOf(th2)));
            try {
                return (int) mediaFormat.getFloat(str);
            } catch (Throwable th3) {
                LiteavLog.m76093w(TAG, "getNumberFromMediaFormat float ClassCastException: ".concat(String.valueOf(th3)));
                return i11;
            }
        }
    }

    public void finalize() throws Throwable {
        nativeDestroy(this.mNativeHandler);
    }

    public AudioEncodeParams getDecidedEncodeParams() {
        AudioEncodeParams audioEncodeParams = new AudioEncodeParams();
        audioEncodeParams.setSampleRate(nativeGetSelectedSampleRate(this.mNativeHandler));
        audioEncodeParams.setChannels(nativeGetSelectedChannels(this.mNativeHandler));
        audioEncodeParams.setBitsPerChannel(nativeGetSelectedBitPerChannels(this.mNativeHandler));
        audioEncodeParams.setBitrate(nativeGetSelectedBitrate(this.mNativeHandler));
        return audioEncodeParams;
    }

    public void setBGMMediaFormat(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return;
        }
        nativeSetBGMAudioInfo(this.mNativeHandler, getNumberFromMediaFormat(mediaFormat, "channel-count", 1), getNumberFromMediaFormat(mediaFormat, "bitrate", 51200), getNumberFromMediaFormat(mediaFormat, "sample-rate", 48000));
    }

    public void setEncodeBitrate(int i11) {
        nativeSetEncodeBitrate(this.mNativeHandler, i11);
    }

    public void setInputAudioMediaFormat(List<MediaFormat> list) {
        if (list == null) {
            return;
        }
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        int[] iArr3 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            MediaFormat mediaFormat = list.get(i11);
            iArr[i11] = getNumberFromMediaFormat(mediaFormat, "channel-count", 1);
            iArr2[i11] = getNumberFromMediaFormat(mediaFormat, "bitrate", 51200);
            iArr3[i11] = getNumberFromMediaFormat(mediaFormat, "sample-rate", 48000);
        }
        nativeSetSourceAudioInfoList(this.mNativeHandler, iArr, iArr2, iArr3);
    }
}
