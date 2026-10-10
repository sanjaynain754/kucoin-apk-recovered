package com.tencent.ugc;

import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class MP4Writer {
    private static final String TAG = "MP4Writer";
    private Map<String, String> mMetaData;
    private volatile long mNativePtr = 0;
    private MP4WriterListener mListener = null;
    private boolean mHasVideo = false;
    private boolean mHasAudio = false;
    private String mPath = "";

    public interface MP4WriterListener {
        void onComplete(long j11);

        void onError(String str);
    }

    private static native long nativeCreate(MP4Writer mP4Writer);

    private static native void nativeDestroy(long j11);

    private static native void nativeSetFileMetaData(long j11, String[] strArr, String[] strArr2);

    private static native void nativeSetHasAudio(long j11, boolean z11);

    private static native void nativeSetHasVideo(long j11, boolean z11);

    private static native void nativeStart(long j11, String str);

    private static native void nativeStop(long j11);

    private static native void nativeWriteAudioFrame(long j11, int i11, int i12, long j12, int i13, ByteBuffer byteBuffer);

    private static native void nativeWriteVideoFrame(long j11, EncodedVideoFrame encodedVideoFrame);

    private void setFileMetaDataInternal() {
        Map<String, String> map = this.mMetaData;
        if (map == null || map.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) this.mMetaData.keySet().toArray(new String[0]);
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = this.mMetaData.get(strArr[i11]);
        }
        nativeSetFileMetaData(this.mNativePtr, strArr, strArr2);
    }

    public void finalize() {
        LiteavLog.m76087i(TAG, "finalize");
        stop();
        if (this.mNativePtr != 0) {
            nativeDestroy(this.mNativePtr);
        }
        this.mNativePtr = 0L;
    }

    public void onComplete(long j11) {
        LiteavLog.m76087i(TAG, "onComplete,durationMs=".concat(String.valueOf(j11)));
        MP4WriterListener mP4WriterListener = this.mListener;
        if (mP4WriterListener == null) {
            return;
        }
        mP4WriterListener.onComplete(j11);
    }

    public void setFileMetaData(Map<String, String> map) {
        this.mMetaData = map;
    }

    public void setHasAudio(boolean z11) {
        LiteavLog.m76087i(TAG, "setHasAudio,hasAudio=".concat(String.valueOf(z11)));
        this.mHasAudio = z11;
    }

    public void setHasVideo(boolean z11) {
        LiteavLog.m76087i(TAG, "setHasVideo,hasVideo=".concat(String.valueOf(z11)));
        this.mHasVideo = z11;
    }

    public void setListener(MP4WriterListener mP4WriterListener) {
        this.mListener = mP4WriterListener;
    }

    public void start() {
        LiteavLog.m76087i(TAG, "start");
        if (this.mNativePtr != 0) {
            LiteavLog.m76093w(TAG, "it is already started.");
            return;
        }
        this.mNativePtr = nativeCreate(this);
        if (this.mNativePtr == 0) {
            LiteavLog.m76087i(TAG, "create native mp4 writer fail.");
            return;
        }
        setFileMetaDataInternal();
        nativeSetHasVideo(this.mNativePtr, this.mHasVideo);
        nativeSetHasAudio(this.mNativePtr, this.mHasAudio);
        nativeStart(this.mNativePtr, this.mPath);
    }

    public void stop() {
        LiteavLog.m76087i(TAG, InterfaceC33730j9.f70350a);
        if (this.mNativePtr == 0) {
            return;
        }
        nativeStop(this.mNativePtr);
    }

    public void writeAudioFrame(AudioFrame audioFrame) {
        if (this.mNativePtr == 0) {
            LiteavLog.m76093w(TAG, "writeAudioFrame, mNativePtr is null.");
        } else if (audioFrame == null || !audioFrame.isValidFrame()) {
            LiteavLog.m76093w(TAG, "writeAudioFrame, frame is invalid.frame = ".concat(String.valueOf(audioFrame)));
        } else {
            nativeWriteAudioFrame(this.mNativePtr, audioFrame.getSampleRate(), audioFrame.getChannelCount(), audioFrame.getTimestamp(), audioFrame.getCodecFormat().getValue(), audioFrame.getData());
        }
    }

    public void writeVideoFrame(EncodedVideoFrame encodedVideoFrame) {
        if (this.mNativePtr == 0) {
            LiteavLog.m76093w(TAG, "writeVideoFrame, mNativePtr is null.");
        } else if (encodedVideoFrame == null || !encodedVideoFrame.isValidFrame()) {
            LiteavLog.m76093w(TAG, "writeVideoFrame, frame is invalid.frame = ".concat(String.valueOf(encodedVideoFrame)));
        } else {
            nativeWriteVideoFrame(this.mNativePtr, encodedVideoFrame);
        }
    }

    public void onError(String str) {
        LiteavLog.m76087i(TAG, "onError,info=".concat(String.valueOf(str)));
        MP4WriterListener mP4WriterListener = this.mListener;
        if (mP4WriterListener == null) {
            return;
        }
        mP4WriterListener.onError(str);
    }

    public void setPath(String str) {
        LiteavLog.m76087i(TAG, "path=".concat(String.valueOf(str)));
        this.mPath = str;
    }
}
