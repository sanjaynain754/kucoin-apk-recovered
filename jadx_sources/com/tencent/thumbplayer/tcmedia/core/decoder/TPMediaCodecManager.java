package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.os.Build;
import android.util.SparseArray;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes63.dex */
public class TPMediaCodecManager {
    private static final String TAG = "TPMediaCodecManager";
    private static SparseArray<ITPMediaCodecDecoder> mCodecList = new SparseArray<>();
    private static AtomicInteger codecNum = new AtomicInteger(0);

    private static native void _onMediaCodecException(int i11, String str);

    private static native void _onMediaCodecReady(int i11, String str);

    private static native void _onMediaCodecReportEvent(int i11, int i12);

    private static native void _onMediaDrmInfo(int i11, Object obj);

    public static boolean initVideoMediaCodec(int i11, String str, int i12, int i13, int i14, Surface surface, int i15, int i16, int i17) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "initVideoMediaCodec failed!");
            return false;
        }
        if (codecById.initDecoder(str, i12, i13, i14, surface, i15, i16, i17)) {
            return codecById.startDecoder();
        }
        return false;
    }

    public static void setCryptoInfo(int i11, int i12, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i13, int i14, int i15) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamObject failed!");
        } else {
            codecById.setCryptoInfo(i12, iArr, iArr2, bArr, bArr2, i13, i14, i15);
        }
    }

    private static void addCodecToList(int i11, ITPMediaCodecDecoder iTPMediaCodecDecoder) {
        synchronized (TPMediaCodecManager.class) {
            mCodecList.put(i11, iTPMediaCodecDecoder);
        }
    }

    public static int createMediaCodec(boolean z11) {
        if (codecNum.get() >= Integer.MAX_VALUE) {
            codecNum.set(0);
        }
        int andIncrement = codecNum.getAndIncrement();
        addCodecToList(andIncrement, z11 ? new TPMediaCodecAudioDecoder(andIncrement) : new TPMediaCodecVideoDecoder(andIncrement));
        return andIncrement;
    }

    private static ITPMediaCodecDecoder getCodecById(int i11) {
        ITPMediaCodecDecoder iTPMediaCodecDecoder;
        synchronized (TPMediaCodecManager.class) {
            iTPMediaCodecDecoder = mCodecList.get(i11);
        }
        if (iTPMediaCodecDecoder != null) {
            return iTPMediaCodecDecoder;
        }
        TPNativeLog.printLog(3, TAG, "No such codec by id:".concat(String.valueOf(i11)));
        return null;
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    private static void removeCodecFromList(int i11) {
        synchronized (TPMediaCodecManager.class) {
            mCodecList.remove(i11);
        }
    }

    public static int flushMediaCodec(int i11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "flushMediaCodec failed!");
            return 3;
        }
        return codecById.flush();
    }

    public static boolean initAudioMediaCodec(int i11, String str, int i12, int i13, int i14, int i15) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "initAudioMediaCodec failed!");
            return false;
        }
        if (!codecById.initDecoder(str, i12, i13, i14, i15)) {
            return false;
        }
        return codecById.startDecoder();
    }

    public static void onMediaCodecException(int i11, String str) {
        _onMediaCodecException(i11, str);
    }

    public static void onMediaCodecReady(int i11, String str) {
        _onMediaCodecReady(i11, str);
    }

    public static void onMediaCodecReportEvent(int i11, int i12) {
        _onMediaCodecReportEvent(i11, i12);
    }

    public static void onMediaDrmInfo(int i11, Object obj) {
        _onMediaDrmInfo(i11, obj);
    }

    public static TPFrameInfo receiveOneFrame(int i11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "receiveOneFrame failed!");
            return null;
        }
        return codecById.dequeueOutputBuffer();
    }

    public static int releaseMediaCodec(int i11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "releaseMediaCodec failed!");
            return 3;
        }
        removeCodecFromList(i11);
        return codecById.release();
    }

    public static int releaseVideoFrame(int i11, int i12, boolean z11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "releaseVideoFrame failed!");
            return 3;
        }
        return codecById.releaseOutputBuffer(i12, z11);
    }

    public static int sendOnePacket(int i11, byte[] bArr, boolean z11, long j11, boolean z12) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "sendOnePacket failed!");
            return 3;
        }
        return codecById.decode(bArr, z11, j11, z12);
    }

    public static int setMediaCodecOperateRate(int i11, float f11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecOperateRate failed!");
            return 3;
        }
        return codecById.setOperateRate(f11);
    }

    public static boolean setMediaCodecParamBool(int i11, int i12, boolean z11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamBool failed!");
            return false;
        }
        return codecById.setParamBool(i12, z11);
    }

    public static boolean setMediaCodecParamBytes(int i11, int i12, byte[] bArr) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamBytes failed!");
            return false;
        }
        return codecById.setParamBytes(i12, bArr);
    }

    public static boolean setMediaCodecParamInt(int i11, int i12, int i13) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamInt failed!");
            return false;
        }
        return codecById.setParamInt(i12, i13);
    }

    public static boolean setMediaCodecParamLong(int i11, int i12, long j11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamLong failed!");
            return false;
        }
        return codecById.setParamLong(i12, j11);
    }

    public static boolean setMediaCodecParamObject(int i11, int i12, Object obj) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamObject failed!");
            return false;
        }
        return codecById.setParamObject(i12, obj);
    }

    public static boolean setMediaCodecParamString(int i11, int i12, String str) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecParamString failed!");
            return false;
        }
        return codecById.setParamString(i12, str);
    }

    public static int setMediaCodecSurface(int i11, Surface surface) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "setMediaCodecSurface failed!");
            return 3;
        }
        return codecById.setOutputSurface(surface);
    }

    public static int signalEndOfStream(int i11) {
        ITPMediaCodecDecoder codecById = getCodecById(i11);
        if (codecById == null) {
            TPNativeLog.printLog(3, TAG, "signalEndOfStream failed!");
            return 3;
        }
        return codecById.signalEndOfStream();
    }
}
